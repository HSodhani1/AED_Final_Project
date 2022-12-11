package ui.HotelManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.EnterpriseDirectory;
import Business.Model.Hotel;
import Business.Model.LaundaryOrg;
import Business.Model.Network;
import Business.Model.SystemAdmin;
import Business.Model.TransportationOrg;

/**
 *
 * @author Aparna
 */

public class manageHotelOrganisation extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private Network network;

    public manageHotelOrganisation(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Network network) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.network = network;
        
        txtCity.setText(network.getName());
        txtCity.setEditable(false);

        
        btnDelete.setOpaque(true);
        
        btnAdd.setOpaque(true);
        
        btnUpdate.setOpaque(true);
        
        btnBack.setOpaque(true);

        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cmbOrgType = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtCity = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblsysadmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        jScrollPane1.setBounds(620, 200, 600, 320);

        cmbOrgType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbOrgType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organisation ", "Laundary", "Transportation" }));
        cmbOrgType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgTypeActionPerformed(evt);
            }
        });
        add(cmbOrgType);
        cmbOrgType.setBounds(290, 220, 212, 25);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(310, 550, 120, 41);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CONTACT");
        add(jLabel3);
        jLabel3.setBounds(30, 330, 102, 22);
        add(txtContact);
        txtContact.setBounds(290, 340, 200, 30);

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(120, 550, 114, 41);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName);
        txtName.setBounds(290, 279, 200, 30);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(25, 25, 110, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("NAME");
        add(jLabel1);
        jLabel1.setBounds(30, 280, 70, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CITY");
        add(jLabel6);
        jLabel6.setBounds(30, 400, 39, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ORGANISATION TYPE ");
        add(jLabel2);
        jLabel2.setBounds(30, 220, 200, 22);

        btnDelete.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(890, 560, 120, 40);
        add(txtCity);
        txtCity.setBounds(290, 400, 200, 30);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsysadmin.setText("MANAGE ORGANISATION FOR HOTEL");
        jPanel1.add(lblsysadmin);
        lblsysadmin.setBounds(420, 30, 570, 29);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1310, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbOrgTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgTypeActionPerformed

    }//GEN-LAST:event_cmbOrgTypeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[20];
        String networkName = network.getName(); //find the network from city-combobox
        String name = txtName.getText();
        String contact = txtContact.getText();

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Organization name should be at least 2 characters long.");
            return;
        }

        String orgType1 = cmbOrgType.getSelectedItem().toString();      // org-type (physician org)     
        EnterpriseDirectory enterpriseDirc = network.getEnterpriseDirectory();
        List<Hotel> hotel = enterpriseDirc.getListOfHotel();

        for (int i = 0; i < hotel.size(); i++) {
            hotel.get(i).findManager(user);      //find healthclub for which manager is working for
            if (orgType1.equals("Laundary")) {
                hotel.get(i).addLaundaryOrg(name, contact, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = contact;
                row[3] = networkName;
                model.addRow(row);
                JOptionPane.showMessageDialog(this, " Organisation added successfully");
                return;                               //healthclub found
            } else {
                hotel.get(i).addTransportationOrg(name, contact, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = contact;
                row[3] = networkName;
                model.addRow(row);
                JOptionPane.showMessageDialog(this, "Organisation added successfully");
                return;
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        String OrgType = (String) model.getValueAt(selectedRowIndex, 0);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 1);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
            if (hotel.findManager(user) != null) {
                if (OrgType.equals("Laundary") && hotel.getLaundaryOrg() != null) {
                    for (LaundaryOrg laundary : hotel.getLaundaryOrg()) {
                        if (laundary.getName().equals(OrgName)) {
                            hotel.deleteLaundary(laundary);

                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (hotel.getTransportationOrgList() != null) {
                    for (TransportationOrg transport : hotel.getTransportationOrgList()) {
                        if (transport.getName().equals(OrgName)) {
                            hotel.deleteTransportation(transport);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else {
                    return;
                }

            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String orgType = cmbOrgType.getSelectedItem().toString();
        String orgname = model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
            if (orgType.equals("Laundary") && hotel.getLaundaryOrg() != null) {
                for (LaundaryOrg laundary : hotel.getLaundaryOrg()) {
                    if (laundary.getName().equals(orgname)) {
                        laundary.setName(txtName.getText());
                        laundary.setContact(txtContact.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Transportation") && hotel.getTransportationOrgList() != null) {
                for (TransportationOrg trans : hotel.getTransportationOrgList()) {
                    if (trans.getName().equals(orgname)) {
                        trans.setName(txtName.getText());
                        trans.setContact(txtContact.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            }

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() != 1) {
            return;
        }

        String orgType = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String orgName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String orgContact = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String orgCity = model.getValueAt(jTable1.getSelectedRow(), 3).toString();

        txtName.setText(orgName);
        txtContact.setText(orgContact);
        txtCity.setText(orgCity);
        cmbOrgType.setSelectedItem(orgType);
        txtCity.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbOrgType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = cmbOrgType.getSelectedItem().toString();
        Network network1 = systemAdmin.findNetwork(network.getName());
        EnterpriseDirectory enterpriseDirec = network1.getEnterpriseDirectory();
        if (enterpriseDirec != null) {
            return;
        }
        for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
            if (hotel.findManager(user) != null) {
                if (hotel.getLaundaryOrg() != null) {
                    row[0] = "Laundary";
                    for (LaundaryOrg laundary : hotel.getLaundaryOrg()) {
                        row[0] = "Laundary";
                        row[1] = laundary.getName();
                        row[2] = laundary.getContact();
                        row[3] = network1.getName();
                        model.addRow(row);
                    }
                }
                if (hotel.getTransportationOrgList() != null) {
                    row[0] = "Transportation";
                    for (TransportationOrg transportation : hotel.getTransportationOrgList()) {
                        row[0] = "Transportation";
                        row[1] = transportation.getName();
                        row[2] = transportation.getContact();
                        row[3] = network.getName();
                        model.addRow(row);
                    }
                }

            }
        }
    }
}
