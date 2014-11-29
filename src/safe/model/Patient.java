/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.model;

/**
 *
 * @author Fredrick Abayie
 */
public class Patient {
    String patientId;
    String patientFname;
    String patientSname;
    int patientAge;
    String patientAddress;
    String patientPhone;
    
    /**
     * 
     * @param patientId
     * @param patientFname
     * @param patientSname
     * @param patientAge
     * @param patientAddress
     * @param patientPhone 
     */
    public Patient ( String patientId, String patientFname, String patientSname, int patientAge, String patientAddress, String patientPhone ){
        this.patientId = patientId;
        this.patientFname = patientFname;
        this.patientSname = patientSname;
        this.patientAge = patientAge;
        this.patientAddress = patientAddress;
        this.patientPhone = patientPhone;
    }//End of Patient
    
    /**
     * 
     * @param patientId 
     */
    public void setPatientId ( String patientId ){
        this.patientId = patientId;
    }//End of setPatientId
    
    /**
     * 
     * @return 
     */
    public String getPatientId ( ){
        return patientId;
    }//End of getPatientId
    
    /**
     * 
     * @param patientFname 
     */
    public void setPatientFname ( String patientFname ){
        this.patientFname = patientFname;
    }//End of setPatientFname
    
}//End of class
