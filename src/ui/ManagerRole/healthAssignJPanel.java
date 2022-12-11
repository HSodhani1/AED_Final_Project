/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManagerRole;

/**
 *
 * @author Shreya
 */

public class healthAssignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HealthClubManagerJPanel
     */
    public healthAssignJPanel() {
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
        tblHealthClubManager = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnConfirmOrder = new javax.swing.JButton();
        cmbPhysician = new javax.swing.JComboBox<>();
        cmbTherapist = new javax.swing.JComboBox<>();
        cmbTrainer = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        tblHealthClubManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CUSTOMER", "CUSTOMER ID", "THERAPIST", "PHYSICIAN", "TRAINER"
            }
        ));
        jScrollPane1.setViewportView(tblHealthClubManager);

        add(jScrollPane1);
        jScrollPane1.setBounds(92, 156, 845, 216);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        add(btnBack);
        btnBack.setBounds(90, 43, 100, 30);

        btnAssign.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAssign.setText("ASSIGN");
        add(btnAssign);
        btnAssign.setBounds(163, 635, 106, 30);

        btnConfirmOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConfirmOrder.setText("CONFIRM ORDER");
        add(btnConfirmOrder);
        btnConfirmOrder.setBounds(730, 390, 200, 43);

        cmbPhysician.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbPhysician.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbPhysician);
        cmbPhysician.setBounds(251, 510, 109, 27);

        cmbTherapist.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbTherapist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbTherapist);
        cmbTherapist.setBounds(251, 452, 109, 27);

        cmbTrainer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbTrainer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbTrainer);
        cmbTrainer.setBounds(251, 569, 109, 27);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("THERAPIST");
        add(jLabel2);
        jLabel2.setBounds(145, 455, 100, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("TRAINER");
        add(jLabel3);
        jLabel3.setBounds(146, 572, 93, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("PHYSICIAN");
        add(jLabel4);
        jLabel4.setBounds(146, 513, 100, 22);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("HEALTH CLUB MANAGER");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(340, 30, 450, 44);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1460, 100);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirmOrder;
    private javax.swing.JComboBox<String> cmbPhysician;
    private javax.swing.JComboBox<String> cmbTherapist;
    private javax.swing.JComboBox<String> cmbTrainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHealthClubManager;
    // End of variables declaration//GEN-END:variables
}