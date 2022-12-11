package ui.SystemAdministration;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.BusinessEvent;
import Business.Model.Enterprise;
import Business.Model.EnterpriseDirectory;
import Business.Model.HealthClub;
import Business.Model.Hotel;
import Business.Model.Network;
import Business.Model.Restaurant;
import Business.Model.SystemAdmin;
import java.util.ConcurrentModificationException;

/**
 *
 * @author Hardik
 */

public class manageEnterpriseJPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;

    public manageEnterpriseJPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        for (Network network : systemAdmin.getListOfNetwork()) {      //populate items in network combobox
            cmbNetwork1.addItem(network.getName());
        }
        for (Network network : systemAdmin.getListOfNetwork()) {
            cmbNetwork.addItem(network.getName());
        }
       
        btnDelete.setOpaque(true);
        
        btnAdd.setOpaque(true);
       
        btnUpdate.setOpaque(true);
        
        btnBack.setOpaque(true);
        
        btnView.setOpaque(true);
    }

    public boolean validateName() {
        if (txtEnterpriseName.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean validateContactNum() {
        if (txtPhoneNo.getText().matches("[0-9]{10}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid contcat: contact should contain only 10 digits");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprises = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtEnterpriseName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbNetwork1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbEntp = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        cmbNetwork = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblsysadmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(280, 600, 215, 38);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(920, 590, 110, 41);

        tblEnterprises.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblEnterprises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK NAME", "ENTERPRISE ", "ENTERPRISE TYPE", "CONTACT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEnterprises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEnterprisesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEnterprises);

        add(jScrollPane1);
        jScrollPane1.setBounds(690, 230, 500, 310);

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(70, 600, 182, 38);

        txtEnterpriseName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEnterpriseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterpriseNameActionPerformed(evt);
            }
        });
        add(txtEnterpriseName);
        txtEnterpriseName.setBounds(310, 380, 172, 32);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ENTERPRISE TYPE");
        add(jLabel1);
        jLabel1.setBounds(80, 330, 184, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NETWORK");
        add(jLabel2);
        jLabel2.setBounds(80, 280, 102, 22);

        cmbNetwork1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbNetwork1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one" }));
        cmbNetwork1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetwork1ActionPerformed(evt);
            }
        });
        add(cmbNetwork1);
        cmbNetwork1.setBounds(310, 280, 180, 27);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ENTERPRISE NAME");
        add(jLabel3);
        jLabel3.setBounds(80, 380, 174, 29);

        cmbEntp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbEntp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one", "Business Event", "Hotel", "Restaurant", "Health Club" }));
        cmbEntp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEntpActionPerformed(evt);
            }
        });
        add(cmbEntp);
        cmbEntp.setBounds(310, 330, 180, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CONTACT");
        add(jLabel6);
        jLabel6.setBounds(80, 440, 166, 22);

        txtPhoneNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtPhoneNo);
        txtPhoneNo.setBounds(310, 440, 172, 32);

        cmbNetwork.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one " }));
        add(cmbNetwork);
        cmbNetwork.setBounds(880, 160, 168, 30);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("SELECT A NETWORK");
        add(jLabel7);
        jLabel7.setBounds(720, 160, 150, 27);

        btnView.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView);
        btnView.setBounds(1070, 160, 85, 30);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(41, 24, 101, 44);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsysadmin.setText("MANAGE ENTERPRISES");
        jPanel1.add(lblsysadmin);
        lblsysadmin.setBounds(440, 40, 319, 29);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = tblEnterprises.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEnterprises.getModel();
        String networkName = (String) model.getValueAt(selectedRowIndex, 0);
        String enterpriseType = (String) model.getValueAt(selectedRowIndex, 2);
        String enterpriseName = (String) model.getValueAt(selectedRowIndex, 1);
        Network network = systemAdmin.findNetwork(networkName);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseType.equals("Business Event") && enterpriseDirec.getListOfEvents() != null) {
            for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
                if (event.getName().equals(enterpriseName)) {
                    enterpriseDirec.deleteEnterpriseEvent(event);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (enterpriseType.equals("Hotel") && enterpriseDirec.getListOfHotel() != null) {
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
                if (hotel.getName().equals(enterpriseName)) {
                    enterpriseDirec.deleteEnterpriseHotel(hotel);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (enterpriseType.equals("Restaurant") && enterpriseDirec.getListOfRestaurants() != null) {
            for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {
                if (res.getName().equals(enterpriseName)) {
                    enterpriseDirec.deleteEnterpriseRestaurant(res);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (enterpriseType.equals("Health Club") && enterpriseDirec.getListOfHealthClub() != null) {
            for (HealthClub club : enterpriseDirec.getListOfHealthClub()) {
                if (club.getName().equals(enterpriseName)) {
                    enterpriseDirec.deleteEnterpriseHealthClub(club);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "not found");
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbEntpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEntpActionPerformed

    }//GEN-LAST:event_cmbEntpActionPerformed

    private void cmbNetwork1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetwork1ActionPerformed

    }//GEN-LAST:event_cmbNetwork1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String contact = txtPhoneNo.getText();
        String name = txtEnterpriseName.getText();
        String networkName = cmbNetwork1.getSelectedItem().toString();
        String enterpriseType1 = cmbEntp.getSelectedItem().toString();
        Network network = systemAdmin.findNetwork(networkName);
        
        
        if (network == null) {
            JOptionPane.showMessageDialog(this, "Enter a Network.");
            return;
        }
        
        if (contact == null || contact.length()>10 || contact.length()<10) {
            JOptionPane.showMessageDialog(this, "Invalid Contact Number.");
            return;
        }
         
        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Invalid input: Enterprise name should be atleast 2 characters long.");
            return;
        }

        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseType1.equals("Health Club") && enterpriseDirec != null) {
            enterpriseDirec.addHealthClub(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");
            return;
        } else if (enterpriseType1.equals("Restaurant") && enterpriseDirec != null) {
            enterpriseDirec.addRestaurant(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");

            return;
        } else if (enterpriseType1.equals("Business Event") && enterpriseDirec != null) {
            enterpriseDirec.addBusinessEvent(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");

            return;
        } else if (enterpriseType1.equals("Hotel") && enterpriseDirec != null) {
            enterpriseDirec.addHotel(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");
            return;
        }
        txtEnterpriseName.setText("");
        txtPhoneNo.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        populateTable();
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (tblEnterprises.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select 1 row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEnterprises.getModel();

        String networkName = cmbNetwork1.getSelectedItem().toString();
        String enterpriseType1 = cmbEntp.getSelectedItem().toString();
        String enterpriseName = model.getValueAt(tblEnterprises.getSelectedRow(), 1).toString();

        Network network = systemAdmin.findNetwork(networkName);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();

        Enterprise enterpriseToUpdate = null;
        if (enterpriseType1.equals("Health Club") && enterpriseDirec != null) {

            for (HealthClub list : enterpriseDirec.getListOfHealthClub()) {
                if (list.getName().equals(enterpriseName)) {  //if enterprise name matches 
                    enterpriseToUpdate = list;
                }
            }
            JOptionPane.showMessageDialog(this, "Enterprise updated successfully");
            return;
        } else if (enterpriseType1.equals("Business Event") && enterpriseDirec != null) {
            for (BusinessEvent list : enterpriseDirec.getListOfEvents()) {
                if (list.getName().equals(enterpriseName)) {
                    enterpriseToUpdate = list;
                }
            }
        } else if (enterpriseType1.equals("Hotel") && enterpriseDirec != null) {
            for (Hotel list : enterpriseDirec.getListOfHotel()) {
                if (list.getName().equals(enterpriseName)) {           //if enterprise name matches 
                    enterpriseToUpdate = list;
                }
            }
        } else if (enterpriseType1.equals("Business Event") && enterpriseDirec != null) {
            for (Restaurant list : enterpriseDirec.getListOfRestaurants()) {
                if (list.getName().equals(enterpriseName)) {           //if enterprise name matches 
                    enterpriseToUpdate = list;
                }
            }
        }

        if (enterpriseToUpdate == null) {
            JOptionPane.showMessageDialog(this, "Unknown enterprise.");
            return;
        }

        enterpriseToUpdate.setName(txtEnterpriseName.getText());
        enterpriseToUpdate.setContact(txtPhoneNo.getText());
        populateTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblEnterprisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEnterprisesMouseClicked

        if (tblEnterprises.getSelectedRowCount() != 1) {
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblEnterprises.getModel();

        String networkName = model.getValueAt(tblEnterprises.getSelectedRow(), 0).toString();
        String enterpriseName = model.getValueAt(tblEnterprises.getSelectedRow(), 1).toString();
        String enterpriseType1 = model.getValueAt(tblEnterprises.getSelectedRow(), 2).toString();
        String enterpriseContact = model.getValueAt(tblEnterprises.getSelectedRow(), 3).toString();

        cmbNetwork1.setSelectedItem(networkName);
        cmbEntp.setSelectedItem(enterpriseType1);
        txtEnterpriseName.setText(enterpriseName);
        txtPhoneNo.setText(enterpriseContact);
    }//GEN-LAST:event_tblEnterprisesMouseClicked

    private void txtEnterpriseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterpriseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterpriseNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbEntp;
    private javax.swing.JComboBox<String> cmbNetwork;
    private javax.swing.JComboBox<String> cmbNetwork1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTable tblEnterprises;
    private javax.swing.JTextField txtEnterpriseName;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprises.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String networkItem = cmbNetwork.getSelectedItem().toString();
        Network network = systemAdmin.findNetwork(networkItem);

        List<BusinessEvent> eventList = network.getEnterpriseDirectory().getListOfEvents();
        if (eventList != null) {
            for (int i = 0; i < eventList.size(); i++) {
                row[0] = networkItem;
                row[1] = eventList.get(i).getName();
                row[2] = "Business Event";
                row[3] = eventList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<Restaurant> restaurantList = network.getEnterpriseDirectory().getListOfRestaurants();
        if (restaurantList != null) {
            for (int i = 0; i < restaurantList.size(); i++) {
                row[0] = networkItem;
                row[1] = restaurantList.get(i).getName();
                row[2] = "Restaurant";
                row[3] = restaurantList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<HealthClub> healthclubList = network.getEnterpriseDirectory().getListOfHealthClub();
        if (healthclubList != null) {
            for (int i = 0; i < healthclubList.size(); i++) {
                row[0] = networkItem;
                row[1] = healthclubList.get(i).getName();
                row[2] = "Health Club";
                row[3] = healthclubList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<Hotel> hotelList = network.getEnterpriseDirectory().getListOfHotel();
        if (hotelList != null) {
            for (int i = 0; i < hotelList.size(); i++) {
                row[0] = networkItem;
                row[1] = hotelList.get(i).getName();
                row[2] = "Hotel";
                row[3] = hotelList.get(i).getContact();
                model.addRow(row);
            }
        }

    }
}
