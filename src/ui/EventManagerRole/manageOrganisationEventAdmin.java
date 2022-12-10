package ui.EventManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.BusinessEvent;
import Business.Model.CateringService;
import Business.Model.DecorServices;
import Business.Model.EnterpriseDirectory;
import Business.Model.Manager;
import Business.Model.Network;
import Business.Model.PhotographyService;
import Business.Model.SystemAdmin;
import ui.main.Validator;

/**
 *
 * @author Shreya
 */

public class manageOrganisationEventAdmin extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Network network;

    public manageOrganisationEventAdmin(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Network network) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.network = network;
        txtNetwork.setText(network.getName());
        txtNetwork.setEditable(false);
        populateTable();
       
        
        btnDelete.setOpaque(true);
        
        btnAdd.setOpaque(true);
        
        btnUpdate.setOpaque(true);
        
        btnBack.setOpaque(true);
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

        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageOrgAdmin = new javax.swing.JTable();
        cmbOrg = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        cmbOrgName = new javax.swing.JComboBox<>();
        txtNetwork = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("NAME");
        add(jLabel6);
        jLabel6.setBounds(130, 230, 90, 22);
        add(txtUsername);
        txtUsername.setBounds(260, 290, 180, 19);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName);
        txtName.setBounds(260, 230, 180, 19);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ORGANIZATION TYPE ");
        add(jLabel2);
        jLabel2.setBounds(30, 470, 190, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("NETWORK");
        add(jLabel7);
        jLabel7.setBounds(130, 400, 130, 22);
        add(txtPassword);
        txtPassword.setBounds(260, 340, 180, 19);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("USERNAME");
        add(jLabel4);
        jLabel4.setBounds(130, 290, 110, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PASSWORD");
        add(jLabel5);
        jLabel5.setBounds(130, 340, 110, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ORGANIZATION NAME");
        add(jLabel3);
        jLabel3.setBounds(30, 520, 200, 22);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(860, 610, 100, 31);

        tblManageOrgAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblManageOrgAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK", "ORGANIZATION TYPE", "ORGANIZATION NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManageOrgAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManageOrgAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManageOrgAdmin);

        add(jScrollPane1);
        jScrollPane1.setBounds(550, 210, 620, 350);

        cmbOrg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbOrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decor", "Photography", "Catering" }));
        cmbOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgActionPerformed(evt);
            }
        });
        add(cmbOrg);
        cmbOrg.setBounds(260, 470, 200, 25);

        btnAdd.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(120, 610, 140, 33);

        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(330, 610, 110, 33);

        cmbOrgName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbOrgName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select organisation Name" }));
        add(cmbOrgName);
        cmbOrgName.setBounds(260, 520, 200, 25);
        add(txtNetwork);
        txtNetwork.setBounds(260, 400, 220, 19);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE ORGANISATION ADMIN FOR EVENTS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 40, 590, 29);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(80, 40, 100, 31);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1520, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblManageOrgAdmin.getModel();
        int selectedRowIndex = tblManageOrgAdmin.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        String orgType = (String) model.getValueAt(selectedRowIndex, 1);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
            if (event.findManager(user) != null) {
                if (orgType.equals("Catering") && event.getListOfCatering() != null) {
                    for (CateringService catering : event.getListOfCatering()) {
                        if (catering.getName().equals(OrgName)) {
                            for (Manager man : catering.getListOfManager()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    catering.deleteManager(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else if (orgType.equals("Decor") && event.getListOfDecors() != null) {
                    for (DecorServices decor : event.getListOfDecors()) {
                        if (decor.getName().equals(OrgName)) {
                            for (Manager man : decor.getListOfManager()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    decor.deleteManager(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    for (PhotographyService photo : event.getListOfPhotographyServices()) {
                        if (photo.getName().equals(OrgName)) {
                            for (Manager man : photo.getListOfManager()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    photo.deleteManager(man);
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblManageOrgAdmin.getModel();
        Object row[] = new Object[20];
        String orgType = cmbOrg.getSelectedItem().toString();
        String orgName1 = cmbOrgName.getSelectedItem().toString();
        String name = txtName.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        if (!Validator.validateName(this, name) || !Validator.validateUserName(this, username)
                || !Validator.validatePassword(this, password)) {
            return;
        }
        
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        List<BusinessEvent> list = enterpriseDirec.getListOfEvents();
        if (!systemAdmin.userExistsInSystem(username)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).findManager(user) != null) {    //if enterpirse manager found 
                    if (orgType.equals("Catering")) {
                        List<CateringService> org1 = list.get(i).getListOfCatering();    // add organisation managers for each org
                        for (int j = 0; j < org1.size(); j++) {
                            if (org1.get(j).getName().equals(orgName1)) {
                                org1.get(j).addManager(name, network.getName(), username, password);
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                systemAdmin.addUser(username, password, "Catering");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    } else if (orgType.equals("Decor")) {
                        List<DecorServices> org2 = list.get(i).getListOfDecors();

                        for (int j = 0; j < org2.size(); j++) {
                            System.out.println(org2.get(i).getName() + "name of decor org");
                            if (org2.get(j).getName().equals(orgName1)) {
                                org2.get(j).addManager(name, network.getName(), username, password);
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                systemAdmin.addUser(username, password, "Decor");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    } else {
                        List<PhotographyService> org3 = list.get(i).getListOfPhotographyServices();
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
                                systemAdmin.addUser(username, password, "Photography");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "username already exists");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void cmbOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgActionPerformed
        cmbOrgName.removeAllItems();

        String orgType = cmbOrg.getSelectedItem().toString();
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        List<BusinessEvent> list = enterpriseDirec.getListOfEvents();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findManager(user) != null) {
                if (orgType.equals("Catering")) {
                    List<CateringService> org1 = list.get(i).getListOfCatering();
                    for (int j = 0; j < org1.size(); j++) {
                        cmbOrgName.addItem(org1.get(j).getName());
                    }
                } else if (orgType.equals("Decor")) {
                    List<DecorServices> org2 = list.get(i).getListOfDecors();
                    for (int j = 0; j < org2.size(); j++) {
                        cmbOrgName.addItem(org2.get(j).getName());
                    }
                } else {
                    List<PhotographyService> org3 = list.get(i).getListOfPhotographyServices();
                    for (int j = 0; j < org3.size(); j++) {
                        cmbOrgName.addItem(org3.get(j).getName());
                    }
                }
                return;
            }
        }
    }//GEN-LAST:event_cmbOrgActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblManageOrgAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManageOrgAdminMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblManageOrgAdmin.getModel();
        String city = model.getValueAt(tblManageOrgAdmin.getSelectedRow(), 0).toString();
        String orgType = model.getValueAt(tblManageOrgAdmin.getSelectedRow(), 1).toString();
        String oName = model.getValueAt(tblManageOrgAdmin.getSelectedRow(), 2).toString();
        String managerName = model.getValueAt(tblManageOrgAdmin.getSelectedRow(), 3).toString();
        String managerUsername = model.getValueAt(tblManageOrgAdmin.getSelectedRow(), 4).toString();
        String managerPassword = model.getValueAt(tblManageOrgAdmin.getSelectedRow(), 5).toString();

        txtName.setText(managerName);
        txtUsername.setText(managerUsername);
        txtPassword.setText(managerPassword);
        txtUsername.setEnabled(false);
        cmbOrg.setSelectedItem(orgType);
        cmbOrgName.setSelectedItem(oName);

    }//GEN-LAST:event_tblManageOrgAdminMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (tblManageOrgAdmin.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblManageOrgAdmin.getModel();
        if (tblManageOrgAdmin.getSelectedRowCount() == 1) {

            String orgType = cmbOrg.getSelectedItem().toString();
            String orgname = cmbOrgName.getSelectedItem().toString();
            String userName = txtUsername.getText();
            String password = txtPassword.getText();

            EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
            for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
                if (orgType.equals("Catering") && event.getListOfCatering() != null) {
                    for (CateringService catering : event.getListOfCatering()) {
                        for (Manager man : catering.getListOfManager()) {
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
                } else if (orgType.equals("Decor") && event.getListOfDecors() != null) {
                    for (DecorServices decor : event.getListOfDecors()) {
                        for (Manager man : decor.getListOfManager()) {
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
                } else if (orgType.equals("Photography") && event.getListOfPhotographyServices() != null) {
                    for (PhotographyService photo : event.getListOfPhotographyServices()) {
                        for (Manager man : photo.getListOfManager()) {
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

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbOrg;
    private javax.swing.JComboBox<String> cmbOrgName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManageOrgAdmin;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNetwork;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageOrgAdmin.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = cmbOrg.getSelectedItem().toString();
        Network network1 = systemAdmin.findNetwork(network.getName());
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseDirec == null) {
            return;
        }
        for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
            if (event.findManager(user) != null) {
                if (event.getListOfCatering() != null) {
                    row[0] = "Catering";
                    for (CateringService catering : event.getListOfCatering()) {
                        for (Manager manager : catering.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Catering";
                            row[2] = catering.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getUsername();
                            row[5] = manager.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (event.getListOfDecors() != null) {
                    row[0] = "Decor";
                    for (DecorServices decor : event.getListOfDecors()) {
                        for (Manager manager : decor.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Decor";
                            row[2] = decor.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getUsername();
                            row[5] = manager.getPassword();
                            model.addRow(row);
                        }
                    }
                }
                if (event.getListOfPhotographyServices() != null) {
                    row[0] = "Photography";
                    for (PhotographyService photo : event.getListOfPhotographyServices()) {
                        for (Manager manager : photo.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Photography";
                            row[2] = photo.getName();
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
