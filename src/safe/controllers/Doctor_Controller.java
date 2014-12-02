/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import safe.views.Doctor_View;
import safe.models.Database_Model;
import safe.models.Doctor_Model;

/**
 *
 * @author chokayg3
 */
public class Doctor_Controller {
    Doctor_View doctor_view;
    Database_Model database_controller;
    ActionListener actionListener;
    
    
public Doctor_Controller (Doctor_View doctor_view, Database_Model database_controller){
        this.doctor_view = doctor_view;
        this.database_controller = database_controller;
    }
    
    
public void doctorButton (){
try
   {
    actionListener = new ActionListener ( ){
    public void actionPerformed ( ActionEvent e ){
      if (e.getSource().equals(doctor_view.getClose_button())){
           doctor_view.dispose();
        }
      
      if (e.getSource().equals(doctor_view.getOk_button())){
          insert();
      }
      }  
     };
    doctor_view.getClose_button().addActionListener ( actionListener );
    doctor_view.getOk_button().addActionListener ( actionListener );
   }
   catch(Exception e){
            
     }
}//End of doctorButton

public void insert(){
    String doctorId = doctor_view.getDoctorId();
    String doctorFname = doctor_view.getDoctorFname();
    String doctorSname = doctor_view.getDoctorSname();
    int doctorPhone = Integer.parseInt(doctor_view.getDoctorPhone());
    String doctorEmail = doctor_view.getDoctorEmail();
    String doctorDepartment = doctor_view.getDoctorDepartment();
    String doctorDate = doctor_view.getDoctorDate();
    
    Doctor_Model doctor_model = new Doctor_Model(doctorId,doctorFname,doctorSname,doctorPhone,doctorEmail,
            doctorDepartment,doctorDate);
    
    database_controller.insertDoctordatabase(doctorId, doctorFname, doctorSname, doctorPhone, doctorEmail, 
            doctorDepartment, doctorDate);
    System.out.println(""+doctor_model.toString());
}
    
}
