/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.models;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import safe.views.Doctor_Table_View;
import safe.views.Doctor_View;
import safe.views.Patient_View;
import safe.views.Patient_Table_View;

/**
 *
 * @author Abayie Fredrick
 */
public class Hospital_Database_Model {
    Connection connection = null;
    Patient_View patient_view;
    Patient_Table_View patient_table_view;
    Doctor_View doctor_view;
    Doctor_Table_View doctor_table_view;
    
    /**
     * Constructor for the class
     * @param patient_view
     * @param patient_table_view 
     * @param doctor_view 
     * @param doctor_table_view 
     */
    public Hospital_Database_Model(Patient_View patient_view, Patient_Table_View patient_table_view, Doctor_View doctor_view,
            Doctor_Table_View doctor_table_view){
        this.patient_view = patient_view;
        this.patient_table_view = patient_table_view;
        this.doctor_view = doctor_view;
        this.doctor_table_view = doctor_table_view;
        connectTodatabase();
    }
    
    /**
     * A method to connect to the database
     */
    public final void connectTodatabase ( ){
    try
        {
            Class.forName ( "com.mysql.jdbc.Driver" ).newInstance ( );
             connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/safe?user=root&password=Ashesi@2016?");
             System.out.println ( "Connected" );
        }//End Of Try
        catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e )
        {
            System.out.println ( "Not Connected " + e.toString ( ) );
        }//End Of Catch
    }
    
    /**
     * Method to insert data into the patient table in the 
     * database
     * @param patientId
     * @param patientFname
     * @param patientSname
     * @param patientAge
     * @param patientAddress
     * @param patientPhone 
     * @param patientGender 
     * @param patientOccupation 
     * @param patientBloodgroup 
     * @param patientMaritalstatus 
     * @param patientBirthdate 
     * @param patientNational 
     * @param patientDisease 
     * @param patientSymptom 
     * @param drugName 
     * @param drugInstruction 
     * @param patientImage 
     */
    public void insertPatientdatabase ( String patientId, String patientFname, String patientSname, int patientAge, String patientAddress, 
            int patientPhone, String patientGender, String patientOccupation, String patientBloodgroup, String patientMaritalstatus,
            String patientBirthdate, String patientNational, String patientDisease, String patientSymptom, String drugName,
            String drugInstruction, byte[] patientImage ) {

         try
        {
            PreparedStatement pStatement = connection.prepareStatement ( "Insert Into patients set patientId=?, patientFname=?,"
                    + " patientSname=?, patientAge=?, patientAddress=?, patientPhone=?, patientGender=?, patientOccupation=?,"
            + "patientBloodgroup=?, patientMaritalstatus=?, patientBirthdate=?, patientNational=?,patientDisease=?,patientSymptom=?,"
                    + "drugName=?,drugInstruction=?,patientImage=?" );
            pStatement.setString ( 1, patientId );
            pStatement.setString ( 2, patientFname );
            pStatement.setString ( 3, patientSname );
            pStatement.setInt ( 4, patientAge );
            pStatement.setString ( 5, patientAddress );
            pStatement.setInt ( 6, patientPhone );
            pStatement.setString ( 7, patientGender );
            pStatement.setString ( 8, patientOccupation );
            pStatement.setString ( 9, patientBloodgroup );
            pStatement.setString ( 10, patientMaritalstatus );
            pStatement.setString ( 11, patientBirthdate );
            pStatement.setString ( 12, patientNational );
            pStatement.setString ( 13, patientDisease );
            pStatement.setString ( 14, patientSymptom );
            pStatement.setString ( 15, drugName );
            pStatement.setString ( 16, drugInstruction );
            pStatement.setBytes ( 17, patientImage );
            pStatement.execute ( );
            JOptionPane.showMessageDialog(patient_view, "Successfully Inserted The Data In The DataBase", "Inserted", JOptionPane.INFORMATION_MESSAGE);
        }//End Of Try
        catch ( SQLException e )
        {
            System.out.println ( e.toString ( ) );
          JOptionPane.showMessageDialog(patient_view, "Failed To Insert The Data In The DataBase", "Failed", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
    }
    
    /**
     *Method to display patient database
     */
    public void displayPatientdatabase ( ) {
         patient_table_view.setRowCount(0);        
        try 
        {
             Statement statement = connection.createStatement ( );
             ResultSet resultSet = statement.executeQuery ( "SELECT * FROM patients" );
         while ( resultSet.next ( ) )
         {
             Object [] w = {resultSet.getString ( "patientId" ),resultSet.getString ( "patientFname" ),resultSet.getString ( "patientSname" ),
                 resultSet.getString ( "patientAge" ),resultSet.getString ( "patientAddress" ),resultSet.getString ( "patientPhone" ),
             resultSet.getString ( "patientGender" ),resultSet.getString ( "patientOccupation" ),resultSet.getString ( "patientBloodgroup" ),
             resultSet.getString ( "patientMaritalstatus" ),resultSet.getString ( "patientBirthdate" ),resultSet.getString ( "patientNational" ),
             resultSet.getString ( "patientDisease" ),resultSet.getString ( "patientSymptom" ),resultSet.getString ( "drugName" ),
             resultSet.getString ( "drugInstruction" )};          
             System.out.println(""+Arrays.toString(w));
             System.out.println(resultSet.getString("patientId"));
             patient_table_view.addRow(w);
         }//End Of While
         System.out.println("Displayed");
         JOptionPane.showMessageDialog(patient_table_view, "Successfully Dispalyed The Data In The DataBase", "Displayed", JOptionPane.INFORMATION_MESSAGE);     
        }//End Of Try
        catch ( SQLException e ) 
        {
            System.out.println(e.toString());
        JOptionPane.showMessageDialog(patient_table_view, "Failed To Display The Data In The DataBase", "Failed", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
    }
    
    
    /**
     * display method for doctor database
     */
    public void displayDoctordatabase ( ) {
         doctor_table_view.setRowCount(0);        
        try 
        {
             Statement statement = connection.createStatement ( );
             ResultSet resultSet = statement.executeQuery ( "SELECT * FROM doctors" );
         while ( resultSet.next ( ) )
         {
             ArrayList<Object> array = new ArrayList<>();
             Object [] w = {resultSet.getString ( "doctorId" ),resultSet.getString ( "doctorFname" ),resultSet.getString ( "doctorSname" ),
                 resultSet.getString ( "doctorPhone" ),resultSet.getString ( "doctorEmail" ),resultSet.getString ( "doctorDepartment" ),
             resultSet.getString ( "doctorDate" ),resultSet.getString("doctorPassword")};
            array.add(w);
             System.out.println(""+array);
             System.out.println(resultSet.getString("doctorId"));
             doctor_table_view.addRow(w);
         }//End Of While
         System.out.println("Displayed");
         JOptionPane.showMessageDialog(doctor_table_view, "Successfully Dispalyed The Data In The DataBase", "Displayed", JOptionPane.INFORMATION_MESSAGE);     
        }//End Of Try
        catch ( SQLException e ) 
        {
            System.out.println(e.toString());
        JOptionPane.showMessageDialog(doctor_table_view, "Failed To Display The Data In The DataBase", "Failed", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
    }
    
/**
 * update method for patients
 */
    public void updatePatientdatabase(){
        System.out.println(patient_table_view.getRowCount());
        try{
             PreparedStatement pStatement = connection.prepareStatement ( "UPDATE patients set patientFname=?,patientSname=?,"
                     + "patientAge=?,patientAddress=?,patientPhone=?,patientGender=?,patientOccupation=?,patientBloodgroup=?,"
                     +"patientMaritalstatus=?,patientBirthdate=?,patientNational=?,patientDisease=?,patientSymptom=?,"
                     + "drugName=?,drugInstruction=? where patientId=?");
             
             for ( int i=0; i<patient_table_view.getRowCount();i++){
                 pStatement.setString ( 1, (String) patient_table_view.getValueAt(i, 1) );
                 pStatement.setString ( 2, (String) patient_table_view.getValueAt(i, 2) );
                 System.out.println(i);
                 pStatement.setString (3, (String) (patient_table_view.getValueAt(i, 3)));
                 pStatement.setString ( 4, (String) patient_table_view.getValueAt(i, 4) );
                 pStatement.setString ( 5, (String) patient_table_view.getValueAt(i, 5) );
                 pStatement.setString ( 6, (String) patient_table_view.getValueAt(i, 6) );
                 pStatement.setString ( 7, (String) patient_table_view.getValueAt(i, 7) );
                 pStatement.setString ( 8, (String) patient_table_view.getValueAt(i, 8) );
                 pStatement.setString ( 9, (String) patient_table_view.getValueAt(i, 9) );
                 pStatement.setString ( 10, (String) patient_table_view.getValueAt(i, 10) );
                 pStatement.setString ( 11, (String) patient_table_view.getValueAt(i, 11) );
                 pStatement.setString ( 12, (String) patient_table_view.getValueAt(i, 12) );
                 pStatement.setString ( 13, (String) patient_table_view.getValueAt(i, 13) );
                 pStatement.setString ( 14, (String) patient_table_view.getValueAt(i, 14) );
                 pStatement.setString ( 15, (String) patient_table_view.getValueAt(i, 15) );
                 pStatement.setString ( 16, (String) patient_table_view.getValueAt(i, 0) );
                 pStatement.executeUpdate ( );
                 pStatement.execute();
                 System.out.println ("End of update");
             }
             JOptionPane.showMessageDialog(patient_table_view, "Successfully Updated The Data In The DataBase", "Update", JOptionPane.INFORMATION_MESSAGE);
        }
        catch( SQLException | HeadlessException e ){
            System.out.println(e.toString());
            System.out.println("Could not update");
            JOptionPane.showMessageDialog(patient_table_view, "Failed To Update The Data In The DataBase", "Failed", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    /**
     * method to update the doctors database
     */
    public void updateDoctordatabase(){
        System.out.println(doctor_table_view.getRowCount());
        try{
             PreparedStatement pStatement = connection.prepareStatement ( "UPDATE doctors set doctorFname=?,doctorSname=?,"
                     + "doctorPhone=?,doctorEmail=?,doctorDepartment=?,doctorDate=?,doctorPassword=? where doctorId=?");
             
             for ( int i=0; i<doctor_table_view.getRowCount();i++){
                 pStatement.setString ( 1, (String) doctor_table_view.getValueAt(i, 1) );
                 pStatement.setString ( 2, (String) doctor_table_view.getValueAt(i, 2) );
                 System.out.println(i);
                 pStatement.setString (3, (String) doctor_table_view.getValueAt(i, 3));
                 pStatement.setString ( 4, (String) doctor_table_view.getValueAt(i, 4) );
                 pStatement.setString ( 5, (String) doctor_table_view.getValueAt(i, 5) );
                 pStatement.setString ( 6, (String) doctor_table_view.getValueAt(i, 6) );
                 pStatement.setString ( 7, (String) doctor_table_view.getValueAt(i, 7) );
                 pStatement.setString ( 8, (String) doctor_table_view.getValueAt(i, 0) );
                
                 pStatement.executeUpdate ( );
                 pStatement.execute();
                 System.out.println ("End of update");
             }
           JOptionPane.showMessageDialog(doctor_table_view, "Successfully Updated The Data In The DataBase", "Updated", JOptionPane.INFORMATION_MESSAGE);
        }
        catch( SQLException | HeadlessException e ){
            System.out.println(e.toString());
            System.out.println("Could not update");
            JOptionPane.showMessageDialog(doctor_table_view, "Failed To Update The Data In The DataBase", "Failed", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    
/**
 * delete method for patients
 */
    public void deletePatientdatabase(){
//         int row=patient_table_view.getSelectedRow();
        String deleteThis=patient_table_view.getValueAt(patient_table_view.getSelectedRow(),0);
        System.out.println(deleteThis);
         try
        {
            PreparedStatement pStatement = connection.prepareStatement ( "Delete From patients Where patientId=?" );
            pStatement.setString(1, deleteThis);
            pStatement.executeUpdate();
            pStatement.execute();
            System.out.println("Deleted from database");
            
            if ( patient_table_view.getSelectedRow ( ) >= 0 )
            patient_table_view.deleteRow ( );
             JOptionPane.showMessageDialog(patient_table_view, "Successfully Deleted The Data In The DataBase", "Deleted", JOptionPane.INFORMATION_MESSAGE);
        }//End Of Try
        catch ( SQLException e )
        {
            System.out.println(e.toString());
            System.out.println("Could not delete");
       JOptionPane.showMessageDialog(patient_table_view, "Failed To Delete The Data From The DataBase", "Not Deleted", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
    }//End of deleteDatabase

    
    
/**
 * delete method for doctors database
 */
    public void deleteDoctordatabase(){
//         int row=patient_table_view.getSelectedRow();
        String deleteThis=doctor_table_view.getValueAt(doctor_table_view.getSelectedRow(),0);
        System.out.println(deleteThis);
         try
        {
            PreparedStatement pStatement = connection.prepareStatement ( "Delete From doctors Where doctorId=?" );
            pStatement.setString(1, deleteThis);
            pStatement.executeUpdate();
            pStatement.execute();
            System.out.println("Deleted from database");
            
            if ( doctor_table_view.getSelectedRow ( ) >= 0 )
            doctor_table_view.deleteRow ( );
         JOptionPane.showMessageDialog(doctor_table_view, "Successfully Deleted The Data In The DataBase", "Deleted", JOptionPane.INFORMATION_MESSAGE);
        }//End Of Try
        catch ( SQLException e )
        {
            System.out.println(e.toString());
            System.out.println("Could not delete");
        JOptionPane.showMessageDialog(doctor_table_view, "Failed To Delete The Data From The DataBase", "Not Deleted", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
    }//End of deleteDatabase

    
    /**
     * method to insert data into the doctors database
     * @param doctorId
     * @param doctorFname
     * @param doctorSname
     * @param doctorPhone
     * @param doctorEmail
     * @param doctorDepartment
     * @param doctorDate 
     * @param doctorPassword 
     */
    public void insertDoctordatabase(String doctorId,String doctorFname,String doctorSname,int doctorPhone,String doctorEmail,
            String doctorDepartment,String doctorDate,String doctorPassword){
        try
        {
             PreparedStatement pStatement = connection.prepareStatement ("Insert into doctors set doctorId=?, doctorFname=?,"
                     + "doctorSname=?,doctorPhone=?,doctorEmail=?,doctorDepartment=?,doctorDate=?, doctorPassword=?");
             
             pStatement.setString (1, doctorId);
             pStatement.setString (2, doctorFname);
             pStatement.setString (3, doctorSname);
             pStatement.setInt (4, doctorPhone);
             pStatement.setString (5, doctorEmail);
             pStatement.setString (6, doctorDepartment);
             pStatement.setString (7, doctorDate);
             pStatement.setString (8, doctorPassword);
             
             pStatement.execute ( );
         JOptionPane.showMessageDialog(doctor_view, "Successfully Inserted The Data In The DataBase", "Inserted", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException | HeadlessException e){
            System.out.println(e.toString());
         JOptionPane.showMessageDialog(doctor_view, "Failed To Insert The Data From The DataBase", "Not Inserted", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}//End of class