package ui.RestaurantManagerRole;

import Business.Model.SystemAdmin;

/**
 *
 * @author Aparna
 */

public class restaurantManagerPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public restaurantManagerPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
       
        btnViewOrder.setOpaque(true);
       
        btnManageOrg.setOpaque(true);
        
        btnOrgAdmin.setOpaque(true);
        
        btnAddMenu.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewOrder = new javax.swing.JButton();
        btnManageOrg = new javax.swing.JButton();
        btnOrgAdmin = new javax.swing.JButton();
        btnAddMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        btnViewOrder.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnViewOrder.setText("VIEW ORDERS");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });
        add(btnViewOrder);
        btnViewOrder.setBounds(790, 260, 290, 40);

        btnManageOrg.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnManageOrg.setText("MANAGE ORGANIZATION");
        btnManageOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgActionPerformed(evt);
            }
        });
        add(btnManageOrg);
        btnManageOrg.setBounds(800, 370, 290, 40);

        btnOrgAdmin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnOrgAdmin.setText("MANAGE ORGANIZATION ADMIN");
        btnOrgAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrgAdminActionPerformed(evt);
            }
        });
        add(btnOrgAdmin);
        btnOrgAdmin.setBounds(800, 480, 290, 40);

        btnAddMenu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddMenu.setText("ADD MENU ");
        btnAddMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMenuActionPerformed(evt);
            }
        });
        add(btnAddMenu);
        btnAddMenu.setBounds(800, 590, 300, 40);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("RESTAURANT MANAGER PANEL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 30, 390, 29);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1270, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ezgif.com-gif-maker.gif"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(70, 250, 500, 380);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnManageOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_btnManageOrgActionPerformed

    private void btnOrgAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgAdminActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_btnOrgAdminActionPerformed

    private void btnAddMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMenuActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_btnAddMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMenu;
    private javax.swing.JButton btnManageOrg;
    private javax.swing.JButton btnOrgAdmin;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
