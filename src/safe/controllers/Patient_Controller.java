/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

import safe.models.Database_Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
//import javax.swing.JOptionPane;
import safe.views.Patient_View;
import safe.models.Patient_Model;
import safe.views.Patient_Table_View;
//import safe.controllers.Database_Model;

/**
 *
 * @author Fredrick Abayie
 */
public final class Patient_Controller {
    private final Patient_View patient_view;
    private final Database_Model database_controller;
    private final Patient_Table_View patient_table_view;
    private ActionListener actionListener;
    File file;
    FileInputStream inputstream;
    JFileChooser filechooser;
    Vector vector;
    DefaultTableModel table_model;
    
    /**
     * 
     * @param patient_view 
     * @param database_controller 
     * @param patient_table_view 
     */
    public Patient_Controller( Patient_View patient_view, Database_Model database_controller, 
            Patient_Table_View patient_table_view ){
        
     this.patient_view = patient_view;   
     this.database_controller = database_controller;
     this.patient_table_view = patient_table_view;
//     this.setVisible(true);
    patientController();
    patientButton();
    }//End of Patient_Controller
    
    /**
     * 
     */
    public void patientButton (){
        try
        {
            actionListener = (ActionEvent e) -> {
                //Connection to database
                if ( e.getSource().equals(patient_table_view.getConnect())){
                    database_controller.connectTodatabase();
                }
                
                //Displaying what is in the database
                if (e.getSource().equals(patient_table_view.getDisplay())){
                    database_controller.displayPatientdatabase();
                }
                
                //Updating the database
                if (e.getSource().equals(patient_table_view.getUpdate())){
                    database_controller.updatePatientdatabase();
                }
                
                  if (e.getSource().equals(patient_table_view.getDelete())){
                    database_controller.deletePatientdatabase();
                }
                  
                  if (e.getSource().equals(patient_table_view.getClose())){
                      System.out.println("Close button pressed");
                    patient_table_view.dispose();
                }
            };
               patient_table_view.getConnect().addActionListener ( actionListener );
               patient_table_view.getDisplay().addActionListener ( actionListener );
               patient_table_view.getUpdate().addActionListener ( actionListener );
               patient_table_view.getDelete().addActionListener ( actionListener );
               patient_table_view.getClose().addActionListener ( actionListener );
        }
        catch( Exception e ){
        }
    }
    
    
    /**
     * A method to connect to the database
     */
    public void patientController ( ){
//                JFileChooser filechooser = new JFileChooser();
//                    filechooser.showOpenDialog(patient_view);
//                    File file = filechooser.getSelectedFile();
//                    String path = file.getAbsolutePath();
//                    patient_view.getImage_button().setIcon(new ImageIcon (path));
        try
        {
        actionListener = new ActionListener ( ){
            @Override
            public void actionPerformed ( ActionEvent e ){
                          
                if ( e.getSource( ).equals ( patient_view.getImage_button ( ))){
                    JFileChooser filechooser = new JFileChooser();
                    filechooser.showOpenDialog(patient_view);
                    file = filechooser.getSelectedFile();
                    String path = file.getAbsolutePath();
                    patient_view.getImage_button().setIcon(new ImageIcon (path));
                    
                }//End of if
                
                if ( e.getSource( ).equals( patient_view.getClose_button ( ))){
                    patient_view.dispose();
                }//End of if
                
                if ( e.getSource( ).equals ( patient_view.getOk_button ( ))){
                    try{
                        patientValidate();
                        
                    }
                    catch(Exception ex){
                    insert();
                    }
                }//End of if
                
              
                
            }//End of actionPerformed
        };//End of ActionListener
        patient_view.getOk_button().addActionListener ( actionListener );
        patient_view.getClose_button().addActionListener ( actionListener );
        patient_view.getImage_button().addActionListener ( actionListener );
        }
        catch ( Exception e ){
//            JOptionPane.showMessageDialog(null, "Failed To Connect To The DataBase", "Not Connected", JOptionPane.ERROR_MESSAGE);
//            System.out.print(e.toString());
        }
    }//End of controller    
    
