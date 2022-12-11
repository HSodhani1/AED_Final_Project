package ui.HotelManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.Booking;
import Business.Model.Customer;
import Business.Model.CustomerDirectory;
import Business.Model.Hotel;
import Business.Model.LaundaryOrg;
import Business.Model.Organization;
import Business.Model.SystemAdmin;
import Business.Model.TransportationOrg;
import Model.services.HotelService;
import Model.services.Service;

/**
 *
 * @author Aparna
 */

public class viewTaskForHotel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Hotel hotel;

    public viewTaskForHotel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Hotel hotel) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.hotel = hotel;
        populateComboBox();
        populateTable();
        
        btnAssignAndConfirmTask.setOpaque(true);
       
        btnBack.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHotelOrderDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbLaundryOrg = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbTransportationOrg = new javax.swing.JComboBox<>();
        btnAssignAndConfirmTask = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        tblHotelOrderDetails.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblHotelOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "STATUS", "LAUNDARY", "TRANSPORTATION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHotelOrderDetails);

        add(jScrollPane1);
        jScrollPane1.setBounds(230, 300, 835, 260);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("SELECT A LAUNDARY ORG");
        add(jLabel1);
        jLabel1.setBounds(260, 160, 242, 22);

        cmbLaundryOrg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbLaundryOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLaundryOrgActionPerformed(evt);
            }
        });
        add(cmbLaundryOrg);
        cmbLaundryOrg.setBounds(280, 210, 202, 27);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("SELECT A TRANSPORTATION ORG");
        add(jLabel2);
        jLabel2.setBounds(660, 160, 320, 22);

        add(cmbTransportationOrg);
        cmbTransportationOrg.setBounds(720, 210, 216, 27);

        btnAssignAndConfirmTask.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAssignAndConfirmTask.setText("ASSIGN AND CONFIRM TASK");
        btnAssignAndConfirmTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignAndConfirmTaskActionPerformed(evt);
            }
        });
        add(btnAssignAndConfirmTask);
        btnAssignAndConfirmTask.setBounds(450, 620, 340, 46);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setText("VIEW ORDER DETAILS FOR HOTEL");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 30, 479, 30);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(50, 30, 102, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignAndConfirmTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignAndConfirmTaskActionPerformed
        int selectedRowIndex = tblHotelOrderDetails.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblHotelOrderDetails.getModel();
        Booking booking = (Booking) model.getValueAt(selectedRowIndex, 0);

        HotelService hotelService = null;
        for (Service service : booking.getServices()) {
            if (hotel.getName().equals(service.getEnterprise().getName())) {
                hotelService = (HotelService) service;
                break;
            }
        }

        if (hotelService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find hotel");
            return;
        }

        if (!hotelService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        LaundaryOrg laundary = (LaundaryOrg) cmbLaundryOrg.getSelectedItem();
        TransportationOrg transportation = (TransportationOrg) cmbTransportationOrg.getSelectedItem();

        List<Organization> organizations = new ArrayList<>();
        for (HotelService.HotelServiceType type : hotelService.getHotelServices()) {
            switch (type) {
                case LAUNDARY:
                    if (laundary == null) {
                        JOptionPane.showMessageDialog(this, "Please select laundary organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(laundary);
                    }
                    break;
                case TRANSPORTATION:
                    if (transportation == null) {
                        JOptionPane.showMessageDialog(this, "Please select transportation organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(transportation);
                    }
                    break;
            }
        }

        for (Organization organization : organizations) {
            hotelService.addOrganization(organization);
        }
        hotelService.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all hotel services to the booking: " + booking.getId());
        populateTable();
    }//GEN-LAST:event_btnAssignAndConfirmTaskActionPerformed

    private void cmbLaundryOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLaundryOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLaundryOrgActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblHotelOrderDetails.getModel();
        model.setRowCount(0);

        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec(); //get all customers
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking
                    System.out.println("Enterprise : " + service.getEnterprise());
                    if (hotel.getName().equals(service.getEnterprise().getName())) {
                        HotelService hotelService = (HotelService) service;

                        Object row[] = new Object[10];
                        row[0] = booking;
                        row[1] = customer;
                        row[2] = hotelService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";

                        for (HotelService.HotelServiceType type : hotelService.getHotelServices()) {
                            switch (type) {
                                case LAUNDARY:
                                    row[3] = "YES";
                                    break;
                                case TRANSPORTATION:
                                    row[4] = "YES";
                                    break;
                            }
                        }
                        model.addRow(row);
                    }
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignAndConfirmTask;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<LaundaryOrg> cmbLaundryOrg;
    private javax.swing.JComboBox<TransportationOrg> cmbTransportationOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHotelOrderDetails;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        cmbLaundryOrg.addItem(null);
        cmbTransportationOrg.addItem(null);

        for (LaundaryOrg laundary : hotel.getLaundaryOrg()) {
            if (laundary != null) {
                cmbLaundryOrg.addItem(laundary);
            }
        }
        for (TransportationOrg transportation : hotel.getTransportationOrgList()) {
            if (transportation != null) {
                cmbTransportationOrg.addItem(transportation);
            }
        }
    }
}
