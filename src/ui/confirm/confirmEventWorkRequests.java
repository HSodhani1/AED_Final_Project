package ui.confirm;

import javax.swing.table.DefaultTableModel;
import Business.Model.Booking;
import Business.Model.Customer;
import Business.Model.CustomerDirectory;
import Business.Model.Manager;
import Business.Model.Organization;
import Business.Model.SystemAdmin;
import Model.services.Service;

/**
 *
 * @author Shreya
 */

public class confirmEventWorkRequests extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private String user;
    private String type;

    public confirmEventWorkRequests(SystemAdmin systemAdmin, String user, String type) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.user = user;
        this.type = type;
        lblbookservices.setText(lblbookservices.getText() + type.toUpperCase() + " ORGANIZATION");
        populateTable();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkReq = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblbookservices = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 235));
        setLayout(null);

        tblWorkReq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblWorkReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER ID", "BOOKING ID", "HOTEL NAME", "DATE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkReq);

        add(jScrollPane1);
        jScrollPane1.setBounds(260, 200, 745, 298);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(null);

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblbookservices.setText("ASSIGNED WORK REQUESTS FOR ");
        jPanel1.add(lblbookservices);
        lblbookservices.setBounds(410, 40, 450, 29);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1420, 110);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JTable tblWorkReq;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkReq.getModel();
        model.setRowCount(0);

        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec();
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {
                for (Service service : booking.getServices()) {
                    for (Organization org : service.getListOfOrg()) {
                        for (Manager man : org.getListOfManager()) {
                            if (man.getUsername().equals(user)) {
                                Object row[] = new Object[5];
                                row[0] = customer.getUserName();
                                row[1] = booking.getId();
                                row[2] = booking.getHotelService().getEnterprise().getName();
                                row[3] = service.getDate();
                                row[4] = service.getStatus();

                                model.addRow(row);
                            }

                            System.out.println();
                        }
                    }
                }
            }
        }

    }
}
