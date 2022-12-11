package ui.RestaurantManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.Booking;
import Business.Model.Customer;
import Business.Model.CustomerDirectory;
import Business.Model.DeliverymanOrg;
import Business.Model.Organization;
import Business.Model.Restaurant;
import Business.Model.SystemAdmin;
import Model.services.BusinessEventService;
import Model.services.RestaurantService;
import Model.services.Service;

public class viewTaskPanelRestaurant extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Restaurant restaurant;

    public viewTaskPanelRestaurant(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Restaurant restaurant) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.restaurant = restaurant;
        populateComboBox();
        populateTable();
       
        btnAccept.setOpaque(true);
        
        btnDenyOrder.setOpaque(true);
        
        btnBack.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantOrderDetails = new javax.swing.JTable();
        cmbOrgDelivery = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnDenyOrder = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        tblRestaurantOrderDetails.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblRestaurantOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "ORDER DETAIL", "ADDRESS", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurantOrderDetails);

        add(jScrollPane1);
        jScrollPane1.setBounds(200, 190, 828, 168);

        cmbOrgDelivery.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(cmbOrgDelivery);
        cmbOrgDelivery.setBounds(480, 480, 261, 27);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("SELECT A ORGANIZATION FOR DELIVERYMAN");
        add(jLabel1);
        jLabel1.setBounds(420, 420, 420, 24);

        btnAccept.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnAccept.setText("ACCEPT ORDER");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept);
        btnAccept.setBounds(430, 600, 184, 42);

        btnDenyOrder.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnDenyOrder.setText("DENY ORDER");
        btnDenyOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyOrderActionPerformed(evt);
            }
        });
        add(btnDenyOrder);
        btnDenyOrder.setBounds(650, 600, 176, 42);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(22, 22, 90, 33);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("VIEW ORDER DETAILS FOR RESTAURANT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(420, 30, 511, 32);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1250, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        int selectRowIndex = tblRestaurantOrderDetails.getSelectedRow();
        if (selectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblRestaurantOrderDetails.getModel();
        Booking booking = (Booking) model.getValueAt(selectRowIndex, 0);

        RestaurantService resService = null;
        for (Service service : booking.getServices()) {
            if (restaurant.getName().equals(service.getEnterprise().getName())) {
                resService = (RestaurantService) service;
                break;
            }
        }

        if (resService == null) {
            throw new RuntimeException("Restaurant service not found, something went wrong.");
        }

        if (!resService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        DeliverymanOrg delivery = (DeliverymanOrg) cmbOrgDelivery.getSelectedItem();
        if (delivery == null) {
            JOptionPane.showMessageDialog(this, "Please select delivery organization to be assinged.");
            return;
        }

        resService.addOrganization(delivery);
        resService.setStatus(Service.Status.CONFIRMED);

        JOptionPane.showMessageDialog(this, String.format("Booking %s is assigned to delivery ord '%s'",
                booking.getId(), delivery));

        populateTable();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnDenyOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyOrderActionPerformed
        int selectRowIndex = tblRestaurantOrderDetails.getSelectedRow();
        if (selectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to deny request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblRestaurantOrderDetails.getModel();
        Booking booking = (Booking) model.getValueAt(selectRowIndex, 0);

        RestaurantService resService = null;
        for (Service service : booking.getServices()) {
            if (service instanceof RestaurantService) {
                resService = (RestaurantService) service;
                break;
            }
        }

        if (resService == null) {
            throw new RuntimeException("Restaurant service not found, something went wrong.");
        }
        if (!resService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        resService.setStatus(Service.Status.REJECTED);
        JOptionPane.showMessageDialog(this, String.format("Booking '%s' is denied.", booking.getId()));
        populateTable();
    }//GEN-LAST:event_btnDenyOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDenyOrder;
    private javax.swing.JComboBox<DeliverymanOrg> cmbOrgDelivery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurantOrderDetails;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblRestaurantOrderDetails.getModel();
        model.setRowCount(0);

        Object row[] = new Object[10];
        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec(); //get all customers
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking
                    if (service.getEnterprise().getName().equals(restaurant.getName())) {
                        RestaurantService restaurantService = (RestaurantService) service;
                        row[0] = booking;
                        row[1] = customer;
                        row[2] = booking.getStatus();
                        row[3] = customer.getAddress();
                        row[4] = restaurantService.getStatus();
                        model.addRow(row);
                    }
                }
            }
        }

    }

    private void populateComboBox() {
        cmbOrgDelivery.addItem(null);
        for (DeliverymanOrg delivery : restaurant.getListOfDeliveryManOrg()) {
            if (delivery != null) {
                cmbOrgDelivery.addItem(delivery);
            }
        }
    }
}
