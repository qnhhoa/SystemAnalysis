/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Account_DTO;
import BUS.Account_BUS;
import com.sun.source.tree.BreakTree;
import javax.swing.JOptionPane;
/**
 *
 * @author Huy
 */
public class DMK_Panel extends javax.swing.JFrame {

    /**
     * Creates new form DMK_Panel
     */

    //public String pass;
    
    
    public DMK_Panel() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DMK_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MatKhauCu_TextField = new javax.swing.JPasswordField();
        MatKhauMoi_TextField = new javax.swing.JPasswordField();
        MatKhauMoiReW_TextField = new javax.swing.JPasswordField();
        btnMDK = new javax.swing.JButton();

        setTitle("CHANGE PASSWORD");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DMK_Panel.setBackground(new java.awt.Color(250, 249, 248));
        DMK_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("UTM Avo", 1, 12)); // NOI18N
        jLabel1.setText("RE-ENTER THE PASSWORD:");
        DMK_Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 170, 40));

        jLabel2.setFont(new java.awt.Font("UTM Avo", 1, 12)); // NOI18N
        jLabel2.setText("ENTER THE OLD PASSWORD:");
        DMK_Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 40));

        jLabel3.setFont(new java.awt.Font("UTM Avo", 1, 12)); // NOI18N
        jLabel3.setText("ENTER THE NEW PASSWORD:");
        DMK_Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 40));

        MatKhauCu_TextField.setText(".............");
        MatKhauCu_TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MatKhauCu_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MatKhauCu_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MatKhauCu_TextFieldFocusLost(evt);
            }
        });
        DMK_Panel.add(MatKhauCu_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 320, 40));

        MatKhauMoi_TextField.setText(".............");
        MatKhauMoi_TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MatKhauMoi_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MatKhauMoi_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MatKhauMoi_TextFieldFocusLost(evt);
            }
        });
        DMK_Panel.add(MatKhauMoi_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 320, 40));

        MatKhauMoiReW_TextField.setText(".............");
        MatKhauMoiReW_TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MatKhauMoiReW_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MatKhauMoiReW_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MatKhauMoiReW_TextFieldFocusLost(evt);
            }
        });
        DMK_Panel.add(MatKhauMoiReW_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 320, 40));

        btnMDK.setFont(new java.awt.Font("UTM Avo", 1, 14)); // NOI18N
        btnMDK.setText("CHANGE PASSWORD");
        btnMDK.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnMDK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMDKMouseClicked(evt);
            }
        });
        btnMDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMDKActionPerformed(evt);
            }
        });
        DMK_Panel.add(btnMDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 50));

        getContentPane().add(DMK_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatKhauCu_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MatKhauCu_TextFieldFocusGained
        if(MatKhauCu_TextField.getText().equals(".............")){
            MatKhauCu_TextField.setText("");
        }
    }//GEN-LAST:event_MatKhauCu_TextFieldFocusGained

    private void MatKhauCu_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MatKhauCu_TextFieldFocusLost
        if(MatKhauCu_TextField.getText().isEmpty()) {
            MatKhauCu_TextField.setText(".............");
            
        }else {
           
            
            this.account_DTO.setID(login_GUI.ID);
            this.account_DTO.setPass(MatKhauCu_TextField.getText());
            
            if(this.account_BUS.checkPass(this.account_DTO)) {
                
            }  else {          
                MatKhauCu_TextField.setText("");                
                MatKhauCu_TextField.requestFocus();
                JOptionPane.showMessageDialog(this, "Your old password was wrong.");
            }
        }
    }//GEN-LAST:event_MatKhauCu_TextFieldFocusLost

    private void MatKhauMoiReW_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MatKhauMoiReW_TextFieldFocusGained
        if(MatKhauMoiReW_TextField.getText().equals(".............")){
            MatKhauMoiReW_TextField.setText("");
        }
    }//GEN-LAST:event_MatKhauMoiReW_TextFieldFocusGained

    private void MatKhauMoiReW_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MatKhauMoiReW_TextFieldFocusLost
        if(MatKhauMoiReW_TextField.getText().isEmpty()) {
            MatKhauMoiReW_TextField.setText(".............");
        }
    }//GEN-LAST:event_MatKhauMoiReW_TextFieldFocusLost

    private void btnMDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMDKActionPerformed
        String pass = String.valueOf(MatKhauMoi_TextField.getPassword());
        String confirm = String.valueOf(MatKhauMoiReW_TextField.getPassword());
        if (!pass.equals(confirm)) {
            JOptionPane.showMessageDialog(this, "The Password and confirmation Password do not match!");
            MatKhauMoi_TextField.setText("");
            MatKhauMoiReW_TextField.setText("");
        }          
    }//GEN-LAST:event_btnMDKActionPerformed

    private void MatKhauMoi_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MatKhauMoi_TextFieldFocusGained
        if(MatKhauMoi_TextField.getText().equals(".............")){
                MatKhauMoi_TextField.setText("");
            }
    }//GEN-LAST:event_MatKhauMoi_TextFieldFocusGained

    private void MatKhauMoi_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MatKhauMoi_TextFieldFocusLost
        if(MatKhauMoi_TextField.getText().isEmpty()) {
            MatKhauMoi_TextField.setText(".............");
        }
    }//GEN-LAST:event_MatKhauMoi_TextFieldFocusLost

    private void btnMDKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMDKMouseClicked
        // TODO add your handling code here:
        if (MatKhauMoi_TextField.getText().equals(MatKhauMoiReW_TextField.getText())){
            account_BUS.ChangePass(new Account_DTO(login_GUI.ID,MatKhauMoi_TextField.getText()));
            JOptionPane.showMessageDialog(this,"Your password has been changed!");
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnMDKMouseClicked

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
            java.util.logging.Logger.getLogger(DMK_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DMK_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DMK_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DMK_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DMK_Panel().setVisible(true);
            }
        });
    }
    Account_BUS account_BUS = new Account_BUS();
    Account_DTO account_DTO = new Account_DTO();
    Login_GUI login_GUI = new Login_GUI();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DMK_Panel;
    private javax.swing.JPasswordField MatKhauCu_TextField;
    private javax.swing.JPasswordField MatKhauMoiReW_TextField;
    private javax.swing.JPasswordField MatKhauMoi_TextField;
    private javax.swing.JButton btnMDK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
