/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.views;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author chokayg3
 */
public class Patient_View extends javax.swing.JFrame {

    /**
     * Creates new form Doctor
     */
    public Patient_View() {
        initComponents();
    }//End of constructor
    
    /**
     * A method to get a button id
     * @return 
     */
    public JButton getOk_button(){
        return ok_button;
    }//End of getOk_button
    
    /**
     * A method to get a button id
     * @return 
     */    
    public JButton getClose_button(){
        return close_button;
    }//End of getClose_button
    
    /**
     * A method to get a button id
     * @return 
     */    
    public JButton getImage_button(){
        return image_button;
    }//End of getImage_button
    
    /**
     * A method to get a string in a text field id
     * @return 
     */
    public String getPatientId(){
        return patientId.getText();
    }//End of getPatientId
    
    public void edit(){
        patientId.setEditable(false);
    }
    
    public void setPatientId(String x){
        patientId.setText(x);
    }
    
    /**
     * A method to get a string in a text field id
     * @return 
     */
    public String getPatientFname(){
        return patientFname.getText();
    }//End of getPatientFname
    
    public void setPatientFname(){
         patientFname.setText(null);
    }

    /**
     * A method to get a string in a text field id
     * @return 
     */    
    public String getPatientSname(){
        return patientSname.getText();
    }//End of getPatientSname
    
    public void setPatientSname(){
         patientSname.setText(null);
    }
    
    /**
     * A method to get a string in a text field id
     * @return 
     */    
    public int getPatientAge(){
        return Integer.parseInt(patientAge.getText());
    }//End of getPatientAge
    
    public void setPatientAge(){
         patientAge.setText(null);
    }
    
    /**
     * A method to get a string in a text field id
     * @return 
     */    
    public String getPatientAddress(){
        return patientAddress.getText();
    }//End of getPatientAddress
    
    public void setPatientAddress(){
         patientAddress.setText(null);
    }
    
    /**
     * A method to get a string in a text field id
     * @return 
     */    
    public int getPatientPhone(){
        return Integer.parseInt(patientPhone.getText());
    }//End of getPatientPhone
    
    public void setPatientPhone(){
         patientPhone.setText(null);
    }
    
    /**
     * A method to get items in a combo box id
     * @return 
     */    
    public String getPatientGender(){
        return patientGender.getSelectedItem().toString();
    }//End of getPatientGender
    
    public void setPatientGender(){
         patientGender.setSelectedIndex(0);
    }
    
    /**
     * A method to get a string in a text field id
     * @return 
     */    
    public String getPatientOccupation(){
        return patientOccupation.getText();
    }//End of getPatientOccupation
    
      public void setPatientOccupation(){
         patientOccupation.setText(null);
    }
    
    /**
     * A method to get items in a combo box id
     * @return 
     */    
    public String getPatientBloodgroup(){
        return patientBloodgroup.getSelectedItem().toString();
    }//End of getPatientBloodgroup
    
      public void setPatientBloodgroup(){
         patientBloodgroup.setSelectedIndex(0);
    }
    
    /**
     * A method to get items in a combo box id
     * @return 
     */    
    public String getPatientMaritalstatus(){
        return patientMaritalstatus.getSelectedItem().toString();
    }//End of getPatientMaritalstatus
    
      public void setPatientMaritalstatus(){
         patientMaritalstatus.setSelectedIndex(0);
    }
    
    /**
     * A method to get a string in a text field id
     * @return 
     */       
    public String getPatientNational(){
        return patientNational.getText();
    }//End of getPatientNational
    
      public void setPatientNational(){
         patientNational.setText(null);
    }
    
    /**
     * A method to get a string of a date in a text field id
     * @return 
     */       
    public String getPatientBirthdate(){
        return ((JTextField)patientBirthdate.getDateEditor().getUiComponent()).getText();
    }//End of getPatientBirthdate
    
