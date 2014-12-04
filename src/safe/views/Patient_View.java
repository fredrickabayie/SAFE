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
    
    public void setPatientId(){
        patientId.setText(null);
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
          return drugInstruction.getText();
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
      public String getPatientSymptoms(){
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
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        patientFname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        patientAge = new javax.swing.JTextField();
        patientSname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patientOccupation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        patientMaritalstatus = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        patientNational = new javax.swing.JTextField();
        patientBirthdate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        patientBloodgroup = new javax.swing.JComboBox();
        patientGender = new javax.swing.JComboBox();
        ok_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        patientAddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        patientPhone = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        patientId = new javax.swing.JTextField();
        image_button = new javax.swing.JButton();
        close_button = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

        addPatientBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/addpatient.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD PATIENT");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Doctor Details"));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel26.setText("Doctor ID");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jLabel17.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel17.setText("First Name");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 40));

        jLabel18.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel18.setText("Department");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 40));

        jLabel19.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel19.setText("Surname");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, 40));

        jLabel11.setText("jLabel11");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 220, -1));

        jLabel14.setText("jLabel14");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 210, -1));

        jLabel15.setText("jLabel15");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 200, -1));

        jLabel22.setText("jLabel22");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 200, -1));

        jTabbedPane3.addTab("Doctor", jPanel4);

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

        getContentPane().add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 730, 170));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Patient Details"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        patientFname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(patientFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 230, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("Age");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        patientAge.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(patientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 230, 40));

        patientSname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        patientSname.setToolTipText("");
        jPanel1.add(patientSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 230, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setText("Blood Group");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel6.setText("Occupation");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 40));

        patientOccupation.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(patientOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 230, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel7.setText("Marital Status");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, 40));

        patientMaritalstatus.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        patientMaritalstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "null", "Single", "Married" }));
        jPanel1.add(patientMaritalstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 230, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel8.setText("Nationality");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 40));

        patientNational.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(patientNational, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 230, 40));

        patientBirthdate.setDateFormatString("yyyy-MM-dd");
        patientBirthdate.setMaxSelectableDate(new java.util.Date(1418346077000L));
        patientBirthdate.setMinSelectableDate(new java.util.Date(-2208985123000L));
        jPanel1.add(patientBirthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 230, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel9.setText("Date Of Birth");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 30));

        patientBloodgroup.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        patientBloodgroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "null", "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        jPanel1.add(patientBloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 230, 40));

        patientGender.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        patientGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "null", "Male", "Female" }));
        jPanel1.add(patientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 230, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 730, 270));

        ok_button.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        ok_button.setText("OK");
        getContentPane().add(ok_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 720, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contact Details"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel10.setText("Address");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        patientAddress.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel2.add(patientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 228, 40));

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel13.setText("Contact No");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 40));

        patientPhone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel2.add(patientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 230, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 730, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Unique Information"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel16.setText("Patient ID");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, 40));

        patientId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel3.add(patientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 230, 40));

        image_button.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        image_button.setMnemonic('p');
        image_button.setText("PHOTO");
        jPanel3.add(image_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, 160));

        close_button.setText("x");
        jPanel3.add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 730, 190));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel23.setText("ADD PATIENT");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 180, 20));

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
