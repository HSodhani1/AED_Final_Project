package ui.HotelManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.Model.EnterpriseDirectory;
import Business.Model.Hotel;
import Business.Model.Manager;
import Business.Model.Network;
import Business.Model.Room;
import Business.Model.Room.RoomType;
import Business.Model.RoomList;
import Business.Model.SystemAdmin;

/**
 *
 * @author Aparna
 */

public class manageRoomPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private Network network;
    private String user;

    public manageRoomPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, Network network, String user) {
        initComponents();

        this.user = user;
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.network = network;

        Network network1 = systemAdmin.findNetwork(network.getName());
        List<Hotel> list = network1.getEnterpriseDirectory().getListOfHotel();

        for (RoomType type : RoomType.values()) {
            cmbRoomType.addItem(type);
        }
        
       
        btnAdd.setOpaque(true);
        
        btnBack.setOpaque(true);
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageRooms = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbRoomType = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        tblManageRooms.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblManageRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Room cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageRooms);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 270, 650, 390);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("ROOM TYPE");
        add(jLabel1);
        jLabel1.setBounds(140, 180, 122, 24);

        cmbRoomType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(cmbRoomType);
        cmbRoomType.setBounds(270, 180, 203, 27);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(27, 23, 100, 33);

        btnAdd.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(500, 180, 110, 33);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("MANAGE ROOMS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(470, 30, 210, 32);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1230, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bad-room-harun-grcb.gif"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(720, 240, 630, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        RoomType selectedItem = (RoomType) cmbRoomType.getSelectedItem();
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        List<Hotel> list = enterpriseDirec.getListOfHotel();

        for (int i = 0; i < list.size(); i++) {
            List<Manager> manager = list.get(i).getListOfManager();
            for (int j = 0; j < manager.size(); j++) {
                if (manager.get(j).getUsername().equals(user)) {
                    RoomList roomList = list.get(i).getRoomListDirec();
                    roomList.createRoom(selectedItem);
                    JOptionPane.showMessageDialog(this, "Room added successfully");

                    populateTable();
                    return;
                }
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<RoomType> cmbRoomType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManageRooms;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageRooms.getModel();
        model.setRowCount(0);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
            for (Manager man : hotel.getListOfManager()) {
                if (man.getUsername().equals(user)) {
                    RoomList roomDirec = hotel.getRoomListDirec();
                    for (Room room : roomDirec.getListOfRooms()) {
                        Object row[] = new Object[10];
                        row[0] = room.getRoomNo();
                        row[1] = room.getRoomType().getName();
                        row[2] = room.getRoomType().getRate();
                        model.addRow(row);
                    }
                }
            }
        }
    }
}
