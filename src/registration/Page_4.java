/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import loginPage.*;

/**
 *
 * @author hp
 */
public class Page_4 extends javax.swing.JFrame {

    /**
     * Creates new form Page_4
     */
    public Page_4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namejLabel = new javax.swing.JLabel();
        namejLabel1 = new javax.swing.JLabel();
        namejLabel2 = new javax.swing.JLabel();
        namejLabel3 = new javax.swing.JLabel();
        namejLabel4 = new javax.swing.JLabel();
        namejLabel5 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        institutionNameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        passwordLevelLabel = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseListenerExit(evt);
            }
        });

        namejLabel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        namejLabel.setText("Name");

        namejLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        namejLabel1.setText("Institution name");

        namejLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        namejLabel2.setText("Email");

        namejLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        namejLabel3.setText("Phone Number");

        namejLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        namejLabel4.setText("Password");

        namejLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        namejLabel5.setText("Confirm Password");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        institutionNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutionNameTextFieldActionPerformed(evt);
            }
        });

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        phoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextFieldActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.setEnabled(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jButton1.setText("Skip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordFieldMouseExited(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFieldKeyReleased(evt);
            }
        });

        confirmPasswordField.setEnabled(false);
        confirmPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmPasswordFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnSubmit)
                .addContainerGap(351, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namejLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(namejLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namejLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namejLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(institutionNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTextField)
                            .addComponent(passwordField)
                            .addComponent(confirmPasswordField))
                        .addGap(26, 26, 26)
                        .addComponent(passwordLevelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(institutionNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namejLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namejLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLevelLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namejLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namejLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void institutionNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutionNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_institutionNameTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void phoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextFieldActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        RegistrationVariable RegistrationVariableObject = new RegistrationVariable();

        RegistrationVariableObject.name = nameTextField.getText();
        RegistrationVariableObject.institution = institutionNameTextField.getText();
        RegistrationVariableObject.phone_number = phoneNumberTextField.getText();
        RegistrationVariableObject.email = emailTextField.getText();
        RegistrationVariableObject.password = passwordField.getText();
        RegistrationVariableObject.confirm_password = confirmPasswordField.getText();
        RegistrationVariableObject.user_type = "admin";
        //System.out.println(RegistrationVariableObject.name+RegistrationVariableObject.name);
        if ((RegistrationVariableObject.name.equals("")) || (RegistrationVariableObject.institution.equals("")) || (RegistrationVariableObject.phone_number.equals("")) || (RegistrationVariableObject.email.equals("")) || (RegistrationVariableObject.password.equals("") || RegistrationVariableObject.confirm_password.equals("")) || (RegistrationVariableObject.password.compareTo(RegistrationVariableObject.confirm_password) != 0)) {
            //Paze_6_Registration_Error Paze_6_Registration_ErrorObject = new Paze_6_Registration_Error();
            //Paze_6_Registration_ErrorObject.setVisible(true);
            dispose();
        } else {
            Page_5 Page_5_object = new Page_5();
            Page_5_object.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void mouseListenerExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseListenerExit
        // TODO add your handling code here:
        if ((nameTextField.getText().equals("")) || (institutionNameTextField.getText().equals("")) || (phoneNumberTextField.getText().equals("")) || (emailTextField.getText().equals("")) || (passwordField.getText().equals("") || confirmPasswordField.getText().equals("")) || (passwordField.getText().compareTo(confirmPasswordField.getText()) != 0)) {
            btnSubmit.setEnabled(false);
        } else {
            btnSubmit.setEnabled(true);
        }

    }//GEN-LAST:event_mouseListenerExit

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        if ((nameTextField.getText().equals("")) || (institutionNameTextField.getText().equals("")) || (phoneNumberTextField.getText().equals("")) || (emailTextField.getText().equals("")) || (passwordField.getText().equals("") || confirmPasswordField.getText().equals("")) || (passwordField.getText().compareTo(confirmPasswordField.getText()) != 0)) {
            btnSubmit.setEnabled(false);
        } else {
            btnSubmit.setEnabled(true);
        }
    }//GEN-LAST:event_formMouseEntered

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Page_2 Page_2_Object = new Page_2();
        Page_2_Object.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyReleased
        // TODO add your handling code here:
        if (confirmPasswordField.getText().compareTo(passwordField.getText()) != 0 && confirmPasswordField.getText().compareTo("") != 0) {
            messageLabel.setText("Password dosen't match");
        } else {
            messageLabel.setText("");
        }

        if (passwordField.getText().length() < 6) {
            passwordLevelLabel.setText("Too weak");
            confirmPasswordField.setEnabled(false);
        } else if (passwordField.getText().length() < 9) {
            passwordLevelLabel.setText("weak");
            confirmPasswordField.setEnabled(false);
        } else if (passwordField.getText().length() < 12) {
            passwordLevelLabel.setText("medium");
            confirmPasswordField.setEnabled(true);
        } else {
            passwordLevelLabel.setText("strong");
            confirmPasswordField.setEnabled(true);
        }

    }//GEN-LAST:event_passwordFieldKeyReleased

    private void passwordFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseExited
        // TODO add your handling code here:

        if (passwordLevelLabel.getText().equals("strong") || passwordLevelLabel.getText().equals("medium") || passwordField.getText().equals("")) {
            passwordLevelLabel.setText("");
        }
    }//GEN-LAST:event_passwordFieldMouseExited

    private void confirmPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordFieldKeyReleased
        // TODO add your handling code here:

        if (confirmPasswordField.getText().compareTo(passwordField.getText()) != 0) {
            messageLabel.setText("Password dosen't match");
        } else {
            messageLabel.setText("");
        }
    }//GEN-LAST:event_confirmPasswordFieldKeyReleased

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
            java.util.logging.Logger.getLogger(Page_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField institutionNameTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JLabel namejLabel1;
    private javax.swing.JLabel namejLabel2;
    private javax.swing.JLabel namejLabel3;
    private javax.swing.JLabel namejLabel4;
    private javax.swing.JLabel namejLabel5;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLevelLabel;
    private javax.swing.JTextField phoneNumberTextField;
    // End of variables declaration//GEN-END:variables
}