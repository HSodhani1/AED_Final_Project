package ui.CustomerRole;

import java.util.function.Consumer;
import Business.Model.Booking;
import Business.Model.SystemAdmin;

/**
 *
 * @author Aparna
 */

public class addServicePanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnEventBooking;
    private Consumer<Booking> callOnOrderBooking;
    private Consumer<Booking> callOnHealthClubBooking;
    private Consumer<Booking> callOnHotelServiceBooking;
    private Runnable backButton4;
    private String username;
    private String hotelName;
    private Booking booking;

    public addServicePanel(SystemAdmin systems, Consumer<Booking> callOnEventBooking, Consumer<Booking> callOnOrderBooking,
            Consumer<Booking> callOnHealthClubBooking, Consumer<Booking> callOnHotelServiceBooking, Runnable backButton, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnEventBooking = callOnEventBooking;
        this.callOnOrderBooking = callOnOrderBooking;
        this.callOnHealthClubBooking = callOnHealthClubBooking;
        this.callOnHotelServiceBooking = callOnHotelServiceBooking;
        this.backButton4 = backButton;
        this.username = username;
        this.booking = booking;
       
       
        btnBack.setOpaque(true);
        
        btnEvent.setOpaque(true);
        
        btnOrder.setOpaque(true);
        
        btnHealthClub.setOpaque(true);
       
        btnOtherServices.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnEvent = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnHealthClub = new javax.swing.JButton();
        btnOtherServices = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(38, 27, 90, 36);

        btnEvent.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnEvent.setText("BUSINESS EVENTS ");
        btnEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventActionPerformed(evt);
            }
        });
        add(btnEvent);
        btnEvent.setBounds(870, 260, 262, 38);

        btnOrder.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnOrder.setText("PLACE ORDER ");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        add(btnOrder);
        btnOrder.setBounds(870, 350, 262, 42);

        btnHealthClub.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnHealthClub.setText("HEALTH CLUB ");
        btnHealthClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHealthClubActionPerformed(evt);
            }
        });
        add(btnHealthClub);
        btnHealthClub.setBounds(870, 440, 262, 42);

        btnOtherServices.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnOtherServices.setText("OTHER SERVICES");
        btnOtherServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherServicesActionPerformed(evt);
            }
        });
        add(btnOtherServices);
        btnOtherServices.setBounds(870, 540, 262, 38);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reception.gif"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(180, 160, 530, 540);

        jPanel2.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("ADD SERVICES ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(480, 30, 210, 40);

        add(jPanel2);
        jPanel2.setBounds(0, 0, 1250, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventActionPerformed
        callOnEventBooking.accept(booking);
    }//GEN-LAST:event_btnEventActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        callOnOrderBooking.accept(booking);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnHealthClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHealthClubActionPerformed
        callOnHealthClubBooking.accept(booking);
    }//GEN-LAST:event_btnHealthClubActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        backButton4.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOtherServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherServicesActionPerformed
        callOnHotelServiceBooking.accept(booking);
    }//GEN-LAST:event_btnOtherServicesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEvent;
    private javax.swing.JButton btnHealthClub;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnOtherServices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
