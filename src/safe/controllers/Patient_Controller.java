/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

/**
 * Importing of java directories
 */
import safe.models.Database_Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import safe.views.Patient_View;
import safe.models.Patient_Model;
import safe.views.Patient_Table_View;
import static safe.views.Patient_Table_View.patient_table;
import static safe.views.Patient_Table_View.table_model;
import static safe.views.Patient_Table_View.vector;
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
//    DefaultTableModel table_model;
     Scanner input;
//    JFileChooser filechooser;
    PrintWriter print;
    
/**
 * COnstructor for the patient controller class
 * @param patient_view 
 * @param database_controller 
 * @param patient_table_view 
 */
public Patient_Controller( Patient_View patient_view, Database_Model database_controller, 
        Patient_Table_View patient_table_view ){

 this.patient_view = patient_view;   
 this.database_controller = database_controller;
 this.patient_table_view = patient_table_view;
     
//       vector = new Vector();
//        vector.add ("ID");
//        vector.add ("FIRST NAME");
//        vector.add ("SURNAME");
//        vector.add ("AGE");
//        vector.add ("ADDRESS");
//        vector.add ("PHONE");
//        vector.add ("GENDER");
//        vector.add ("OCCUPATION");
//        vector.add ("BLOODGROUP");
//        vector.add ("STATUS");
//        vector.add ("BIRTHDATE");
//        vector.add ("NATIONAL");
//        vector.add ("DISEASE");
//        vector.add ("SYMPTOM");
//        vector.add ("DRUG");
//        vector.add ("INSTRUCTION");
patientController();
patientButton();
}//End of Patient_Controller
    
/**
 * method to handle buttons pressed
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

//Updating what is in the patient database
if (e.getSource().equals(patient_table_view.getUpdate())){
    database_controller.updatePatientdatabase();
}

//Deleting a row from the patient database
  if (e.getSource().equals(patient_table_view.getDelete())){
    database_controller.deletePatientdatabase();
}

  //The button to close the window
  if (e.getSource().equals(patient_table_view.getClose())){
      System.out.println("Close button pressed");
    patient_table_view.dispose();
}

  //Import button pressed
  if (e.getSource().equals(patient_table_view.getOpen())){
      System.out.println("Open button pressed");
     JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(patient_table_view);
      file = chooser.getSelectedFile();
      open(file);
  }

  //Export button pressed
  if (e.getSource().equals(patient_table_view.getSave())){
      System.out.println("Save button pressed");
       JFileChooser chooser = new JFileChooser();
        chooser.showSaveDialog(patient_table_view);
     file = chooser.getSelectedFile();
      save(file);
  }
};
   patient_table_view.getConnect().addActionListener ( actionListener );
   patient_table_view.getDisplay().addActionListener ( actionListener );
   patient_table_view.getUpdate().addActionListener ( actionListener );
   patient_table_view.getDelete().addActionListener ( actionListener );
   patient_table_view.getClose().addActionListener ( actionListener );
   patient_table_view.getOpen().addActionListener ( actionListener );
   patient_table_view.getSave().addActionListener ( actionListener );
}
catch( Exception e ){
    System.out.println(e.toString());
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
        insert();
    }//End of if



}//End of actionPerformed
};//End of ActionListener
patient_view.getOk_button().addActionListener ( actionListener );
patient_view.getClose_button().addActionListener ( actionListener );
patient_view.getImage_button().addActionListener ( actionListener );
}
catch ( Exception e ){
//            JOptionPane.showMessageDialog(null, "Failed To Connect To The DataBase", "Not Connected", JOptionPane.ERROR_MESSAGE);
    System.out.print(e.toString());
}
}//End of controller    
    
    
/**
 * Method to insert into the database
 */
