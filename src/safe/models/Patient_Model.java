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
    String patientDisease;
    String patientSymptom;
    String drugName;
    String drugInstruction;
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
     * @param patientDisease 
     * @param patientSymptom 
     * @param drugName 
     * @param drugInstruction 
     */
    public Patient_Model ( String patientId, String patientFname, String patientSname, int patientAge, String patientAddress, 
            int patientPhone, String patientGender, String patientOccupation, String patientBloodgroup, String patientMaritalstatus,
            String patientBirthdate, String patientNational, String patientDisease, String patientSymptom, String drugName,
            String drugInstruction){
        this.patientId = patientId;
        this.patientFname = patientFname;
        this.patientSname = patientSname;
        this.patientAge = patientAge;
        this.patientAddress = patientAddress;
        this.patientPhone = patientPhone;
        this.patientGender = patientGender;
        this.patientBloodgroup = patientBloodgroup;
        this.patientBirthdate = patientBirthdate;
        this.patientOccupation = patientOccupation;
        this.patientDisease = patientDisease;
        this.patientNational = patientNational;
        this.patientMaritalstatus = patientMaritalstatus;
        this.patientSymptom = patientSymptom;
        this.drugName = drugName;
        this.drugInstruction = drugInstruction;
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
     * @param patientDisease
     */
    public void setPatientDisease ( String patientDisease ){
        this.patientDisease = patientDisease;
    }//End of setPatientDisease
    
    /**
     * 
     * @return 
     */
    public String getPatientDisease ( ){
        return patientDisease;
    }//End of getPatientDisease
    
    /**
     * 
     * @param patientSymptom
     */
    public void setPatientSymptom ( String patientSymptom ){
        this.patientSymptom = patientSymptom;
    }//End of setPatientSymptom
    
    /**
     * 
     * @return 
     */
    public String getPatientSymptom ( ){
        return patientSymptom;
    }//End of getPatientSymptom
    
    /**
     * 
     * @param drugName
     */
    public void setDrugName ( String drugName ){
        this.drugName = drugName;
    }//End of setDrugName
    
    /**
     * 
     * @return 
     */
    public String getDrugName ( ){
        return drugName;
    }//End of getDrugName
    
    /**
     * 
     * @param drugInstruction
     */
    public void setDrugInstruction ( String drugInstruction ){
        this.drugInstruction = drugInstruction;
    }//End of setDrugInstruction
    
    /**
     * 
     * @return 
     */
    public String getDrugInstruction( ){
        return drugInstruction;
    }//End of getDrugInstruction
    
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
                " "+patientDisease+" "+patientSymptom+" "+drugName+" "+drugInstruction;
    }//End of toString
    
    
    
}//End of class
