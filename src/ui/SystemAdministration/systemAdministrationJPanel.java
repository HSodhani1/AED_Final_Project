package ui.SystemAdministration;

import java.awt.Color;
import Business.Model.SystemAdmin;

/**
 *
 * @author Hardik
 */

public class systemAdministrationJPanel extends javax.swing.JPanel {

    SystemAdmin systems;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public systemAdministrationJPanel(SystemAdmin systems, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
       // setBackground(new java.awt.Color(255, 204, 204));

        
        btnManageNetworks.setOpaque(true);
        
        btnManageCustomers.setOpaque(true);
        
        btnManageManagers.setOpaque(true);
        
        btnManageEnterprises.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageNetworks = new javax.swing.JButton();
        btnManageEnterprises = new javax.swing.JButton();
        btnManageCustomers = new javax.swing.JButton();
        btnManageManagers = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblsysadmin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        btnManageNetworks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageNetworks.setText("MANAGE NETWORKS");
        btnManageNetworks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworksActionPerformed(evt);
            }
        });
        add(btnManageNetworks);
        btnManageNetworks.setBounds(920, 240, 247, 42);

        btnManageEnterprises.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageEnterprises.setText("MANAGE ENTERPRISES");
        btnManageEnterprises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterprisesActionPerformed(evt);
            }
        });
        add(btnManageEnterprises);
        btnManageEnterprises.setBounds(930, 360, 247, 48);

        btnManageCustomers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageCustomers.setText("MANAGE CUSTOMERS");
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });
        add(btnManageCustomers);
        btnManageCustomers.setBounds(930, 610, 247, 43);

        btnManageManagers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageManagers.setText("MANAGE MANAGERS");
        btnManageManagers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageManagersActionPerformed(evt);
            }
        });
        add(btnManageManagers);
        btnManageManagers.setBounds(930, 490, 247, 45);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wifi.gif"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(-30, 130, 800, 590);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setText("SYSTEM ADMINISTRATOR");
        jPanel1.add(lblsysadmin);
        lblsysadmin.setBounds(440, 40, 499, 44);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1260, 130);

        jPanel2.setBackground(new java.awt.Color(239, 234, 234));
        add(jPanel2);
        jPanel2.setBounds(0, 700, 770, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEnterprisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterprisesActionPerformed
        callOnCreateMethod2.run();

    }//GEN-LAST:event_btnManageEnterprisesActionPerformed

    private void btnManageNetworksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworksActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnManageNetworksActionPerformed

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnManageManagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageManagersActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_btnManageManagersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageEnterprises;
    private javax.swing.JButton btnManageManagers;
    private javax.swing.JButton btnManageNetworks;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblsysadmin;
    // End of variables declaration//GEN-END:variables
}
