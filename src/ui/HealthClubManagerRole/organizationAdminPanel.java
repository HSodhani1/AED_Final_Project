package ui.HealthClubManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.EnterpriseDirectory;
import Business.Model.HealthClub;
import Business.Model.Manager;
import Business.Model.Network;
import Business.Model.PhysicianOrg;
import Business.Model.SystemAdmin;
import Business.Model.TherapistOrg;
import Business.Model.TrainerOrg;
import ui.main.Validator;

/**
 *
 * @author Hardik
 */

public class organizationAdminPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Network network;

    public organizationAdminPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Network network) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.network = network;
        txtNetwork.setText(network.getName());
        txtNetwork.setEditable(false);
        populateTable();
        
       
        updateButton.setOpaque(true);
        
        btnBack.setOpaque(true);
       
        btnDelete.setOpaque(true);
        
        addButton.setOpaque(true);
    }

    public boolean validateName() {
        if (txtName.getText().matches("[a-zA-Z]{2,19}") && txtName.getText() != null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean PasswordName() {
        if (txtPassword.getText().matches("[a-zA-Z]{3,}") && txtPassword.getText() != null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : password should contain more than 3 or more letters");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHealthAdmin = new javax.swing.JTable();
        lblOrgType = new javax.swing.JLabel();
        cmbOrgType = new javax.swing.JComboBox<>();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblOrgName = new javax.swing.JLabel();
        cmbOrgName = new javax.swing.JComboBox<>();
        lblNetwork = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        txtNetwork = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        tblHealthAdmin.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblHealthAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK", "ORGNANIZATION TYPE", "ORGANIZATION NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHealthAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHealthAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHealthAdmin);

        add(jScrollPane1);
        jScrollPane1.setBounds(580, 160, 580, 340);

        lblOrgType.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblOrgType.setText("ORGANIZATION TYPE");
        add(lblOrgType);
        lblOrgType.setBounds(40, 410, 192, 22);

        cmbOrgType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbOrgType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Physician", "Trainer", "Therapist" }));
        cmbOrgType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgTypeActionPerformed(evt);
            }
        });
        add(cmbOrgType);
        cmbOrgType.setBounds(260, 410, 199, 27);

        lblName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblName.setText("NAME");
        add(lblName);
        lblName.setBounds(50, 160, 100, 30);

        txtName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(txtName);
        txtName.setBounds(230, 160, 220, 30);

        lblUsername.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblUsername.setText("USERNAME");
        add(lblUsername);
        lblUsername.setBounds(50, 220, 140, 30);
        add(txtUsername);
        txtUsername.setBounds(230, 220, 220, 30);

        lblPassword.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblPassword.setText("PASSWORD");
        add(lblPassword);
        lblPassword.setBounds(50, 280, 140, 30);
        add(txtPassword);
        txtPassword.setBounds(230, 280, 220, 30);

        addButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(90, 560, 155, 40);

        btnDelete.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(830, 550, 120, 40);

        lblOrgName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblOrgName.setText("ORGANIZATION NAME ");
        add(lblOrgName);
        lblOrgName.setBounds(40, 470, 220, 22);

        cmbOrgName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(cmbOrgName);
        cmbOrgName.setBounds(260, 470, 202, 27);

        lblNetwork.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblNetwork.setText("NETWORK");
        add(lblNetwork);
        lblNetwork.setBounds(50, 340, 101, 22);

        updateButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton);
        updateButton.setBounds(290, 560, 122, 40);
        add(txtNetwork);
        txtNetwork.setBounds(230, 340, 220, 30);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(40, 30, 90, 38);

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeading.setText("MANAGE ORGANIZATION ADMIN");
        jPanel1.add(lblHeading);
        lblHeading.setBounds(440, 0, 490, 90);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1220, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblHealthAdmin.getModel();
        Object row[] = new Object[20];
        String orgType = cmbOrgType.getSelectedItem().toString();
        String orgName1 = cmbOrgName.getSelectedItem().toString();
        String name = txtName.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String Network = txtNetwork.getText();
        
        if (txtNetwork == null) {
            JOptionPane.showMessageDialog(this, "Enter a Network.");
            return;
        }

        if (!Validator.validateName(this, name) || !Validator.validateUserName(this, username)
                || !Validator.validatePassword(this, password)) {
            return;
        }
        
        if (name == null){
            JOptionPane.showMessageDialog(this, "Enter Name");
            return;
        }
        
        if (Network == null){
            JOptionPane.showMessageDialog(this, "Enter Network");
            return;
        }

        if (!systemAdmin.userExistsInSystem(username)) {

            EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
            List<HealthClub> list = enterpriseDirec.getListOfHealthClub();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).findManager(user) != null) {    //if health club manager found in network
                    if (orgType.equals("Physician")) {
                        List<PhysicianOrg> org1 = list.get(i).getListOfPhysicianOrg();
                        for (int j = 0; j < org1.size(); j++) {
                            if (org1.get(j).getName().equals(orgName1)) {
                                org1.get(j).addManager(name, network.getName(), username, password); //add managers for each org (eg:physiican org)
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                systemAdmin.addUser(username, password, "Physician");
                                JOptionPane.showMessageDialog(this, "Successfully added Physician organization");
                                return;
                            }
                        }
                    } else if (orgType.equals("Trainer")) {
                        List<TrainerOrg> org2 = list.get(i).getListOfTrainerOrg();
                        for (int j = 0; j < org2.size(); j++) {
                            if (org2.get(j).getName().equals(orgName1)) {
                                org2.get(j).addManager(name, network.getName(), username, password);
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                systemAdmin.addUser(username, password, "Trainer");
                                JOptionPane.showMessageDialog(this, "Successfully added Trainer organization");
                                return;
                            }
                        }
                    } else {
                        List<TherapistOrg> org3 = list.get(i).getListOfTherapistOrg();
                        for (int j = 0; j < org3.size(); j++) {
                            if (org3.get(j).getName().equals(orgName1)) {
                                org3.get(j).addManager(name, network.getName(), username, password);
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                systemAdmin.addUser(username, password, "Therapist");
                                JOptionPane.showMessageDialog(this, "Successfully added Therapist organization");
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, " username already exits");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void cmbOrgTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgTypeActionPerformed
        cmbOrgName.removeAllItems();
        String orgType = cmbOrgType.getSelectedItem().toString();

        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        List<HealthClub> list = enterpriseDirec.getListOfHealthClub();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findManager(user) != null) {
                if (orgType.equals("Physician")) {
                    List<PhysicianOrg> org1 = list.get(i).getListOfPhysicianOrg();
                    for (int j = 0; j < org1.size(); j++) {
                        cmbOrgName.addItem(org1.get(j).getName());
                    }
                } else if (orgType.equals("Trainer")) {
                    List<TrainerOrg> org2 = list.get(i).getListOfTrainerOrg();
                    for (int j = 0; j < org2.size(); j++) {
                        cmbOrgName.addItem(org2.get(j).getName());
                    }
                } else {
                    List<TherapistOrg> org3 = list.get(i).getListOfTherapistOrg();
                    for (int j = 0; j < org3.size(); j++) {
                        cmbOrgName.addItem(org3.get(j).getName());
                    }
                }
                return;
            }
        }

    }//GEN-LAST:event_cmbOrgTypeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblHealthAdmin.getModel();
        int selectedRowIndex = tblHealthAdmin.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        String orgType = (String) model.getValueAt(selectedRowIndex, 1);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        EnterpriseDirectory enterpDirectory = network.getEnterpriseDirectory();
        for (HealthClub club : enterpDirectory.getListOfHealthClub()) {
            if (club.findManager(user) != null) {
                if (orgType.equals("Therapist") && club.getListOfTherapistOrg() != null) {
                    for (TherapistOrg therapist : club.getListOfTherapistOrg()) {
                        if (therapist.getName().equals(OrgName)) {
                            for (Manager man : therapist.getListOfManager()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    therapist.deleteManager(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else if (orgType.equals("Physician") && club.getListOfPhysicianOrg() != null) {
                    for (PhysicianOrg physician : club.getListOfPhysicianOrg()) {
                        if (physician.getName().equals(OrgName)) {
                            for (Manager man : physician.getListOfManager()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    physician.deleteManager(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    for (TrainerOrg trainer : club.getListOfTrainerOrg()) {
                        if (trainer.getName().equals(OrgName)) {
                            for (Manager man : trainer.getListOfManager()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    trainer.deleteManager(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblHealthAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHealthAdminMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblHealthAdmin.getModel();
        String city = model.getValueAt(tblHealthAdmin.getSelectedRow(), 0).toString();
        String orgType = model.getValueAt(tblHealthAdmin.getSelectedRow(), 1).toString();
        String oName = model.getValueAt(tblHealthAdmin.getSelectedRow(), 2).toString();
        String managerName = model.getValueAt(tblHealthAdmin.getSelectedRow(), 3).toString();
        String managerUsername = model.getValueAt(tblHealthAdmin.getSelectedRow(), 4).toString();
        String managerPassword = model.getValueAt(tblHealthAdmin.getSelectedRow(), 5).toString();

        txtName.setText(managerName);
        txtUsername.setText(managerUsername);
        txtPassword.setText(managerPassword);
        txtUsername.setEnabled(false);
        cmbOrgType.setSelectedItem(orgType);
        cmbOrgName.setSelectedItem(oName);
    }//GEN-LAST:event_tblHealthAdminMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (tblHealthAdmin.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblHealthAdmin.getModel();
        if (tblHealthAdmin.getSelectedRowCount() == 1) {

            String orgType = cmbOrgType.getSelectedItem().toString();
            String orgname = cmbOrgName.getSelectedItem().toString();
            String userName = txtUsername.getText();
            String password = txtPassword.getText();

            EnterpriseDirectory enterpDirectory = network.getEnterpriseDirectory();
            for (HealthClub club : enterpDirectory.getListOfHealthClub()) {
                if (orgType.equals("Physician") && club.getListOfPhysicianOrg() != null) {
                    for (PhysicianOrg phy : club.getListOfPhysicianOrg()) {
                        for (Manager man : phy.getListOfManager()) {
                            if (man.getUsername().equals(txtUsername.getText())) {
                                man.setName(txtName.getText());
                                man.setPassword(txtPassword.getText());
                                systemAdmin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else if (orgType.equals("Therapist") && club.getListOfTherapistOrg() != null) {
                    for (TherapistOrg thera : club.getListOfTherapistOrg()) {
                        for (Manager man : thera.getListOfManager()) {
                            if (man.getUsername().equals(txtUsername.getText())) {
                                man.setName(txtName.getText());
                                man.setPassword(txtPassword.getText());
                                systemAdmin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else if (orgType.equals("Trainer") && club.getListOfTrainerOrg() != null) {
                    for (TrainerOrg trainer : club.getListOfTrainerOrg()) {
                        for (Manager man : trainer.getListOfManager()) {
                            if (man.getUsername().equals(txtUsername.getText())) {
                                man.setName(txtName.getText());
                                man.setPassword(txtPassword.getText());
                                systemAdmin.updateUser(userName, password);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid organization");
                }
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> cmbOrgName;
    private javax.swing.JComboBox<String> cmbOrgType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblOrgName;
    private javax.swing.JLabel lblOrgType;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblHealthAdmin;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNetwork;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblHealthAdmin.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = cmbOrgType.getSelectedItem().toString();
        Network network1 = systemAdmin.findNetwork(network.getName());
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseDirec == null) {
            return;
        }
        for (HealthClub health : enterpriseDirec.getListOfHealthClub()) {
            if (health.findManager(user) != null) {
                if (health.getListOfPhysicianOrg() != null) {
                    row[0] = "Physician";
                    for (PhysicianOrg physicianInfo : health.getListOfPhysicianOrg()) {
                        for (Manager manager : physicianInfo.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Physician";
                            row[2] = physicianInfo.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getUsername();
                            row[5] = manager.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (health.getListOfTherapistOrg() != null) {
                    row[0] = "Therapist";
                    for (TherapistOrg therapistInfo : health.getListOfTherapistOrg()) {
                        for (Manager manager : therapistInfo.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Therapist";
                            row[2] = therapistInfo.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getUsername();
                            row[5] = manager.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (health.getListOfTrainerOrg() != null) {
                    row[0] = "Trainer";
                    for (TrainerOrg trainerInfo : health.getListOfTrainerOrg()) {
                        for (Manager manager : trainerInfo.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Trainer";
                            row[2] = trainerInfo.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getUsername();
                            row[5] = manager.getPassword();
                            model.addRow(row);
                        }
                    }
                }

            }
        }
    }
}
