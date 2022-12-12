package ui.HotelManagerRole;

import Business.Model.SystemAdmin;

/**
 *
 * @author Aparna
 */

public class hotelManagerPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public hotelManagerPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
       
        
        btnViewTask.setOpaque(true);
        
        btnManageOrg.setOpaque(true);
       
        btnManageOrgAdmin.setOpaque(true);
        
        btnManageRoom.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblsysadmin = new javax.swing.JLabel();
        btnManageOrgAdmin = new javax.swing.JButton();
        btnManageOrg = new javax.swing.JButton();
        btnViewTask = new javax.swing.JButton();
        btnManageRoom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setText("HOTEL MANAGER");
        add(lblsysadmin);
        lblsysadmin.setBounds(460, 40, 317, 44);

        btnManageOrgAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageOrgAdmin.setText("MANAGE ORGANIZATION ADMIN");
        btnManageOrgAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgAdminActionPerformed(evt);
            }
        });
        add(btnManageOrgAdmin);
        btnManageOrgAdmin.setBounds(850, 410, 301, 40);

        btnManageOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageOrg.setText("MANAGE ORGANIZATION ");
        btnManageOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgActionPerformed(evt);
            }
        });
        add(btnManageOrg);
        btnManageOrg.setBounds(840, 320, 312, 40);

        btnViewTask.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnViewTask.setText("VIEW TASK");
        btnViewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTaskActionPerformed(evt);
            }
        });
        add(btnViewTask);
        btnViewTask.setBounds(840, 230, 312, 40);

        btnManageRoom.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnManageRoom.setText("MANAGE ROOMS");
        btnManageRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRoomActionPerformed(evt);
            }
        });
        add(btnManageRoom);
        btnManageRoom.setBounds(850, 490, 294, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotel_ra.gif"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(190, 150, 480, 540);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);
        add(jPanel1);
        jPanel1.setBounds(0, 0, 1300, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrgAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgAdminActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_btnManageOrgAdminActionPerformed

    private void btnViewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTaskActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnViewTaskActionPerformed

    private void btnManageOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_btnManageOrgActionPerformed

    private void btnManageRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRoomActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_btnManageRoomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrg;
    private javax.swing.JButton btnManageOrgAdmin;
    private javax.swing.JButton btnManageRoom;
    private javax.swing.JButton btnViewTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblsysadmin;
    // End of variables declaration//GEN-END:variables
}
