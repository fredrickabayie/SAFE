/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.models;

import java.sql.Connection;
import java.sql.*;
import java.util.Arrays;
import safe.views.Doctor_View;
import safe.views.Patient_View;
import safe.views.Patient_Table_View;

/**
 *
 * @author chokayg3
 */
public class Database_Model {
    Connection connection = null;
    Patient_View patient_view;
    Patient_Table_View patient_table_view;
    Doctor_View doctor_view;
    
    /**
     * 
     * @param patient_view
     * @param patient_table_view 
     */
    public Database_Model(Patient_View patient_view, Patient_Table_View patient_table_view, Doctor_View doctor_view){
        this.patient_view = patient_view;
        this.patient_table_view = patient_table_view;
        this.doctor_view = doctor_view;
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
     * 
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
     * @param patientCountry 
     * @param patientCity 
     * @param patientPin 
     * @param patientEmail 
     */
    public void insertPatientdatabase ( String patientId, String patientFname, String patientSname, int patientAge, String patientAddress, 
            int patientPhone, String patientGender, String patientOccupation, String patientBloodgroup, String patientMaritalstatus,
            String patientBirthdate, String patientNational, String patientCountry, String patientCity, int patientPin, 
            String patientEmail ) {
//        JFileChooser filechooser = new JFileChooser();
//                    filechooser.showOpenDialog(patient_view);
//                    File file = filechooser.getSelectedFile();
//                    String path = file.getAbsolutePath();
//                    patient_view.getImage_button().setIcon(new ImageIcon (path));
         try
        {
//            FileInputStream input = new FileInputStream(file);
//            int length = ( int )file.length();
//            patientImage = input;
            
            PreparedStatement pStatement = connection.prepareStatement ( "Insert Into patients set patientId=?, patientFname=?,"
                    + " patientSname=?, patientAge=?, patientAddress=?, patientPhone=?, patientGender=?, patientOccupation=?,"
            + "patientBloodgroup=?, patientMaritalstatus=?, patientBirthdate=?, patientNational=?, patientCountry=?,"
            + "patientCity=?, patientPin=?, patientEmail=?" );
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
            pStatement.setString ( 13, patientCountry );
            pStatement.setString ( 14, patientCity );
            pStatement.setInt ( 15, patientPin );
            pStatement.setString ( 16, patientEmail );
//            pStatement.setBlob ( 17, patientImage );
            pStatement.execute ( );
        }//End Of Try
        catch ( SQLException e )
        {
            System.out.println ( e.toString ( ) );
        }//End Of Catch
    }
    
    /**
     * 
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
             resultSet.getString ( "patientCountry" ),resultSet.getString ( "patientCity" ),resultSet.getString ( "patientPin" ),
             resultSet.getString ( "patientEmail" )};
//             resultSet.getString ( "patientAge" ),resultSet.getString ( "patientAddress" ), resultSet.getString ( "patientPhone" ),resultSet.getString ( "Travel" ),
//             resultSet.getString ( "Departure" ),resultSet.getString ( "Price" ),resultSet.getString ( "Traveldate" ),resultSet.getString ( "Age" )};
             System.out.println(""+Arrays.toString(w));
             System.out.println(resultSet.getString("patientId"));
             patient_table_view.addRow(w);
         }//End Of While
         System.out.println("Displayed");
//         JOptionPane.showMessageDialog(null, "Successfully Dispalyed The Data In The DataBase", "Displayed", JOptionPane.INFORMATION_MESSAGE);     
        }//End Of Try
        catch ( SQLException e ) 
        {
            System.out.println(e.toString());
//        JOptionPane.showMessageDialog(null, "Failed To Display The Data In The DataBase", "Failed", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
    }
    
    public void updatePatientdatabase(){
        System.out.println(patient_table_view.getRowCount());
        try{
             PreparedStatement pStatement = connection.prepareStatement ( "UPDATE patients set patientFname=?,patientSname=?,"
                     + "patientAge=?,patientAddress=?,patientPhone=?,patientGender=?,patientOccupation=?,patientBloodgroup=?,"
                     +"patientMaritalstatus=?,patientBirthdate=?,patientNational=?,patientCountry=?,patientCity=?,patientPin=?,"
                     +"patientEmail=? where patientId=?");
             
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
                 pStatement.setString(16, (String) patient_table_view.getValueAt(i, 0));
                 pStatement.executeUpdate ( );
                 pStatement.execute();
                 System.out.println ("End of update");
             }
             
        }
        catch( Exception e ){
            System.out.println(e.toString());
            System.out.println("Could not update");
        }

    }
    
    public void deletePatientdatabase(){
//         int row=patient_table_view.getSelectedRow();
        String deleteThis=patient_table_view.getValueAt(patient_table_view.getSelectedRow(),0);
        System.out.println(deleteThis);
         try
        {
//            PreparedStatement pStatement = connection.prepareStatement ( "Delete From patients Where patientId="+deleteThis+";" );
            PreparedStatement pStatement = connection.prepareStatement ( "Delete From patients Where patientId=?" );
            pStatement.setString(1, deleteThis);
            pStatement.executeUpdate();
            pStatement.execute();
            System.out.println("Deleted from database");
//        JOptionPane.showMessageDialog(null, "Successfully Deleted The Data From The DataBase", "Deleted", JOptionPane.INFORMATION_MESSAGE);
        
            if ( patient_table_view.getSelectedRow ( ) >= 0 )
            patient_table_view.deleteRow ( );
        }//End Of Try
        catch ( SQLException e )
        {
            System.out.println(e.toString());
            System.out.println("Could not delete");
//            JOptionPane.showMessageDialog(null, "Failed To Delete The Data From The DataBase", "Not Deleted", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
    }//End of deleteDatabase
    
    
    public void insertDoctordatabase(){
        
    }
    
    
}//End of class