package ui.HealthClubManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.Booking;
import Business.Model.Customer;
import Business.Model.CustomerDirectory;
import Business.Model.HealthClub;
import Business.Model.Organization;
import Business.Model.PhysicianOrg;
import Business.Model.SystemAdmin;
import Business.Model.TherapistOrg;
import Business.Model.TrainerOrg;
import model.services.HealthClubService;
import model.services.Service;

/**
 *
 * @author Hardik
 */

public class viewTaskPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private HealthClub healthClub;

    public viewTaskPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, HealthClub healthClub) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.healthClub = healthClub;
        populateComboBox();
        populateTable();
      
        btnBack.setOpaque(true);
        
        btnAssignWork.setOpaque(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        cmbTherapist = new javax.swing.JComboBox<>();
        cmbPhysician = new javax.swing.JComboBox<>();
        cmbTrainer = new javax.swing.JComboBox<>();
        btnAssignWork = new javax.swing.JButton();
        lbltherapist = new javax.swing.JLabel();
        lblPhysician = new javax.swing.JLabel();
        lblTrainer = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        tblOrderDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "NAME", "STATUS", "THERAPIST", "PHYSICIAN", "TRAINER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrderDetails);

        add(jScrollPane1);
        jScrollPane1.setBounds(250, 320, 829, 240);

        cmbTherapist.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(cmbTherapist);
        cmbTherapist.setBounds(240, 210, 218, 27);

        cmbPhysician.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(cmbPhysician);
        cmbPhysician.setBounds(540, 210, 198, 27);

        cmbTrainer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(cmbTrainer);
        cmbTrainer.setBounds(840, 210, 215, 27);

        btnAssignWork.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAssignWork.setText("ASSIGN AND CONFIRM TASK");
        btnAssignWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignWorkActionPerformed(evt);
            }
        });
        add(btnAssignWork);
        btnAssignWork.setBounds(520, 610, 310, 44);

        lbltherapist.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbltherapist.setText("SELECT A THERAPIST ORG");
        add(lbltherapist);
        lbltherapist.setBounds(230, 170, 260, 30);

        lblPhysician.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblPhysician.setText("SELECT A PHYSICIAN ORG");
        add(lblPhysician);
        lblPhysician.setBounds(530, 170, 250, 22);

        lblTrainer.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTrainer.setText("SELECT A TRAINER ORG");
        add(lblTrainer);
        lblTrainer.setBounds(830, 170, 230, 22);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("VIEW ORDER DETAILS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(470, 30, 334, 28);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(20, 30, 100, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1260, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignWorkActionPerformed
        int selectedRowIndex = tblOrderDetails.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblOrderDetails.getModel();
        Booking booking = (Booking) model.getValueAt(selectedRowIndex, 0);

        HealthClubService healthClubService = null;
        for (Service service : booking.getServices()) {
            if (healthClub.getName().equals(service.getEnterprise().getName())) {
                healthClubService = (HealthClubService) service;
                break;
            }
        }

        if (healthClubService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find health club");
            return;
        }
        if (!healthClubService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        TherapistOrg therapistInfo = (TherapistOrg) cmbTherapist.getSelectedItem();
        PhysicianOrg physicianInfo = (PhysicianOrg) cmbPhysician.getSelectedItem();
        TrainerOrg trainerInfo = (TrainerOrg) cmbTrainer.getSelectedItem();

        List<Organization> orgs = new ArrayList<>();
        for (HealthClubService.HealthClubServiceType type : healthClubService.getHealthClubServices()) {
            switch (type) {
                case THERAPIST:
                    if (therapistInfo == null) {
                        JOptionPane.showMessageDialog(this, "Please select therapist organization to be assinged for the booking.");
                        return;
                    } else {
                        orgs.add(therapistInfo);
                    }
                    break;
                case PHYSICIAN:
                    if (physicianInfo == null) {
                        JOptionPane.showMessageDialog(this, "Please select physician organization to be assinged for the booking.");
                        return;
                    } else {
                        orgs.add(physicianInfo);
                    }
                    break;
                case TRAINER:
                    if (trainerInfo == null) {
                        JOptionPane.showMessageDialog(this, "Please select trainer organization to be assinged for the booking.");
                        return;
                    } else {
                        orgs.add(trainerInfo);
                    }
                    break;
            }
        }

        for (Organization organization : orgs) {
            healthClubService.addOrganization(organization);
        }
        healthClubService.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all healthclub services to the booking: " + booking.getId());

        return;

    }//GEN-LAST:event_btnAssignWorkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignWork;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<PhysicianOrg> cmbPhysician;
    private javax.swing.JComboBox<TherapistOrg> cmbTherapist;
    private javax.swing.JComboBox<TrainerOrg> cmbTrainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPhysician;
    private javax.swing.JLabel lblTrainer;
    private javax.swing.JLabel lbltherapist;
    private javax.swing.JTable tblOrderDetails;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblOrderDetails.getModel();
        model.setRowCount(0);

        Object row[] = new Object[10];
        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec(); //get all customers
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking

                    if (service.getEnterprise().getName().equals(healthClub.getName())) {

                        HealthClubService healthClubService = (HealthClubService) service;

                        row[0] = booking;
                        row[1] = customer;
                        row[2] = healthClubService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";
                        row[5] = "NO";

                        for (HealthClubService.HealthClubServiceType type : healthClubService.getHealthClubServices()) {
                            switch (type) {
                                case THERAPIST:
                                    row[3] = "YES";
                                    break;
                                case PHYSICIAN:
                                    row[4] = "YES";
                                    break;
                                case TRAINER:
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
        cmbTherapist.addItem(null);
        cmbPhysician.addItem(null);
        cmbTrainer.addItem(null);

        for (TherapistOrg therapist : healthClub.getListOfTherapistOrg()) {
            if (therapist != null) {
                cmbTherapist.addItem(therapist);
            }
        }
        for (PhysicianOrg physician : healthClub.getListOfPhysicianOrg()) {
            if (physician != null) {
                cmbPhysician.addItem(physician);
            }
        }
        for (TrainerOrg trainer : healthClub.getListOfTrainerOrg()) {
            if (trainer != null) {
                cmbTrainer.addItem(trainer);
            }
        }
    }

}
