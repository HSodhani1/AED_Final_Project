package ui.RestaurantManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.EnterpriseDirectory;
import Business.Model.Manager;
import Business.Model.MenuItem;
import Business.Model.Network;
import Business.Model.Restaurant;
import Business.Model.SystemAdmin;

/**
 *
 * @author Aparna
 */

public class addOrderPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private Network network;

    public addOrderPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Network network) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.network = network;
       
        populateMenu();
        
        addBtn.setOpaque(true);
      
        backButton.setOpaque(true);

    }

    public boolean validateMenu() {
        if (txtItem.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : menu should contain only alphabets");
            return false;
        }
    }

    public boolean priceField() {
        if (txtPrice == null) {
            JOptionPane.showMessageDialog(this, "price field should not b left blank");
            return false;
        } else {
            return true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MENU ITEM DETAILS", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(740, 460, 460, 177);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ADD AN ITEM ");
        add(jLabel1);
        jLabel1.setBounds(750, 260, 140, 30);

        txtItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtItem);
        txtItem.setBounds(940, 260, 177, 30);

        addBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn);
        addBtn.setBounds(890, 370, 112, 40);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("PRICE ");
        add(jLabel3);
        jLabel3.setBounds(750, 310, 109, 30);
        add(txtPrice);
        txtPrice.setBounds(940, 310, 177, 30);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(30, 30, 93, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setText("MENU ITEM LIST");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(570, 30, 210, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1460, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Updated_Menu-Gif.gif"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(30, 210, 680, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String Item = txtItem.getText();
        String ItemPrice = txtPrice.getText();
        
        if (Item == null) {
            JOptionPane.showMessageDialog(this, "Enter an Item.");
            return;
        }
        
        if (ItemPrice == null) {
            JOptionPane.showMessageDialog(this, "Enter a Price.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String item = txtItem.getText();
        int price = Integer.parseInt(txtPrice.getText().trim());

        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        List<Restaurant> resList = enterpriseDirec.getListOfRestaurants();                // get all restaurants
        for (Restaurant res : resList) {
            List<Manager> managers = res.getListOfManager();
            for (Manager manager : managers) {
                if (manager.getUsername().equals(user)) {            //if manager is found in that restaurant then add item to that res...
                    res.addItem(item, price);

                    populateMenu();
                    JOptionPane.showMessageDialog(this, "Item added successfully");
                    return;
                }
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private void populateMenu() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (Restaurant restaurant : enterpriseDirec.getListOfRestaurants()) {
            if (restaurant.findManager(user) != null) {
                Object row[] = new Object[10];
                for (MenuItem item : restaurant.getListOfItem()) {
                    row[0] = item.getDetails();
                    row[1] = item.getPrice();
                    model.addRow(row);
                }
            }
        }

    }
}
