package ui.SystemAdministration;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.Customer;
import Business.Model.CustomerDirectory;
import Business.Model.SystemAdmin;
import ui.main.Validator;

/**
 *
 * @author Hardik
 */

public class manageCustomersJPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;

    public manageCustomersJPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        populateTable();
       
        
        btnDelete.setOpaque(true);
        
        btnAdd.setOpaque(true);
       
        btnUpdate.setOpaque(true);
        
        btnBack.setOpaque(true);
    }

    public boolean validateName() {
        if (txtCustomerName.getText().matches("[a-zA-Z]{2,19}")) {
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

    public boolean validateCity() {
        if (txtCity.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : city should contain only alphabets");
            return false;
        }
    }

    public boolean validateAddress() {
        if (txtAddress.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : address should contain only alphabets");
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

        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageCustormers = new javax.swing.JTable();
        txtPhoneNo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblsysadmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(31, 34, 90, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("PHONE NUMBER");
        add(jLabel3);
        jLabel3.setBounds(240, 460, 146, 22);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(990, 321, 120, 50);

        tblManageCustormers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblManageCustormers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER NAME", "PHONE NUMBER", "CITY", "ADDRESS", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManageCustormers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManageCustormersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManageCustormers);

        add(jScrollPane1);
        jScrollPane1.setBounds(100, 140, 1036, 154);
        add(txtPhoneNo);
        txtPhoneNo.setBounds(470, 460, 168, 19);

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(510, 680, 104, 47);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("USERNAME");
        add(jLabel4);
        jLabel4.setBounds(780, 410, 102, 22);
        add(txtCustomerName);
        txtCustomerName.setBounds(470, 410, 168, 19);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PASSWORD");
        add(jLabel5);
        jLabel5.setBounds(780, 460, 102, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CUSTOMER NAME");
        add(jLabel2);
        jLabel2.setBounds(240, 410, 170, 22);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(680, 680, 110, 47);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CITY");
        add(jLabel6);
        jLabel6.setBounds(240, 500, 146, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("ADDRESS");
        add(jLabel9);
        jLabel9.setBounds(240, 540, 146, 22);
        add(txtAddress);
        txtAddress.setBounds(470, 550, 168, 19);
        add(txtPassword);
        txtPassword.setBounds(900, 460, 160, 19);
        add(txtUsername);
        txtUsername.setBounds(900, 410, 160, 19);
        add(txtCity);
        txtCity.setBounds(470, 500, 168, 19);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblsysadmin.setText("MANAGE CUSTOMERS");
        jPanel1.add(lblsysadmin);
        lblsysadmin.setBounds(520, 40, 288, 32);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1420, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblManageCustormers.getModel();
        String username = model.getValueAt(tblManageCustormers.getSelectedRow(), 4).toString();
        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec();
        if (customerDirec.getListOfCustomer() != null) {
            for (Customer customer : customerDirec.getListOfCustomer()) {
                if (customer.getUserName().equals(username)) {
                    systemAdmin.deleteCustomer(customer);
                    populateTable();
                    JOptionPane.showMessageDialog(this, "Customer deleted successfully");
                    return;
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = txtCustomerName.getText();
        String contact = txtPhoneNo.getText();
        String city = txtCity.getText();
        String address = txtAddress.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        
         if (address == null) {
            JOptionPane.showMessageDialog(this, "Enter an Address");
            return;
        }
        
        if (city == null) {
            JOptionPane.showMessageDialog(this, "Enter a City.");
            return;
        }
        
        if (contact == null || contact.length()>10 || contact.length()<10) {
            JOptionPane.showMessageDialog(this, "Invalid Contact Info");
            return;
        }
         
        if (!Validator.validateName(this, name) || !Validator.validateUserName(this, username)
                || !Validator.validatePassword(this, password)) {
            return;
        }

        if (systemAdmin.userExistsInSystem(username)) {
            JOptionPane.showMessageDialog(this, "Username already exists.");
            return;
        }

        Customer customer = systemAdmin.getCustomerDirec().addCustomer();  //add customer to directory in system
        customer.setName(name);
        customer.setContact(contact);
        customer.setCity(city);
        customer.setAddress(address);
        customer.setUserName(username);
        customer.setPassword(password);
        populateTable();
        JOptionPane.showMessageDialog(this, "Customer added successfully");

        systemAdmin.addUser(username, password, "Customer");

        txtCustomerName.setText("");
        txtPhoneNo.setText("");
        txtCity.setText("");
        txtUsername.setText("");
        txtAddress.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (tblManageCustormers.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblManageCustormers.getModel();
        if (tblManageCustormers.getSelectedRowCount() == 1) {
            String user = txtUsername.getText();
            Customer customer = systemAdmin.findCustomer(user);
            customer.setAddress(txtAddress.getText());
            customer.setName(txtCustomerName.getText());
            customer.setContact(txtPhoneNo.getText());
            customer.setCity(txtCity.getText());
            JOptionPane.showMessageDialog(this, "updated Successfully");
            populateTable();

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblManageCustormersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManageCustormersMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblManageCustormers.getModel();
        String customerName = model.getValueAt(tblManageCustormers.getSelectedRow(), 0).toString();
        String customerContact = model.getValueAt(tblManageCustormers.getSelectedRow(), 1).toString();
        String customerCity = model.getValueAt(tblManageCustormers.getSelectedRow(), 2).toString();
        String customerAddress = model.getValueAt(tblManageCustormers.getSelectedRow(), 3).toString();
        String username = model.getValueAt(tblManageCustormers.getSelectedRow(), 4).toString();
        String password = model.getValueAt(tblManageCustormers.getSelectedRow(), 5).toString();
        txtCustomerName.setText(customerName);
        txtPhoneNo.setText(customerContact);
        txtCity.setText(customerCity);
        txtAddress.setText(customerAddress);
        txtUsername.setText(username);
        txtPassword.setText(password);
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);
    }//GEN-LAST:event_tblManageCustormersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTable tblManageCustormers;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageCustormers.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (Customer customer : systemAdmin.getCustomerDirec().getListOfCustomer()) {
            row[0] = customer.getName();
            row[1] = customer.getContact();
            row[2] = customer.getCity();
            row[3] = customer.getAddress();
            row[4] = customer.getUserName();
            row[5] = customer.getPassword();
            model.addRow(row);
        }
    }
}
