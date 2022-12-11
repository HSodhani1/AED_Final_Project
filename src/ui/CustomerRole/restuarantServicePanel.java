package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import Business.Model.Booking;
import Business.Model.MenuItem;
import Business.Model.Restaurant;
import Business.Model.SystemAdmin;
import Model.services.RestaurantService;
import ui.main.DateUtils;

/**
 *
 * @author Hardik
 */

public class restuarantServicePanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnCreateMethod1;
    private String username;
    private Booking booking;

    public restuarantServicePanel(SystemAdmin systems, Consumer<Booking> callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        for (Restaurant res : booking.getNetwork().getEnterpriseDirectory().getListOfRestaurants()) {
            cmbRestaurant.addItem(res);
        }
     
        btnBack.setOpaque(true);
       
        btnPlaceOrder.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbMenu = new javax.swing.JComboBox<>();
        btnPlaceOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbRestaurant = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        cmbMenu.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMenuActionPerformed(evt);
            }
        });
        add(cmbMenu);
        cmbMenu.setBounds(980, 420, 210, 27);

        btnPlaceOrder.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnPlaceOrder.setText("PLACE ORDER");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        add(btnPlaceOrder);
        btnPlaceOrder.setBounds(840, 500, 180, 43);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("SELECT ITEM FROM LIST ");
        add(jLabel2);
        jLabel2.setBounds(640, 420, 250, 24);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("SELECT A RESTAURANT NAME ");
        add(jLabel4);
        jLabel4.setBounds(640, 330, 300, 24);

        cmbRestaurant.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRestaurantActionPerformed(evt);
            }
        });
        add(cmbRestaurant);
        cmbRestaurant.setBounds(980, 330, 210, 27);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3727022.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(20, 180, 600, 510);

        jPanel1.setBackground(new java.awt.Color(235, 234, 234));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText(" MENU ITEMS FOR RESTAURANT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(380, 30, 603, 47);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(50, 40, 100, 33);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1360, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRestaurantActionPerformed
        cmbMenu.removeAllItems();
        Restaurant restaurant = (Restaurant) cmbRestaurant.getSelectedItem();
        if (restaurant != null) {
            for (MenuItem item : restaurant.getListOfItem()) {
                cmbMenu.addItem(item);
            }
        }
    }//GEN-LAST:event_cmbRestaurantActionPerformed

    private void cmbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMenuActionPerformed

    }//GEN-LAST:event_cmbMenuActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        Date date = DateUtils.formatDate(new Date());
        MenuItem item = (MenuItem) cmbMenu.getSelectedItem();
        Restaurant restaurant = (Restaurant) cmbRestaurant.getSelectedItem();

        RestaurantService service = new RestaurantService(restaurant, date, item.getDetails(), item.getPrice());
        booking.addService(service);
        JOptionPane.showMessageDialog(this, "Order placed successfully");

        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox<MenuItem> cmbMenu;
    private javax.swing.JComboBox<Restaurant> cmbRestaurant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
