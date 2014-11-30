/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author chokayg3
 */
public class Database_Controller {
    Connection connection = null;
    
    
    /**
     * A method to connect to the database
     */
    public void connectTodatabase ( ){
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
     */
    public void insertTodatabase ( String patientId, String patientFname, String patientSname, int patientAge, String patientAddress, 
            int patientPhone, String patientGender, String patientOccupation, String patientBloodgroup, String patientMaritalstatus,
            String patientBirthdate, String patientNational, String patientCountry, String patientCity, int patientPin, String patientEmail ){
         try
        {
            PreparedStatement pStatement = connection.prepareStatement ( "Insert Into patients set patientId=?, patientFname=?,"
                    + " patientSname=?, patientAge=?, patientAddress=?, patientPhone=?, patientGender=?, patientOccupation=?,"
            + "patientBloodgroup=?, patientMaritalstatus=?, patientBirthdate=?, patientNational=?, patientCountry=?,"
            + "patientCity=?, patientPin=?" );
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
            pStatement.execute ( );
        }//End Of Try
        catch ( SQLException e )
        {
            System.out.println ( e.toString ( ) );
        }//End Of Catch
    }
    
}
