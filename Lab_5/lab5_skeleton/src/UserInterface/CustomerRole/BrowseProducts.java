/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package UserInterface.CustomerRole;

import Business.MasterOrderCatalog;
import Business.Order;
import Business.OrderItem;
import Business.Product;
import Business.Supplier;
import Business.SupplierDirectory;
import UserInterface.CustomerRole.ViewProductDetailJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Rushabh
 */
public class BrowseProducts extends javax.swing.JPanel {

    private JPanel userProcessorContainer;
    private SupplierDirectory supplierDir;
    private  MasterOrderCatalog masterOrderCata;
    private Order order;
    private boolean isCheckedOut = false;
    
    BrowseProducts(JPanel upc, SupplierDirectory sd, MasterOrderCatalog moc) {
        initComponents();
        this.userProcessorContainer = upc;
        this.supplierDir = sd;
        this.masterOrderCata = moc;
        order = new Order();
        popluateSupplierCombo();
        if(!isCheckedOut){
            
        }
        order = new Order();
    }
    
    private void popluateSupplierCombo() {
        suppComboBox1.removeAllItems();;
        for(Supplier s : supplierDir.getSupplierlist()){
            suppComboBox1.addItem(s);
        }
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.setRowCount(0);
        Supplier supplier = (Supplier)suppComboBox1.getSelectedItem();
        for(Product p : supplier.getProductCatalog().getProductcatalog()) {
            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getModelNumber();
            row[2] = p.getPrice();
            row[3] = p.getAvil();
            model.addRow(row);
        }
    }
    
