/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

import safe.views.Doctor_View;
import safe.models.Patient_Database_Model;

/**
 *
 * @author chokayg3
 */
public class Doctor_Controller {
    Doctor_View doctor_view;
    Patient_Database_Model database_controller;
    
    
    
    public Doctor_Controller (Doctor_View doctor_view, Patient_Database_Model database_controller){
        this.doctor_view = doctor_view;
        this.database_controller = database_controller;
    }
    
}
