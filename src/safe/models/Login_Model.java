/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.models;

/**
 *
 * @author Abayie Fredrick
 */
public class Login_Model {
    
    /**
     * Declaring variables
     */
    String username;
    String password;
    
    //Default constructor
    public Login_Model(){
        username = null;
        password = null;
    }//End of Default constructor
    
    /**
     * Constructor for the class
     * @param username
     * @param password 
     */
    public Login_Model(String username, String password){
        this.password = password;
        this.username = username;
    }//End of constructor
    
    /**
     * Method to set the user name
     * @param username 
     */
    public void setUsername (String username){
        this.username = username;
    }//End of setUsername
    
    /**
     * Method to getUsername
     * @return 
     */
    public String getUsername (){
        return username;
    }//End of getUsername
    
    /**
     * Method to set password
     * @param password 
     */
    public void setPassword (String password){
        this.password = password;
    }//End of setPassword
    
    /**
     * Method to get password
     * @return 
     */
    public String getPassword (){
        return password;
    }//End of getPassword
    
    /**
     * Method to return username and password
     * @return 
     */
    @Override
    public String toString(){
        return username+" "+password;
    }//End of toString
    
}//End of Model
