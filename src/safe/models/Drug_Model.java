/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.models;

/**
 *
 * @author chokayg3
 */
public class Drug_Model {
    String drugId;
    String drugName;
    String drugManufacturer;
    String drugExpire;
    String drugUsage;
    double drugPrice;
    int drugQuantity;
    
    /**
     * 
     * @param drugId
     * @param drugName
     * @param drugManufacturer
     * @param drugExpire
     * @param drugUsage 
     * @param drugPrice 
     * @param drugQuantity 
     */
    public Drug_Model ( String drugId, String drugName, String drugManufacturer, String drugExpire, String drugUsage,
            double drugPrice, int drugQuantity){
        this.drugId = drugId;
        this.drugName = drugName;
        this.drugManufacturer = drugManufacturer;
        this.drugExpire = drugExpire;
        this.drugUsage = drugUsage;
        this.drugPrice = drugPrice;
        this.drugQuantity = drugQuantity;
    }//End of Drug_Model
    
    /**
     * 
     * @param drugId
     */
    public void setDrugBarcode ( String drugId ){
        this.drugId = drugId;
    }//End of setDrugId
    
    /**
     * 
     * @return 
     */
    public String getDrugId ( ){
        return drugId;
    }//End of getDrugId
    
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
     * @param drugExpire
     */
    public void setDrugExpire ( String drugExpire ){
        this.drugExpire = drugExpire;
    }//End of setDrugExpire
    
    /**
     * 
     * @return 
     */
    public String getDrugExpire( ){
        return drugExpire;
    }//End of getDrugExpire
    
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
    
    /**
     * 
     * @param drugPrice 
     */
    public void setDrugPirce ( double drugPrice ){
        this.drugPrice = drugPrice;
    }//End of setDrugPrice
    
    /**
     * 
     * @return 
     */
    public double getDrugPrice ( ){
        return drugPrice;
    }//End of getDrugPrice
    
    /**
     * 
     * @param drugQuantity 
     */
    public void setDrugQuantity ( int drugQuantity ){
        this.drugQuantity = drugQuantity;
    }//End of setDrugQuantity
    
    /**
     * 
     * @return 
     */
    public int getDrugQuantity ( ){
        return drugQuantity;
    }//End of getDrugQuantity
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return drugId+" "+drugName+" "+drugManufacturer+" "+drugExpire+" "+drugUsage;
    }
    
}//End of class
