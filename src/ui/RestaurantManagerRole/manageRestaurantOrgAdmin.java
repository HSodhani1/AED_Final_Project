package ui.RestaurantManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.DeliverymanOrg;
import Business.Model.EnterpriseDirectory;
import Business.Model.Manager;
import Business.Model.Network;
import Business.Model.Restaurant;
import Business.Model.SystemAdmin;
import ui.main.Validator;

/**
 *
 * @author Aparna
 */

public class manageRestaurantOrgAdmin extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private Network network;

    public manageRestaurantOrgAdmin(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Network network) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.network = network;
        txtNetworkName.setText(network.getName());
        txtNetworkName.setEditable(false);

        populateTable();
        
        deleteBtn.setOpaque(true);
        
        addButton.setOpaque(true);
        
        updateButton.setOpaque(true);
        
        backBtn.setOpaque(true);
    }

//    public boolean validateName() {
//        if (nameField.getText() != null && nameField.getText().matches("[a-zA-Z]{2,19}")) {
//            return true;
//        } else {
//            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
//            return false;
//        }
//    }
//
//    public boolean validatePassword() {
//        if (passwordField.getText() != null && passwordField.getText().matches("[a-zA-Z]{3,}")) {
//            return true;
//        } else {
//            JOptionPane.showMessageDialog(this, "Invalid input : password should contain 3 or more letters");
//            return false;
//        }
//    }
//
//    public boolean validateUserName() {
//        if (usernameField.getText() != null && usernameField.getText().length() > 1) {
//            return true;
//        }
//        JOptionPane.showMessageDialog(this, "Invalid input : username should contain 2 or more charactewrs");
//        return false;
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orgName = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        orgCombo = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        txtNetworkName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(280, 150, 764, 171);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("NETWORK");
        add(jLabel1);
        jLabel1.setBounds(210, 410, 103, 22);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("ORGANIZATION TYPE");
        add(jLabel2);
        jLabel2.setBounds(210, 480, 210, 22);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("ORGANIZATION NAME");
        add(jLabel3);
        jLabel3.setBounds(210, 550, 220, 22);

        orgName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(orgName);
        orgName.setBounds(440, 550, 197, 27);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("NAME");
        add(jLabel4);
        jLabel4.setBounds(740, 410, 60, 22);

        nameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(nameField);
        nameField.setBounds(890, 410, 182, 27);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("USERNAME");
        add(jLabel5);
        jLabel5.setBounds(740, 480, 130, 22);

        usernameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(usernameField);
        usernameField.setBounds(890, 480, 182, 27);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("PASSWORD");
        add(jLabel6);
        jLabel6.setBounds(740, 550, 140, 22);

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(passwordField);
        passwordField.setBounds(890, 550, 182, 27);

        addButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(530, 650, 143, 41);

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deliveryman" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });
        add(orgCombo);
        orgCombo.setBounds(440, 480, 197, 27);

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(900, 340, 114, 37);

        updateButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton);
        updateButton.setBounds(730, 650, 130, 41);

        txtNetworkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetworkNameActionPerformed(evt);
            }
        });
        add(txtNetworkName);
        txtNetworkName.setBounds(440, 409, 197, 30);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("MANAGE ORGANIZATION ADMIN FOR RESTAURANT");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(410, 30, 520, 40);

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn);
        backBtn.setBounds(60, 30, 98, 42);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1260, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[20];
        String orgType = orgCombo.getSelectedItem().toString();
        String orgName1 = orgName.getSelectedItem().toString();
        String name = nameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();
        String network1 = txtNetworkName.getText();
        
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
            List<Restaurant> list = enterpriseDirec.getListOfRestaurants();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).findManager(user) != null) {    //if manager found 
                    if (orgType.equals("Deliveryman")) {
                        List<DeliverymanOrg> org1 = list.get(i).getListOfDeliveryManOrg();
                        for (int j = 0; j < org1.size(); j++) {
                            if (org1.get(j).getName().equals(orgName1)) {
                                org1.get(j).addManager(name, network.getName(), username, password);  // add manager for deliveryman org
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = username;
                                row[5] = password;
                                model.addRow(row);
                                systemAdmin.addUser(username, password, "Deliveryman");
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

        nameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        String orgType = (String) orgCombo.getSelectedItem();
        orgName.removeAllItems();

        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        List<Restaurant> list = enterpriseDirec.getListOfRestaurants();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findManager(user) != null) {
                if (orgType.equals("Deliveryman")) {
                    List<DeliverymanOrg> org1 = list.get(i).getListOfDeliveryManOrg();
                    for (int j = 0; j < org1.size(); j++) {
                        orgName.addItem(org1.get(j).getName());
                    }
                }
                return;
            }
        }
    }//GEN-LAST:event_orgComboActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        String orgType = (String) model.getValueAt(selectedRowIndex, 1);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {
            if (res.findManager(user) != null) {
                if (res.getListOfDeliveryManOrg() != null) {
                    for (DeliverymanOrg del : res.getListOfDeliveryManOrg()) {
                        if (del.getName().equals(OrgName)) {
                            for (Manager man : del.getListOfManager()) {
                                if (man.getUsername().equals(selectedUser)) {
                                    del.deleteManager(man);
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
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String city = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String orgType = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String oName = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String managerName = model.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String managerUsername = model.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String managerPassword = model.getValueAt(jTable1.getSelectedRow(), 5).toString();

        nameField.setText(managerName);
        usernameField.setText(managerUsername);
        passwordField.setText(managerPassword);
        usernameField.setEnabled(false);
        txtNetworkName.setText(city);
        orgCombo.setSelectedItem(orgType);
        orgName.setSelectedItem(oName);
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (jTable1.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {

            String orgType = orgCombo.getSelectedItem().toString();
            String orgname = orgName.getSelectedItem().toString();
            String userName = usernameField.getText();
            String password = passwordField.getText();

            EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
            for (Restaurant rest : enterpriseDirec.getListOfRestaurants()) {
                if (orgType.equals("Deliveryman") && rest.getListOfDeliveryManOrg() != null) {
                    for (DeliverymanOrg del : rest.getListOfDeliveryManOrg()) {
                        for (Manager man : del.getListOfManager()) {
                            if (man.getUsername().equals(usernameField.getText())) {
                                man.setName(nameField.getText());
                                man.setPassword(passwordField.getText());
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

    private void txtNetworkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetworkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNetworkNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JComboBox<String> orgName;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField txtNetworkName;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        Network network1 = systemAdmin.findNetwork(network.getName());
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseDirec == null) {
            return;
        }
        for (Restaurant restaurant : enterpriseDirec.getListOfRestaurants()) {
            if (restaurant.findManager(user) != null) {
                if (restaurant.getListOfDeliveryManOrg() != null) {
                    row[0] = "Deliveryman";
                    for (DeliverymanOrg delivery : restaurant.getListOfDeliveryManOrg()) {
                        for (Manager manager : delivery.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Deliveryman";
                            row[2] = delivery.getName();
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
