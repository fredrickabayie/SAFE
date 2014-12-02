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
      }  
     };
    doctor_view.getClose_button().addActionListener ( actionListener );
   }
   catch(Exception e){
            
     }
}//End of doctorListener
    
}