    public void refreashProductTable(String keyword){
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.setRowCount(0); 
        for(Supplier s : supplierDir.getSupplierlist()){
            for(Product p : s.getProductCatalog().getProductcatalog()){
                if(p.getProdName().equalsIgnoreCase(keyword)){
                    Object row[] = new Object[4];
                    row[0] = p;
                    row[1] = p.getModelNumber();
                    row[2] = p.getPrice();
                    row[3] = p.getAvil();
                    model.addRow(row);
                }
            }
        }        
    }
    public void refreashOrderTable(){
        DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
        model.setRowCount(0); 
        for(OrderItem oi : order){       
                Object row[] = new Object[4];
                row[0] = oi;
                row[1] = oi.getSealsPrice();
                row[2] = oi.getQuanity();
                row[3] = oi.getSealsPrice();
                model.addRow(row);
            }
        }        

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        suppComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        viewProdjButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addtoCartButton6 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        btnSearchProduct = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnViewOrderItem = new javax.swing.JButton();
        btnModifyQuantity = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        txtSearchKeyWord = new javax.swing.JTextField();
        txtNewQuantity = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 511));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Product Id", "Price", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 590, 100));

        suppComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppComboBox1ActionPerformed(evt);
            }
        });
        add(suppComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Supplier");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier Product Catalog");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 90, -1));

        viewProdjButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        viewProdjButton2.setText("View Product Detail");
        viewProdjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProdjButton2ActionPerformed(evt);
            }
        });
        add(viewProdjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 160, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Vijaya", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/bestbuy.gif"))); // NOI18N
        jLabel4.setText("Welcome To Please Buy !");
        jLabel4.setIconTextGap(7);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        addtoCartButton6.setText("ADD TO CART");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });
        add(addtoCartButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 40, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });
        add(btnSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jLabel6.setText("Sales Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));
        add(txtSalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 40, -1));

        jLabel7.setText("Item in cart");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 580, 110));

        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
            }
        });
        add(btnViewOrderItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });
        add(btnModifyQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, -1, -1));

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });
        add(btnRemoveOrderItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, -1));

        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));
        add(txtSearchKeyWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 140, 110, -1));
        add(txtNewQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 70, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void suppComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppComboBox1ActionPerformed
        populateTable();
    }//GEN-LAST:event_suppComboBox1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void viewProdjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProdjButton2ActionPerformed
        int row = productTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        Product p = (Product)productTable.getValueAt(row, 0);
        ViewProductDetailJPanel vpdjp = new ViewProductDetailJPanel(userProcessorContainer, p);
        userProcessorContainer.add("ViewProductDetailJPanelCust", vpdjp);
        CardLayout layout = (CardLayout) userProcessorContainer.getLayout();
        layout.next(userProcessorContainer);
        
    }//GEN-LAST:event_viewProdjButton2ActionPerformed

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        int selectedRow = productTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null,"pelase select a row");
            return ;
        }
        Product selectedProduct = (Product) productTable.getValueAt(selectedRow, 0);
        int fetchQty = (Integer) quantitySpinner.getValue();
        if(fetchQty <= 0){
            JOptionPane.showMessageDialog(null,"quantyit cannot less than 0");
            return ;
        }
        try{
            double salesPrice = Double.parseDouble( txtSalesPrice.getText());
            if(salesPrice <= selectedProduct.getPrice()){
                JOptionPane.showMessageDialog(null,"salse price canot be less than acutal price");
                return ;
            }
            if(fetchQty <= selectedProduct.getAvil()){
                boolean alreadyPresent = false;
                for(OrderItem oi : order){
                    if(oi.getProduct() == selectedProduct){
                        selectedProduct.setAvil(selectedProduct.getAvil() - fetchQty);
                        oi.setQuanity(fetchQty +oi.getQuanity());
                        alreadyPresent = true;
                        populateTable();
                        refreashOrderTable();
                        break;
                    }
                }
                if(!alreadyPresent){
                    selectedProduct.setAvil(selectedProduct.getAvil() - fetchQty);
                    order.addOrderItem(selectedProduct, fetchQty, salesPrice);
                    populateTable();
                    refreashOrderTable();
                }
            }else{
                JOptionPane.showMessageDialog(null,"Quantity > availibility","Warning", JOptionPane.WARNING_MESSAGE);
                return ;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Sales price");
            return ;
        }
        
    }//GEN-LAST:event_addtoCartButton6ActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        if(order.size() > 0){
            masterOrderCata.addOrder(order);
            JOptionPane.showMessageDialog(null,"order placed");
            order = new Order();
            refreashOrderTable();
            populateTable();
            isCheckedOut = true;
        }
        else{
            JOptionPane.showMessageDialog(null,"there is no order added");
            return ;
        }
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        int selectedRow = orderTable.getSelectedRow();
        if(selectedRow < 0){
            return;
        }
        
        OrderItem oi = (OrderItem) orderTable.getValueAt(selectedRow, 0);
        int currentAvail = oi.getProduct().getAvil();
        int oldQty = oi.getQuanity();
        try{
            int newQty = Integer.parseInt(txtNewQuantity.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"quantity number");
            return ;
        }
        int newQty = Integer.parseInt(txtNewQuantity.getText());
        if(newQty > (currentAvail + oldQty)){
            JOptionPane.showMessageDialog(null,"quantity is more than avalibility");
            return ;
        }else{
            if(newQty <= 0){
                JOptionPane.showMessageDialog(null,"quantity should be greate than 0");
            return ;
            }
            oi.setQuanity(newQty);
            oi.getProduct().setAvil(currentAvail + (oldQty - newQty));
            populateTable();
            refreashOrderTable();
        }
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        String prodName = txtSearchKeyWord.getText();
        refreashProductTable(prodName);
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        int row = orderTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        OrderItem oi = (OrderItem)orderTable.getValueAt(row, 0);
        int oldAvail = oi.getProduct().getAvil();
        int oldQty = oi.getQuanity();
        int newQty = oldAvail + oldQty;
        oi.getProduct().setAvil(newQty);
        order.removeOrderItem(oi);
        JOptionPane.showMessageDialog(null, "order item removed");
        refreashOrderTable();
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed
        int row = orderTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        OrderItem oi = (OrderItem)orderTable.getValueAt(row, 0);
        ViewOrderItemDetailJPanel vpdjp = new ViewOrderItemDetailJPanel(userProcessorContainer, oi);
        userProcessorContainer.add("ViewOrderItemDetailJPanelCust", vpdjp);
        CardLayout layout = (CardLayout) userProcessorContainer.getLayout();
        layout.next(userProcessorContainer);
    }//GEN-LAST:event_btnViewOrderItemActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JComboBox suppComboBox1;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtSearchKeyWord;
    private javax.swing.JButton viewProdjButton2;
    // End of variables declaration//GEN-END:variables

}
