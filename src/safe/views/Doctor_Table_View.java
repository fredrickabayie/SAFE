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
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Abayie Fredrick
 */
public class Doctor_Table_View extends javax.swing.JFrame {
public static DefaultTableModel table_model;
public static Vector vector;
TableColumn department;
JComboBox department_combo;
    /**
     * Creates new form Doctor_Table_View
     */
    public Doctor_Table_View() {
          vector = new Vector();
        vector.add ("ID");
        vector.add ("FIRST NAME");
        vector.add ("SURNAME");
        vector.add ("PHONE");
        vector.add ("EMAIL");
        vector.add ("DEPARTMENT");
        vector.add ("DATE JOINED");
        vector.add ("PASSWORD");
        table_model = new DefaultTableModel ( new Vector(),vector);
        initComponents();
        
        department = doctor_table.getColumnModel().getColumn(5);
        department_combo = new JComboBox();
        department_combo.addItem("Cardiology");
        department_combo.addItem("ENT");
        department_combo.addItem("Gynaecology");
        department_combo.addItem("Haematology");
        department_combo.addItem("Oncology");
        department.setCellEditor ( new DefaultCellEditor (department_combo));
   }
    
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
         if ( doctor_table.getSelectedRow ( ) >= 0 )
            table_model.removeRow ( doctor_table.getSelectedRow ( ) );
    }
     
     /**
      * A method to return a selected row
      * @return 
      */
     public int getSelectedRow(){
         return doctor_table.getSelectedRow();
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
     * Method to return close button
     * @return 
     */
    public JButton getClose(){
        return close;
    }//End of getClose
    
    /**
     * Method to return open button
     * @return 
     */
    public JButton getOpen(){
        return open;
    }//End of getOpen
    
    /**
     * MEthod to return save button
     * @return 
     */
    public JButton getSave(){
        return save;
    }//End of getSave
    
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
     * Method to return the search text field
     * @return 
     */
    public String getSearch(){
        return search_field.getText();
    }//End of getSearch
    
    /**
     * Method to return the search button
     * @return 
     */
    public JButton getSearch_button(){
        return search_button;
    }//End of getSearch
    
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctor_table = new javax.swing.JTable();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        display = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        open = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        print = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        close = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        search_field = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        import_menu = new javax.swing.JMenuItem();
        export_menu = new javax.swing.JMenuItem();
        exit_menu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        display_menu = new javax.swing.JMenuItem();
        update_menu = new javax.swing.JMenuItem();
        delete_menu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        print_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctor_table.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        doctor_table.setModel(table_model);
        doctor_table.setRowHeight(25);
        jScrollPane1.setViewportView(doctor_table);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1300, -1));

        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator6);

        display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/accept_database-32.png"))); // NOI18N
        display.setToolTipText("Display data in database");
        jToolBar1.add(display);

        jLabel4.setText("     ");
        jToolBar1.add(jLabel4);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/delete_database-32.png"))); // NOI18N
        delete.setToolTipText("Delete data from database");
        jToolBar1.add(delete);

        jLabel3.setText("     ");
        jToolBar1.add(jLabel3);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/data_backup-32.png"))); // NOI18N
        update.setToolTipText("Update data in database");
        jToolBar1.add(update);
        jToolBar1.add(jSeparator5);

        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/import-32.png"))); // NOI18N
        open.setToolTipText("Import data from csv");
        jToolBar1.add(open);

        jLabel2.setText("     ");
        jToolBar1.add(jLabel2);

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/export-32.png"))); // NOI18N
        save.setToolTipText("Export data to csv");
        jToolBar1.add(save);
        jToolBar1.add(jSeparator4);

        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/print-32.png"))); // NOI18N
        print.setToolTipText("Print data");
        print.setFocusable(false);
        print.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        print.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(print);
        jToolBar1.add(jSeparator3);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/cancel-32.png"))); // NOI18N
        close.setToolTipText("Exit");
        jToolBar1.add(close);
        jToolBar1.add(jSeparator7);

        jDesktopPane2.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 50));
        jDesktopPane2.add(search_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 230, 35));

        search_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/search-32.png"))); // NOI18N
        search_button.setToolTipText("Search");
        jDesktopPane2.add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 40, 35));

        getContentPane().add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

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

        exit_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exit_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/cancel-26.png"))); // NOI18N
        exit_menu.setText("Exit");
        jMenu1.add(exit_menu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Database");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        display_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        display_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/accept_database-26.png"))); // NOI18N
        display_menu.setText("Display");
        jMenu2.add(display_menu);

        update_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        update_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/data_backup-26.png"))); // NOI18N
        update_menu.setText("Update");
        jMenu2.add(update_menu);

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
            java.util.logging.Logger.getLogger(Doctor_Table_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_Table_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_Table_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_Table_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_Table_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JButton delete;
    private javax.swing.JMenuItem delete_menu;
    private javax.swing.JButton display;
    private javax.swing.JMenuItem display_menu;
    public static javax.swing.JTable doctor_table;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton open;
    private javax.swing.JButton print;
    private javax.swing.JMenuItem print_menu;
    private javax.swing.JButton save;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_field;
    private javax.swing.JButton update;
    private javax.swing.JMenuItem update_menu;
    // End of variables declaration//GEN-END:variables
}
