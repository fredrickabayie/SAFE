/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.model;

/**
 *
 * @author chokayg3
 */
public class Drug {
    String drugBarcode;
    String drugName;
    String drugManufacturer;
    String drugExpiredate;
    String drugUsage;
    
    /**
     * 
     * @param drugBarcode
     * @param drugName
     * @param drugManufacturer
     * @param drugExpiredate
     * @param drugUsage 
     */
    public Drug ( String drugBarcode, String drugName, String drugManufacturer, String drugExpiredate, String drugUsage ){
        this.drugBarcode = drugBarcode;
        this.drugName = drugName;
        this.drugManufacturer = drugManufacturer;
        this.drugExpiredate = drugExpiredate;
        this.drugUsage = drugUsage;
    }//End of Drug
    
    /**
     * 
     * @param drugBarcode
     */
    public void setDrugBarcode ( String drugBarcode ){
        this.drugBarcode = drugBarcode;
    }//End of setDrugBarcode
    
    /**
     * 
     * @return 
     */
    public String getDrugBarcode ( ){
        return drugBarcode;
    }//End of getDrugBarcode
    
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
     * @param drugManufacturer 
     */
    public void setDrugManufacturer ( String drugManufacturer ){
        this.drugManufacturer = drugManufacturer;
    }//End of setDrugManufacturer
    
    /**
     * 
     * @return 
     */
    public String getDrugManufacturer ( ){
        return drugManufacturer;
    }//End of getDrugManufacturer
    
     /**
     * 
     * @param drugExpiredate 
     */
    public void setDrugExpiredate ( String drugExpiredate){
        this.drugExpiredate = drugExpiredate;
    }//End of setDrugExpiredate
    
    /**
     * 
     * @return 
     */
    public String getDrugExpiredate ( ){
        return drugExpiredate;
    }//End of getDrugExpiredate
    
     /**
     * 
     * @param drugUsage 
     */
    public void setDrugUsage ( String drugUsage ){
        this.drugUsage = drugUsage;
    }//End of setDrugUsage
    
    /**
     * 
     * @return 
     */
    public String getDrugUsage ( ){
        return drugUsage;
    }//End of getDrugUsage
    
}//End of class
