/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

/**
 * Importing of java directories
 */
import java.awt.HeadlessException;
import safe.models.Hospital_Database_Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import safe.views.Patient_View;
import safe.models.Patient_Model;
import safe.views.Patient_Table_View;
import static safe.views.Patient_Table_View.patient_table;
import static safe.views.Patient_Table_View.table_model;

/**
 *
 * @author Fredrick Abayie
 * @version 1.02
 */
public final class Patient_Controller {
    private final Patient_View patient_view;
    private final Hospital_Database_Model database_controller;
    private final Patient_Table_View patient_table_view;
    private ActionListener actionListener;
    File file;
    FileInputStream inputstream;
    JFileChooser filechooser;
    Vector vector;
    Scanner input;
    PrintWriter print;
    TableRowSorter <TableModel> rowSorter;
    long ticket_id;
    Connection connection;
    byte[] patientImage = null;
    
/**
 * Constructor for the patient controller class
 * @param patient_view instance instance of the patient view class
 * @param database_controller instance of the database controller class
 * @param patient_table_view instance of the patient table view class
 */
public Patient_Controller( Patient_View patient_view, Hospital_Database_Model database_controller, 
        Patient_Table_View patient_table_view ){

 this.patient_view = patient_view;
 this.database_controller = database_controller;
 this.patient_table_view = patient_table_view;
  rowSorter = new TableRowSorter<>(patient_table.getModel());
  patient_table.setRowSorter( rowSorter);
    generateId();
        patient_view.setPatientId("PAT"+ticket_id);
        patient_view.editable();
patientController();
patientButton();
}//End of Patient_Controller


/**
 * Method to generate an id
 */
public void generateId(){
int x =0;
do{
Random ran = new Random();
x = ran.nextInt(100000) + 1000;


}while(checkId(x)==true);

ticket_id=x;
}

/**
 * Method to check or verify id
 * @param x accepts long variable
 * @return set valid to true when condition is satisfied
 */
public boolean checkId(long x){
boolean valid=true;
try {
try(java.sql.Statement s = connection.createStatement()) {
    java.sql.ResultSet r = s.executeQuery("SELECT patientFname FROM patients where patientId="+x+";");
    try{
        if(r==null)
            valid= false;
        else
            valid= true;
    } catch(Exception e){
        System.out.println(e.toString());
    }
}}catch (Exception e) {
System.out.println("Error " + e.toString());
valid= false; 
	}
   return valid;     
}
    
/**
 * method to handle buttons pressed
 */
public void patientButton (){
try
{
    actionListener = (ActionEvent e) -> {

//Displaying what is in the database
if (e.getSource().equals(patient_table_view.getDisplay())
   ||e.getSource().equals(patient_table_view.getDisplay_menu())){
    database_controller.displayPatientdatabase();
}

//Updating what is in the patient database
if (e.getSource().equals(patient_table_view.getUpdate())
   ||e.getSource().equals(patient_table_view.getUpdate_menu())){
    database_controller.updatePatientdatabase();
}

//Deleting a row from the patient database
  if (e.getSource().equals(patient_table_view.getDelete())
     ||e.getSource().equals(patient_table_view.getDelete_menu())){
    database_controller.deletePatientdatabase();
}

  //The button to close the window
  if (e.getSource().equals(patient_table_view.getClose())
     ||e.getSource().equals(patient_table_view.getExit_menu())){
      System.out.println("Close button pressed");
    patient_table_view.dispose();
}

  //Import button pressed
  if (e.getSource().equals(patient_table_view.getOpen())
     ||e.getSource().equals(patient_table_view.getImport_menu())){
      System.out.println("Open button pressed");
     JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(patient_table_view);
      file = chooser.getSelectedFile();
      open(file);
  }

  //Export button pressed
  if (e.getSource().equals(patient_table_view.getSave())
     ||e.getSource().equals(patient_table_view.getExport_menu())){
      System.out.println("Save button pressed");
       JFileChooser chooser = new JFileChooser();
        chooser.showSaveDialog(patient_table_view);
     file = chooser.getSelectedFile();
      save(file);
  }
  
  //Search button pressed
  if (e.getSource().equals(patient_table_view.getSearch_button())){
      search();
  }
  
    //Print menu
  if (e.getSource().equals(patient_table_view.getPrint_menu())
      ||e.getSource().equals(patient_table_view.getPrint_button())){
      print();
  }
  
  //Clear table
  if (e.getSource().equals(patient_table_view.getClear_menu())){
      patient_table_view.setRowCount(0);
  }
  
  //Delete row
  if (e.getSource().equals(patient_table_view.getDeleteRow_menu())){
      patient_table_view.deleteRow();
  }
  
};
   patient_table_view.getDisplay().addActionListener ( actionListener );
   patient_table_view.getDisplay_menu().addActionListener ( actionListener );
   patient_table_view.getUpdate().addActionListener ( actionListener );
   patient_table_view.getUpdate_menu().addActionListener ( actionListener );
   patient_table_view.getDelete().addActionListener ( actionListener );
   patient_table_view.getDelete_menu().addActionListener ( actionListener );
   patient_table_view.getClose().addActionListener ( actionListener );
   patient_table_view.getExit_menu().addActionListener ( actionListener );
   patient_table_view.getOpen().addActionListener ( actionListener );
   patient_table_view.getImport_menu().addActionListener ( actionListener );
   patient_table_view.getSave().addActionListener ( actionListener );
   patient_table_view.getExport_menu().addActionListener ( actionListener );
   patient_table_view.getSearch_button().addActionListener(actionListener);
   patient_table_view.getPrint_menu().addActionListener(actionListener);
   patient_table_view.getPrint_button().addActionListener(actionListener);
   patient_table_view.getClear_menu().addActionListener(actionListener);
   patient_table_view.getDeleteRow_menu().addActionListener(actionListener);
}
catch( Exception e ){
    System.out.println(e.toString());
}
}
    
    
/**
 * A method to connect to the database
 */
public void patientController ( ){
try
{
actionListener = new ActionListener ( ){
    @Override
    public void actionPerformed ( ActionEvent e ){

    if ( e.getSource( ).equals ( patient_view.getImage_button ( ))){
        image();
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

Patient_Model patient_model = new Patient_Model ( patientId, patientFname, patientSname, patientAge, patientAddress, 
    patientPhone, patientGender, patientOccupation, patientBloodgroup, patientMaritalstatus, patientBirthdate,
    patientNational, patientDisease, patientSymptom, drugName, drugInstruction );

database_controller.insertPatientdatabase(patientId, patientFname, patientSname, patientAge, patientAddress, patientPhone,
    patientGender, patientOccupation, patientBloodgroup, patientMaritalstatus, patientBirthdate, patientNational, 
    patientDisease, patientSymptom, drugName, drugInstruction,patientImage );

ArrayList<Object> array = new ArrayList<>();
array.add(patient_model);

    System.out.println ( ""+array );
    resetTextFields();
    generateId();
    patient_view.setPatientId("PAT"+ticket_id);
        patient_view.editable();
    }
}
    
/**
 * Method to reset the text fields
 */
private void resetTextFields(){
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
   patient_view.setImage_button();
}
   
    
/**
 * Method to check for validation of input
 * @return true when the condition is satisfied
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
 * @param file the selected file name
 */
 public void open(File file)
{
table_model.setRowCount(0);
String split=",";
try
{
    input = new Scanner ( new BufferedReader ( new FileReader( file )));
    input.nextLine();
    while (input.hasNextLine()){
     String [] splitter=input.nextLine().split(split);
        Vector row=new Vector();
        row.addAll(Arrays.asList(splitter));
        table_model.addRow(row);
    }
 input.close();
 System.out.println("Opened data");
 JOptionPane.showMessageDialog ( patient_table_view, "Successfully Imported The File " +file.getName(), "IMPORTED", JOptionPane.INFORMATION_MESSAGE);
}//End Of Try
catch (IOException ex)
{ 
    System.out.println(ex.toString());
JOptionPane.showMessageDialog(patient_table_view, "Failed To Import File " +file.getName(), "ERROR", JOptionPane.ERROR_MESSAGE);
}//End Of Catch
}

 /**
 * Method to get column names of the patient table
 * @return the array of column names
 */
public ArrayList getColumnNames(){
    ArrayList<String> array = new ArrayList<>();
    for ( int i=0; i < patient_table.getColumnCount ( ); i++ )
       array.add ( patient_table.getColumnName ( i ) );
   return array;
}
     
    
/**
 * Method to save data to a file
 * @param file the name of the file to save
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
JOptionPane.showMessageDialog(patient_table_view, "Data Exported Successfully To " +file.getName(), "EXPORTED", JOptionPane.INFORMATION_MESSAGE);
}//End Of Try
    catch (IOException ex) 
    { 
        System.out.println(""+ex.toString());
        JOptionPane.showMessageDialog(patient_table_view, "Failed To Export Data", "ERROR "+file.getName(), JOptionPane.ERROR_MESSAGE);
    }
}//End Of Catch

/**
 * A method to allow searching of data in the table
 */
public void search ( ){
if ( patient_table_view.getSearch().trim().length() == 0 )
           rowSorter.setRowFilter( null );
        else
         rowSorter.setRowFilter ( RowFilter.regexFilter ( patient_table_view.getSearch() ) );
}//End of search

/**
 * Method to read and get image from a file chooser
 */
public void image(){
    JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(patient_view);
        file = chooser.getSelectedFile();
        String path = file.getAbsolutePath();
        System.out.println(""+path);
        patient_view.setPath(path);
        patient_view.getImage_button().setIcon(new ImageIcon (path));
        try{
            File image = new File(path);
            FileInputStream inputStream = new FileInputStream(image);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] byt = new byte[1024];
            for ( int readNum; (readNum=inputStream.read(byt))!=-1;){
                outputStream.write(byt,0,readNum);
            }
            patientImage = outputStream.toByteArray();
            System.out.println(Arrays.toString(patientImage));
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
}

/**
 * Method to print the table
 */
public void print(){
    MessageFormat header = new MessageFormat("Patient Report");
    MessageFormat footer = new MessageFormat("Page{0,number,integer}");
    try{
        patient_table.print(JTable.PrintMode.NORMAL,header,footer);
        JOptionPane.showMessageDialog(patient_table_view, "Data Printed Successfully", "PRINTED", JOptionPane.INFORMATION_MESSAGE);
    }
    catch(PrinterException | HeadlessException e){
        System.out.println(e.toString());
        JOptionPane.showMessageDialog(patient_table_view, "Failed To Print Data", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
    
}//End of class
