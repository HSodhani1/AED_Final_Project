package ui.CustomerRole;

import Business.Model.SystemAdmin;

/**
 *
 * @author Aparna
 */

public class custStartPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private String user;

    public custStartPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
       
        
        btnBack.setOpaque(true);
        
        btnBookRoom.setOpaque(true);
        
        btnManageBooking.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBookRoom = new javax.swing.JButton();
        btnManageBooking = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setMaximumSize(new java.awt.Dimension(1650, 1080));
        setPreferredSize(new java.awt.Dimension(1650, 1080));
        setLayout(null);

        btnBookRoom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBookRoom.setText("BOOK ROOMS & SERVICES");
        btnBookRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookRoomActionPerformed(evt);
            }
        });
        add(btnBookRoom);
        btnBookRoom.setBounds(110, 320, 343, 38);

        btnManageBooking.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageBooking.setText("MANAGE BOOKING");
        btnManageBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageBookingActionPerformed(evt);
            }
        });
        add(btnManageBooking);
        btnManageBooking.setBounds(110, 460, 335, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/giphy (1).gif"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(650, 180, 630, 460);

        jPanel1.setBackground(new java.awt.Color(235, 234, 234));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CUSTOMER PANEL ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 30, 346, 44);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        jPanel1.add(btnBack);
        btnBack.setBounds(60, 30, 100, 41);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1300, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageBookingActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_btnManageBookingActionPerformed

    private void btnBookRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookRoomActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnBookRoomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookRoom;
    private javax.swing.JButton btnManageBooking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
