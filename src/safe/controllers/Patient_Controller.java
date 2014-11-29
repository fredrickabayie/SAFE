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

/**
 *
 * @author chokayg3
 */
public class Patient_Controller {
    private final Patient_View patient_view;
    private ActionListener actionListener;
    
    public Patient_Controller( Patient_View patient_view ){
     this.patient_view = patient_view;   
    }
    
    public void controller ( ){
        actionListener = new ActionListener ( ){
            @Override
            public void actionPerformed ( ActionEvent e ){
                if ( e.getSource( ).equals ( patient_view.getCancel_button ( ))){
                    patient_view.dispose();
                }
                if ( e.getSource( ).equals ( patient_view.getOk_button ( ))){
                    String patientId = patient_view.getPatientId();
                    String patientFname = patient_view.getPatientFname();
                    String patientSname = patient_view.getPatientSname();
                    int patientAge = patient_view.getPatientAge();
                    String patientAddress = patient_view.getPatientAddress();
                    String patientPhone = patient_view.getPatientPhone();
                    Patient_Model patient_model = new Patient_Model ( patientId, patientFname, patientSname, patientAge, patientAddress, patientPhone );
                    
                    System.out.println ( ""+patient_model.toString() );
                }
            }
        };
        patient_view.getCancel_button().addActionListener ( actionListener );
        patient_view.getOk_button().addActionListener ( actionListener );
    }
    
}
