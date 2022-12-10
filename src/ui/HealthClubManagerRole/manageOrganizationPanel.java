package ui.HealthClubManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.EnterpriseDirectory;
import Business.Model.HealthClub;
import Business.Model.Network;
import Business.Model.PhysicianOrg;
import Business.Model.SystemAdmin;
import Business.Model.TherapistOrg;
import Business.Model.TrainerOrg;

/**
 *
 * @author Hardik
 */

public class manageOrganizationPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnMethod;
    private String user;
    private Network network;

    public manageOrganizationPanel(SystemAdmin systemAdmin, Runnable callOnMethod, String user, Network network) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnMethod = callOnMethod;
        this.user = user;
        this.network = network;
        txtCity.setText(network.getName());
        txtCity.setEditable(false);
        populateTable();
        

        
        deleteBtn.setOpaque(true);
       
        btnAdd.setOpaque(true);
       
        btnUpdate.setOpaque(true);
        
        btnBack.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHealthClub = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        cmbOrgType = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtContact = new javax.swing.JTextField();
        lblOrgType = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        tblHealthClub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblHealthClub.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORGANIZATION TYPE", "NAME", "CONTACT", "CITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHealthClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHealthClubMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHealthClub);

        add(jScrollPane1);
        jScrollPane1.setBounds(650, 180, 560, 380);

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setText("NAME ");
        add(lblName);
        lblName.setBounds(80, 350, 60, 22);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtName);
        txtName.setBounds(310, 350, 218, 27);

        lblContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblContact.setText("CONTACT");
        add(lblContact);
        lblContact.setBounds(80, 410, 189, 22);

        cmbOrgType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbOrgType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organization", "Physician", "Trainer", "Therapist" }));
        cmbOrgType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgTypeActionPerformed(evt);
            }
        });
        add(cmbOrgType);
        cmbOrgType.setBounds(310, 300, 218, 27);

        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(900, 600, 110, 30);

        lblCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCity.setText("CITY");
        add(lblCity);
        lblCity.setBounds(80, 460, 145, 22);

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(130, 560, 128, 40);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(370, 560, 110, 40);

        txtContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        add(txtContact);
        txtContact.setBounds(310, 410, 218, 27);

        lblOrgType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOrgType.setText("ORGANIZATION TYPE ");
        add(lblOrgType);
        lblOrgType.setBounds(80, 300, 189, 22);
        add(txtCity);
        txtCity.setBounds(310, 460, 218, 26);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE ORGANIZATION FOR HEALTH CLUB");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(460, 40, 560, 30);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(40, 30, 90, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1290, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblHealthClub.getModel();
        int selectedRowIndex = tblHealthClub.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        String OrgType = (String) model.getValueAt(selectedRowIndex, 0);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 1);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (HealthClub club : enterpriseDirec.getListOfHealthClub()) {
            if (club.findManager(user) != null) {
                if (OrgType.equals("Physician") && club.getListOfPhysicianOrg() != null) {
                    for (PhysicianOrg physician : club.getListOfPhysicianOrg()) {
                        if (physician.getName().equals(OrgName)) {
                            club.deletePhysician(physician);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Trainer") && club.getListOfTrainerOrg() != null) {
                    for (TrainerOrg trainer : club.getListOfTrainerOrg()) {
                        if (trainer.getName().equals(OrgName)) {
                            club.deleteTrainer(trainer);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Therapist") && club.getListOfTherapistOrg() != null) {
                    for (TherapistOrg therapist : club.getListOfTherapistOrg()) {
                        if (therapist.getName().equals(OrgName)) {
                            club.deleteTherapist(therapist);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else {
                    return;
                }

            }
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String networkName = network.getName();  //find the network 
        String name = txtName.getText();

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Organization name should be at least 2 characters long.");
            return;
        }

        String contact = txtContact.getText();
        String orgType1 = cmbOrgType.getSelectedItem().toString();
        EnterpriseDirectory enterpDirectory = network.getEnterpriseDirectory();
        List<HealthClub> healthClub = enterpDirectory.getListOfHealthClub();
        for (int i = 0; i < healthClub.size(); i++) {
            healthClub.get(i).findManager(user);      //find healthclub for which manager is working for
            if (orgType1.equals("Physician")) {
                healthClub.get(i).addPhysicianOrg(name, contact, networkName);
                JOptionPane.showMessageDialog(this, "Physician Organisation added successfully");
            } else if (orgType1.equals("Trainer")) {
                healthClub.get(i).addTraineOrg(name, contact, networkName);
                JOptionPane.showMessageDialog(this, "Trainer Organisation successfully");
            } else {
                healthClub.get(i).addTherapistOrg(name, contact, networkName);
                JOptionPane.showMessageDialog(this, "Therapist Organisation added successfully");
            }
        }
        populateTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void cmbOrgTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrgTypeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (tblHealthClub.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        DefaultTableModel model = (DefaultTableModel) tblHealthClub.getModel();

        String orgType = cmbOrgType.getSelectedItem().toString();
        String orgName = model.getValueAt(tblHealthClub.getSelectedRow(), 1).toString();

        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (HealthClub club : enterpriseDirec.getListOfHealthClub()) {
            if (orgType.equals("Physician") && club.getListOfPhysicianOrg() != null) {
                for (PhysicianOrg phy : club.getListOfPhysicianOrg()) {
                    if (phy.getName().equals(orgName)) {
                        phy.setName(txtName.getText());
                        phy.setContact(txtContact.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Therapist") && club.getListOfTherapistOrg() != null) {
                for (TherapistOrg therapist : club.getListOfTherapistOrg()) {
                    if (therapist.getName().equals(orgName)) {
                        therapist.setName(txtName.getText());
                        therapist.setContact(txtContact.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Trainer") && club.getListOfTrainerOrg() != null) {
                for (TrainerOrg trainer : club.getListOfTrainerOrg()) {
                    if (trainer.getName().equals(orgName)) {
                        trainer.setName(txtName.getText());
                        trainer.setContact(txtContact.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            }

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblHealthClubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHealthClubMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblHealthClub.getModel();
        if (tblHealthClub.getSelectedRowCount() != 1) {
            return;
        }

        String orgType = model.getValueAt(tblHealthClub.getSelectedRow(), 0).toString();
        String orgName = model.getValueAt(tblHealthClub.getSelectedRow(), 1).toString();
        String orgContact = model.getValueAt(tblHealthClub.getSelectedRow(), 2).toString();
        String orgCity = model.getValueAt(tblHealthClub.getSelectedRow(), 3).toString();

        txtName.setText(orgName);
        txtContact.setText(orgContact);
        txtCity.setText(orgCity);
        cmbOrgType.setSelectedItem(orgType);
        txtCity.setEnabled(false);
    }//GEN-LAST:event_tblHealthClubMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbOrgType;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrgType;
    private javax.swing.JTable tblHealthClub;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblHealthClub.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = cmbOrgType.getSelectedItem().toString();
        Network network1 = systemAdmin.findNetwork(network.getName());
        EnterpriseDirectory enterpriseDirec = network1.getEnterpriseDirectory();
        for (HealthClub health : enterpriseDirec.getListOfHealthClub()) {
            if (health.findManager(user) != null) {
                if (health.getListOfPhysicianOrg() != null) {
                    row[0] = "Physician";
                    for (PhysicianOrg physicianInfo : health.getListOfPhysicianOrg()) {
                        row[0] = "Physician";
                        row[1] = physicianInfo.getName();
                        row[2] = physicianInfo.getContact();
                        row[3] = network1.getName();
                        model.addRow(row);
                    }
                }
                if (health.getListOfTherapistOrg() != null) {
                    row[0] = "Therapist";
                    for (TherapistOrg therapistInfo : health.getListOfTherapistOrg()) {
                        row[0] = "Therapist";
                        row[1] = therapistInfo.getName();
                        row[2] = therapistInfo.getContact();
                        row[3] = network.getName();
                        model.addRow(row);
                    }
                }
                if (health.getListOfTrainerOrg() != null) {
                    row[0] = "Trainer";
                    for (TrainerOrg trainerInfo : health.getListOfTrainerOrg()) {
                        row[0] = "Trainer";
                        row[1] = trainerInfo.getName();
                        row[2] = trainerInfo.getContact();
                        row[3] = network.getName();
                        model.addRow(row);
                    }
                }

            }
        }
    }

}
