/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
                if ( e.getSource( ).equals ( patient_view.getOk_button ( ))){
                    String patientId = patient_view.getPatientId();
                    String patientFname = patient_view.getPatientFname();
                    String patientSname = patient_view.getPatientSname();
                    int patientAge = patient_view.getPatientAge();
                    String patientAddress = patient_view.getPatientAddress();
                    String patientPhone = patient_view.getPatientPhone();
                    Patient_Model patient_model = new Patient_Model ( patientId, patientFname, patientSname, patientAge, patientAddress, patientPhone );
                    
                    System.out.println ( ""+patient_model.toString() );
                }//End of if
            }//End of actionPerformed
        };//End of ActionListener
        patient_view.getCancel_button().addActionListener ( actionListener );
        patient_view.getOk_button().addActionListener ( actionListener );
        patient_view.getConnect_button().addActionListener ( actionListener );
        }
        catch ( Exception e ){
        }
    }//End of controller
    
}//End of class
