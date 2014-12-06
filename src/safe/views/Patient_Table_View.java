/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.views;

import java.util.Enumeration;
import java.util.Vector;
//import javafx.stage.FileChooser;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import safe.controllers.Patient_Controller;

/**
 *
 * @author chokayg3
 */
public final class Patient_Table_View extends javax.swing.JFrame {
    public static DefaultTableModel table_model;
    public static Vector vector;
    TableColumn gender;
    TableColumn blood;
    TableColumn status;
    TableColumn id;
    JComboBox status_combo;
    JComboBox blood_combo;
    JComboBox gender_combo;
//    JFileChooser filechooser;
//    Patient_Controller patient_controller;

    /**
     * Creates new form Patient_Table_View
     */
    public Patient_Table_View() {
        vector = new Vector();
        vector.add ("ID");
        vector.add ("FIRST NAME");
        vector.add ("SURNAME");
        vector.add ("AGE");
        vector.add ("ADDRESS");
        vector.add ("PHONE");
        vector.add ("GENDER");
        vector.add ("OCCUPATION");
        vector.add ("BLOODGROUP");
        vector.add ("STATUS");
        vector.add ("BIRTHDATE");
        vector.add ("NATIONAL");
        vector.add ("DISEASE");
        vector.add ("SYMPTOM");
        vector.add ("DRUG");
        vector.add ("INSTRUCTION");
        table_model = new DefaultTableModel ( new Vector(), vector );
        
//        filechooser = new JFileChooser();
        initComponents();
        
        //Combo box for gender
        gender = patient_table.getColumnModel().getColumn(6);
        gender_combo = new JComboBox();
        gender_combo.addItem ("Male");
        gender_combo.addItem ("Female");
        gender.setCellEditor( new DefaultCellEditor(gender_combo));
        
        //Combo box for blood group
        blood = patient_table.getColumnModel().getColumn(8);
        blood_combo = new JComboBox();
        blood_combo.addItem ("O+");
        blood_combo.addItem ("O-");
        blood_combo.addItem ("A+");
        blood_combo.addItem ("A-");
        blood_combo.addItem ("B+");
        blood_combo.addItem ("B-");
        blood_combo.addItem ("AB+");
        blood_combo.addItem ("AB-");
        blood.setCellEditor( new DefaultCellEditor(blood_combo));
        
        //Combo box for marital status
        status = patient_table.getColumnModel().getColumn(9);
        status_combo = new JComboBox();
        status_combo.addItem ("Single");
        status_combo.addItem ("Married");
        status.setCellEditor( new DefaultCellEditor(status_combo));
        
        id = patient_table.getColumnModel().getColumn(0);
//        id.setCellEditor(new DefaultCellEditor(null));
//        isCellEditable(0,0);
        
    }
    
//    //overide this to allow editing of some columns/rows
//    public boolean isCellEditable(int row, int col) {
//        if ((col == 0)) { 
//            return false;
//        }
//        else 
//            return true;
//    }
              
    /**
     * 
     * @param w 
     */
    public void addRow(Object []w){
        table_model.addRow(w);
    }//End of getPatient_table
    
    /**
     * 
     * @return 
     */
    public int getRowCount(){
        return table_model.getRowCount();
    }
    
    /**
     * A method to get a value in the table
     * @param i
     * @param j
     * @return 
     */
     public String getValueAt(int i, int j){
        return (String) table_model.getValueAt(i, j);
    }//End of getValueAt
     
     /**
      * 
      */
     public void deleteRow()
    {
         if ( patient_table.getSelectedRow ( ) >= 0 )
            table_model.removeRow ( patient_table.getSelectedRow ( ) );
    }
     
     /**
      * A method to return a selected row
      * @return 
      */
     public int getSelectedRow(){
         return patient_table.getSelectedRow();
     }//End of getSelectedRow
    
     /**
      * 
      * @param i 
      */
    public void setRowCount( int i){
        i=0;
        table_model.setRowCount(i);
    }
    
    /**
     * 
     * @return 
     */
    public JButton getDisplay(){
        return display;
    }
    
    /**
     * 
     * @return 
     */
    public JButton getConnect(){
        return connect;
    }
    
    /**
     * 
     * @return 
     */
    public JButton getUpdate(){
        return update;
    }
    
    /**
     * 
     * @return 
     */
    public JButton getDelete(){
        return delete;
    }
    
    /**
     * 
     * @return 
     */
    public JButton getClose(){
        return close_button;
    }
    
    /**
     * 
     * @return 
     */
    public JButton getOpen(){
        return open;
    }
    
    /**
     * 
     * @return 
     */
    public JButton getSave(){
        return save;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patient_table = new javax.swing.JTable();
        connect = new javax.swing.JButton();
        display = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        close_button = new javax.swing.JButton();
        open = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patient_table.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        patient_table.setModel(table_model);
        patient_table.setCellSelectionEnabled(true);
        patient_table.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        patient_table.setRowHeight(25);
        jScrollPane1.setViewportView(patient_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1560, 600));

        connect.setText("connect");
        getContentPane().add(connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        display.setText("display");
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        update.setText("update");
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        delete.setText("delete");
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("PATIENT TABLE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 200, -1));

        close_button.setText("X");
        getContentPane().add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 110, -1, -1));

        open.setText("import");
        getContentPane().add(open, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, -1, -1));

        save.setText("export");
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 70, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Patient_Table_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Table_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Table_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Table_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_Table_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_button;
    private javax.swing.JButton connect;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton open;
    public static javax.swing.JTable patient_table;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
