/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManagerRole;

/**
 *
 * @author Shreya
 */

public class restaurantAssignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantJPanel
     */
    public restaurantAssignJPanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblviewdetails = new javax.swing.JTable();
        btnConfirm = new javax.swing.JButton();
        cmbDeliveryMan = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        tblviewdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CUSTOMER NAME", "CUSTOMERT ID", "ITEM", "ITEM PRICE"
            }
        ));
        jScrollPane1.setViewportView(tblviewdetails);

        add(jScrollPane1);
        jScrollPane1.setBounds(285, 218, 708, 158);

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConfirm.setText("CONFIRM ORDER");
        add(btnConfirm);
        btnConfirm.setBounds(798, 386, 200, 43);

        cmbDeliveryMan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbDeliveryMan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbDeliveryMan);
        cmbDeliveryMan.setBounds(706, 485, 109, 27);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("DELIVERYMAN");
        add(jLabel2);
        jLabel2.setBounds(568, 488, 117, 22);

        btnAssign.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAssign.setText("ASSIGN");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign);
        btnAssign.setBounds(687, 531, 130, 42);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        jPanel1.add(btnBack);
        btnBack.setBounds(50, 30, 130, 50);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setText("CONFIRM AND ASSIGN EVENTS");
        jPanel1.add(lblsysadmin);
        lblsysadmin.setBounds(420, 30, 620, 44);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1460, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cmbDeliveryMan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTable tblviewdetails;
    // End of variables declaration//GEN-END:variables
}
