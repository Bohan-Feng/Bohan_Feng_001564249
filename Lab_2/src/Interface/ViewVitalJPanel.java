/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.*;
/**
 *
 * @author Bohan Feng
 */
public class ViewVitalJPanel extends javax.swing.JPanel {

    
    private VitalSignHistory vsh;
    /**
     * Creates new form ViewVitalJPanel
     */
    public ViewVitalJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
        populateTable();
    }
    
    private void populateTable(){
        // table model
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tblVitalSigns.getModel();
        dtm.setRowCount(0);
        
        for(VitalSign vs : this.vsh.getVitalSignHistory()){
            Object row[] = new Object[2];
            row[0] = vs;
            row[1] = vs.getBloodPressure();
            dtm.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        btnViewDetail = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        bloodPressureLabel = new javax.swing.JLabel();
        pluseLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        temperatureText = new javax.swing.JTextField();
        bloodPressureText = new javax.swing.JTextField();
        pluseText = new javax.swing.JTextField();
        dateText = new javax.swing.JTextField();
        temperatureLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("View Vital Signs");

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood"
            }
        ));
        jScrollPane1.setViewportView(tblVitalSigns);

        btnViewDetail.setText("View Details");
        btnViewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        bloodPressureLabel.setText("blood pressure");

        pluseLabel.setText("pluse");

        dateLabel.setText("date");

        temperatureText.setEnabled(false);
        temperatureText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatureTextActionPerformed(evt);
            }
        });

        bloodPressureText.setEnabled(false);

        pluseText.setEnabled(false);

        dateText.setEnabled(false);

        temperatureLabel.setText("temperature");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bloodPressureLabel)
                                    .addComponent(temperatureLabel)
                                    .addComponent(pluseLabel)
                                    .addComponent(dateLabel))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bloodPressureText)
                                    .addComponent(pluseText)
                                    .addComponent(dateText)
                                    .addComponent(temperatureText))))))
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnViewDetail)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetail)
                    .addComponent(btnDelete))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureLabel)
                    .addComponent(temperatureText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodPressureLabel)
                    .addComponent(bloodPressureText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pluseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pluseLabel))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel))
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailActionPerformed
        int selectedRow = tblVitalSigns.getSelectedRow();
        if(selectedRow >= 0)
        {
            VitalSign selectedVS = (VitalSign)tblVitalSigns.getValueAt(selectedRow, 0);
            bloodPressureText.setText(""+selectedVS.getBloodPressure());
            dateText.setText(""+selectedVS.getDate());
            pluseText.setText(""+selectedVS.getPluse());
            temperatureText.setText(""+selectedVS.getTemperature());
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Item not selected");
        }
    }//GEN-LAST:event_btnViewDetailActionPerformed

    private void temperatureTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperatureTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temperatureTextActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblVitalSigns.getSelectedRow();
        if(selectedRow >= 0)
        {
            VitalSign selectedVS = (VitalSign)tblVitalSigns.getValueAt(selectedRow, 0);
            vsh.deleteVital(selectedVS);
            populateTable();
            javax.swing.JOptionPane.showMessageDialog(null, "Item Deleted");
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Item not selected");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bloodPressureLabel;
    private javax.swing.JTextField bloodPressureText;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnViewDetail;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pluseLabel;
    private javax.swing.JTextField pluseText;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JTextField temperatureText;
    // End of variables declaration//GEN-END:variables
}
