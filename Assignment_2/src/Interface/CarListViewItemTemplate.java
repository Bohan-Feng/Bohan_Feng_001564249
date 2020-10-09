package Interface;

import Business.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Bohan Feng
 */
public class CarListViewItemTemplate extends javax.swing.JPanel {

    private Car car;
    
    public static SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
    
    private static CarList carlist;
    
    private boolean canEdit;
    /**
     * Creates new form CarListItemTemplate
     */
    public CarListViewItemTemplate(Car c, CarList theTable) {
        initComponents();
        this.carlist = theTable;
        this.car = c;
        setContent();
        disAndEnableTxt();
        canEdit = false;
    }
    
    private void setContent(){
        txtSerial.setText(car.getSeriesNum());
        txtSerial.enable(false);
        txtMaker.setText(car.getMaker());
        txtLocation.setText(car.getCity());
        txtModel.setText(car.getModel());
        txtSeats.setText(car.getSeatNum() + "");
        txtYear.setText(car.getManufactureYear() + "");
        labelUpdate.setText(dateFormater.format(car.getUpdateTime()));
        labelExpired.setText(dateFormater.format(car.getMaintanceExpiredDate()));
        boxAvaliable.setSelected(car.isIsAvaliable());
    }
    
    private void disAndEnableTxt(){
        txtMaker.enable(!txtMaker.isEnabled());
        txtLocation.enable(!txtLocation.isEnabled());
        txtModel.enable(!txtModel.isEnabled());
        txtSeats.enable(!txtSeats.isEnabled());
        txtYear.enable(!txtYear.isEnabled());
        boxAvaliable.enable(!boxAvaliable.isEnabled());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEdit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaker = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSeats = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelUpdate = new javax.swing.JLabel();
        labelExpired = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        boxAvaliable = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(34, 34, 51));

        btnEdit.setBackground(new java.awt.Color(31, 186, 214));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/image/edit0.png"))); // NOI18N
        jLabel1.setText("Edit");

        javax.swing.GroupLayout btnEditLayout = new javax.swing.GroupLayout(btnEdit);
        btnEdit.setLayout(btnEditLayout);
        btnEditLayout.setHorizontalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        btnEditLayout.setVerticalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnDelete.setBackground(new java.awt.Color(31, 186, 214));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDeleteMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/image/trash6.png"))); // NOI18N
        jLabel2.setText("Delete");

        javax.swing.GroupLayout btnDeleteLayout = new javax.swing.GroupLayout(btnDelete);
        btnDelete.setLayout(btnDeleteLayout);
        btnDeleteLayout.setHorizontalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDeleteLayout.setVerticalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Serial Num");

        txtSerial.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        txtSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Maker");

        txtMaker.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        txtMaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMakerActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Model");

        txtModel.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Locatioin");

        txtLocation.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Seats");

        txtSeats.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        txtSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last Upadte");

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Maintance Expired Date");

        labelUpdate.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        labelUpdate.setForeground(new java.awt.Color(255, 255, 255));
        labelUpdate.setText("update text");

        labelExpired.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        labelExpired.setForeground(new java.awt.Color(255, 255, 255));
        labelExpired.setText("expired text");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Year");

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Avaliable");

        boxAvaliable.setBackground(new java.awt.Color(34, 34, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaker, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtModel, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(boxAvaliable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(43, 43, 43))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(58, 58, 58)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtYear)
                            .addComponent(txtLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtSeats)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(labelExpired)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(labelUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMaker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtYear)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(boxAvaliable, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(labelExpired)
                            .addComponent(jLabel9)
                            .addComponent(labelUpdate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialActionPerformed

    private void txtMakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMakerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMakerActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsActionPerformed

    private void btnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMousePressed
        btnEdit.setBackground(MainFrame.darkColor);
    }//GEN-LAST:event_btnEditMousePressed

    private void btnEditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseReleased
        btnEdit.setBackground(MainFrame.lightColor);
    }//GEN-LAST:event_btnEditMouseReleased

    private void btnDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMousePressed
        btnDelete.setBackground(MainFrame.darkColor);
    }//GEN-LAST:event_btnDeleteMousePressed

    private void btnDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseReleased
        btnDelete.setBackground(MainFrame.lightColor);
    }//GEN-LAST:event_btnDeleteMouseReleased

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        if(canEdit){
            SaveChanges();
        }else{
            SwitchToEditMode();
        }
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        deleteCar();
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void deleteCar() {
        carlist.deleteCar(car);
        javax.swing.JOptionPane.showMessageDialog(null, 
                        "Car Deleted");
        this.removeAll();
        this.revalidate();
        this.repaint();
        setContent();
        disAndEnableTxt();
    }
    private void SaveChanges() {
        car.setCity(txtLocation.getText());
        car.setMaker(txtMaker.getText());
        car.setIsAvaliable(boxAvaliable.isSelected());
        car.setModel(txtModel.getText());
        car.setSeatNum(Integer.parseInt(txtSeats.getText()));
        car.setManufactureYear(Integer.parseInt(txtYear.getText()));
        car.setUpdateTime(new Date());
        carlist.updateCar(car);
        javax.swing.JOptionPane.showMessageDialog(null, 
                        "Car infomation Updated");
        this.removeAll();
        this.revalidate();
        this.repaint();
        setContent();
        disAndEnableTxt();
        canEdit = false;
    }

    private void SwitchToEditMode() {
        jLabel1.setIcon(null);
        jLabel1.setText("Save");
        canEdit = true;
        disAndEnableTxt();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxAvaliable;
    private javax.swing.JPanel btnDelete;
    private javax.swing.JPanel btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelExpired;
    private javax.swing.JLabel labelUpdate;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMaker;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSerial;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

}