    private void insert(){
         String patientId = patient_view.getPatientId();
         String patientFname = patient_view.getPatientFname();
         String patientSname = patient_view.getPatientSname();
         int patientAge = patient_view.getPatientAge();
          String patientAddress = patient_view.getPatientAddress();
        int patientPhone = patient_view.getPatientPhone();
       String patientNational = patient_view.getPatientNational();
        String patientBloodgroup = patient_view.getPatientBloodgroup();
        String patientOccupation = patient_view.getPatientOccupation();
      String patientGender = patient_view.getPatientGender();
        String patientMaritalstatus = patient_view.getPatientMaritalstatus();
        String patientBirthdate = patient_view.getPatientBirthdate();
        String patientDisease = patient_view.getPatientDisease();
        String patientSymptom = patient_view.getPatientSymptoms();
        String drugName = patient_view.getDrugName();
        String drugInstruction = patient_view.getDrugInstruction();
//      byte patientImage = patient_view.getPatientImage();
//      inputstream = new FileInputStream(file);
//      int len = ( int ) file.length();
//     if ( e.getSource( ).equals ( patient_view.getBrowse_button ( ))){
//      JFileChooser filechooser = new JFileChooser();
//      filechooser.showOpenDialog(patient_view);
//      file = filechooser.getSelectedFile();
//                   String path = file.getAbsolutePath();
//                    patient_view.getImage_button().setIcon(new ImageIcon (path));
//                    
//                }//End of if
//                                FileInputStream input = new FileInputStream(file);
//                    int length = ( int )file.length();
//                    patientImage = input;
                   
                    
   Patient_Model patient_model = new Patient_Model ( patientId, patientFname, patientSname, patientAge, patientAddress, 
        patientPhone, patientGender, patientOccupation, patientBloodgroup, patientMaritalstatus, patientBirthdate,
        patientNational, patientDisease, patientSymptom, drugName, drugInstruction );
                    
   database_controller.insertPatientdatabase(patientId, patientFname, patientSname, patientAge, patientAddress, patientPhone,
        patientGender, patientOccupation, patientBloodgroup, patientMaritalstatus, patientBirthdate, patientNational, 
        patientDisease, patientSymptom, drugName, drugInstruction );
        System.out.println ( ""+patient_model.toString() );
        resetTextFields();
    }
    
    /**
     * 
     */
    private void resetTextFields(){
        patient_view.setPatientId();
         patient_view.setPatientFname();
        patient_view.setPatientSname();
     patient_view.setPatientAge();
        patient_view.setPatientAddress();
       patient_view.setPatientPhone();
      patient_view.setPatientNational();
       patient_view.setPatientDisease();
        patient_view.setPatientBloodgroup();
       patient_view.setPatientOccupation();
      patient_view.setPatientGender();
       patient_view.setPatientMaritalstatus();
       patient_view.setPatientBirthdate();
       patient_view.setPatientSymptom();
       patient_view.setDrugName();
       patient_view.setDrugInstruction();
    }
   
    
/**
 * 
 * @return 
 */
public boolean patientValidate ( ){
  boolean valid=true;
        if(patient_view.getPatientId()==null){
            System.out.println("Id empty");
        }
        else if(patient_view.getPatientFname()==null){
            
        }
//        ||patient_view.getPatientAddress()==null
////                ||patient_view.getPatientGender().equals("null")||patient_view.getPatientOccupation()==null){
//            valid=false;
//            System.out.println("Fields Empty");
//        }
//        else 
//            System.out.println("Fields not empty");
        
        
//         try{
////          long phonenum=Long.parseLong(phone_field.getText().substring(1));
//            
//        }catch(Exception e){
//           
//       valid=false;
//        }
//        
//        return valid;
        return false;
    }
    
}//End of class



//     /**
//     * A method to connect to the database
//     */
//    public void browse ( ){
//        try
//        {
//        actionListener = new ActionListener ( ){
//            @Override
//            public void actionPerformed ( ActionEvent e ){
//                if ( e.getSource( ).equals ( patient_view.getBrowse_button ( ))){
//                    filechooser = new JFileChooser("C:\\",FileSystemView.getFileSystemView ());
//                filechooser.setFileFilter ( new FileNameExtensionFilter ("Image Files", "jpg","png","gif"));
//                int returnVal = filechooser.showOpenDialog(patient_view);
//                if (returnVal==JFileChooser.APPROVE_OPTION){
//                    String filename = filechooser.getSelectedFile().getName();
//                    String extension = filename.substring(filename.lastIndexOf("."));
//                    if (extension.equalsIgnoreCase(".jpg")||extension.equalsIgnoreCase(".png")||
//                     extension.equalsIgnoreCase(".bmp")||extension.equalsIgnoreCase(".tif")||extension.equalsIgnoreCase(".gif")){
//                        
//                    }
//                    else{
//                        System.out.println("Not an image file");
//                    }
//                }
//                }
//            }
//        };
//        }
//        catch ( Exception e )
//        {
//            
//        }
//    }