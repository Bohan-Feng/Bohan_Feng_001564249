/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.MenuItem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bohan Feng
 */
public class CreateOrderJPanel extends javax.swing.JPanel {

    private JPanel container;
    private EcoSystem system;
    private Customer customer;
    private Map<MenuItem, Integer> cart;
    /**
     * Creates new form CreateOrderJPanel
     */
    public CreateOrderJPanel(JPanel userProcessContainer, EcoSystem sys, Customer c) {
        initComponents();
        
        this.container = userProcessContainer;
        this.system = sys;
        this.customer = c;
        cart = new HashMap<>();
        populateCombo();
    }
    
    void populateCombo(){
        ComboRestaurant.removeAllItems();
        for(Restaurant r : system.getRestaurantDirectory()){
            ComboRestaurant.addItem(r + "");
        }
    }
    
    void populateMenu(){
        if(ComboRestaurant.getSelectedIndex() < 0){
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tabelMenu.getModel();
        model.setRowCount(0);
        for(MenuItem mi : system.getRestaurantDirectory().get(ComboRestaurant.getSelectedIndex()).getMenu()){
            Object row[] = new Object[2];
            row[0] = mi;
            row[1] = mi.getDescription();
            model.addRow(row);
        }
    }
    
    void populateCart(){
        DefaultTableModel modelOrder = (DefaultTableModel)tabelOrderItem.getModel();
        modelOrder.setRowCount(0);
        for(MenuItem k : cart.keySet()){
            Object row[] = new Object[2];
            row[0] = k;
            row[1] = cart.get(k);
            modelOrder.addRow(row);
        }
    }
    
    void addtoCart(MenuItem toAdd){
        if(cart.keySet().contains(toAdd)){
            cart.put(toAdd, cart.get(toAdd) + 1);
        }else{
            cart.put(toAdd, 1);
        }
        populateCart();
    }
    
    void deletefromCart(MenuItem toDelete){
        cart.put(toDelete, cart.get(toDelete) - 1);
        if(cart.get(toDelete) == 0){
            cart.remove(toDelete);
        }
        populateCart();
    }
    
    void cleanCart(){
        DefaultTableModel modelOrder = (DefaultTableModel)tabelOrderItem.getModel();
        modelOrder.setRowCount(0);
        cart = new HashMap<>();
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
        ComboRestaurant = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMenu = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelOrderItem = new javax.swing.JTable();
        btnAddItem = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnDeleteItem = new javax.swing.JButton();

        jLabel1.setText("Restaurant");

        ComboRestaurant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboRestaurantActionPerformed(evt);
            }
        });

        tabelMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description"
            }
        ));
        jScrollPane1.setViewportView(tabelMenu);

        tabelOrderItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quanty"
            }
        ));
        jScrollPane2.setViewportView(tabelOrderItem);

        btnAddItem.setText(">");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel2.setText("Order Items");

        jLabel3.setText("Address");

        btnDeleteItem.setText("<");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConfirm))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(312, 312, 312)
                                .addComponent(jLabel2)
                                .addGap(0, 263, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(ComboRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddItem)
                                .addGap(89, 89, 89)
                                .addComponent(btnDeleteItem)
                                .addGap(145, 145, 145)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirm)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        int row = tabelMenu.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        addtoCart((MenuItem)(tabelMenu.getValueAt(row, 0)));
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void ComboRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboRestaurantActionPerformed
        populateMenu();
        cleanCart();
    }//GEN-LAST:event_ComboRestaurantActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        int row = tabelOrderItem.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        deletefromCart((MenuItem)(tabelOrderItem.getValueAt(row, 0)));
        tabelOrderItem.setRowSelectionInterval(row, row);
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        goBack();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if(!inputValidate())
            return;
        Order o = new Order();
        Restaurant maker = system.getRestaurantDirectory().get(ComboRestaurant.getSelectedIndex());
        o.setRestaurnatID(maker.getID());
        o.setReceiverID(customer.getID());
        o.setAddress(txtAddress.getText());
        String orderInfo = "";
        for(MenuItem mi : cart.keySet()){
            orderInfo += mi + " * " + cart.get(mi) + "\n";
        }
        o.setOrderInfo(orderInfo);
        system.getOrderDirectory().add(o);
        JOptionPane.showMessageDialog(null, "Order " + o + "added for Customer " + customer);
        goBack();
    }//GEN-LAST:event_btnConfirmActionPerformed

    boolean inputValidate(){
        if("".equals(txtAddress.getText())){
            JOptionPane.showMessageDialog(null, "Text field cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }else if(tabelOrderItem.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "you must order something", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    void goBack(){
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboRestaurant;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelMenu;
    private javax.swing.JTable tabelOrderItem;
    private javax.swing.JTextField txtAddress;
    // End of variables declaration//GEN-END:variables
}
