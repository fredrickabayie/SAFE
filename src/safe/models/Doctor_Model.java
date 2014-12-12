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
     * Constructor for the doctor model class
     * @param doctorId the doctor id
     * @param doctorFname the doctor first name
     * @param doctorSname the doctor surname
     * @param doctorPhone the doctor phone number
     * @param doctorDepartment the doctor department
     * @param doctorEmail the doctor email address
     * @param doctorDate the doctor date joined the department
     * @param doctorPassword the doctor password
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
     * @param doctorId the doctor id
     */
    public void setDoctorId ( String doctorId ){
        this.doctorId = doctorId;
    }//End of setDoctorId
    
    /**
     * Method to get doctor id
     * @return the doctor id
     */
    public String getDoctorId ( ){
        return doctorId;
    }//End of getDoctorId
    
    /**
     * Method to set doctor first name
     * @param doctorFname the doctor first name
     */
    public void setDoctorFname ( String doctorFname ){
        this.doctorFname = doctorFname;
    }//End of setDoctorFname
    
    /**
     * Method to get doctor first name
     * @return the doctor first name
     */
    public String getDoctorFname ( ){
        return doctorFname;
    }//ENd of getDoctorFname
    
    /**
     * Method to set doctor surname
     * @param doctorSname the doctor surname
     */
    public void setDoctorSname ( String doctorSname ){
        this.doctorSname = doctorSname;
    }//End of setDoctorSname
    
    /**
     * Method to get doctor surname
     * @return the doctor surname
     */
    public String getDoctorSname ( ){
        return doctorSname;
    }//End of getDoctorSname
    
    /**
     * Method to set doctor phone
     * @param doctorPhone the doctor phone number
     */
    public void setDoctorPhone ( int doctorPhone ){
        this.doctorPhone = doctorPhone;
    }//End of setDoctorPhone
    
    /**
     * Method to get doctor phone
     * @return the doctor phone number
     */
    public int getDocotorPhone ( ){
        return doctorPhone;
    }//End of getDoctorPhone
    
    /**
     * Method to set doctor department
     * @param doctorDepartment the doctor department
     */
    public void setDoctorDepartment ( String doctorDepartment ){
        this.doctorDepartment = doctorDepartment;
    }//End of setDoctorDepartment
    
    /**
     * Method to get doctor department
     * @return the doctor department
     */
    public String getDoctorDepartment ( ){
        return doctorDepartment;
    }//End of getDoctorDepartment
    
    /**
     * Method to set doctor date
     * @param doctorDate the doctor date joined
     */
    public void setDoctorDate( String doctorDate ){
        this.doctorDate = doctorDate;
    }//End of setDoctorDate
    
    /**
     * Method to get doctor date
     * @return the doctor date joined
     */
    public String getDoctorDate ( ){
        return doctorDate;
    }//End of getDoctorDate
    
    /**
     * Method to set doctor password
     * @param doctorPassword the doctor password
     */
    public void setDoctorPassword(String doctorPassword){
        this.doctorPassword = doctorPassword;
    }//End of setDoctorPassword
    
    /**
     * Method to get doctor password
     * @return the doctor password
     */
    public String getDoctorPassword (){
        return doctorPassword;
    }//End of getDoctorPassword
    
    /**
     * Method to return doctor details
     * @return the string representation of the doctor model
     */
    @Override
    public String toString(){
        return doctorId+" "+doctorFname+" "+doctorSname+" "+doctorPhone+" "+doctorEmail+" "
                +doctorDepartment+" "+doctorDate;
    }//End of toString
    
}//End of class
