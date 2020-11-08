/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea.ManageRestaurant;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Bohan Feng
 */
public class CreateAdminForRestaurant extends javax.swing.JPanel {
    
    
    private JPanel container;
    private EcoSystem system;
    private Restaurant restaurant;
    /**
     * Creates new form CreateAdminForRestaurant
     */
    public CreateAdminForRestaurant(JPanel upc, EcoSystem sys, Restaurant rest) {
        initComponents();
        this.container = upc;
        this.system = sys;
        this.restaurant = rest;
        populateData();
    }
    
    void populateData(){
        jLabel1.setText("Create an Admin for " + restaurant);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JTextField();
        brnSave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Create an Admin for <Restaurnat name>");

        jLabel2.setText("User Name");

        fieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUserNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Password");

        fieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPasswordActionPerformed(evt);
            }
        });

        brnSave.setText("Save");
        brnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnSaveActionPerformed(evt);
            }
        });

        jButton2.setText("<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(250, 250, 250)
                        .addComponent(brnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(fieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(brnSave))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUserNameActionPerformed

    private void fieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPasswordActionPerformed

    private void brnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnSaveActionPerformed
        if(validateInput()){
            Employee employee = system.getEmployeeDirectory().createEmployee(restaurant + " Admin " + restaurant.getAdmins().size());        
            UserAccount ua = system.getUserAccountDirectory().createUserAccount(fieldUserName.getText(), fieldPassword.getText(), employee, new AdminRole());
            restaurant.getAdmins().add(ua);
            JOptionPane.showMessageDialog(null, "Admin " + ua.getUsername() + "added to " + restaurant);
            goBack();
        }
    }//GEN-LAST:event_brnSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        goBack();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void goBack(){
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }
    
    boolean validateInput(){
       if(fieldUserName.getText().equals("")
            ||fieldPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "text field cannot be empty");
            return false;
        }else if(!system.getUserAccountDirectory().checkIfUsernameIsUnique(this.fieldUserName.getText())){
            JOptionPane.showMessageDialog(null, "user name " + this.fieldUserName.getText() + " already exist, please change to another one");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnSave;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldUserName;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
