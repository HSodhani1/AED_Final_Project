package ui.HealthClubManagerRole;

import Business.Model.SystemAdmin;

/**
 *
 * @author Hardik
 */

public class healthClubManagerPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callMethod1;
    private Runnable callMethod2;
    private Runnable callMethod3;

    public healthClubManagerPanel(SystemAdmin systemAdmin, Runnable callMethod1, Runnable callMethod2, Runnable callMEthod3) {
        initComponents();
        this.callMethod1 = callMethod1;
        this.callMethod2 = callMethod2;
        this.callMethod3 = callMEthod3;
       
        
        btnViewTask.setOpaque(true);
        
        btnManageOrg.setOpaque(true);
       
        btnOrgAdmin.setOpaque(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewTask = new javax.swing.JButton();
        btnManageOrg = new javax.swing.JButton();
        btnOrgAdmin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        btnViewTask.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewTask.setText("VIEW TASK");
        btnViewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTaskActionPerformed(evt);
            }
        });
        add(btnViewTask);
        btnViewTask.setBounds(130, 170, 301, 38);

        btnManageOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageOrg.setText("MANAGE ORGANIZATION");
        btnManageOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgActionPerformed(evt);
            }
        });
        add(btnManageOrg);
        btnManageOrg.setBounds(480, 170, 301, 45);

        btnOrgAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOrgAdmin.setText("MANAGE ORGANISATION ADMIN");
        btnOrgAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrgAdminActionPerformed(evt);
            }
        });
        add(btnOrgAdmin);
        btnOrgAdmin.setBounds(840, 170, 320, 44);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        lblHeading.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblHeading.setText("HEALTH CLUB MANAGER PANEL ");
        jPanel1.add(lblHeading);
        lblHeading.setBounds(470, 40, 427, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1250, 110);

        jPanel2.setBackground(new java.awt.Color(249, 166, 84));
        jPanel2.setLayout(null);
        add(jPanel2);
        jPanel2.setBounds(-10, 270, 210, 510);

        jPanel3.setBackground(new java.awt.Color(249, 166, 84));
        jPanel3.setLayout(null);
        add(jPanel3);
        jPanel3.setBounds(1040, 270, 210, 510);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/healthclub.gif"))); // NOI18N
        add(lblImage);
        lblImage.setBounds(200, 270, 840, 506);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTaskActionPerformed
                 callMethod1.run();
    }//GEN-LAST:event_btnViewTaskActionPerformed

    private void btnManageOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgActionPerformed
         callMethod2.run();
    }//GEN-LAST:event_btnManageOrgActionPerformed

    private void btnOrgAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgAdminActionPerformed
        callMethod3.run();
    }//GEN-LAST:event_btnOrgAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrg;
    private javax.swing.JButton btnOrgAdmin;
    private javax.swing.JButton btnViewTask;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables
}
