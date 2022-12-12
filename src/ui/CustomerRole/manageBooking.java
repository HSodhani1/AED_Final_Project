package ui.CustomerRole;

import java.util.List;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.Booking;
import Business.Model.Customer;
import Business.Model.CustomerDirectory;
import Business.Model.SystemAdmin;

/**
 *
 * @author Aparna
 */

public class manageBooking extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Consumer<Booking> callOnAddServiceMethod;
    private Consumer<Booking> callOnViewServiceMethod;
    private String username;

    public manageBooking(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Consumer<Booking> callOnCreateMethod2, Consumer<Booking> callOnViewServiceMethod, String username) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnAddServiceMethod = callOnCreateMethod2;
        this.callOnViewServiceMethod = callOnViewServiceMethod;
        this.username = username;

        populateTable();
       
        btnBack.setOpaque(true);
       
        addServiceBtn.setOpaque(true);
        
        viewOrder.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBookingDetails = new javax.swing.JTable();
        addServiceBtn = new javax.swing.JButton();
        viewOrder = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(34, 27, 90, 36);

        tblBookingDetails.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblBookingDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HOTEL NAME", "BOOKING ID", "PRICE", "STATUS", "CHECK_IN", "CHECK OUT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblBookingDetails);

        add(jScrollPane2);
        jScrollPane2.setBounds(170, 210, 950, 300);

        addServiceBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addServiceBtn.setText("ADD SERVICES");
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });
        add(addServiceBtn);
        addServiceBtn.setBounds(290, 600, 205, 53);

        viewOrder.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewOrder.setText("VIEW SERVICE DETAILS");
        viewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderActionPerformed(evt);
            }
        });
        add(viewOrder);
        viewOrder.setBounds(620, 600, 280, 53);

        jPanel1.setBackground(new java.awt.Color(235, 234, 234));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("BOOKING DETAILS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 30, 357, 35);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1290, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceBtnActionPerformed
        int selectedRowIndex = tblBookingDetails.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to add services.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblBookingDetails.getModel();
        String bookingId = (String) model.getValueAt(selectedRowIndex, 1);

        System.out.println(bookingId + " is selected");

        CustomerDirectory customDirec = systemAdmin.getCustomerDirec();
        Customer customer = customDirec.findCustomerUsername(username);

        List<Booking> list = customer.getBookingList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(bookingId)) {
                callOnAddServiceMethod.accept(list.get(i));
                return;
            }
        }
    }//GEN-LAST:event_addServiceBtnActionPerformed

    private void viewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderActionPerformed
        int selectedRowIndex = tblBookingDetails.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblBookingDetails.getModel();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to view its details.");
            return;
        }
        String bookingId = (String) model.getValueAt(selectedRowIndex, 1);

        System.out.println(bookingId + " is selected");

        CustomerDirectory customDirec = systemAdmin.getCustomerDirec();
        Customer customer = customDirec.findCustomerUsername(username);

        List<Booking> list = customer.getBookingList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(bookingId)) {
                callOnViewServiceMethod.accept(list.get(i));
                return;
            }
        }
    }//GEN-LAST:event_viewOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBookingDetails;
    private javax.swing.JButton viewOrder;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblBookingDetails.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        CustomerDirectory customDirec = systemAdmin.getCustomerDirec();
        Customer customer = customDirec.findCustomerUsername(username);
        System.out.println("customer found is " + customer.getName() + " username is " + username);
        for (Booking bookingList : customer.getBookingList()) {
            row[0] = bookingList.getHotelService().getEnterprise();
            row[1] = bookingList.getId();
            row[2] = bookingList.getTotalCost();
            row[3] = bookingList.getStatus();
            row[4] = bookingList.getCheckin();
            row[5] = bookingList.getCheckout();
            model.addRow(row);
        }

    }
}
