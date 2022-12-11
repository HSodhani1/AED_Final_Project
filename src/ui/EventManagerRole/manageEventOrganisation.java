package ui.EventManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.BusinessEvent;
import Business.Model.CateringService;
import Business.Model.DecorServices;
import Business.Model.EnterpriseDirectory;
import Business.Model.Network;
import Business.Model.PhotographyService;
import Business.Model.SystemAdmin;

/**
 *
 * @author Shreya
 */

public class manageEventOrganisation extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private Network network;

    public manageEventOrganisation(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Network network) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.network = network;

        txtCity.setText(network.getName());
        txtCity.setEditable(false);

        populateTable();
        
        
        btnDelete.setOpaque(true);
        
        btnAdd.setOpaque(true);
       
        btnUpdate.setOpaque(true);
      
        btnBack.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEventManager = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cmbOrg = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtCity = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        tblEventManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORGANISATION TYPE", "NAME", "CONTACT", "CITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEventManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEventManagerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEventManager);

        add(jScrollPane1);
        jScrollPane1.setBounds(640, 210, 530, 350);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("ORGANISATION TYPE");
        add(jLabel2);
        jLabel2.setBounds(30, 240, 196, 30);

        cmbOrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organisation", "Decor", "Catering", "Photography" }));
        add(cmbOrg);
        cmbOrg.setBounds(270, 250, 210, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("NAME");
        add(jLabel3);
        jLabel3.setBounds(30, 300, 119, 30);
        add(txtName);
        txtName.setBounds(270, 310, 199, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("CONTACT");
        add(jLabel4);
        jLabel4.setBounds(30, 360, 119, 30);
        add(txtContact);
        txtContact.setBounds(270, 360, 199, 30);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("CITY");
        add(jLabel5);
        jLabel5.setBounds(30, 420, 98, 30);

        btnAdd.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(230, 500, 107, 50);

        btnDelete.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(860, 600, 110, 39);

        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(410, 500, 110, 50);

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        add(txtCity);
        txtCity.setBounds(270, 420, 198, 30);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE ORGANISATION FOR EVENTS ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 30, 466, 32);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(50, 40, 100, 33);

        add(jPanel1);
        jPanel1.setBounds(-10, 0, 1370, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblEventManager.getModel();
        Object row[] = new Object[20];
        String networkName = network.getName();
        String name = txtName.getText();
        String contact = txtContact.getText();
        String city = txtCity.getText();
        
        if (city == null) {
            JOptionPane.showMessageDialog(this, "Enter a City");
            return;
        }
        
        if (networkName == null) {
            JOptionPane.showMessageDialog(this, "Enter a Network");
            return;
        }
        
        if (contact == null || contact.length() < 10 || contact.length() > 10) {
            JOptionPane.showMessageDialog(this, "Invalid Contact Number");
            return;
        }
        
        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Organization name should be at least 2 characters long.");
            return;
        }

        String orgType1 = cmbOrg.getSelectedItem().toString();      // org-type (physician org)     
        EnterpriseDirectory enterpriseDirc = network.getEnterpriseDirectory();
        List<BusinessEvent> events = enterpriseDirc.getListOfEvents();
        for (int i = 0; i < events.size(); i++) {
            events.get(i).findManager(user);      //find healthclub for which manager is working for
            if (orgType1.equals("Catering")) {
                events.get(i).addCateringService(name, contact, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = contact;
                row[3] = networkName;
                model.addRow(row);
                JOptionPane.showMessageDialog(this, "Catering Organisation added successfully");
                return;
            } else if (orgType1.equals("Decor")) {
                events.get(i).addDecorService(name, contact, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = contact;
                row[3] = networkName;
                model.addRow(row);
                JOptionPane.showMessageDialog(this, "Decor Organisation successfully");
                return;
            } else {
                events.get(i).addPhotographyService(name, contact, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = contact;
                row[3] = networkName;
                model.addRow(row);
                JOptionPane.showMessageDialog(this, "Photography Organisation added successfully");
                return;
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblEventManager.getModel();
        int selectedRowIndex = tblEventManager.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        String OrgType = (String) model.getValueAt(selectedRowIndex, 0);
        String OrgName = (String) model.getValueAt(selectedRowIndex, 1);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
            if (event.findManager(user) != null) {
                if (OrgType.equals("Catering") && event.getListOfCatering() != null) {
                    for (CateringService catering : event.getListOfCatering()) {
                        if (catering.getName().equals(OrgName)) {
                            event.deleteCatering(catering);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Photography") && event.getListOfPhotographyServices() != null) {
                    for (PhotographyService photo : event.getListOfPhotographyServices()) {
                        if (photo.getName().equals(OrgName)) {
                            event.deletePhotography(photo);
                            JOptionPane.showMessageDialog(this, "Deleted successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Decor") && event.getListOfDecors() != null) {
                    for (DecorServices decor : event.getListOfDecors()) {
                        if (decor.getName().equals(OrgName)) {
                            event.deleteDecor(decor);
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

    private void tblEventManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEventManagerMouseClicked

        DefaultTableModel model = (DefaultTableModel) tblEventManager.getModel();
        if (tblEventManager.getSelectedRowCount() != 1) {
            return;
        }

        String orgType = model.getValueAt(tblEventManager.getSelectedRow(), 0).toString();
        String orgName = model.getValueAt(tblEventManager.getSelectedRow(), 1).toString();
        String orgContact = model.getValueAt(tblEventManager.getSelectedRow(), 2).toString();
        String orgCity = model.getValueAt(tblEventManager.getSelectedRow(), 3).toString();

        txtName.setText(orgName);
        txtContact.setText(orgContact);
        txtCity.setText(orgCity);
        cmbOrg.setSelectedItem(orgType);
        txtCity.setEnabled(false);
    }//GEN-LAST:event_tblEventManagerMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (tblEventManager.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        DefaultTableModel model = (DefaultTableModel) tblEventManager.getModel();

        String orgType = cmbOrg.getSelectedItem().toString();
        String orgname = model.getValueAt(tblEventManager.getSelectedRow(), 1).toString();

        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
            if (orgType.equals("Catering") && event.getListOfCatering() != null) {
                for (CateringService catering : event.getListOfCatering()) {
                    if (catering.getName().equals(orgname)) {
                        catering.setName(txtName.getText());
                        catering.setContact(txtContact.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Decor") && event.getListOfDecors() != null) {
                for (DecorServices decor : event.getListOfDecors()) {
                    if (decor.getName().equals(orgname)) {
                        decor.setName(txtName.getText());
                        decor.setContact(txtContact.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Photography") && event.getListOfPhotographyServices() != null) {
                for (PhotographyService photo : event.getListOfPhotographyServices()) {
                    if (photo.getName().equals(orgname)) {
                        photo.setName(txtName.getText());
                        photo.setContact(txtContact.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            }

        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEventManager;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEventManager.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = cmbOrg.getSelectedItem().toString();
        Network network1 = systemAdmin.findNetwork(network.getName());
        EnterpriseDirectory enterpriseDirec = network1.getEnterpriseDirectory();
        if (enterpriseDirec == null) {
            return;
        }
        for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
            if (event.findManager(user) != null) {
                if (event.getListOfCatering() != null) {
                    row[0] = "Catering";
                    for (CateringService catering : event.getListOfCatering()) {
                        row[0] = "Catering";
                        row[1] = catering.getName();
                        row[2] = catering.getContact();
                        row[3] = network1.getName();
                        model.addRow(row);
                    }
                }
                if (event.getListOfDecors() != null) {
                    row[0] = "Decor";
                    for (DecorServices decor : event.getListOfDecors()) {
                        row[0] = "Decor";
                        row[1] = decor.getName();
                        row[2] = decor.getContact();
                        row[3] = network.getName();
                        model.addRow(row);
                    }
                }
                if (event.getListOfPhotographyServices() != null) {
                    row[0] = "Photography";
                    for (PhotographyService photo : event.getListOfPhotographyServices()) {
                        row[0] = "Photography";
                        row[1] = photo.getName();
                        row[2] = photo.getContact();
                        row[3] = network.getName();
                        model.addRow(row);
                    }
                }

            }
        }
    }
}
