package ui.RestaurantManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.DeliverymanOrg;
import Business.Model.EnterpriseDirectory;
import Business.Model.Network;
import Business.Model.Restaurant;
import Business.Model.SystemAdmin;
import ui.main.Validator;

/**
 *
 * @author Aparna
 */

public class manageRestaurantOrganisationPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private Network network;

    public manageRestaurantOrganisationPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Network network) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.network = network;
        //setBackground(new java.awt.Color(255, 204, 204));
        txtCity.setText(network.getName());
        txtCity.setEditable(false);

        
        deleteBtn.setOpaque(true);
       
        addButton.setOpaque(true);
        
        updateButton.setOpaque(true);
        
        backButton.setOpaque(true);

        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        txtCity = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORGANIZATION TYPE", "NAME", "CONTACT", "CITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane1.setBounds(180, 160, 810, 172);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("ORGANIZATION TYPE");
        add(jLabel1);
        jLabel1.setBounds(250, 390, 210, 34);

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organisation", "Deliveryman" }));
        add(orgCombo);
        orgCombo.setBounds(490, 400, 232, 27);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("NAME");
        add(jLabel2);
        jLabel2.setBounds(300, 450, 91, 22);

        nameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(nameField);
        nameField.setBounds(490, 450, 232, 27);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("CONTACT");
        add(jLabel3);
        jLabel3.setBounds(290, 510, 91, 22);

        txtContact.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(txtContact);
        txtContact.setBounds(490, 510, 232, 27);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("CITY");
        add(jLabel4);
        jLabel4.setBounds(300, 580, 82, 22);

        addButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton);
        addButton.setBounds(410, 650, 102, 39);
        add(txtCity);
        txtCity.setBounds(490, 569, 232, 30);

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn);
        deleteBtn.setBounds(870, 340, 110, 50);

        updateButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton);
        updateButton.setBounds(580, 650, 140, 39);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setText("MANAGE RESTAURANT ORGANISATION");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(430, 30, 509, 30);

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(30, 30, 92, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[20];
        String name = nameField.getText();
        String contact = txtContact.getText();
        String networkName = network.getName();
        String orgType1 = orgCombo.getSelectedItem().toString();      // org-type (delivery org)    
        EnterpriseDirectory enterpriseDirc = network.getEnterpriseDirectory();
        String City = txtCity.getText();
        
        if (contact == null || contact.length() < 10 || contact.length() > 10) {
            JOptionPane.showMessageDialog(this, "Invalid Contact Number");
            return;
        }
        
        if (City == null) {
            JOptionPane.showMessageDialog(this, "Enter a City.");
            return;
        }
        
        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Organization name should be at least 2 characters long.");
            return;
        }

        List<Restaurant> res = enterpriseDirc.getListOfRestaurants();
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i).findManager(user) != null) {     //find restaurant for which manager is working for   
                res.get(i).addDeliverymanOrg(name, contact, networkName);   //add deliveryman org name
                row[0] = orgType1;
                row[1] = name;
                row[2] = contact;
                row[3] = networkName;
                model.addRow(row);
                JOptionPane.showMessageDialog(this, "Organization added successfully");
                return;
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        String OrgType = (String) model.getValueAt(selectedRowIndex, 0);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 1);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {
            if (res.findManager(user) != null) {
                if (res.getListOfDeliveryManOrg() != null) {
                    for (DeliverymanOrg del : res.getListOfDeliveryManOrg()) {
                        if (del.getName().equals(OrgName)) {
                            del.deleteDeliveryman(del);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String orgType = orgCombo.getSelectedItem().toString();
        String orgname = model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {
            if (orgType.equals("Deliveryman") && res.getListOfDeliveryManOrg() != null) {
                for (DeliverymanOrg del : res.getListOfDeliveryManOrg()) {
                    if (del.getName().equals(orgname)) {
                        del.setName(nameField.getText());
                        del.setContact(txtContact.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() != 1) {
            return;
        }

        String orgType = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String orgName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String orgContact = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String orgCity = model.getValueAt(jTable1.getSelectedRow(), 3).toString();

        nameField.setText(orgName);
        txtContact.setText(orgContact);
        txtCity.setText(orgCity);
        orgCombo.setSelectedItem(orgType);
        txtCity.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        Network network1 = systemAdmin.findNetwork(network.getName());
        EnterpriseDirectory enterpriseDirec = network1.getEnterpriseDirectory();
        for (Restaurant restaurant : enterpriseDirec.getListOfRestaurants()) {
            if (restaurant.findManager(user) != null) {
                if (restaurant.getListOfDeliveryManOrg() != null) {
                    row[0] = "Deliveryman";
                    for (DeliverymanOrg delivery : restaurant.getListOfDeliveryManOrg()) {
                        row[0] = "Deliveryman";
                        row[1] = delivery.getName();
                        row[2] = delivery.getContact();
                        row[3] = network1.getName();
                        model.addRow(row);
                    }
                }
            }
        }
    }
}
