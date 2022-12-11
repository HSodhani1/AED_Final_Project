package ui.EventManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.Booking;
import Business.Model.BusinessEvent;
import Business.Model.CateringService;
import Business.Model.Customer;
import Business.Model.CustomerDirectory;
import Business.Model.DecorServices;
import Business.Model.Organization;
import Business.Model.PhotographyService;
import Business.Model.SystemAdmin;
import Model.services.BusinessEventService;
import Model.services.Service;

/**
 *
 * @author Hardik
 */

public class viewEventTaskPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private BusinessEvent businessEvent;

    public viewEventTaskPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, BusinessEvent businessEvent) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.businessEvent = businessEvent;
        populateComboBox();
        populateTable();
        
        
        btnBack.setOpaque(true);
       
       btnConfirmRequest.setOpaque(true);
      
       btnConfirmRequest.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewOrderDetails = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCatering = new javax.swing.JComboBox<>();
        cmbDecor = new javax.swing.JComboBox<>();
        cmbPhotography = new javax.swing.JComboBox<>();
        btnConfirmRequest = new javax.swing.JButton();
        btnDenyRequest = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        tblViewOrderDetails.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblViewOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING ID", "NAME", "STATUS", "CATERING", "DECOR", "PHOTOGRAPHY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewOrderDetails);

        add(jScrollPane1);
        jScrollPane1.setBounds(90, 260, 1090, 360);

        jLabel2.setText("SELECT A CATERING ORG");
        add(jLabel2);
        jLabel2.setBounds(330, 150, 130, 10);

        jLabel3.setText("SELECT A DECOR ORG");
        add(jLabel3);
        jLabel3.setBounds(620, 150, 120, 20);

        jLabel4.setText("SELECT A PHOTOGRAPHY ORG");
        add(jLabel4);
        jLabel4.setBounds(890, 150, 150, 20);

        add(cmbCatering);
        cmbCatering.setBounds(300, 180, 202, 30);

        add(cmbDecor);
        cmbDecor.setBounds(580, 180, 196, 30);

        add(cmbPhotography);
        cmbPhotography.setBounds(870, 180, 193, 30);

        btnConfirmRequest.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnConfirmRequest.setText("CONFIRM REQUEST");
        btnConfirmRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmRequestActionPerformed(evt);
            }
        });
        add(btnConfirmRequest);
        btnConfirmRequest.setBounds(370, 660, 230, 41);

        btnDenyRequest.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnDenyRequest.setText("DENY REQUEST");
        btnDenyRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyRequestActionPerformed(evt);
            }
        });
        add(btnDenyRequest);
        btnDenyRequest.setBounds(790, 660, 220, 41);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("VIEW ORDER DETAILS FOR EVENTS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 40, 457, 32);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(60, 30, 89, 33);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1360, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmRequestActionPerformed
        int selectedRowIndex = tblViewOrderDetails.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblViewOrderDetails.getModel();
        Booking booking = (Booking) model.getValueAt(selectedRowIndex, 0);

        BusinessEventService eventService = null;
        for (Service service : booking.getServices()) {
            if (businessEvent.getName().equals(service.getEnterprise().getName())) {
                eventService = (BusinessEventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        if (!eventService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        CateringService cateringService = (CateringService) cmbCatering.getSelectedItem();
        PhotographyService photographyService = (PhotographyService) cmbPhotography.getSelectedItem();
        DecorServices decorService = (DecorServices) cmbDecor.getSelectedItem();

        List<Organization> organizations = new ArrayList<>();
        for (BusinessEventService.BusinessEventServiceType type : eventService.getBusinessEventServiceTypes().keySet()) {
            switch (type) {
                case CATERING:
                    if (cateringService == null) {
                        JOptionPane.showMessageDialog(this, "Please select catering organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(cateringService);
                    }
                    break;
                case DECOR:
                    if (decorService == null) {
                        JOptionPane.showMessageDialog(this, "Please decor catering organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(decorService);
                    }
                    break;
                case PHOTOGRAPHY:
                    if (photographyService == null) {
                        JOptionPane.showMessageDialog(this, "Please select photography organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(photographyService);
                    }
                    break;
            }
        }

        for (Organization organization : organizations) {
            eventService.addOrganization(organization);
        }
        eventService.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all event services to the booking: " + booking.getId());
        populateTable();
    }//GEN-LAST:event_btnConfirmRequestActionPerformed

    private void btnDenyRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyRequestActionPerformed
        int selectedRowIndex = tblViewOrderDetails.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to deny request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblViewOrderDetails.getModel();
        Booking booking = (Booking) model.getValueAt(selectedRowIndex, 0);

        BusinessEventService eventService = null;
        for (Service service : booking.getServices()) {
            if (businessEvent.getName().equals(service.getEnterprise().getName())) {
                eventService = (BusinessEventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        if (!eventService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be denied.",
                    booking.getId()));
            return;
        }

        eventService.setStatus(Service.Status.REJECTED);
        JOptionPane.showMessageDialog(this, "Denied booking request with id: " + booking.getId());
        populateTable();
    }//GEN-LAST:event_btnDenyRequestActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblViewOrderDetails.getModel();
        model.setRowCount(0);

        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec(); //get all customers
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking

                    if (service.getEnterprise().getName().equals(businessEvent.getName())) {

                        BusinessEventService businessEventService = (BusinessEventService) service;
                        Object row[] = new Object[10];
                        row[0] = booking;
                        row[1] = customer;
                        row[2] = businessEventService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";
                        row[5] = "NO";

                        for (BusinessEventService.BusinessEventServiceType type : businessEventService.getBusinessEventServiceTypes().keySet()) {
                            switch (type) {
                                case CATERING:
                                    row[3] = "YES";
                                    break;
                                case DECOR:
                                    row[4] = "YES";
                                    break;
                                case PHOTOGRAPHY:
                                    row[5] = "YES";
                                    break;
                            }
                        }
                        model.addRow(row);
                    }
                }
            }
        }

    }

    private void populateComboBox() {
        cmbCatering.removeAllItems();
        cmbDecor.removeAllItems();
        cmbPhotography.removeAllItems();

        cmbCatering.addItem(null);
        cmbDecor.addItem(null);
        cmbPhotography.addItem(null);

        for (CateringService catering : businessEvent.getListOfCatering()) {
            if (catering != null) {
                cmbCatering.addItem(catering);
            }
        }
        for (DecorServices decor : businessEvent.getListOfDecors()) {
            if (decor != null) {
                cmbDecor.addItem(decor);
            }
        }
        for (PhotographyService photography : businessEvent.getListOfPhotographyServices()) {
            if (photography != null) {
                cmbPhotography.addItem(photography);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirmRequest;
    private javax.swing.JButton btnDenyRequest;
    private javax.swing.JComboBox<CateringService> cmbCatering;
    private javax.swing.JComboBox<Business.Model.DecorServices> cmbDecor;
    private javax.swing.JComboBox<Business.Model.PhotographyService> cmbPhotography;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewOrderDetails;
    // End of variables declaration//GEN-END:variables
}
