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
    
    /**
     * 
     * @param doctorId
     * @param doctorFname
     * @param doctorSname
     * @param doctorPhone 
     * @param doctorDepartment 
     */
    public Doctor_Model ( String doctorId, String doctorFname, String doctorSname, int doctorPhone, String doctorDepartment ){
        this.doctorId = doctorId;
        this.doctorFname = doctorFname;
        this.doctorSname = doctorSname;
        this.doctorPhone = doctorPhone;
        this.doctorDepartment = doctorDepartment;
    }//End of Doctor_Model
    
    /**
     * 
     * @param doctorId 
     */
    public void setDoctorId ( String doctorId ){
        this.doctorId = doctorId;
    }//End of setDoctorId
    
    /**
     * 
     * @return 
     */
    public String getDoctorId ( ){
        return doctorId;
    }//End of getDoctorId
    
    /**
     * 
     * @param doctorFname 
     */
    public void setDoctorFname ( String doctorFname ){
        this.doctorFname = doctorFname;
    }//End of setDoctorFname
    
    /**
     * 
     * @return 
     */
    public String getDoctorFname ( ){
        return doctorFname;
    }//ENd of getDoctorFname
    
    /**
     * 
     * @param doctorSname 
     */
    public void setDoctorSname ( String doctorSname ){
        this.doctorSname = doctorSname;
    }//End of setDoctorSname
    
    /**
     * 
     * @return 
     */
    public String getDoctorSname ( ){
        return doctorSname;
    }//End of getDoctorSname
    
    /**
     * 
     * @param doctorPhone 
     */
    public void setDoctorPhone ( int doctorPhone ){
        this.doctorPhone = doctorPhone;
    }//End of setDoctorPhone
    
    /**
     * 
     * @return 
     */
    public int getDocotorPhone ( ){
        return doctorPhone;
    }//End of getDoctorPhone
    
    /**
     * 
     * @param doctorDepartment
     */
    public void setDoctorDepartment ( String doctorDepartment ){
        this.doctorDepartment = doctorDepartment;
    }//End of setDoctorDepartment
    
    /**
     * 
     * @return 
     */
    public String getDoctorDepartment ( ){
        return doctorDepartment;
    }//End of getDoctorDepartment
    
}//End of class
