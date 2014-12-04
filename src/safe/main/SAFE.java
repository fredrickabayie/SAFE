/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.main;
import safe.controllers.Doctor_Controller;
import safe.models.Database_Model;
import safe.controllers.Patient_Controller;
import safe.views.Doctor_Table_View;
import safe.views.Doctor_View;
import safe.views.Patient_Table_View;
import safe.views.Patient_View;

/**
 *
 * @author chokayg3
 */
public class SAFE {

   /**
     * @param args the command line arguments
     */
    public static void main( String args [ ] ) {
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
            java.util.logging.Logger.getLogger(SAFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SAFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SAFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SAFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Patient_View patient_view = new Patient_View ( );
                Patient_Table_View patient_table_view = new Patient_Table_View();
                
                
                Doctor_View doctor_view = new Doctor_View ( );
                Doctor_Table_View doctor_table_view = new Doctor_Table_View ();
                
                Database_Model database_controller = new Database_Model ( patient_view,patient_table_view,doctor_view,doctor_table_view );
                Patient_Controller patient_controller = new Patient_Controller ( patient_view, database_controller, patient_table_view );
                Doctor_Controller doctor_controller = new Doctor_Controller (doctor_view,database_controller,doctor_table_view);
                
                
//               doctor_table_view.setVisible(true);
               
//                patient_view.setVisible ( true );
//                patient_table_view.setVisible(true);
//                doctor_view.setVisible(true);
//                patient_controller.doctorController();
//                doctor_controller.doctorButton();
                patient_controller.patientButton();
            }
        });
    }
    
}