/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
//import javax.swing.JOptionPane;
import safe.views.Patient_View;
import safe.models.Patient_Model;
//import safe.controllers.Database_Controller;

/**
 *
 * @author Fredrick Abayie
 */
public class Patient_Controller {
    private final Patient_View patient_view;
    private final Database_Controller database_controller;
    private ActionListener actionListener;
    
    /**
     * 
     * @param patient_view 
     * @param database_controller 
     */
    public Patient_Controller( Patient_View patient_view, Database_Controller database_controller ){
     this.patient_view = patient_view;   
     this.database_controller = database_controller;
    }//End of Patient_Controller
    
    /**
     * A method to connect to the database
     */
    public void controller ( ){
        try
        {
        actionListener = new ActionListener ( ){
            @Override
            public void actionPerformed ( ActionEvent e ){
                if ( e.getSource( ).equals ( patient_view.getCancel_button ( ))){
                    patient_view.dispose();
                }//End of if
                if ( e.getSource( ).equals ( patient_view.getConnect_button ( ))){
                    database_controller.connectTodatabase();
                }//End of if
                if ( e.getSource( ).equals( patient_view.getClose_button ( ))){
                    patient_view.dispose();
                }//End of if
                if ( e.getSource( ).equals ( patient_view.getOk_button ( ))){
                    String patientId = patient_view.getPatientId();
                    String patientFname = patient_view.getPatientFname();
                    String patientSname = patient_view.getPatientSname();
                    int patientAge = patient_view.getPatientAge();
                    String patientAddress = patient_view.getPatientAddress();
                    int patientPhone = patient_view.getPatientPhone();
                    String patientEmail = patient_view.getPatientEmail();
                    String patientCountry = patient_view.getPatientCountry();
                    int patientPin = patient_view.getPatientPin();
                    String patientNational = patient_view.getPatientNational();
                    String patientCity = patient_view.getPatientCity();
                    String patientBloodgroup = patient_view.getPatientBloodgroup();
                    String patientOccupation = patient_view.getPatientOccupation();
                    String patientGender = patient_view.getPatientGender();
                    String patientMaritalstatus = patient_view.getPatientMaritalstatus();
//                    String patientBirth = null;
//                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
//                    patientBirth=sdf.format(patient_view.getPatientBirthdate().get);
//                     bookingControl.setValues(9,strDate); //store the date as string
                    String patientBirthdate = patient_view.getPatientBirthdate();
                    Patient_Model patient_model = new Patient_Model ( patientId, patientFname, patientSname, patientAge, patientAddress, 
                            patientPhone, patientGender, patientOccupation, patientBloodgroup, patientMaritalstatus, patientBirthdate,
                    patientNational, patientCountry, patientCity, patientPin, patientEmail );
                    database_controller.insertTodatabase(patientId, patientFname, patientSname, patientAge, patientAddress, patientPhone,
                            patientGender, patientOccupation, patientBloodgroup, patientMaritalstatus, patientBirthdate, patientNational, 
                            patientCountry, patientCity, patientPin, patientEmail);
                    System.out.println ( ""+patient_model.toString() );
                }//End of if
            }//End of actionPerformed
        };//End of ActionListener
        patient_view.getCancel_button().addActionListener ( actionListener );
        patient_view.getOk_button().addActionListener ( actionListener );
        patient_view.getConnect_button().addActionListener ( actionListener );
        patient_view.getClose_button().addActionListener ( actionListener );
        }
        catch ( Exception e ){
//            JOptionPane.showMessageDialog(null, "Failed To Connect To The DataBase", "Not Connected", JOptionPane.ERROR_MESSAGE);
//            System.out.print(e.toString());
        }
    }//End of controller
    
}//End of class
