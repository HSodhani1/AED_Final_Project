package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import Business.Model.Booking;
import Business.Model.SystemAdmin;
import model.services.HotelService;
import ui.main.DateUtils;

/**
 *
 * @author Aparna
 */

public class hotelServicePanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnCreateMethod1;
    private String username;
    private Booking booking;

    public hotelServicePanel(SystemAdmin systems, Consumer<Booking> callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;
        
        
        btnBack.setOpaque(true);
       
        btnPlaceRequest.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLaundry = new javax.swing.JRadioButton();
        btnTransportation = new javax.swing.JRadioButton();
        btnPlaceRequest = new javax.swing.JButton();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        btnLaundry.setBackground(new java.awt.Color(255, 245, 235));
        btnLaundry.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnLaundry.setText("LAUNDARY SERVICE ($10)");
        add(btnLaundry);
        btnLaundry.setBounds(210, 560, 317, 33);

        btnTransportation.setBackground(new java.awt.Color(255, 245, 235));
        btnTransportation.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnTransportation.setText("TRANSPORTATION SERVICE ($20)");
        add(btnTransportation);
        btnTransportation.setBounds(760, 570, 400, 33);

        btnPlaceRequest.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnPlaceRequest.setText("PLACE REQUEST");
        btnPlaceRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceRequestActionPerformed(evt);
            }
        });
        add(btnPlaceRequest);
        btnPlaceRequest.setBounds(500, 670, 231, 47);
        add(dateField);
        dateField.setBounds(510, 170, 223, 39);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("DATE");
        add(jLabel3);
        jLabel3.setBounds(380, 180, 75, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ezgif.com-gif-maker (13).gif"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(150, 250, 400, 300);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ezgif.com-gif-maker (15).gif"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(710, 250, 400, 300);

        jPanel1.setBackground(new java.awt.Color(235, 234, 234));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("HOTEL SERVICE PANEL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 30, 450, 47);

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
        jPanel1.setBounds(0, 0, 1290, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPlaceRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceRequestActionPerformed
        boolean laundaryBtnSelected = btnLaundry.isSelected();
        boolean transportationBtnSelected = btnTransportation.isSelected();
        Date date = DateUtils.formatDate(dateField.getDate());
        Date checkin = booking.getCheckin();
        Date checkout = booking.getCheckout();
        if (date.compareTo(checkin) < 0 || date.compareTo(checkout) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be within check-in date (" + checkin
                    + ") and checkout date (" + checkout + ")");
            return;
        }

        HotelService hotelService = booking.getHotelService();
        if (laundaryBtnSelected) {
            hotelService.addService(HotelService.HotelServiceType.LAUNDARY);
        }
        if (transportationBtnSelected) {
            hotelService.addService(HotelService.HotelServiceType.TRANSPORTATION);
        }

        hotelService.setDate(date);
        JOptionPane.showMessageDialog(this, "Your hotel services are been added.");
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_btnPlaceRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnLaundry;
    private javax.swing.JButton btnPlaceRequest;
    private javax.swing.JRadioButton btnTransportation;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