      public void setPatientBirthdate(){
         patientBirthdate.setDate(null);
    }
       
      /**
       * 
       * @return 
       */
      public String getDrugName(){
          return drugName.getText();
      }
      
      /**
       * 
       */
      public void setDrugName(){
          drugName.setText(null);
      }
      
      /**
       * 
       * @return 
       */
      public String getPatientDisease(){
          return patientDisease.getText();
      }
      
      /**
       * 
       */
      public void setPatientDisease(){
          patientDisease.setText(null);
      }
      
      /**
       * 
     * @return 
       */
      public String getPatientSymptom(){
          return patientSymptom.getText();
      }
      
      /**
       * 
       */
      public void setPatientSymptom(){
          patientSymptom.setText(null);
      }
      
      /**
       * 
       * @return 
       */
     public String getDrugInstruction(){
         return drugInstruction.getText();
     }
      
     /**
      * 
      */
     public void setDrugInstruction(){
         drugInstruction.setText(null);
     }
      
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPatientBackground = new javax.swing.JLabel();
        ok_button = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        close_button = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        image_button = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        patientId = new javax.swing.JTextField();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        patientNational = new javax.swing.JTextField();
        patientOccupation = new javax.swing.JTextField();
        patientAge = new javax.swing.JTextField();
        patientSname = new javax.swing.JTextField();
        patientFname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        patientGender = new javax.swing.JComboBox();
        patientMaritalstatus = new javax.swing.JComboBox();
        patientBloodgroup = new javax.swing.JComboBox();
        patientBirthdate = new com.toedter.calendar.JDateChooser();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        patientAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        patientPhone = new javax.swing.JTextField();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        patientDisease = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientSymptom = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        drugInstruction = new javax.swing.JTextArea();
        drugName = new javax.swing.JTextField();

        addPatientBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/addpatient.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD PATIENT");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ok_button.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        ok_button.setText("OK");
        getContentPane().add(ok_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1110, -1, -1));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel23.setText("ADD PATIENT");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 180, 20));

        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/x_lowercase-26.png"))); // NOI18N
        getContentPane().add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, 20));

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Unique Information"));

        image_button.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        image_button.setMnemonic('p');
        image_button.setText("PHOTO");
        jDesktopPane1.add(image_button);
        image_button.setBounds(10, 20, 230, 160);

        jLabel16.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel16.setText("Patient ID");
        jDesktopPane1.add(jLabel16);
        jLabel16.setBounds(370, 130, 65, 40);

        patientId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jDesktopPane1.add(patientId);
        patientId.setBounds(490, 130, 230, 40);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 730, 190));

        jDesktopPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Patient Details"));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setText("First Name");
        jDesktopPane2.add(jLabel1);
        jLabel1.setBounds(10, 30, 71, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel3.setText("Last Name");
        jDesktopPane2.add(jLabel3);
        jLabel3.setBounds(10, 80, 69, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("Age");
        jDesktopPane2.add(jLabel2);
        jLabel2.setBounds(10, 130, 26, 40);

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel6.setText("Occupation");
        jDesktopPane2.add(jLabel6);
        jLabel6.setBounds(10, 180, 78, 40);

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel8.setText("Nationality");
        jDesktopPane2.add(jLabel8);
        jLabel8.setBounds(10, 230, 71, 40);

        patientNational.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jDesktopPane2.add(patientNational);
        patientNational.setBounds(110, 230, 230, 40);

        patientOccupation.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jDesktopPane2.add(patientOccupation);
        patientOccupation.setBounds(110, 180, 230, 40);

        patientAge.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jDesktopPane2.add(patientAge);
        patientAge.setBounds(110, 130, 230, 40);

        patientSname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        patientSname.setToolTipText("");
        jDesktopPane2.add(patientSname);
        patientSname.setBounds(110, 80, 230, 40);

        patientFname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jDesktopPane2.add(patientFname);
        patientFname.setBounds(110, 30, 230, 40);

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel9.setText("Date Of Birth");
        jDesktopPane2.add(jLabel9);
        jLabel9.setBounds(370, 30, 89, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setText("Blood Group");
        jDesktopPane2.add(jLabel4);
        jLabel4.setBounds(370, 80, 84, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel7.setText("Marital Status");
        jDesktopPane2.add(jLabel7);
        jLabel7.setBounds(370, 130, 93, 40);

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel5.setText("Gender");
        jDesktopPane2.add(jLabel5);
        jLabel5.setBounds(370, 180, 50, 30);

        patientGender.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        patientGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "null", "Male", "Female" }));
        jDesktopPane2.add(patientGender);
        patientGender.setBounds(490, 180, 230, 40);

        patientMaritalstatus.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        patientMaritalstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "null", "Single", "Married" }));
        jDesktopPane2.add(patientMaritalstatus);
        patientMaritalstatus.setBounds(490, 130, 230, 40);

        patientBloodgroup.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        patientBloodgroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "null", "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        jDesktopPane2.add(patientBloodgroup);
        patientBloodgroup.setBounds(490, 80, 230, 40);

        patientBirthdate.setDateFormatString("yyyy-MM-dd");
        patientBirthdate.setMaxSelectableDate(new java.util.Date(1418346077000L));
        patientBirthdate.setMinSelectableDate(new java.util.Date(-2208985123000L));
        jDesktopPane2.add(patientBirthdate);
        patientBirthdate.setBounds(490, 30, 230, 40);

        getContentPane().add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 730, 300));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contact Details"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientAddress.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel2.add(patientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 228, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel10.setText("Address");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel13.setText("Contact No");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 40));

        patientPhone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel2.add(patientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 230, 40));

        jDesktopPane3.add(jPanel2);
        jPanel2.setBounds(0, 20, 730, 70);

        getContentPane().add(jDesktopPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 730, 90));
        getContentPane().add(jDesktopPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 730, 190));

        jTabbedPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Doctor Details"));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel25.setText("Patient Disease");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 30));

        patientDisease.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel7.add(patientDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 40));

        jLabel20.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel20.setText("Patient Symptoms");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, 30));

        patientSymptom.setColumns(20);
        patientSymptom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        patientSymptom.setRows(5);
        jScrollPane1.setViewportView(patientSymptom);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 440, 80));

        jTabbedPane3.addTab("Report", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel24.setText("Drug Name");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 30));

        jLabel21.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel21.setText("Instruction");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 30));

        drugInstruction.setColumns(20);
        drugInstruction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        drugInstruction.setRows(5);
        jScrollPane2.setViewportView(drugInstruction);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 440, 80));

        drugName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel8.add(drugName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 40));

        jTabbedPane3.addTab("Prescription", jPanel8);

        getContentPane().add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 850, 730, 170));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Patient_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Patient_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Patient_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Patient_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Patient_View().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addPatientBackground;
    private javax.swing.JButton close_button;
    private javax.swing.JTextArea drugInstruction;
    private javax.swing.JTextField drugName;
    private javax.swing.JButton image_button;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton ok_button;
    private javax.swing.JTextField patientAddress;
    private javax.swing.JTextField patientAge;
    private com.toedter.calendar.JDateChooser patientBirthdate;
    private javax.swing.JComboBox patientBloodgroup;
    private javax.swing.JTextField patientDisease;
    private javax.swing.JTextField patientFname;
    private javax.swing.JComboBox patientGender;
    private javax.swing.JTextField patientId;
    private javax.swing.JComboBox patientMaritalstatus;
    private javax.swing.JTextField patientNational;
    private javax.swing.JTextField patientOccupation;
    private javax.swing.JTextField patientPhone;
    private javax.swing.JTextField patientSname;
    private javax.swing.JTextArea patientSymptom;
    // End of variables declaration//GEN-END:variables
}
