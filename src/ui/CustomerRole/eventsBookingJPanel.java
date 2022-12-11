package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import Business.Model.Booking;
import Business.Model.BusinessEvent;
import Business.Model.CateringService.CateringType;
import Business.Model.DecorServices.DecorType;
import Business.Model.PhotographyService.PhotographyType;
import Business.Model.SystemAdmin;
import Model.services.BusinessEventService;
import ui.main.DateUtils;

/**
 *
 * @author Aparna
 */

public class eventsBookingJPanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnCreateMethod1;
    private String username;
    private Booking booking;

    public eventsBookingJPanel(SystemAdmin systems, Consumer<Booking> callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        cmbOrg.addItem(null);
        for (BusinessEvent eventOrg : booking.getNetwork().getEnterpriseDirectory().getListOfEvents()) {
            cmbOrg.addItem(eventOrg);
        }
        
        
        btnBack.setOpaque(true);
        
        totalPrice.setOpaque(true);
        
        btnBookEvent.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        btnBack = new javax.swing.JButton();
        photoRadioBtn = new javax.swing.JRadioButton();
        cateringRadioBtn = new javax.swing.JRadioButton();
        btnBookEvent = new javax.swing.JButton();
        cmbDecor = new javax.swing.JComboBox<>();
        cmbPhotography = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbCatering = new javax.swing.JComboBox<>();
        decorRadioBtn = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        cmbOrg = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblbookservices = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

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
        btnBack.setBounds(33, 21, 100, 30);

        photoRadioBtn.setBackground(new java.awt.Color(255, 245, 235));
        photoRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        photoRadioBtn.setText("PHOTOGRAPHY");
        photoRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoRadioBtnActionPerformed(evt);
            }
        });
        add(photoRadioBtn);
        photoRadioBtn.setBounds(40, 290, 200, 27);

        cateringRadioBtn.setBackground(new java.awt.Color(255, 245, 235));
        cateringRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cateringRadioBtn.setText("CATERING");
        cateringRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateringRadioBtnActionPerformed(evt);
            }
        });
        add(cateringRadioBtn);
        cateringRadioBtn.setBounds(40, 380, 117, 27);

        btnBookEvent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBookEvent.setText("BOOK EVENT");
        btnBookEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookEventActionPerformed(evt);
            }
        });
        add(btnBookEvent);
        btnBookEvent.setBounds(440, 710, 152, 38);

        cmbDecor.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(cmbDecor);
        cmbDecor.setBounds(300, 560, 431, 27);

        cmbPhotography.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(cmbPhotography);
        cmbPhotography.setBounds(300, 330, 445, 27);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("TYPE OF PACKAGE ");
        add(jLabel5);
        jLabel5.setBounds(110, 330, 190, 22);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("TYPE OF PACKAGE");
        add(jLabel1);
        jLabel1.setBounds(90, 430, 210, 22);

        cmbCatering.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbCatering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCateringActionPerformed(evt);
            }
        });
        add(cmbCatering);
        cmbCatering.setBounds(300, 430, 445, 27);

        decorRadioBtn.setBackground(new java.awt.Color(255, 245, 235));
        decorRadioBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        decorRadioBtn.setText("DECOR SERVICE ");
        decorRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decorRadioBtnActionPerformed(evt);
            }
        });
        add(decorRadioBtn);
        decorRadioBtn.setBounds(40, 490, 210, 27);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("TYPE OF PACKAGE");
        add(jLabel6);
        jLabel6.setBounds(70, 560, 190, 25);
        add(priceField);
        priceField.setBounds(300, 640, 120, 32);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("DATE ");
        add(jLabel2);
        jLabel2.setBounds(50, 160, 98, 22);
        add(dateField);
        dateField.setBounds(300, 160, 200, 26);

        add(cmbOrg);
        cmbOrg.setBounds(300, 240, 200, 27);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("BUSINESS EVENTS ");
        add(jLabel4);
        jLabel4.setBounds(50, 230, 180, 22);

        totalPrice.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        totalPrice.setText("TOTAL PRICE");
        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });
        add(totalPrice);
        totalPrice.setBounds(70, 640, 130, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ezgif.com-gif-maker (8).gif"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(780, 100, 510, 500);

        jPanel1.setBackground(new java.awt.Color(235, 234, 234));
        jPanel1.setLayout(null);

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblbookservices.setText("BOOK EVENTS");
        jPanel1.add(lblbookservices);
        lblbookservices.setBounds(550, 30, 258, 44);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1320, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void photoRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoRadioBtnActionPerformed
        if (photoRadioBtn.isSelected()) {
            cmbPhotography.removeAllItems();
            for (PhotographyType photo : PhotographyType.values()) {
                cmbPhotography.addItem(photo);
            }
        }
    }//GEN-LAST:event_photoRadioBtnActionPerformed

    private void btnBookEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookEventActionPerformed

        BusinessEvent businessEvent = (BusinessEvent) cmbOrg.getSelectedItem();

        if (businessEvent == null) {
            JOptionPane.showMessageDialog(this, "Please select a Business Event organization from the dropdown.");
            return;
        }

        Date date = DateUtils.formatDate(dateField.getDate());
        Date checkin = booking.getCheckin();
        Date checkout = booking.getCheckout();
        if (date.compareTo(checkin) < 0 || date.compareTo(checkout) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be within check-in date (" + checkin
                    + ") and checkout date (" + checkout + ")");
            return;
        }

        boolean photoRadioBtnSelected = photoRadioBtn.isSelected();
        boolean decorRadioBtnSelected = decorRadioBtn.isSelected();
        boolean cateringRadioBtnSelected = cateringRadioBtn.isSelected();

        if (!photoRadioBtnSelected && !decorRadioBtnSelected && !cateringRadioBtnSelected) {
            JOptionPane.showMessageDialog(this, "Please select at least one service for Business Event.");
            return;
        }

        int price = 0;
        BusinessEventService service = new BusinessEventService(businessEvent, date);
        if (photoRadioBtnSelected) {
            PhotographyType photography = (PhotographyType) cmbPhotography.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.PHOTOGRAPHY, photography.getRate());
            price += photography.getRate();
        }

        if (decorRadioBtnSelected) {
            DecorType decor = (DecorType) cmbDecor.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.DECOR, decor.getRate());
            price += decor.getRate();
        }

        if (cateringRadioBtnSelected) {
            CateringType catering = (CateringType) cmbCatering.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.CATERING, catering.getRate());
            price += catering.getRate();
        }

        priceField.setText(String.valueOf(price));
        booking.addService(service);

        JOptionPane.showMessageDialog(this, "Business event service added successfully.");
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_btnBookEventActionPerformed

    private void cmbCateringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCateringActionPerformed

    }//GEN-LAST:event_cmbCateringActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cateringRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateringRadioBtnActionPerformed
        if (cateringRadioBtn.isSelected()) {
            cmbCatering.removeAllItems();
            for (CateringType catering : CateringType.values()) {
                cmbCatering.addItem(catering);
            }

        }
    }//GEN-LAST:event_cateringRadioBtnActionPerformed

    private void decorRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decorRadioBtnActionPerformed
        if (decorRadioBtn.isSelected()) {
            cmbDecor.removeAllItems();
            for (DecorType decor : DecorType.values()) {
                cmbDecor.addItem(decor);
            }
        }
    }//GEN-LAST:event_decorRadioBtnActionPerformed

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed

        BusinessEvent businessEvent = (BusinessEvent) cmbOrg.getSelectedItem();

        if (businessEvent == null) {
            JOptionPane.showMessageDialog(this, "Please select a Business Event organization from the dropdown.");
            return;
        }
        boolean photoRadioBtnSelected = photoRadioBtn.isSelected();
        boolean decorRadioBtnSelected = decorRadioBtn.isSelected();
        boolean cateringRadioBtnSelected = cateringRadioBtn.isSelected();
        Date date = DateUtils.formatDate(dateField.getDate());

        int price = 0;
        BusinessEventService service = new BusinessEventService(businessEvent, date);
        if (photoRadioBtnSelected) {
            PhotographyType photography = (PhotographyType) cmbPhotography.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.PHOTOGRAPHY, photography.getRate());
            price += photography.getRate();
        }

        if (decorRadioBtnSelected) {
            DecorType decor = (DecorType) cmbDecor.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.DECOR, decor.getRate());
            price += decor.getRate();
        }

        if (cateringRadioBtnSelected) {
            CateringType catering = (CateringType) cmbCatering.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.CATERING, catering.getRate());
            price += catering.getRate();
        }

        priceField.setText(String.valueOf(price));
    }//GEN-LAST:event_totalPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookEvent;
    private javax.swing.JRadioButton cateringRadioBtn;
    private javax.swing.JComboBox<CateringType> cmbCatering;
    private javax.swing.JComboBox<DecorType> cmbDecor;
    private javax.swing.JComboBox<BusinessEvent> cmbOrg;
    private javax.swing.JComboBox<PhotographyType> cmbPhotography;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JRadioButton decorRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JRadioButton photoRadioBtn;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton totalPrice;
    // End of variables declaration//GEN-END:variables
}
