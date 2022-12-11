package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import Business.Model.Booking;
import Business.Model.SystemAdmin;

/**
 *
 * @author Aparna
 */

public class viewServiceDetailsPanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Runnable callOnCreateMethod1;
    private String username;
    private Booking booking;

    public viewServiceDetailsPanel(SystemAdmin systems, Runnable callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;
        populatePanel();
      
        
        btnBack.setOpaque(true);
        bookingDetails.setColumns(19);
        bookingDetails.setRows(7);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bookingDetails = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCheckOut = new javax.swing.JTextField();
        txtCheckin = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        bookingDetails.setColumns(20);
        bookingDetails.setRows(5);
        jScrollPane1.setViewportView(bookingDetails);

        add(jScrollPane1);
        jScrollPane1.setBounds(290, 250, 675, 500);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("CHECK-IN ");
        add(jLabel1);
        jLabel1.setBounds(430, 140, 100, 24);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("CHECK-OUT");
        add(jLabel2);
        jLabel2.setBounds(430, 180, 110, 24);

        txtCheckOut.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(txtCheckOut);
        txtCheckOut.setBounds(610, 180, 249, 25);

        txtCheckin.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(txtCheckin);
        txtCheckin.setBounds(610, 140, 249, 25);

        jPanel1.setBackground(new java.awt.Color(235, 234, 234));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setText("VIEW ORDER DETAILS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 30, 264, 32);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(40, 30, 90, 36);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1260, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bookingDetails;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCheckOut;
    private javax.swing.JTextField txtCheckin;
    // End of variables declaration//GEN-END:variables

    private void populatePanel() {
        txtCheckin.setText(booking.getCheckin().toString());
        txtCheckOut.setText(booking.getCheckout().toString());
        bookingDetails.setText(booking.prettyPrint());
    }
}
