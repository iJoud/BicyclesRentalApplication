/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BicycleRentalApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akihiko Shuji
 */
public class AccountInformation extends javax.swing.JFrame {

    /**
     * Creates new form AccountInformation
     */
    
    public int CurrentUser;
    
    public AccountInformation() {
        initComponents();
        UserName.setText(User.Users.get(CurrentUser).getfName() + " " + User.Users.get(CurrentUser).getlName());
        Email.setText(User.Users.get(CurrentUser).getEmail());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UserName = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Interface = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        ChangePassword = new javax.swing.JLabel();
        SavedCC = new javax.swing.JLabel();
        Edit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(440, 890));
        setPreferredSize(new java.awt.Dimension(430, 890));
        setSize(new java.awt.Dimension(428, 926));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(430, 890));
        jPanel1.setPreferredSize(new java.awt.Dimension(430, 890));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserName.setBackground(new java.awt.Color(246, 246, 246));
        UserName.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        UserName.setForeground(new java.awt.Color(5, 63, 94));
        jPanel1.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 190, 30));

        Email.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        Email.setForeground(new java.awt.Color(5, 63, 94));
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 240, 40));

        jPanel2.setBackground(new java.awt.Color(246, 246, 246));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 180, 40));

        jPanel3.setBackground(new java.awt.Color(246, 246, 246));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 240, 40));

        Interface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfacesImage/Account Information.png"))); // NOI18N
        jPanel1.add(Interface, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 430, 910));

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        ChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePasswordMouseClicked(evt);
            }
        });
        jPanel1.add(ChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 110, 30));

        SavedCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SavedCCMouseClicked(evt);
            }
        });
        jPanel1.add(SavedCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 230, 40));

        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });
        jPanel1.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 210, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked

        try {
            new HomePage().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(AccountInformation.class.getName()).log(Level.SEVERE, null, ex);
        } //End of try/catch
        this.dispose();
        
    }//GEN-LAST:event_backMouseClicked

    private void ChangePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordMouseClicked
        
        new AccountInformation_ChangePassword().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_ChangePasswordMouseClicked

    private void SavedCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SavedCCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SavedCCMouseClicked

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        
        new AccountInformation_Edit().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_EditMouseClicked

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
            java.util.logging.Logger.getLogger(AccountInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountInformation().setVisible(true);
            }
        });
    } //End of main method

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChangePassword;
    private javax.swing.JLabel Edit;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Interface;
    private javax.swing.JLabel SavedCC;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
} //End of class
