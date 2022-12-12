package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import Business.Model.Booking;
import Business.Model.SystemAdmin;
//import javax.mail.PasswordAuthentication;
//import java.util.Properties;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import javax.net.ssl.SSLHandshakeException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Hardik
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
        txtDetails.setColumns(19);
        txtDetails.setRows(7);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetails = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCheckin = new javax.swing.JTextField();
        txtCheckOut = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        txtDetails.setColumns(20);
        txtDetails.setRows(5);
        jScrollPane1.setViewportView(txtDetails);

        add(jScrollPane1);
        jScrollPane1.setBounds(310, 270, 675, 480);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("CHECK-IN ");
        add(jLabel1);
        jLabel1.setBounds(430, 140, 100, 22);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("EMAIL RECEIPT TO");
        add(jLabel2);
        jLabel2.setBounds(380, 220, 160, 22);

        txtCheckin.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtCheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckinActionPerformed(evt);
            }
        });
        add(txtCheckin);
        txtCheckin.setBounds(610, 140, 249, 27);

        txtCheckOut.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckOutActionPerformed(evt);
            }
        });
        add(txtCheckOut);
        txtCheckOut.setBounds(610, 180, 249, 27);

        jPanel1.setBackground(new java.awt.Color(235, 234, 234));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setText("VIEW ORDER DETAILS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 30, 264, 30);

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

        btnBack1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack1.setText("BACK");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1);
        btnBack1.setBounds(40, 30, 90, 36);

        btnPayment.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnPayment.setText("Make Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        add(btnPayment);
        btnPayment.setBounds(990, 440, 190, 50);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("CHECK-OUT");
        add(jLabel4);
        jLabel4.setBounds(430, 180, 110, 22);

        txtEmailID.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(txtEmailID);
        txtEmailID.setBounds(610, 220, 249, 27);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        
        String eid = txtEmailID.getText();
        
        if (eid == null || eid != "^[A-Za-z0-9+_.-]+@(.+)$") {
            JOptionPane.showMessageDialog(this, "Enter a valid Email ID.");
            return;
        }
        
        String email = txtDetails.getText();
        String fromEmail = "hardik.sodhani@gmail.com";
        String fromEmailPassword = "wjzcqbztkjdiyngs";
        String subject = "Payment Receipt";
        String toEmail = txtEmailID.getText();
         
        Properties properties = new Properties();
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.EnableSSL.enable","true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.debug", "true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.smtp.socketFactory.fallback", "false");
        properties.setProperty("mail.smtp.port", "465");
        properties.setProperty("mail.smtp.socketFactory.port", "465");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, fromEmailPassword);
            }
        });

        try{
            MimeMessage message = new  MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(email);
            Transport.send(message);
        }
        catch(MessagingException ex){
            System.out.println(""+ex);
        }
        
        JOptionPane.showMessageDialog(this, "Mail Receipt Sent");
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void txtCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckOutActionPerformed

    private void txtCheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCheckOut;
    private javax.swing.JTextField txtCheckin;
    private javax.swing.JTextArea txtDetails;
    private javax.swing.JTextField txtEmailID;
    // End of variables declaration//GEN-END:variables

    private void populatePanel() {
        txtCheckin.setText(booking.getCheckin().toString());
        txtCheckOut.setText(booking.getCheckout().toString());
        txtDetails.setText(booking.prettyPrint());
    }
}