private void insert(){
    if(patientValidate()==false)
    {
        JOptionPane.showMessageDialog(patient_view, "Please Verify your input");
        System.out.println("Fields empty");
    }
    else{
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
    String patientSymptom = patient_view.getPatientSymptom();
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
//                   patientValidate();

Patient_Model patient_model = new Patient_Model ( patientId, patientFname, patientSname, patientAge, patientAddress, 
    patientPhone, patientGender, patientOccupation, patientBloodgroup, patientMaritalstatus, patientBirthdate,
    patientNational, patientDisease, patientSymptom, drugName, drugInstruction );

database_controller.insertPatientdatabase(patientId, patientFname, patientSname, patientAge, patientAddress, patientPhone,
    patientGender, patientOccupation, patientBloodgroup, patientMaritalstatus, patientBirthdate, patientNational, 
    patientDisease, patientSymptom, drugName, drugInstruction );
    System.out.println ( ""+patient_model.toString() );
    resetTextFields();
    }
}
    
/**
 * Method to reset the text fields
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
 * Method to check for validation of input
 * @return 
 */
public boolean patientValidate ( ){
  boolean valid=true;

   if (patient_view.getPatientId()==null||patient_view.getPatientFname()==null||patient_view.getPatientSname()==null
       ||patient_view.getPatientDisease()==null||patient_view.getPatientSymptom()==null||patient_view.getDrugName()==null
       ||patient_view.getPatientAddress()==null||patient_view.getPatientGender().equals("null")||patient_view.getDrugInstruction()==null
       ||patient_view.getPatientOccupation()==null||patient_view.getPatientMaritalstatus().equals("null")
       ||patient_view.getPatientBloodgroup().equals("null")||patient_view.getPatientNational()==null){
          valid=false;
          System.out.println("Please fill all");
    }

        return valid;
}

/**
 * Method to open saved data
 * @param file 
 */
 public void open(File file)
{
table_model.setRowCount(0);
String splitHere=",";
try
{
    input = new Scanner ( new BufferedReader ( new FileReader( file )));
    input.nextLine();
    while (input.hasNextLine()){
     String [] oneTicket=input.nextLine().split(splitHere);
        Vector row=new Vector();
        for(int i=0;i<oneTicket.length;i++){
            row.add(oneTicket[i]);
        }
        table_model.addRow(row);
    }
 input.close();
 System.out.println("OPened data");
 JOptionPane.showMessageDialog ( patient_table_view, "Successfully Opened The File " +file.getName(), "OPENED", JOptionPane.INFORMATION_MESSAGE);
}//End Of Try
catch (IOException ex)
{ 
    System.out.println(ex.toString());
JOptionPane.showMessageDialog(patient_table_view, "Failed To Open File " +file.getName(), "ERROR", JOptionPane.ERROR_MESSAGE);
}//End Of Catch
}
    
 
/**
 * Method to get column names of the patient table
 * @return 
 */
public Vector getColumnNames()
{
    Vector <String> vector = new Vector < > ( );
   for ( int i=0; i < patient_table.getColumnCount ( ); i++ )
       vector.add ( patient_table.getColumnName ( i ) );
   return vector;
}
     
    
/**
 * Method to save data to a file
 * @param file 
 */
public void save (File file){
try
{
   print = new PrintWriter ( new BufferedWriter (new FileWriter (file+".csv")) );
   String headers=getColumnNames().toString();
   print.println(headers.substring(1,headers.length()-1));
   Enumeration veNums=table_model.getDataVector().elements();
   while(veNums.hasMoreElements()){
       String row=veNums.nextElement().toString();
     print.println(row.substring(1,row.length()-1)); 
   }
   print.close();          
   System.out.println("Saved data to file");
JOptionPane.showMessageDialog(patient_table_view, "Data Saved Successfully To " +file.getName(), "SAVED", JOptionPane.INFORMATION_MESSAGE);
}//End Of Try
    catch (IOException ex) 
    { 
        System.out.println(""+ex.toString());
    }
   JOptionPane.showMessageDialog(patient_table_view, "Failed To Save Data", "ERROR "+file.getName(), JOptionPane.ERROR_MESSAGE);
}//End Of Catch
    
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