/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.views;

/**
 *
 * @author chokayg3
 */
public class Doctor_View extends javax.swing.JFrame {

    /**
     * Creates new form Doctor_View
     */
    public Doctor_View() {
        initComponents();
    }//End of Doctor_View
    
    /**
     * 
     * @return 
     */
    public String getDoctorId(){
        return doctorId.getText();
    }//End of getDoctorId
    
    /**
     * 
     * @return 
     */
    public String getDoctorFname(){
        return doctorFname.getText();
    }//End of getDoctorFname
    
    /**
     * 
     * @return 
     */
    public String getDoctorSname(){
        return doctorSname.getText();
    }//End of getDoctorSname
    
    /**
     * 
     * @return 
     */
    public String getDoctorPhone(){
        return doctorPhone.getText();
    }//End of getDoctorPhone
    
    /**
     * 
     * @return 
     */
    public String getDoctorEmail(){
        return doctorEmail.getText();
    }//End of getDoctorEmail
    
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        doctorImage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        doctorId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        doctorFname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doctorSname = new javax.swing.JTextField();
        doctorPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        doctorEmail = new javax.swing.JTextField();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/safe/images/newdoctor3.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctorImage.setText("PHOTO");
        jPanel1.add(doctorImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 160));

        jLabel1.setText("Doctor ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 30));
        jPanel1.add(doctorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 230, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 180));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(doctorFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 240, 50));

        jLabel3.setText("First Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 40));

        jLabel4.setText("Surname");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 40));
        jPanel2.add(doctorSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 149, 230, 50));
        jPanel2.add(doctorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 219, 220, 50));

        jLabel5.setText("Phone");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 225, -1, 40));

        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, 40));
        jPanel2.add(doctorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 190, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 790, 320));

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
            java.util.logging.Logger.getLogger(Doctor_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField doctorEmail;
    private javax.swing.JTextField doctorFname;
    private javax.swing.JTextField doctorId;
    private javax.swing.JButton doctorImage;
    private javax.swing.JTextField doctorPhone;
    private javax.swing.JTextField doctorSname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
