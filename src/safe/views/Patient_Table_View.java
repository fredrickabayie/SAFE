/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.views;

import com.toedter.calendar.JCalendar;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
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
              
    /**
     * Method to add a row to the table
     * @param w 
     */
    public void addRow(Object []w){
        table_model.addRow(w);
    }//End of getPatient_table
    
    /**
     * Method returning table model row count
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
      * method to delete a row from the database
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
      * Method to set row count of the table
      * @param i 
      */
    public void setRowCount( int i){
        i=0;
        table_model.setRowCount(i);
    }
    
    /**
     * Method to return display button
     * @return 
     */
    public JButton getDisplay(){
        return display;
    }
    
    /**
     * Method to return update button
     * @return 
     */
    public JButton getUpdate(){
        return update;
    }
    
    /**
     * Method to return delete button
     * @return 
     */
    public JButton getDelete(){
        return delete;
    }
    
    /**
     * Method to return close button
     * @return 
     */
    public JButton getClose(){
        return close_button;
    }
    
    /**
     * Method to return open button
     * @return 
     */
    public JButton getOpen(){
        return open;
    }
    
    /**
     * Method to return save button
     * @return 
     */
    public JButton getSave(){
        return save;
    }
    
      /**
     * Method to return table menu item
     * @return 
     */
    public JMenuItem getImport_menu(){
        return import_menu;
    }//End of getImport_menu
    
    /**
     * Method to return table menu item
     * @return 
     */
    public JMenuItem getExport_menu(){
        return export_menu;
    }//End of getExport_menu
    
    /**
     * Method to return table menu item
     * @return 
     */
    public JMenuItem getExit_menu(){
        return exit_menu;
    }//End of getExit_menu
    
    /**
     * Method to return table menu item
     * @return 
     */
    public JMenuItem getDisplay_menu(){
        return display_menu;
    }//End of getDisplay_menu
    
    /**
     * Method to return table menu item
     * @return 
     */
    public JMenuItem getUpdate_menu(){
        return update_menu;
    }//End of getUpdate_menu
    
    
    /**
     * Method to return table menu item
     * @return 
     */
    public JMenuItem getDelete_menu(){
        return delete_menu;
    }//End of getDelete_menu
    
    /**
     * Method to return search text field
     * @return 
     */
    public String getSearch(){
        return search_field.getText();
    }//End of getSearch
    
    /**
     * Method to get search button
     * @return 
     */
    public JButton getSearch_button(){
        return search_button;
    }//End of getSearch_button
    
    /**
     * Method to return print button
     * @return 
     */
    public JButton getPrint_button(){
        return print;
    }//End of getPrint_button
    
    /**
     * Method to return print menu
     * @return 
     */
    public JMenuItem getPrint_menu(){
        return print_menu;
    }//End of getPrint_menu
    
    /**
     * Method to return clear menu item
     * @return 
     */
    public JMenuItem getClear_menu(){
        return clear_menu;
    }//End of getClear_menu
    
    /**
     * Method to return delete row from table
     * @return 
     */
    public JMenuItem getDeleteRow_menu(){
        return deleterow_menu;
    }//End of getDeleteRow_menu
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        display = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        open = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        print = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        close_button = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        search_field = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        patient_table = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        import_menu = new javax.swing.JMenuItem();
        export_menu = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        exit_menu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        deleterow_menu = new javax.swing.JMenuItem();
        clear_menu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        display_menu = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        update_menu = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        delete_menu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        print_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator2);

        display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/accept_database-32.png"))); // NOI18N
        display.setToolTipText("Display data in database");
        jToolBar1.add(display);

        jLabel4.setText("     ");
        jToolBar1.add(jLabel4);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/data_backup-32.png"))); // NOI18N
        update.setToolTipText("Update data in database");
        jToolBar1.add(update);

        jLabel3.setText("     ");
        jToolBar1.add(jLabel3);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/delete_database-32.png"))); // NOI18N
        delete.setToolTipText("delete from database");
        jToolBar1.add(delete);
        jToolBar1.add(jSeparator1);

        open.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/import-32.png"))); // NOI18N
        open.setToolTipText("Import data from csv");
        jToolBar1.add(open);

        jLabel2.setText("     ");
        jToolBar1.add(jLabel2);

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/export-32.png"))); // NOI18N
        save.setToolTipText("export data to csv");
        jToolBar1.add(save);
        jToolBar1.add(jSeparator3);

        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/print-32.png"))); // NOI18N
        print.setFocusable(false);
        print.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        print.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(print);
        jToolBar1.add(jSeparator4);

        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/cancel-32.png"))); // NOI18N
        close_button.setToolTipText("exit");
        jToolBar1.add(close_button);
        jToolBar1.add(jSeparator5);

        jDesktopPane1.add(jToolBar1);
        jToolBar1.setBounds(0, 0, 1050, 50);

        search_field.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jDesktopPane1.add(search_field);
        search_field.setBounds(1260, 10, 230, 35);

        search_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/search-32.png"))); // NOI18N
        search_button.setToolTipText("Search");
        jDesktopPane1.add(search_button);
        search_button.setBounds(1490, 10, 40, 35);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 50));

        patient_table.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        patient_table.setModel(table_model);
        patient_table.setCellSelectionEnabled(true);
        patient_table.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        patient_table.setRowHeight(25);
        jScrollPane1.setViewportView(patient_table);

        jDesktopPane2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1530, 610);

        getContentPane().add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 1530, 610));

        jMenuBar1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        import_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        import_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/import-26.png"))); // NOI18N
        import_menu.setText("Import");
        jMenu1.add(import_menu);

        export_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        export_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/export-26.png"))); // NOI18N
        export_menu.setText("Export");
        jMenu1.add(export_menu);
        jMenu1.add(jSeparator6);

        exit_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exit_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/cancel-26.png"))); // NOI18N
        exit_menu.setText("Exit");
        jMenu1.add(exit_menu);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Edit");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/delete-26.png"))); // NOI18N
        jMenu5.setText("Delete");

        deleterow_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        deleterow_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/Delete_Row-26.png"))); // NOI18N
        deleterow_menu.setText("Row");
        jMenu5.add(deleterow_menu);

        jMenu4.add(jMenu5);

        clear_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        clear_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/delete_file-26.png"))); // NOI18N
        clear_menu.setText("Clear");
        jMenu4.add(clear_menu);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Database");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        display_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        display_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/accept_database-26.png"))); // NOI18N
        display_menu.setText("Display");
        jMenu2.add(display_menu);
        jMenu2.add(jSeparator8);

        update_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        update_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/data_backup-26.png"))); // NOI18N
        update_menu.setText("Update");
        jMenu2.add(update_menu);
        jMenu2.add(jSeparator7);

        delete_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        delete_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/delete_database-26.png"))); // NOI18N
        delete_menu.setText("Delete");
        jMenu2.add(delete_menu);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("More");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        print_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        print_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/print-26.png"))); // NOI18N
        print_menu.setText("Print");
        jMenu3.add(print_menu);

        jMenuBar1.add(jMenu3);

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
    private javax.swing.JMenuItem clear_menu;
    private javax.swing.JButton close_button;
    private javax.swing.JButton delete;
    private javax.swing.JMenuItem delete_menu;
    private javax.swing.JMenuItem deleterow_menu;
    private javax.swing.JButton display;
    private javax.swing.JMenuItem display_menu;
    private javax.swing.JMenuItem exit_menu;
    private javax.swing.JMenuItem export_menu;
    private javax.swing.JMenuItem import_menu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton open;
    public static javax.swing.JTable patient_table;
    private javax.swing.JButton print;
    private javax.swing.JMenuItem print_menu;
    private javax.swing.JButton save;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_field;
    private javax.swing.JButton update;
    private javax.swing.JMenuItem update_menu;
    // End of variables declaration//GEN-END:variables
}
