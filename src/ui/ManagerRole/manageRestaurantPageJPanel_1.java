/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManagerRole;

/**
 *
 * @author Shreya
 */

public class manageRestaurantPageJPanel_1 extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantJPanel
     */
    public manageRestaurantPageJPanel_1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbEnterprise = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtManager = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantdelivery = new javax.swing.JTable();
        txtManagerID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblsysadmin = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("USERNAME");
        add(jLabel4);
        jLabel4.setBounds(134, 582, 102, 22);
        add(txtUsername);
        txtUsername.setBounds(337, 582, 125, 19);
        add(txtPhoneNo);
        txtPhoneNo.setBounds(337, 545, 125, 19);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        add(btnUpdate);
        btnUpdate.setBounds(363, 705, 99, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ENTERPRISE");
        add(jLabel2);
        jLabel2.setBounds(134, 415, 145, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("PHONE NUMBER");
        add(jLabel6);
        jLabel6.setBounds(134, 540, 145, 22);

        cmbEnterprise.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbEnterprise);
        cmbEnterprise.setBounds(337, 412, 125, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("MANAGER ID");
        add(jLabel3);
        jLabel3.setBounds(134, 500, 145, 22);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(1058, 355, 95, 31);
        add(txtManager);
        txtManager.setBounds(337, 463, 125, 19);

        tblRestaurantdelivery.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblRestaurantdelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ENTERPRISE", "MANAGER", "MANAGER ID", "PHONE NUMBER", "USERNAME", "PASSWORD"
            }
        ));
        jScrollPane1.setViewportView(tblRestaurantdelivery);

        add(jScrollPane1);
        jScrollPane1.setBounds(126, 154, 1027, 191);
        add(txtManagerID);
        txtManagerID.setBounds(337, 503, 125, 19);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PASSWORD");
        add(jLabel5);
        jLabel5.setBounds(134, 622, 102, 22);

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        add(btnAdd);
        btnAdd.setBounds(238, 705, 90, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("MANAGER");
        add(jLabel1);
        jLabel1.setBounds(134, 458, 145, 22);
        add(txtPassword);
        txtPassword.setBounds(337, 622, 125, 19);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setText("MANAGE EMPLOYEES (RESTAURANT(DELIVERY SERVICES))");
        jPanel1.add(lblsysadmin);
        lblsysadmin.setBounds(200, 20, 1062, 44);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        jPanel1.add(btnBack);
        btnBack.setBounds(40, 20, 100, 40);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1460, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbEnterprise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTable tblRestaurantdelivery;
    private javax.swing.JTextField txtManager;
    private javax.swing.JTextField txtManagerID;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
