

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.RestaurantAdminRole.ManageMenu.CreateMenuItemJPanel;
import userinterface.RestaurantAdminRole.ManageMenu.ViewRestaurantMenuJPanel;
import userinterface.RestaurantAdminRole.ManageOrders.ViewRestaurantOrderJPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel container;
    private EcoSystem system;
    private UserAccount account;
    private Restaurant restaurant;
    
    /** Creates new form AdminWorkAreaJPanel
     * @param userProcessContainer
     * @param sys
     * @param ua 
     */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem sys, UserAccount ua) {
        initComponents();
        this.container = userProcessContainer;
        this.system = sys;
        this.account = ua;
        this.restaurant = (Restaurant)system
                    .getRestaurantDirectory()
                    .stream()
                    .filter(r -> r.getAdmins().contains(ua))
                    .toArray()[0];
        labelRestaurantName.setText(restaurant.getRestaruantName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMngMenu = new javax.swing.JButton();
        btnMngOrders = new javax.swing.JButton();
        labelRestaurantName = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();

        btnMngMenu.setText("Manage menu");
        btnMngMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngMenuActionPerformed(evt);
            }
        });

        btnMngOrders.setText("Manage Orders");
        btnMngOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngOrdersActionPerformed(evt);
            }
        });

        labelRestaurantName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelRestaurantName.setText("<Restaurant name>");

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseLabel1.setText("Manage Restaurant");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMngOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMngMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRestaurantName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnMngOrders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMngMenu)
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMngMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngMenuActionPerformed
        JPanel viewPanel = new ViewRestaurantMenuJPanel(container, system, restaurant);
        container.add("ViewMenuItemArea", viewPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnMngMenuActionPerformed

    private void btnMngOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngOrdersActionPerformed
        JPanel viewPanel = new ViewRestaurantOrderJPanel(container, system, restaurant);
        container.add("ViewMenuItemArea", viewPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnMngOrdersActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMngMenu;
    private javax.swing.JButton btnMngOrders;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel labelRestaurantName;
    // End of variables declaration//GEN-END:variables
    
}
