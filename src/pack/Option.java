/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.awt.Color;
import javax.swing.ButtonGroup;

/**
 *
 * @author Justine
 */
public class Option extends javax.swing.JPanel {

    /**
     * Creates new form Option
     */
    
    public static ButtonGroup a = new ButtonGroup();
    
    public Option() {
        
        initComponents();
        radio1.setSelected(true);
        a.add(radio1);
        a.add(radio2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        repassField = new javax.swing.JPasswordField();
        passField = new javax.swing.JPasswordField();
        statLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel2.setText("Re-Tye Password:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 120, 35));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel4.setText("Accout Type:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, 110, 30));

        userField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 150, 35));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel3.setText("Password:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, 35));

        repassField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        add(repassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 150, 35));

        passField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passFieldKeyReleased(evt);
            }
        });
        add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 150, 35));

        statLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        add(statLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 150, 35));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel6.setText("Password Status : ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, 35));

        radio1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        radio1.setSelected(true);
        radio1.setText("Clerk Account");
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });
        add(radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 30));

        radio2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        radio2.setText("Secretery Account");
        add(radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel5.setText("Username:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 80, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void passFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyReleased
 String pass = passField.getText();

        if (pass.length() <= 1) {
            statLbl.setForeground(new Color(204, 0, 0));
            statLbl.setText("Weak Password");
            pwstats="weak";
        }
        if (pass.length() == 5) {
            statLbl.setForeground(new Color(255, 190, 0));
            statLbl.setText("Good Password");
            pwstats="good";
        }
        if (pass.length() >= 9) {
            statLbl.setForeground(new Color(0, 204, 0));
            statLbl.setText("Strong Password");
            pwstats="strong";
        }   // TODO add your handling code here:
    }//GEN-LAST:event_passFieldKeyReleased
    public static String pwstats="";
    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JPasswordField passField;
    public static javax.swing.JRadioButton radio1;
    public static javax.swing.JRadioButton radio2;
    public static javax.swing.JPasswordField repassField;
    public static javax.swing.JLabel statLbl;
    public static javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
