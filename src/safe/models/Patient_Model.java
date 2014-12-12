/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.models;

/**
 *
 * @author Fredrick Abayie
 * @version 1.02
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
     * Constructor for the patient model class
     * @param patientId the patient id
     * @param patientFname the patient first name
     * @param patientSname the patient surname
     * @param patientAge the patient age
     * @param patientAddress the patient address
     * @param patientPhone the patient phone number
     * @param patientGender the patient gender
     * @param patientOccupation the patient occupation
     * @param patientBloodgroup the patient blood group
     * @param patientMaritalstatus the patient marital status
     * @param patientBirthdate the patient birth date
     * @param patientNational the patient nationality
     * @param patientDisease the patient disease
     * @param patientSymptom the patient symptom
     * @param drugName the drug name
     * @param drugInstruction the drug instruction
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
    }//End of Patient_Model
    
    /**
     * Method to set patient id
     * @param patientId the patient id
     */
    public void setPatientId ( String patientId ){
        this.patientId = patientId;
    }//End of setPatientId
    
    /**
     * Method to get patient id
     * @return the patient id
     */
    public String getPatientId ( ){
        return patientId;
    }//End of getPatientId
    
    /**
     * Method to set patient first name
     * @param patientFname the patient first name
     */
    public void setPatientFname ( String patientFname ){
        this.patientFname = patientFname;
    }//End of setPatientFname
    
    /**
     * Method to get patient first name
     * @return the patient first name
     */
    public String getPatientFname ( ){
        return patientFname;
    }//End of getPatientFname
    
    /**
     * Method to set patient surname
     * @param patientSname the patient surname
     */
    public void setPatientSname ( String patientSname ){
        this.patientSname = patientSname;
    }//End of setPatientSname
    
    /**
     * Method to get the patient surname
     * @return the patient surname
     */
    public String getPatientSname ( ){
        return patientSname;
    }//End of getPatientSname
    
    /**
     * Method to set the patient age
     * @param patientAge the patient age
     */
    public void setPatientAge ( int patientAge ){
        this.patientAge = patientAge;
    }//End of setPatientAge
    
    /**
     * Method to get patient age
     * @return the patient age
     */
    public int getPatientAge ( ){
        return patientAge;
    }//End of getPatientFname
    
    /**
     * Method to set patient address
     * @param patientAddress the patient address
     */
    public void setPatientAddress ( String patientAddress ){
        this.patientAddress = patientAddress;
    }//End of setPatientAddress
    
    /**
     * Method to get patient address
     * @return the patient address
     */
    public String getPatientAddress ( ){
        return patientAddress;
    }//End of getPatientAddress
    
    /**
     * Method to set patient phone number
     * @param patientPhone the patient phone number
     */
    public void setPatientPhone ( int patientPhone ){
        this.patientPhone = patientPhone;
    }//End of setPatientPhone
    
    /**
     * Method to get patient phone number
     * @return the patient phone number
     */
    public int getPatientPhone ( ){
        return patientPhone;
    }//End of getPatientPhone
    
    /**
     * Method to set patient gender
     * @param patientGender the patient gender
     */
    public void setPatientGender ( String patientGender ){
        this.patientGender = patientGender;
    }//End of setPatientGender
    
    /**
     * Method to get patient gender
     * @return the patient gender
     */
    public String getPatientGender ( ){
        return patientGender;
    }//End of getPatientGender
    
    /**
     * Method to set patient blood group
     * @param patientBloodgroup the patient blood group
     */
    public void setPatientBloodgroup ( String patientBloodgroup ){
        this.patientBloodgroup = patientBloodgroup;
    }//End of setPatientGender
    
    /**
     * Method to get patient blood group
     * @return the patient blood group
     */
    public String getPatientBloodgroup ( ){
        return patientBloodgroup;
    }//End of getPatientBloodgroup
    
    /**
     * Method to set patient status
     * @param patientMaritalstatus the patient status
     */
    public void setPatientMaritalstatus ( String patientMaritalstatus ){
        this.patientMaritalstatus = patientMaritalstatus;
    }//End of setPatientMaritalstatus
    
    /**
     * Method to get patient status
     * @return the patient status
     */
    public String getPatientMaritalstatus ( ){
        return patientMaritalstatus;
    }//End of getPatientMaritalstatus
    
    /**
     * Method to set patient nationality
     * @param patientNational the patient nationality
     */
    public void setPatientNational ( String patientNational ){
        this.patientNational = patientNational;
    }//End of setPatientNational
    
    /**
     * Method to get patient nationality
     * @return the patient nationality
     */
    public String getPatientNational ( ){
        return patientNational;
    }//End of getPatientNational
    
    /**
     * Method to set patient birth date
     * @param patientBirthdate the patient birth date
     */
    public void setPatientBirthdate ( String patientBirthdate ){
        this.patientBirthdate = patientBirthdate;
    }//End of setPatientBirthdate
    
    /**
     * Method to get patient birth date
     * @return the patient birth date
     */
    public String getPatientBirthdate ( ){
        return patientBirthdate;
    }//End of getPatientBirthdate
    
    /**
     * Method to set patient disease
     * @param patientDisease the patient disease
     */
    public void setPatientDisease ( String patientDisease ){
        this.patientDisease = patientDisease;
    }//End of setPatientDisease
    
    /**
     * Method to get patient disease
     * @return the patient disease
     */
    public String getPatientDisease ( ){
        return patientDisease;
    }//End of getPatientDisease
    
    /**
     * Method to set patient symptom
     * @param patientSymptom the patient symptom
     */
    public void setPatientSymptom ( String patientSymptom ){
        this.patientSymptom = patientSymptom;
    }//End of setPatientSymptom
    
    /**
     * Method to get patient symptom
     * @return the patient symptom
     */
    public String getPatientSymptom ( ){
        return patientSymptom;
    }//End of getPatientSymptom
    
    /**
     * Method to set drug name
     * @param drugName the drug name
     */
    public void setDrugName ( String drugName ){
        this.drugName = drugName;
    }//End of setDrugName
    
    /**
     * Method to get drug name
     * @return the drug name
     */
    public String getDrugName ( ){
        return drugName;
    }//End of getDrugName
    
    /**
     * Method to set drug instruction
     * @param drugInstruction the drug instruction
     */
    public void setDrugInstruction ( String drugInstruction ){
        this.drugInstruction = drugInstruction;
    }//End of setDrugInstruction
    
    /**
     * Method to get drug instruction
     * @return the drug instruction
     */
    public String getDrugInstruction( ){
        return drugInstruction;
    }//End of getDrugInstruction
    
    /**
     * Method to get patient image
     * @param patientImage the patient image
     */
    public void setPatientImage ( byte patientImage ){
        this.patientImage = patientImage;
    }//End of setPatientImage
    
    /**
     * Method to get patient image
     * @return the patient image
     */
    public byte getPatientImage ( ){
        return patientImage;
    }//End of getPatientImage
    
    /**
     * Method to show a string representation of patient model
     * @return the patient model
     */
    @Override
    public String toString (){
        return  patientId+" "+patientFname+" "+patientSname+" "+patientAge+" "+patientAddress+" "+patientPhone+" "+patientGender+
                " "+patientOccupation+" "+patientBloodgroup+" "+patientMaritalstatus+" "+patientBirthdate+" "+patientNational+
                " "+patientDisease+" "+patientSymptom+" "+drugName+" "+drugInstruction;
    }//End of toString
    
    
    
}//End of class
