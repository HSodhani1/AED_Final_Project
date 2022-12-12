package ui.CustomerRole;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import Business.Model.Booking;
import Business.Model.Customer;
import Business.Model.Hotel;
import Business.Model.Network;
import Business.Model.Room;
import Business.Model.Room.RoomType;
import Business.Model.SystemAdmin;
import ui.main.DateUtils;

/**
 *
 * @author Aparna
 */

public class bookRoomServ extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Runnable callOnCreateMethod1;
    private String username;

    public bookRoomServ(SystemAdmin systems, Runnable callOnCreateMethod1, String username) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        for (Network network : systems.getListOfNetwork()) {
            cmbCity.addItem(network.getName());
        }
        for (RoomType type : RoomType.values()) {
            cmbRoomTypes.addItem(type);
        }
        
       
        btnBack.setOpaque(true);
        
        btnTotalPrice.setOpaque(true);
        
        btnBookRoom.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbldate = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        lblhotel = new javax.swing.JLabel();
        txtPriceField = new javax.swing.JTextField();
        btnnoofpeople = new javax.swing.JLabel();
        lblroom = new javax.swing.JLabel();
        btnBookRoom = new javax.swing.JButton();
        txtPeopleField = new javax.swing.JTextField();
        txtNumberOfRoom = new javax.swing.JTextField();
        checkin = new com.toedter.calendar.JDateChooser();
        cmbHotel = new javax.swing.JComboBox<>();
        checkout = new com.toedter.calendar.JDateChooser();
        cmbCity = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbRoomTypes = new javax.swing.JComboBox<>();
        btnTotalPrice = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblbookservices = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        lbldate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldate.setText("CHECK-IN & CHECK-OUT");
        add(lbldate);
        lbldate.setBounds(80, 170, 220, 22);

        lblcity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcity.setText("CITY");
        add(lblcity);
        lblcity.setBounds(80, 230, 121, 22);

        lblhotel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblhotel.setText("HOTELS");
        add(lblhotel);
        lblhotel.setBounds(80, 290, 121, 22);
        add(txtPriceField);
        txtPriceField.setBounds(340, 560, 101, 37);

        btnnoofpeople.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnoofpeople.setText("NO OF PEOPLE");
        add(btnnoofpeople);
        btnnoofpeople.setBounds(80, 370, 140, 22);

        lblroom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblroom.setText("NO OF ROOMS");
        add(lblroom);
        lblroom.setBounds(80, 480, 120, 22);

        btnBookRoom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBookRoom.setText("BOOK ROOM");
        btnBookRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookRoomActionPerformed(evt);
            }
        });
        add(btnBookRoom);
        btnBookRoom.setBounds(440, 680, 151, 45);
        add(txtPeopleField);
        txtPeopleField.setBounds(350, 370, 342, 26);
        add(txtNumberOfRoom);
        txtNumberOfRoom.setBounds(350, 490, 334, 26);
        add(checkin);
        checkin.setBounds(350, 170, 171, 26);

        cmbHotel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbHotel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a hotel" }));
        add(cmbHotel);
        cmbHotel.setBounds(350, 290, 346, 27);
        add(checkout);
        checkout.setBounds(550, 170, 153, 26);

        cmbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city" }));
        cmbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityActionPerformed(evt);
            }
        });
        add(cmbCity);
        cmbCity.setBounds(350, 230, 346, 27);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("ROOM TYPE ");
        add(jLabel1);
        jLabel1.setBounds(80, 420, 120, 22);

        cmbRoomTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoomTypesActionPerformed(evt);
            }
        });
        add(cmbRoomTypes);
        cmbRoomTypes.setBounds(350, 430, 334, 27);

        btnTotalPrice.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnTotalPrice.setText("TOTAL PRICE");
        btnTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalPriceActionPerformed(evt);
            }
        });
        add(btnTotalPrice);
        btnTotalPrice.setBounds(80, 560, 160, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ezgif.com-gif-maker (9).gif"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(780, 110, 520, 500);

        jPanel1.setBackground(new java.awt.Color(235, 234, 234));
        jPanel1.setLayout(null);

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblbookservices.setText("BOOK ROOMS AND SERVICES");
        jPanel1.add(lblbookservices);
        lblbookservices.setBounds(480, 40, 370, 29);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(50, 30, 100, 38);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1390, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookRoomActionPerformed
        Date checkinDate = checkin.getDate();
        Date checkoutdate = checkout.getDate();
        int people = Integer.parseInt(txtPeopleField.getText());
        String city = cmbCity.getSelectedItem().toString();
        int roomCount = Integer.parseInt(txtNumberOfRoom.getText());
        RoomType roomType = (RoomType) cmbRoomTypes.getSelectedItem();
        
         if (people <= 0) {
            JOptionPane.showMessageDialog(this, "Enter a valid Number of people in the room.");
            return;
        }

        if (checkinDate.compareTo(DateUtils.now()) < 0 || checkoutdate.compareTo(DateUtils.now()) < 0) {
            JOptionPane.showMessageDialog(this, "Checkin and checkout dates cannot be in the past.");
            return;
        }

        if (checkinDate.compareTo(checkoutdate) > 0) {
            JOptionPane.showMessageDialog(this, "Checkout date should be after checkin date.");
            return;
        }

        Network network = systems.findNetwork(city);

        Hotel hotel = network.getEnterpriseDirectory().findHotel(cmbHotel.getSelectedItem().toString());
        List<Room> availableRooms = hotel.availableRooms(checkinDate, checkoutdate, roomType);
        if (availableRooms.size() < roomCount) {
            JOptionPane.showMessageDialog(this, "Rooms not available for the specified date.");
            return;
        }

        hotel.bookRooms(checkinDate, checkoutdate, roomCount, roomType);
        Customer customer = systems.getCustomerDirec().findCustomerUsername(username);
        Booking booking = customer.addBooking(hotel, network);  //add bookings in customer class
        booking.getHotelService().getRoomlist().createRoom(roomType);     // add rooms in booking class 
        booking.setCheckin(checkinDate);
        booking.setCheckout(checkoutdate);
        booking.setStatus("Booked");
        booking.setCost(roomType.getRate());

        JOptionPane.showMessageDialog(this, "Room booked successfully. The total cost for your booking is "
                + (roomCount * roomType.getRate()) + "$");
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnBookRoomActionPerformed

    private void cmbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityActionPerformed
        String city = cmbCity.getSelectedItem().toString();
        Network network = systems.findNetwork(city);
        cmbHotel.removeAllItems();
        if (network != null) {
            for (Hotel hotel : network.getEnterpriseDirectory().getListOfHotel()) {  //populate all hotel in that city
                cmbHotel.addItem(hotel.getName());
            }
        }
    }//GEN-LAST:event_cmbCityActionPerformed

    private void cmbRoomTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoomTypesActionPerformed

    }//GEN-LAST:event_cmbRoomTypesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalPriceActionPerformed
        final String roomNum = txtNumberOfRoom.getText();
        if (roomNum != null && !roomNum.isEmpty()) {
            int roomCount = Integer.parseInt(roomNum);
            RoomType selectType = (RoomType) cmbRoomTypes.getSelectedItem();
            txtPriceField.setText(selectType.getRate() * roomCount + "$");
        } else {
            JOptionPane.showMessageDialog(this, "Please provide number of rooms to calculate price.");
        }
    }//GEN-LAST:event_btnTotalPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookRoom;
    private javax.swing.JButton btnTotalPrice;
    private javax.swing.JLabel btnnoofpeople;
    private com.toedter.calendar.JDateChooser checkin;
    private com.toedter.calendar.JDateChooser checkout;
    private javax.swing.JComboBox<String> cmbCity;
    private javax.swing.JComboBox<String> cmbHotel;
    private javax.swing.JComboBox<RoomType> cmbRoomTypes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblhotel;
    private javax.swing.JLabel lblroom;
    private javax.swing.JTextField txtNumberOfRoom;
    private javax.swing.JTextField txtPeopleField;
    private javax.swing.JTextField txtPriceField;
    // End of variables declaration//GEN-END:variables
}
