package ui.SystemAdministration;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.BusinessEvent;
import Business.Model.EnterpriseDirectory;
import Business.Model.HealthClub;
import Business.Model.Hotel;
import Business.Model.Manager;
import Business.Model.Network;
import Business.Model.Restaurant;
import Business.Model.SystemAdmin;
import ui.main.Validator;

/**
 *
 * @author Hardik
 */

public class manageManagersJPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;

    public manageManagersJPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        for (Network network : systemAdmin.getListOfNetwork()) {
            cmbNetwork.addItem(network.getName());
        }
        populateTable();
      
        btnDelete.setOpaque(true);
       
        btnAdd.setOpaque(true);
        
        btnUpdate.setOpaque(true);
       
        btnBack.setOpaque(true);
    }

    public boolean validateName() {
        if (txtManagerName.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean PasswordName() {
        if (txtPassword.getText().matches("[a-zA-Z]{3}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : password should contain only 3 inputs");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageEnterpriseManagers = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtManagerName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        cmbEnterpriseType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbEnterpriseName = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblsysadmin = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(880, 550, 110, 39);

        tblManageEnterpriseManagers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblManageEnterpriseManagers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK NAME", "ENTERPRISE TYPE", "ENTERPRISE NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManageEnterpriseManagers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManageEnterpriseManagersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManageEnterpriseManagers);

        add(jScrollPane1);
        jScrollPane1.setBounds(600, 240, 610, 250);

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(190, 550, 121, 40);

        txtManagerName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtManagerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManagerNameActionPerformed(evt);
            }
        });
        add(txtManagerName);
        txtManagerName.setBounds(260, 390, 194, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ENTERPRISE");
        add(jLabel1);
        jLabel1.setBounds(60, 290, 161, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NETWORK");
        add(jLabel2);
        jLabel2.setBounds(60, 230, 102, 30);

        cmbNetwork.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a network" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });
        add(cmbNetwork);
        cmbNetwork.setBounds(260, 230, 194, 30);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(380, 550, 99, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("MANAGER NAME");
        add(jLabel3);
        jLabel3.setBounds(60, 390, 151, 30);

        txtUsername.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(txtUsername);
        txtUsername.setBounds(260, 440, 194, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("USERNAME");
        add(jLabel4);
        jLabel4.setBounds(60, 440, 102, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PASSWORD");
        add(jLabel5);
        jLabel5.setBounds(60, 480, 102, 30);

        txtPassword.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(txtPassword);
        txtPassword.setBounds(260, 480, 194, 30);

        cmbEnterpriseType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a enterprise", "Health Club", "Restaurant", "Hotel", "Business Event" }));
        cmbEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseTypeActionPerformed(evt);
            }
        });
        add(cmbEnterpriseType);
        cmbEnterpriseType.setBounds(260, 290, 194, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ENTERPRISE NAME");
        add(jLabel7);
        jLabel7.setBounds(60, 340, 173, 30);

        cmbEnterpriseName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbEnterpriseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecte name of enterprise" }));
        add(cmbEnterpriseName);
        cmbEnterpriseName.setBounds(260, 340, 194, 30);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsysadmin.setText("MANAGE ENTERPRISE MANAGERS");
        jPanel1.add(lblsysadmin);
        lblsysadmin.setBounds(450, 40, 455, 29);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(30, 20, 120, 50);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1420, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = tblManageEnterpriseManagers.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblManageEnterpriseManagers.getModel();
        String networkName = (String) model.getValueAt(selectedRowIndex, 0);
        String enterpriseType = (String) model.getValueAt(selectedRowIndex, 1);
        String enterpriseName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        Network network = systemAdmin.findNetwork(networkName);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseType.equals("Business Event")) {
            for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
                for (Manager man : event.getListOfManager()) {
                    if (man.getName().equals(selectedUser)) {
                        event.deleteManager(man);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        } else if (enterpriseType.equals("Restaurant")) {
            for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {
                for (Manager man : res.getListOfManager()) {
                    if (man.getName().equals(selectedUser)) {
                        res.deleteManager(man);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        } else if (enterpriseType.equals("Hotel")) {
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
                for (Manager man : hotel.getListOfManager()) {
                    if (man.getName().equals(selectedUser)) {
                        hotel.deleteManager(man);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtManagerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManagerNameActionPerformed

    }//GEN-LAST:event_txtManagerNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblManageEnterpriseManagers.getModel();
        Object row[] = new Object[10];
        String name = txtManagerName.getText();
        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        String networkName = cmbNetwork.getSelectedItem().toString();
        String enterpriseType1 = cmbEnterpriseType.getSelectedItem().toString();   //type of enterprises eg:healthclub
        String enterpriseName1 = cmbEnterpriseName.getSelectedItem().toString();
        String managerName = txtManagerName.getText();
        
        if (managerName == null) {
            JOptionPane.showMessageDialog(this, "Enter a Manager Name.");
            return;
        }
        
        if (!Validator.validateName(this, name) || !Validator.validateUserName(this, userName)
                || !Validator.validatePassword(this, password)) {
            return;
        }

        if (!systemAdmin.userExistsInSystem(userName)) {
            Network network = systemAdmin.findNetwork(networkName);  //finiding network
            EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
            if (enterpriseType1.equals("Health Club") && enterpriseDirec != null) {
                HealthClub healthclubName1 = enterpriseDirec.findHealthClub(enterpriseName1);
                healthclubName1.addManager(name, userName, password);
                systemAdmin.getUserNamePasswordMap();
                systemAdmin.addUser(userName, password, "Health Club");
                row[0] = networkName;
                row[1] = "Health Club";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
                return;
            } else if (enterpriseType1.equals("Business Event") && enterpriseDirec != null) {
                BusinessEvent event1 = enterpriseDirec.findEvent(enterpriseName1);
                event1.addManager(name, userName, password);
                systemAdmin.addUser(userName, password, "Business Event");
                row[0] = networkName;
                row[1] = "BusinessEvent";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            } else if (enterpriseType1.equals("Restaurant") && enterpriseDirec != null) {
                Restaurant res1 = enterpriseDirec.findRestaurant(enterpriseName1);
                res1.addManager(userName, userName, password);
                systemAdmin.addUser(userName, password, "Restaurant");

                row[0] = networkName;
                row[1] = "Restaurant";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            } else if (enterpriseType1.equals("Hotel") && enterpriseDirec != null) {
                Hotel hotel1 = enterpriseDirec.findHotel(enterpriseName1);
                hotel1.addManager(name, userName, password);
                systemAdmin.addUser(userName, password, "Hotel");
                row[0] = networkName;
                row[1] = "Hotel";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(this, String.format("This username '%s' already exists", userName));
        }
        JOptionPane.showMessageDialog(this, "Manager added successfully");
        txtManagerName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        cmbEnterpriseName.setSelectedIndex(0);
        cmbEnterpriseType.setSelectedIndex(0);
        cmbNetwork.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed

    }//GEN-LAST:event_cmbNetworkActionPerformed

    private void cmbEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseTypeActionPerformed
        cmbEnterpriseName.removeAllItems();
        String networkName = cmbNetwork.getSelectedItem().toString();
        Network network = systemAdmin.findNetwork(networkName);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        String enterpriseType1 = cmbEnterpriseType.getSelectedItem().toString();
        if (enterpriseType1.equals("Health Club")) {
            for (HealthClub club : enterpriseDirec.getListOfHealthClub()) {
                cmbEnterpriseName.addItem(club.getName());
            }
        } else if (enterpriseType1.equals("Business Event")) {
            for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
                cmbEnterpriseName.addItem(event.getName());
            }
        } else if (enterpriseType1.equals("Restaurant")) {
            for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {
                cmbEnterpriseName.addItem(res.getName());
            }
        } else if (enterpriseType1.equals("Hotel")) {
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
                cmbEnterpriseName.addItem(hotel.getName());
            }
        } else {
            return;
        }

    }//GEN-LAST:event_cmbEnterpriseTypeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (tblManageEnterpriseManagers.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        String networkName = cmbNetwork.getSelectedItem().toString();
        String enterpriseType1 = cmbEnterpriseType.getSelectedItem().toString();
        String enterpriseName1 = cmbEnterpriseName.getSelectedItem().toString();
        String managerUserName = txtUsername.getText();

        String password = txtPassword.getText();
        String name = txtManagerName.getText();

        Network network = systemAdmin.findNetwork(networkName);  //finiding network
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();

        if (enterpriseType1.equals("Health Club")) {
            HealthClub healthclubName1 = enterpriseDirec.findHealthClub(enterpriseName1);
            for (Manager man : healthclubName1.getListOfManager()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    systemAdmin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Business Event")) {
            BusinessEvent event1 = enterpriseDirec.findEvent(enterpriseName1);
            for (Manager man : event1.getListOfManager()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    systemAdmin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Hotel")) {
            Hotel hotel = enterpriseDirec.findHotel(enterpriseName1);
            for (Manager man : hotel.getListOfManager()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    systemAdmin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Restaurant")) {
            Restaurant res = enterpriseDirec.findRestaurant(enterpriseName1);
            for (Manager man : res.getListOfManager()) {
                if (man.getUsername().equals(managerUserName)) {
                    man.setName(name);
                    man.setPassword(password);

                    systemAdmin.updateUser(managerUserName, password);

                    populateTable();
                    JOptionPane.showMessageDialog(this, "Updated successfully ");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid enterprise [" + enterpriseType1 + "]");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblManageEnterpriseManagersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManageEnterpriseManagersMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblManageEnterpriseManagers.getModel();
        if (tblManageEnterpriseManagers.getSelectedRowCount() != 1) {
            return;
        }

        String networkName = model.getValueAt(tblManageEnterpriseManagers.getSelectedRow(), 0).toString();

        String eType = model.getValueAt(tblManageEnterpriseManagers.getSelectedRow(), 1).toString();
        String eName = model.getValueAt(tblManageEnterpriseManagers.getSelectedRow(), 2).toString();

        String managerName = model.getValueAt(tblManageEnterpriseManagers.getSelectedRow(), 3).toString();
        String managerUserName = model.getValueAt(tblManageEnterpriseManagers.getSelectedRow(), 4).toString();
        String managerPassword = model.getValueAt(tblManageEnterpriseManagers.getSelectedRow(), 5).toString();

        txtManagerName.setText(managerName);
        txtUsername.setText(managerUserName);
        txtPassword.setText(managerPassword);

        cmbNetwork.setSelectedItem(networkName);
        cmbEnterpriseName.setSelectedItem(eName);
        cmbEnterpriseType.setSelectedItem(eType);
    }//GEN-LAST:event_tblManageEnterpriseManagersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbEnterpriseName;
    private javax.swing.JComboBox<String> cmbEnterpriseType;
    private javax.swing.JComboBox<String> cmbNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTable tblManageEnterpriseManagers;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageEnterpriseManagers.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (Network network : systemAdmin.getListOfNetwork()) {        //populate network
            row[0] = network.getName();
            EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();  //populate enterpirse name
            for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {   //poplulate events enterprise
                row[1] = "Business Event";
                row[2] = event.getName();
                for (Manager manager : event.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Business Event";
                    row[2] = event.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }
            for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {   //poplulate restauarant enterprise
                row[1] = "Restaurant";
                row[2] = res.getName();
                for (Manager manager : res.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Restaurant";
                    row[2] = res.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {   //poplulate hotel enterprise
                row[1] = "Hotel";
                row[2] = hotel.getName();
                for (Manager manager : hotel.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Hotel";
                    row[2] = hotel.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }
            for (HealthClub health : enterpriseDirec.getListOfHealthClub()) {   //poplulate hotel enterprise
                row[1] = "Health Club";
                row[2] = health.getName();
                for (Manager manager : health.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Health Club";
                    row[2] = health.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }

        }
    }

}
