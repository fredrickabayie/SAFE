/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.views;

import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

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
        close_button = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        connect = new javax.swing.JButton();
        display = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        open = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        import_menu = new javax.swing.JMenuItem();
        export_menu = new javax.swing.JMenuItem();
        exit_menu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        display_menu = new javax.swing.JMenuItem();
        update_menu = new javax.swing.JMenuItem();
        delete_menu = new javax.swing.JMenuItem();

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1560, 600));

        close_button.setText("X");
        getContentPane().add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 0, -1, -1));

        jToolBar1.setRollover(true);

        connect.setText("connect");
        jToolBar1.add(connect);

        display.setText("display");
        jToolBar1.add(display);

        update.setText("update");
        jToolBar1.add(update);

        delete.setText("delete");
        jToolBar1.add(delete);

        open.setText("import");
        jToolBar1.add(open);

        save.setText("export");
        jToolBar1.add(save);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 0, 180, 30));

        jLabel1.setText("Search");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 50, 30));

        jMenuBar1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N

        jMenu1.setText("File");

        import_menu.setText("Import");
        jMenu1.add(import_menu);

        export_menu.setText("Export");
        jMenu1.add(export_menu);

        exit_menu.setText("Exit");
        jMenu1.add(exit_menu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Database");

        display_menu.setText("Display");
        jMenu2.add(display_menu);

        update_menu.setText("Update");
        jMenu2.add(update_menu);

        delete_menu.setText("Delete");
        jMenu2.add(delete_menu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
    private javax.swing.JMenuItem delete_menu;
    private javax.swing.JButton display;
    private javax.swing.JMenuItem display_menu;
    private javax.swing.JMenuItem exit_menu;
    private javax.swing.JMenuItem export_menu;
    private javax.swing.JMenuItem import_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton open;
    public static javax.swing.JTable patient_table;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    private javax.swing.JMenuItem update_menu;
    // End of variables declaration//GEN-END:variables
}
