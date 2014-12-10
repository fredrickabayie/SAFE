/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import safe.views.Doctor_View;
import safe.models.Hospital_Database_Model;
import safe.models.Doctor_Model;
import safe.views.Doctor_Table_View;
import static safe.views.Doctor_Table_View.table_model;
import static safe.views.Doctor_Table_View.doctor_table;
import static safe.views.Patient_Table_View.patient_table;

/**
 *
 * @author Abayie Fredrick
 */
public class Doctor_Controller {
    Doctor_View doctor_view;
    Hospital_Database_Model database_model;
    ActionListener actionListener;
    Doctor_Table_View doctor_table_view;
    Scanner input;
    PrintWriter print;
    File file;
    TableRowSorter <TableModel> rowSorter;
    
    
public Doctor_Controller (Doctor_View doctor_view, Hospital_Database_Model database_model, Doctor_Table_View doctor_table_view){
        this.doctor_view = doctor_view;
        this.database_model = database_model;
        this.doctor_table_view = doctor_table_view;
        doctorButton();
         rowSorter = new TableRowSorter<>(doctor_table.getModel());
         doctor_table.setRowSorter( rowSorter);
    }
    
    
public void doctorButton (){
try
   {
    actionListener = new ActionListener ( ){
    @Override
    public void actionPerformed ( ActionEvent e ){
      if (e.getSource().equals(doctor_view.getClose_button())){
           doctor_view.dispose();
        }
      
      if (e.getSource().equals(doctor_view.getOk_button())){
          insert();
      }
      
      if (e.getSource().equals(doctor_table_view.getDisplay())
          ||e.getSource().equals(doctor_table_view.getDisplay_menu())){
          database_model.displayDoctordatabase();
      }
      
      if (e.getSource().equals(doctor_table_view.getUpdate())
         ||e.getSource().equals(doctor_table_view.getUpdate_menu())){
          database_model.updateDoctordatabase();
      }
      
      if (e.getSource().equals(doctor_table_view.getDelete())
              ||e.getSource().equals(doctor_table_view.getDelete_menu())){
          database_model.deleteDoctordatabase();
      }
      
      if (e.getSource().equals(doctor_table_view.getClose())
          ||e.getSource().equals(doctor_table_view.getExit_menu())){
          doctor_table_view.dispose();
      }
      
      if (e.getSource().equals(doctor_table_view.getOpen())
         ||e.getSource().equals(doctor_table_view.getImport_menu())){
          System.out.println("Open button pressed");
         JFileChooser chooser = new JFileChooser();
         chooser.showOpenDialog(doctor_table_view);
          file = chooser.getSelectedFile();
          open(file);
      }
      
       if (e.getSource().equals(doctor_table_view.getSave())
          ||e.getSource().equals(doctor_table_view.getExport_menu())){
          System.out.println("Save button pressed");
         JFileChooser chooser = new JFileChooser();
         chooser.showSaveDialog(doctor_table_view);
          file = chooser.getSelectedFile();
          save(file);
      }
       
       //Statement to get the search button
       if (e.getSource().equals(doctor_table_view.getSearch_button())){
           search();
       }
       
       //Print report
       if (e.getSource().equals(doctor_table_view.getPrint_button())
          ||e.getSource().equals(doctor_table_view.getPrint_menu())){
           print();
       }
      
      }  
     };
    doctor_view.getClose_button().addActionListener ( actionListener );
    doctor_view.getOk_button().addActionListener ( actionListener );
    doctor_table_view.getDisplay().addActionListener ( actionListener );
    doctor_table_view.getDisplay_menu().addActionListener ( actionListener );
    doctor_table_view.getUpdate().addActionListener ( actionListener );
    doctor_table_view.getUpdate_menu().addActionListener ( actionListener );
    doctor_table_view.getDelete().addActionListener ( actionListener );
    doctor_table_view.getDelete_menu().addActionListener ( actionListener );
    doctor_table_view.getClose().addActionListener ( actionListener );
    doctor_table_view.getExit_menu().addActionListener ( actionListener );
    doctor_table_view.getOpen().addActionListener ( actionListener );
    doctor_table_view.getImport_menu().addActionListener ( actionListener );
    doctor_table_view.getSave().addActionListener ( actionListener );
    doctor_table_view.getExport_menu().addActionListener ( actionListener );
    doctor_table_view.getSearch_button().addActionListener ( actionListener );
    doctor_table_view.getPrint_button().addActionListener ( actionListener );
    doctor_table_view.getPrint_menu().addActionListener ( actionListener );
   }
   catch(Exception e){
            
     }
}//End of doctorButton

/**
 * 
 */
public void insert(){
    String doctorId = doctor_view.getDoctorId();
    String doctorFname = doctor_view.getDoctorFname();
    String doctorSname = doctor_view.getDoctorSname();
    int doctorPhone = Integer.parseInt(doctor_view.getDoctorPhone());
    String doctorEmail = doctor_view.getDoctorEmail();
    String doctorDepartment = doctor_view.getDoctorDepartment();
    String doctorDate = doctor_view.getDoctorDate();
    String doctorPassword = doctor_view.getPassword();
    
    Doctor_Model doctor_model = new Doctor_Model(doctorId,doctorFname,doctorSname,doctorPhone,doctorEmail,
            doctorDepartment,doctorDate,doctorPassword);
    
    database_model.insertDoctordatabase(doctorId, doctorFname, doctorSname, doctorPhone, doctorEmail, 
            doctorDepartment, doctorDate,doctorPassword);
    System.out.println(""+doctor_model.toString());
}

/**
 * Method to open a saved data
 * @param file 
 */
 public void open(File file)
    {
        table_model.setRowCount(0);
        String splitHere=",";
        try
        {
            input = new Scanner ( new BufferedReader ( new FileReader( file )));
            input.nextLine();
            while (input.hasNextLine()){
             String [] oneTicket=input.nextLine().split(splitHere);
                Vector row=new Vector();
                for(int i=0;i<oneTicket.length;i++){
                    row.add(oneTicket[i]);
                }
                table_model.addRow(row);
            }
         input.close();
         System.out.println("Opened data");
         JOptionPane.showMessageDialog ( doctor_table_view, "Successfully Opened The File " +file.getName(), "OPENED", JOptionPane.INFORMATION_MESSAGE);
        }//End Of Try
        catch (IOException ex)
        { 
            System.out.println(ex.toString());
        JOptionPane.showMessageDialog(doctor_table_view, "Failed To Open File " +file.getName(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
    }
 
     /**
     * A method to get the column names in the table
     * @return 
     */
     public Vector getColumnNames()
    {
         Vector <String> vector = new Vector < > ( );
        for ( int i=0; i < doctor_table.getColumnCount ( ); i++ )
            vector.add ( doctor_table.getColumnName ( i ) );
        return vector;
    }
     
    /**
     * Method to save data to file
     * @param file 
     */
    public void save (File file)
    {
        try
        {
            print = new PrintWriter ( new BufferedWriter (new FileWriter (file+".csv")) );
            String headers=getColumnNames().toString();
            print.println(headers.substring(1,headers.length()-1));
            Enumeration veNums=table_model.getDataVector().elements();
//            Enumeration veNums=patient_table_view.getTable_model();
            while(veNums.hasMoreElements()){
                String row=veNums.nextElement().toString();
              print.println(row.substring(1,row.length()-1)); 
            }
//            System.out.println(table_model.getDataVector().elementAt(0));
            print.close();          
            System.out.println("Saved data to file");
         JOptionPane.showMessageDialog(doctor_table_view, "Data Saved Successfully To " +file.getName(), "SAVED", JOptionPane.INFORMATION_MESSAGE);
        }//End Of Try
        catch (IOException ex) 
        { 
            System.out.println(""+ex.toString());
        }
            JOptionPane.showMessageDialog(doctor_table_view, "Failed To Save Data", "ERROR "+file.getName(), JOptionPane.ERROR_MESSAGE);
        }//End Of Catch 
    
    /**
 * A method to allow searching of data in the table
 */
public void search ( ){
if ( doctor_table_view.getSearch().trim().length() == 0 )
           rowSorter.setRowFilter( null );
        else
         rowSorter.setRowFilter ( RowFilter.regexFilter ( doctor_table_view.getSearch() ) );
}//End of search

/**
 * Method to print the table
 */
public void print(){
    MessageFormat header = new MessageFormat("Report Print");
    MessageFormat footer = new MessageFormat("Page{0,number,integer}");
    try{
        doctor_table.print(JTable.PrintMode.NORMAL,header,footer);
    }
    catch(PrinterException | HeadlessException e){
        System.out.println(e.toString());
        JOptionPane.showMessageDialog(doctor_table_view, "Failed To Print Data", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    JOptionPane.showMessageDialog(doctor_table_view, "Data Printed Successfully", "PRINTED", JOptionPane.INFORMATION_MESSAGE);
}
    
}//End of class
