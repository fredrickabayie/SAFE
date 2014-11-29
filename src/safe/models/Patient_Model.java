/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.models;

/**
 *
 * @author Fredrick Abayie
 */
public class Patient_Model {
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
    public Patient_Model ( String patientId, String patientFname, String patientSname, int patientAge, String patientAddress, String patientPhone ){
        this.patientId = patientId;
        this.patientFname = patientFname;
        this.patientSname = patientSname;
        this.patientAge = patientAge;
        this.patientAddress = patientAddress;
        this.patientPhone = patientPhone;
    }//End of Patient_Model
    
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
    
    /**
     * 
     * @return 
     */
    public String getPatientFname ( ){
        return patientFname;
    }//End of getPatientFname
    
    /**
     * 
     * @param patientSname 
     */
    public void setPatientSname ( String patientSname ){
        this.patientSname = patientSname;
    }//End of setPatientSname
    
    /**
     * 
     * @return 
     */
    public String getPatientSname ( ){
        return patientSname;
    }//End of getPatientSname
    
    /**
     * 
     * @param patientAge 
     */
    public void setPatientAge ( int patientAge ){
        this.patientAge = patientAge;
    }//End of setPatientAge
    
    /**
     * 
     * @return 
     */
    public int getPatientAge ( ){
        return patientAge;
    }//End of getPatientFname
    
    /**
     * 
     * @param patientAddress 
     */
    public void setPatientAddress ( String patientAddress ){
        this.patientAddress = patientAddress;
    }//End of setPatientAddress
    
    /**
     * 
     * @return 
     */
    public String getPatientAddress ( ){
        return patientAddress;
    }//End of getPatientAddress
    
    /**
     * 
     * @param patientPhone
     */
    public void setPatientPhone ( String patientPhone ){
        this.patientPhone = patientPhone;
    }//End of setPatientPhone
    
    /**
     * 
     * @return 
     */
    public String getPatientPhone ( ){
        return patientPhone;
    }//End of getPatientPhone
    
    @Override
    public String toString (){
        return  patientId+" "+patientFname+" "+patientSname+" "+patientAge+" "+patientAddress+" "+patientPhone;
    }
    
    
    
}//End of class
