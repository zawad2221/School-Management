/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import loginPage.Page_2;
import profile.ProfilePage1;
import profile_page.Profile_page_1;

/**
 *
 * @author hp
 */
public class Admin_Home_Page extends javax.swing.JFrame {

    private CreatedAcountVariable CreatedAcountVariableObject = new CreatedAcountVariable();

    /**
     * Creates new form Admin_Home_Page
     */
    public Admin_Home_Page() {
        initComponents();
        //jButton1.setBackground(new java.awt.Color(240, 240, 240));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnCreatAccountForTeacher = new javax.swing.JButton();
        btnCreatAccountForStudent = new javax.swing.JButton();
        btnAddClass = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("Profile");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCreatAccountForTeacher.setBackground(new java.awt.Color(255, 255, 255));
        btnCreatAccountForTeacher.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnCreatAccountForTeacher.setText("Creat Account For Teacher");
        btnCreatAccountForTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreatAccountForTeacherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreatAccountForTeacherMouseExited(evt);
            }
        });
        btnCreatAccountForTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatAccountForTeacherActionPerformed(evt);
            }
        });

        btnCreatAccountForStudent.setBackground(new java.awt.Color(255, 255, 255));
        btnCreatAccountForStudent.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnCreatAccountForStudent.setText("Create Account For Student");
        btnCreatAccountForStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreatAccountForStudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreatAccountForStudentMouseExited(evt);
            }
        });
        btnCreatAccountForStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatAccountForStudentActionPerformed(evt);
            }
        });

        btnAddClass.setBackground(new java.awt.Color(255, 255, 255));
        btnAddClass.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnAddClass.setText("Add Class");
        btnAddClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddClassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddClassMouseExited(evt);
            }
        });
        btnAddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClassActionPerformed(evt);
            }
        });

        logOutButton.setBackground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("Log Out");
        logOutButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButtonMouseExited(evt);
            }
        });
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreatAccountForTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddClass, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreatAccountForStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(224, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(btnCreatAccountForTeacher)
                .addGap(31, 31, 31)
                .addComponent(btnCreatAccountForStudent)
                .addGap(26, 26, 26)
                .addComponent(btnAddClass)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClassActionPerformed
        // TODO add your handling code here:
        AddClass AddClassObject = new AddClass();
        AddClassObject.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddClassActionPerformed

    private void btnCreatAccountForTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatAccountForTeacherActionPerformed
        // TODO add your handling code here:
        CreatedAcountVariableObject.userType = "teacher";
        AccountCounter AccountCounterObject = new AccountCounter();
        AccountCounterObject.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCreatAccountForTeacherActionPerformed

    private void btnCreatAccountForStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatAccountForStudentActionPerformed
        // TODO add your handling code here:

        CreatedAcountVariableObject.userType = "student";
        AccountCounter AccountCounterObject = new AccountCounter();
        AccountCounterObject.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCreatAccountForStudentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        Profile_page_1 Profile_page_1Object = new Profile_page_1();
//        Profile_page_1Object.setVisible(true);
//        dispose();

        ProfilePage1 ProfilePage1Object = new ProfilePage1();
        ProfilePage1Object.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        Page_2 Page_2Object = new Page_2();
        Page_2Object.setVisible(true);
        dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        
        jButton1.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jButton1MouseExited

    private void btnCreatAccountForTeacherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreatAccountForTeacherMouseEntered
        // TODO add your handling code here:
        btnCreatAccountForTeacher.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnCreatAccountForTeacherMouseEntered

    private void btnCreatAccountForTeacherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreatAccountForTeacherMouseExited
        // TODO add your handling code here:
        btnCreatAccountForTeacher.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_btnCreatAccountForTeacherMouseExited

    private void btnCreatAccountForStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreatAccountForStudentMouseEntered
        // TODO add your handling code here:
        btnCreatAccountForStudent.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnCreatAccountForStudentMouseEntered

    private void btnCreatAccountForStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreatAccountForStudentMouseExited
        // TODO add your handling code here:
        btnCreatAccountForStudent.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_btnCreatAccountForStudentMouseExited

    private void btnAddClassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddClassMouseEntered
        // TODO add your handling code here:
        btnAddClass.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnAddClassMouseEntered

    private void btnAddClassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddClassMouseExited
        // TODO add your handling code here:
        btnAddClass.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_btnAddClassMouseExited

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
        // TODO add your handling code here:
        logOutButton.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
        // TODO add your handling code here:
        logOutButton.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_logOutButtonMouseExited

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
            java.util.logging.Logger.getLogger(Admin_Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Home_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClass;
    private javax.swing.JButton btnCreatAccountForStudent;
    private javax.swing.JButton btnCreatAccountForTeacher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton logOutButton;
    // End of variables declaration//GEN-END:variables
}
