package com.oodj_assignment.UI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.oodj_assignment.Customer;
import javax.swing.JOptionPane;

/**
 *
 * @author Jackson
 */
public class SignupForm extends javax.swing.JFrame {

    Customer newCustomer = new Customer();
    
    /**
     * Creates new form MainPage
     */
    public SignupForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        clearBtn = new javax.swing.JButton();
        passwordTf = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        usernameTf = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        phoneNumLabel = new javax.swing.JLabel();
        phoneNumTf = new javax.swing.JTextField();
        confirmPasswordLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();
        confirmPasswordTf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 10, true));

        clearBtn.setBackground(new java.awt.Color(255, 255, 255));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.setFocusPainted(false);
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        passwordTf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordLabel.setText("Password");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emailLabel.setText("Email");

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setText("Sign up ");

        emailTf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        usernameTf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameLabel.setText("Username");

        phoneNumLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phoneNumLabel.setText("Phone number (+60)");

        phoneNumTf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        confirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        confirmPasswordLabel.setText("Confirm password");

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(null);
        backBtn.setFocusPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        signupBtn.setBackground(new java.awt.Color(255, 255, 255));
        signupBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        signupBtn.setText("Sign up");
        signupBtn.setFocusPainted(false);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        confirmPasswordTf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(title))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phoneNumTf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(emailLabel)
                            .addComponent(emailTf)
                            .addComponent(phoneNumLabel)
                            .addComponent(usernameLabel)
                            .addComponent(usernameTf))
                        .addGap(59, 59, 59)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordTf)
                            .addComponent(passwordLabel)
                            .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordLabel)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(confirmPasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmPasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(phoneNumLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        emailTf.setText("");
        usernameTf.setText("");
        phoneNumTf.setText("");
        passwordTf.setText("");
        confirmPasswordTf.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        new MainMenu().show();
    }//GEN-LAST:event_backBtnActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        try { 
            newCustomer.signup(
                emailTf.getText(), 
                usernameTf.getText(), 
                phoneNumTf.getText(),
                passwordTf.getText(),
                confirmPasswordTf.getText()
            );
            dispose();
            newCustomer.viewMenu();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } 
    }//GEN-LAST:event_signupBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel background;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPasswordTf;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTf;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTf;
    private javax.swing.JLabel phoneNumLabel;
    private javax.swing.JTextField phoneNumTf;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel title;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTf;
    // End of variables declaration//GEN-END:variables

}
