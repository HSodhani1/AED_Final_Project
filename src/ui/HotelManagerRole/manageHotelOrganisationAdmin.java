package ui.HotelManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.BusinessEvent;
import Business.Model.CateringService;
import Business.Model.DecorServices;
import Business.Model.EnterpriseDirectory;
import Business.Model.Hotel;
import Business.Model.LaundaryOrg;
import Business.Model.Manager;
import Business.Model.Network;
import Business.Model.PhotographyService;
import Business.Model.SystemAdmin;
import Business.Model.TransportationOrg;
import ui.main.Validator;

/**
 *
 * @author Aparna
 */

public class manageHotelOrganisationAdmin extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Network network;

    public manageHotelOrganisationAdmin(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Network network) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.network = network;
        txtNetwork.setText(network.getName());
        populateTable();
        
        
        btnDelete.setOpaque(true);
       
        btnAdd.setOpaque(true);
   
        btnUpdate.setOpaque(true);
       
        btnBack.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        cmbOrgType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHotelOrgAdmin = new javax.swing.JTable();
        cmbOrgName = new javax.swing.JComboBox<>();
        txtNetwork = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblsysadmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(90, 650, 132, 39);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName);
        txtName.setBounds(200, 200, 144, 30);

        cmbOrgType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laundary", "Transportation" }));
        cmbOrgType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgTypeActionPerformed(evt);
            }
        });
        add(cmbOrgType);
        cmbOrgType.setBounds(280, 470, 187, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ORGANIZATION TYPE");
        add(jLabel1);
        jLabel1.setBounds(40, 470, 190, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("NAME");
        add(jLabel6);
        jLabel6.setBounds(60, 210, 70, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NETWORK");
        add(jLabel2);
        jLabel2.setBounds(50, 410, 102, 22);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(300, 650, 99, 39);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ORGANIZATION NAME");
        add(jLabel3);
        jLabel3.setBounds(40, 540, 194, 22);
        add(txtUsername);
        txtUsername.setBounds(200, 270, 144, 30);
        add(txtPassword);
        txtPassword.setBounds(200, 340, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("USERNAME");
        add(jLabel4);
        jLabel4.setBounds(60, 280, 102, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PASSWORD");
        add(jLabel5);
        jLabel5.setBounds(60, 340, 102, 22);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(32, 23, 110, 31);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(860, 650, 100, 40);

        tblHotelOrgAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblHotelOrgAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK NAME", "ORGANIZATION TYPE", "ORGANIZATION NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHotelOrgAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHotelOrgAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHotelOrgAdmin);

        add(jScrollPane1);
        jScrollPane1.setBounds(520, 170, 710, 440);

        cmbOrgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgNameActionPerformed(evt);
            }
        });
        add(cmbOrgName);
        cmbOrgName.setBounds(280, 540, 187, 21);
        add(txtNetwork);
        txtNetwork.setBounds(200, 410, 177, 30);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsysadmin.setText("MANAGE HOTEL ORGANISATION ADMIN");
        jPanel1.add(lblsysadmin);
        lblsysadmin.setBounds(380, 30, 520, 29);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblHotelOrgAdmin.getModel();
        int selectedRowIndex = tblHotelOrgAdmin.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        String orgType = (String) model.getValueAt(selectedRowIndex, 1);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
            if (hotel.findManager(user) != null) {
                if (orgType.equals("Laundary") && hotel.getLaundaryOrg() != null) {
                    for (LaundaryOrg laundary : hotel.getLaundaryOrg()) {
                        if (laundary.getName().equals(OrgName)) {
                            for (Manager man : laundary.getListOfManager()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    laundary.deleteManager(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else if (orgType.equals("Transportation") && hotel.getTransportationOrgList() != null) {
                    for (TransportationOrg transportation : hotel.getTransportationOrgList()) {
                        if (transportation.getName().equals(OrgName)) {
                            for (Manager man : transportation.getListOfManager()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    transportation.deleteManager(man);
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblHotelOrgAdmin.getModel();
        Object row[] = new Object[20];
        String orgType = cmbOrgType.getSelectedItem().toString();
        String orgName1 = cmbOrgName.getSelectedItem().toString();
        String name = txtName.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String network1 = txtNetwork.getText();
        
         if (network1 == null) {
            JOptionPane.showMessageDialog(this, "Enter a Network.");
            return;
        }
         
        if (!Validator.validateName(this, name) || !Validator.validateUserName(this, username)
                || !Validator.validatePassword(this, password)) {
            return;
        }

        if (!systemAdmin.userExistsInSystem(username)) {

            EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
            List<Hotel> list = enterpriseDirec.getListOfHotel();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).findManager(user) != null) {    //if manager found for hotel enterprise
                    if (orgType.equals("Laundary")) {
                        List<LaundaryOrg> org1 = list.get(i).getLaundaryOrg();
                        for (int j = 0; j < org1.size(); j++) {
                            if (org1.get(j).getName().equals(orgName1)) {
                                org1.get(j).addManager(name, network.getName(), username, password); // add managers for each org
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                systemAdmin.addUser(username, password, "Laundary");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    } else if (orgType.equals("Transportation")) {
                        List<TransportationOrg> org2 = list.get(i).getTransportationOrgList();
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
                                systemAdmin.addUser(username, password, "Transportation");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, " This username already exists");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void cmbOrgTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgTypeActionPerformed
        String orgType = cmbOrgType.getSelectedItem().toString();
        cmbOrgName.removeAllItems();

        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        List<Hotel> list = enterpriseDirec.getListOfHotel();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findManager(user) != null) {
                if (orgType.equals("Laundary")) {
                    List<LaundaryOrg> org1 = list.get(i).getLaundaryOrg();
                    for (int j = 0; j < org1.size(); j++) {
                        cmbOrgName.addItem(org1.get(j).getName());
                        return;
                    }
                } else {
                    List<TransportationOrg> org3 = list.get(i).getTransportationOrgList();
                    for (int j = 0; j < org3.size(); j++) {
                        cmbOrgName.addItem(org3.get(j).getName());
                    }
                }
                return;
            }
        }

    }//GEN-LAST:event_cmbOrgTypeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (tblHotelOrgAdmin.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblHotelOrgAdmin.getModel();
        if (tblHotelOrgAdmin.getSelectedRowCount() == 1) {

            String orgType = cmbOrgType.getSelectedItem().toString();
            String orgname = cmbOrgName.getSelectedItem().toString();
            String userName = txtUsername.getText();
            String password = txtPassword.getText();

            EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
                if (orgType.equals("Laundary") && hotel.getLaundaryOrg() != null) {
                    for (LaundaryOrg laundary : hotel.getLaundaryOrg()) {
                        for (Manager man : laundary.getListOfManager()) {
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
                } else if (orgType.equals("Transportation") && hotel.getTransportationOrgList() != null) {
                    for (TransportationOrg trans : hotel.getTransportationOrgList()) {
                        for (Manager man : trans.getListOfManager()) {
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
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblHotelOrgAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHotelOrgAdminMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblHotelOrgAdmin.getModel();
        String city = model.getValueAt(tblHotelOrgAdmin.getSelectedRow(), 0).toString();
        String orgType = model.getValueAt(tblHotelOrgAdmin.getSelectedRow(), 1).toString();
        String oName = model.getValueAt(tblHotelOrgAdmin.getSelectedRow(), 2).toString();
        String managerName = model.getValueAt(tblHotelOrgAdmin.getSelectedRow(), 3).toString();
        String managerUsername = model.getValueAt(tblHotelOrgAdmin.getSelectedRow(), 4).toString();
        String managerPassword = model.getValueAt(tblHotelOrgAdmin.getSelectedRow(), 5).toString();

        txtName.setText(managerName);
        txtUsername.setText(managerUsername);
        txtPassword.setText(managerPassword);
        txtUsername.setEnabled(false);

        cmbOrgType.setSelectedItem(orgType);
        cmbOrgName.setSelectedItem(oName);
    }//GEN-LAST:event_tblHotelOrgAdminMouseClicked

    private void cmbOrgNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrgNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbOrgName;
    private javax.swing.JComboBox<String> cmbOrgType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTable tblHotelOrgAdmin;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNetwork;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblHotelOrgAdmin.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];

        Network network1 = systemAdmin.findNetwork(network.getName());
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseDirec == null) {
            return;
        }
        for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
            if (hotel.findManager(user) != null) {
                if (hotel.getLaundaryOrg() != null) {
                    row[0] = "Laundary";
                    for (LaundaryOrg laundary : hotel.getLaundaryOrg()) {
                        for (Manager manager : laundary.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Laundary";
                            row[2] = laundary.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getUsername();
                            row[5] = manager.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (hotel.getTransportationOrgList() != null) {
                    row[0] = "Transportation";
                    for (TransportationOrg transportation : hotel.getTransportationOrgList()) {
                        for (Manager manager : transportation.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Transportation";
                            row[2] = transportation.getName();
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
