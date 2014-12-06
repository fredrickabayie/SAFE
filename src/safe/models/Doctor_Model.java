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
public class Doctor_Model {
    String doctorId;
    String doctorFname;
    String doctorSname;
    int doctorPhone;
    String doctorDepartment;
    String doctorEmail;
    String doctorDate;
    String doctorPassword;
    
    /**
     * 
     * @param doctorId
     * @param doctorFname
     * @param doctorSname
     * @param doctorPhone 
     * @param doctorDepartment 
     * @param doctorEmail 
     * @param doctorDate 
     * @param doctorPassword 
     */
    public Doctor_Model ( String doctorId, String doctorFname, String doctorSname, int doctorPhone, String doctorDepartment,
                          String doctorEmail,String doctorDate,String doctorPassword ){
        this.doctorId = doctorId;
        this.doctorFname = doctorFname;
        this.doctorSname = doctorSname;
        this.doctorPhone = doctorPhone;
        this.doctorDepartment = doctorDepartment;
        this.doctorEmail = doctorEmail;
        this.doctorDate = doctorDate;
        this.doctorPassword = doctorPassword;
    }//End of Doctor_Model
    
    /**
     * Method to set the doctor id
     * @param doctorId 
     */
    public void setDoctorId ( String doctorId ){
        this.doctorId = doctorId;
    }//End of setDoctorId
    
    /**
     * Method to get doctor id
     * @return 
     */
    public String getDoctorId ( ){
        return doctorId;
    }//End of getDoctorId
    
    /**
     * Method to set doctor first name
     * @param doctorFname 
     */
    public void setDoctorFname ( String doctorFname ){
        this.doctorFname = doctorFname;
    }//End of setDoctorFname
    
    /**
     * Method to get doctor first name
     * @return 
     */
    public String getDoctorFname ( ){
        return doctorFname;
    }//ENd of getDoctorFname
    
    /**
     * Method to set doctor surname
     * @param doctorSname 
     */
    public void setDoctorSname ( String doctorSname ){
        this.doctorSname = doctorSname;
    }//End of setDoctorSname
    
    /**
     * Method to get doctor surname
     * @return 
     */
    public String getDoctorSname ( ){
        return doctorSname;
    }//End of getDoctorSname
    
    /**
     * Method to set doctor phone
     * @param doctorPhone 
     */
    public void setDoctorPhone ( int doctorPhone ){
        this.doctorPhone = doctorPhone;
    }//End of setDoctorPhone
    
    /**
     * Method to get doctor phone
     * @return 
     */
    public int getDocotorPhone ( ){
        return doctorPhone;
    }//End of getDoctorPhone
    
    /**
     * Method to set doctor department
     * @param doctorDepartment
     */
    public void setDoctorDepartment ( String doctorDepartment ){
        this.doctorDepartment = doctorDepartment;
    }//End of setDoctorDepartment
    
    /**
     * Method to get doctor department
     * @return 
     */
    public String getDoctorDepartment ( ){
        return doctorDepartment;
    }//End of getDoctorDepartment
    
    /**
     * Method to set doctor date
     * @param doctorDate 
     */
    public void setDoctorDate( String doctorDate ){
        this.doctorDate = doctorDate;
    }//End of setDoctorDate
    
    /**
     * Method to get doctor date
     * @return 
     */
    public String getDoctorDate ( ){
        return doctorDate;
    }//End of getDoctorDate
    
    /**
     * Method to set doctor password
     * @param doctorPassword 
     */
    public void setDoctorPassword(String doctorPassword){
        this.doctorPassword = doctorPassword;
    }//End of setDoctorPassword
    
    /**
     * Method to get doctor password
     * @return 
     */
    public String getDoctorPassword (){
        return doctorPassword;
    }//End of getDoctorPassword
    
    /**
     * Method to return doctor details
     * @return 
     */
    @Override
    public String toString(){
        return doctorId+" "+doctorFname+" "+doctorSname+" "+doctorPhone+" "+doctorEmail+" "
                +doctorDepartment+" "+doctorDate;
    }//End of toString
    
}//End of class
