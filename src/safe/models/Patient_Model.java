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
    int patientPhone;
    String patientGender;
    String patientOccupation;
    String patientBloodgroup;
    String patientMaritalstatus;
    String patientBirthdate;
    String patientNational;
    String patientCountry;
    String patientCity;
    int patientPin;
    String patientEmail;
    byte patientImage;
    
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
     * @param patientEmail 
//     * @param patientImage 
     */
    public Patient_Model ( String patientId, String patientFname, String patientSname, int patientAge, String patientAddress, 
            int patientPhone, String patientGender, String patientOccupation, String patientBloodgroup, String patientMaritalstatus,
            String patientBirthdate, String patientNational, String patientCountry, String patientCity, int patientPin,
            String patientEmail ){
        this.patientId = patientId;
        this.patientFname = patientFname;
        this.patientSname = patientSname;
        this.patientAge = patientAge;
        this.patientAddress = patientAddress;
        this.patientPhone = patientPhone;
        this.patientGender = patientGender;
        this.patientBloodgroup = patientBloodgroup;
        this.patientCity = patientCity;
        this.patientBirthdate = patientBirthdate;
        this.patientOccupation = patientOccupation;
        this.patientPin = patientPin;
        this.patientEmail = patientEmail;
        this.patientCountry = patientCountry;
        this.patientNational = patientNational;
        this.patientMaritalstatus = patientMaritalstatus;
//        this.patientImage = patientImage;
        
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
    public void setPatientPhone ( int patientPhone ){
        this.patientPhone = patientPhone;
    }//End of setPatientPhone
    
    /**
     * 
     * @return 
     */
    public int getPatientPhone ( ){
        return patientPhone;
    }//End of getPatientPhone
    
    /**
     * 
     * @param patientGender
     */
    public void setPatientGender ( String patientGender ){
        this.patientGender = patientGender;
    }//End of setPatientGender
    
    /**
     * 
     * @return 
     */
    public String getPatientGender ( ){
        return patientGender;
    }//End of getPatientGender
    
    /**
     * 
     * @param patientBloodgroup
     */
    public void setPatientBloodgroup ( String patientBloodgroup ){
        this.patientBloodgroup = patientBloodgroup;
    }//End of setPatientGender
    
    /**
     * 
     * @return 
     */
    public String getPatientBloodgroup ( ){
        return patientBloodgroup;
    }//End of getPatientBloodgroup
    
    /**
     * 
     * @param patientMaritalstatus
     */
    public void setPatientMaritalstatus ( String patientMaritalstatus ){
        this.patientMaritalstatus = patientMaritalstatus;
    }//End of setPatientMaritalstatus
    
    /**
     * 
     * @return 
     */
    public String getPatientMaritalstatus ( ){
        return patientMaritalstatus;
    }//End of getPatientMaritalstatus
    
    /**
     * 
     * @param patientNational
     */
    public void setPatientNational ( String patientNational ){
        this.patientNational = patientNational;
    }//End of setPatientNational
    
    /**
     * 
     * @return 
     */
    public String getPatientNational ( ){
        return patientNational;
    }//End of getPatientNational
    
    /**
     * 
     * @param patientBirthdate
     */
    public void setPatientBirthdate ( String patientBirthdate ){
        this.patientBirthdate = patientBirthdate;
    }//End of setPatientBirthdate
    
    /**
     * 
     * @return 
     */
    public String getPatientBirthdate ( ){
        return patientBirthdate;
    }//End of getPatientBirthdate
    
    /**
     * 
     * @param patientCountry
     */
    public void setPatientCountry ( String patientCountry ){
        this.patientCountry = patientCountry;
    }//End of setPatientCountry
    
    /**
     * 
     * @return 
     */
    public String getPatientCountry ( ){
        return patientCountry;
    }//End of getPatientCountry
    
    /**
     * 
     * @param patientCity
     */
    public void setPatientCity ( String patientCity ){
        this.patientCity = patientCity;
    }//End of setPatientCity
    
    /**
     * 
     * @return 
     */
    public String getPatientCity ( ){
        return patientCity;
    }//End of getPatientCity
    
    /**
     * 
     * @param patientPin
     */
    public void setPatientPin ( int patientPin ){
        this.patientPin = patientPin;
    }//End of setPatientPin
    
    /**
     * 
     * @return 
     */
    public int getPatientPin ( ){
        return patientPin;
    }//End of getPatientPin
    
    /**
     * 
     * @param patientEmail
     */
    public void setPatientEmail ( String patientEmail ){
        this.patientEmail = patientEmail;
    }//End of setPatientEmail
    
    /**
     * 
     * @return 
     */
    public String getPatientEmail ( ){
        return patientEmail;
    }//End of getPatientEmail
    
    /**
     * 
     * @param patientImage
     */
    public void setPatientImage ( byte patientImage ){
        this.patientImage = patientImage;
    }//End of setPatientImage
    
    /**
     * 
     * @return 
     */
    public byte getPatientImage ( ){
        return patientImage;
    }//End of getPatientImage
    
    @Override
    public String toString (){
        return  patientId+" "+patientFname+" "+patientSname+" "+patientAge+" "+patientAddress+" "+patientPhone+" "+patientGender+
                " "+patientOccupation+" "+patientBloodgroup+" "+patientMaritalstatus+" "+patientBirthdate+" "+patientNational+
                " "+patientEmail+" "+patientCountry+" "+patientCity+" "+patientPin;
    }//End of toString
    
    
    
}//End of class
