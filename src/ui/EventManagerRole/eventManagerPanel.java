package ui.EventManagerRole;

import Business.Model.SystemAdmin;

/**
 *
 * @author Shreya
 */

public class eventManagerPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;

    public eventManagerPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        
        
        btnViewTask.setOpaque(true);
       
        btnManageOrg.setOpaque(true);
        
        manageOrgAdmin.setOpaque(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageOrg = new javax.swing.JButton();
        btnViewTask = new javax.swing.JButton();
        manageOrgAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        btnManageOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageOrg.setText("MANAGE ORGANISATION");
        btnManageOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgActionPerformed(evt);
            }
        });
        add(btnManageOrg);
        btnManageOrg.setBounds(480, 190, 313, 40);

        btnViewTask.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewTask.setText("VIEW TASK");
        btnViewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTaskActionPerformed(evt);
            }
        });
        add(btnViewTask);
        btnViewTask.setBounds(80, 190, 313, 39);

        manageOrgAdmin.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        manageOrgAdmin.setText("MANAGE ORGANISATION ADMIN");
        manageOrgAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrgAdminActionPerformed(evt);
            }
        });
        add(manageOrgAdmin);
        manageOrgAdmin.setBounds(870, 190, 330, 41);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/event-management.gif"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(170, 290, 890, 510);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("EVENT MANAGER PANEL ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 30, 460, 80);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1260, 140);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(null);
        add(jPanel2);
        jPanel2.setBounds(100, 700, 1160, 150);

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        add(jPanel3);
        jPanel3.setBounds(0, 290, 170, 560);

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        add(jPanel4);
        jPanel4.setBounds(1060, 290, 200, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_btnManageOrgActionPerformed

    private void btnViewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTaskActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnViewTaskActionPerformed

    private void manageOrgAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrgAdminActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_manageOrgAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrg;
    private javax.swing.JButton btnViewTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton manageOrgAdmin;
    // End of variables declaration//GEN-END:variables
}
