/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import safe.views.Doctor_Table_View;
import safe.views.Doctor_View;
import safe.views.Login_View;
import safe.views.Main_View;
import safe.views.Patient_Table_View;
import safe.views.Patient_View;

/**
 *
 * @author chokayg3
 */
public final class Main_Controller {
    Main_View main_view;
    ActionListener actionListener;
    Patient_Controller patient_controller;
    Patient_View patient_view;
    Patient_Table_View patient_table_view;
    Doctor_View doctor_view;
    Doctor_Table_View doctor_table_view;
    Login_View login_view;
    
    public Main_Controller( Main_View main_view, Patient_Controller patient_controller, Patient_View patient_view,
            Patient_Table_View patient_table_view,Doctor_View doctor_view,Doctor_Table_View doctor_table_view,
            Login_View login_view){
        this.main_view = main_view;
        this.patient_controller = patient_controller;
        this.patient_view = patient_view;
        this.patient_table_view = patient_table_view;
        this.doctor_view = doctor_view;
        this.doctor_table_view = doctor_table_view;
        this.login_view = login_view;
        menu ( );
    }
    
    
    /**
     * Method to get the actions of the main view menu
     */
    public void menu ( ){
         try
        {
            actionListener = (ActionEvent e) -> {
                //
                if (e.getSource().equals(main_view.getAddPatient_menu())){
                    patient_view.setVisible(true);
//                    patient_controller;
                    System.out.println("add patient pressed");
                }
                
                if (e.getSource().equals(main_view.getPatientTable_menu())){
                    patient_table_view.setVisible(true);
                    System.out.println("patient table pressed");
                }
                
                if (e.getSource().equals(main_view.getAddDoctor_menu())){
                    doctor_view.setVisible(true);
                    System.out.println("add doctor pressed");
                }
                
                if (e.getSource().equals(main_view.getDoctorTable_menu())){
                    doctor_table_view.setVisible(true);
                    System.out.println("doctor table pressed");
                }
                
                if (e.getSource().equals(main_view.getDoctorLogin_menu())){
                    login_view.setVisible(true);
                    System.out.println("login menu pressed");
                }
              };
               main_view.getAddPatient_menu().addActionListener ( actionListener );
               main_view.getPatientTable_menu().addActionListener ( actionListener );
               main_view.getAddDoctor_menu().addActionListener ( actionListener );
               main_view.getDoctorTable_menu().addActionListener ( actionListener );
               main_view.getDoctorLogin_menu().addActionListener ( actionListener );
        }
        
        catch( Exception e ){
            System.out.println(e.toString());
        }    
}
}
