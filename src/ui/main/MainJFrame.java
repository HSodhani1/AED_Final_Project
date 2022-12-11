package ui.main;

import db.DbUtils;
import java.util.List;
import javax.swing.JOptionPane;
import Business.Model.Booking;
import Business.Model.BusinessEvent;
import Business.Model.Customer;
import Business.Model.Enterprise;
import Business.Model.HealthClub;
import Business.Model.Hotel;
import Business.Model.Manager;
import Business.Model.Network;
import Business.Model.Restaurant;
import Business.Model.SystemAdmin;
import ui.CustomerRole.addServicePanel;
import ui.CustomerRole.eventsBookingJPanel;
import ui.CustomerRole.bookRoomServ;
import ui.CustomerRole.custStartPanel;
import ui.CustomerRole.healthClubServicesJPanel;
import ui.CustomerRole.hotelServicePanel;
import ui.CustomerRole.manageBooking;
import ui.CustomerRole.restuarantServicePanel;
import ui.CustomerRole.viewServiceDetailsPanel;
import ui.EventManagerRole.eventManagerPanel;
import ui.EventManagerRole.manageOrganisationEventAdmin;
import ui.EventManagerRole.manageEventOrganisation;
import ui.EventManagerRole.viewEventTaskPanel;
import ui.HealthClubManagerRole.viewTaskPanel;
import ui.HealthClubManagerRole.healthClubManagerPanel;
import ui.RestaurantManagerRole.manageRestaurantOrganisationPanel;
import ui.HealthClubManagerRole.organizationAdminPanel;
import ui.HealthClubManagerRole.manageOrganizationPanel;
import ui.HotelManagerRole.hotelManagerPanel;
import ui.HotelManagerRole.manageHotelOrganisationAdmin;
import ui.HotelManagerRole.manageHotelOrganisation;
import ui.HotelManagerRole.manageRoomPanel;
import ui.HotelManagerRole.viewTaskForHotel;
import ui.RestaurantManagerRole.addOrderPanel;
import ui.RestaurantManagerRole.manageRestaurantOrgAdmin;
import ui.RestaurantManagerRole.restaurantManagerPanel;
import ui.RestaurantManagerRole.viewTaskPanelRestaurant;
import ui.SystemAdministration.manageCustomersJPanel;
import ui.SystemAdministration.manageEnterpriseJPanel;
import ui.SystemAdministration.manageManagersJPanel;
import ui.SystemAdministration.manageNetworkJPanel;
import ui.SystemAdministration.systemAdministrationJPanel;
import ui.confirm.confirmEventWorkRequests;


/**
 *
 * @author Hardik
 */

public class MainJFrame extends javax.swing.JFrame {

    private SystemAdmin systemAdmin;
    private String userName;
    private String password;

    public MainJFrame() {
        initComponents();
        this.systemAdmin = DbUtils.getInstance().retrieveSystem();
        btnLogout.setEnabled(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        WorkArea = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlPanel.setBackground(new java.awt.Color(255, 245, 235));
        ControlPanel.setPreferredSize(new java.awt.Dimension(138, 813));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD");

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(245, 195, 171));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2))
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(ControlPanel);

        WorkArea.setBackground(new java.awt.Color(255, 245, 235));
        WorkArea.setLayout(null);
        WorkArea.add(jLabel16);
        jLabel16.setBounds(910, 340, 0, 150);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FarawayPeskyAustraliankelpie-max-1mb.gif"))); // NOI18N
        WorkArea.add(jLabel3);
        jLabel3.setBounds(330, 310, 680, 470);

        jPanel1.setBackground(new java.awt.Color(67, 80, 126));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HOTEL MANAGEMENT SYSTEM");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 50, 781, 58);

        WorkArea.add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 140);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/welc.gif"))); // NOI18N
        WorkArea.add(jLabel5);
        jLabel5.setBounds(350, 170, 630, 170);

        jSplitPane.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1628, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        this.userName = txtUsername.getText();
        this.password = txtPassword.getText();

        if (systemAdmin.validateUserNamePassword(userName, password)) {
            String type = systemAdmin.findUserType(userName);

            switch (type) {
                case "admin":
                    systemAdministrationJPanel systemAdministration = new systemAdministrationJPanel(systemAdmin, this::renderNetworkPanel, this::renderEnterprisePanel, this::renderManagerPanel, this::renderCustomerPanel);
                    jSplitPane.setRightComponent(systemAdministration);
                    break;

                case "Customer":
                    renderCustomer(userName);
                    break;

                case "Health Club":
                    renderHealthClubManager(userName);
                    break;

                case "Restaurant":
                    renderRestaurantManager(userName);
                    break;

                case "Hotel":
                    hotelManagerPanel();
                    break;

                case "Business Event":
                    eventManagerPanel();
                    break;
                case "Catering":
                    confirmWorkRequestForEvent();
                    break;
                case "Decor":
                    confirmWorkRequestForEvent();
                    break;
                case "Photography":
                    confirmWorkRequestForEvent();
                    break;
                case "Deliveryman":
                    confirmWorkRequestForEvent();
                    break;
                case "Laundary":
                    confirmWorkRequestForEvent();
                    break;
                case "Transportation":
                    confirmWorkRequestForEvent();
                    break;
                case "Physician":
                    confirmWorkRequestForEvent();
                    break;
                case "Therapist":
                    confirmWorkRequestForEvent();
                    break;
                case "Trainer":
                    confirmWorkRequestForEvent();
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Type not supported.");
                    return;
            }
            txtUsername.setText("");
            txtPassword.setText("");
            btnLogin.setEnabled(false);
            btnLogout.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        System.out.println("Logout called.");
        DbUtils.getInstance().storeSystem(systemAdmin);
        jSplitPane.setRightComponent(WorkArea);
        btnLogin.setEnabled(true);
        btnLogout.setEnabled(false);
        txtUsername.setText("");
        txtPassword.setText("");
        System.out.println("Logout success.");
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void renderNetworkPanel() {
        manageNetworkJPanel network1 = new manageNetworkJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(network1);
    }

    private void renderEnterprisePanel() {
        manageEnterpriseJPanel enterprise = new manageEnterpriseJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(enterprise);
    }

    private void renderCustomerPanel() {
        manageCustomersJPanel customer = new manageCustomersJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(customer);
    }

    private void renderManagerPanel() {
        manageManagersJPanel manager = new manageManagersJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(manager);
    }

    private void renderSystemAdminPanel() {
        jSplitPane.setRightComponent(new systemAdministrationJPanel(systemAdmin, this::renderNetworkPanel, this::renderEnterprisePanel, this::renderManagerPanel, this::renderCustomerPanel));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void renderCustomer(String username) {
        Customer customer = systemAdmin.getCustomerDirec().findCustomerUsername(username);
        custStartPanel customerPanel = new custStartPanel(systemAdmin, this::renderBookRoomPanel, this::manageBooking);
        jSplitPane.setRightComponent(customerPanel);
    }

    private void renderBookRoomPanel() {
        bookRoomServ bookroomPanel = new bookRoomServ(systemAdmin, this::manageCustomerPanel, userName);
        jSplitPane.setRightComponent(bookroomPanel);
    }

    private void manageBooking() {
        manageBooking manageBookingPanel = new manageBooking(systemAdmin, this::manageCustomerPanel, this::addServices, this::viewService, userName);
        jSplitPane.setRightComponent(manageBookingPanel);
    }

    private void manageCustomerPanel() {
        jSplitPane.setRightComponent(new custStartPanel(systemAdmin, this::renderBookRoomPanel, this::manageBooking));
    }

    private void addServices(Booking booking) {
        addServicePanel service = new addServicePanel(systemAdmin, this::bookEvent, this::placeOrder, this::healthPanel,
                this::hotelService, this::manageBooking, userName, booking);
        jSplitPane.setRightComponent(service);
    }

    private void bookEvent(Booking booking) {
        eventsBookingJPanel event = new eventsBookingJPanel(systemAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(event);
    }

    private void placeOrder(Booking booking) {           //customer order from restaurant
        restuarantServicePanel order = new restuarantServicePanel(systemAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(order);
    }

    private void healthPanel(Booking booking) {             // healthclub panel for customer
        healthClubServicesJPanel healthClub = new healthClubServicesJPanel(systemAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(healthClub);
    }

    private void hotelService(Booking booking) {    //laundary and transport service panel fpr customer
        hotelServicePanel hotelPanel = new hotelServicePanel(systemAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(hotelPanel);
    }

    private void viewService(Booking booking) {
        viewServiceDetailsPanel viewService = new viewServiceDetailsPanel(systemAdmin, this::manageBooking, userName, booking);
        jSplitPane.setRightComponent(viewService);
    }

    private void renderHealthClubManager(String username) {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<HealthClub> healthClubs = network.get(i).getEnterpriseDirectory().getListOfHealthClub();
            for (int j = 0; j < healthClubs.size(); j++) {
                List<Manager> manager = healthClubs.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(username)) {
                        healthClubManagerPanel healthManagerPanel = new healthClubManagerPanel(systemAdmin, this::viewTaskPanel, this::createOrganization,
                                this::organizationAdminPanel);
                        jSplitPane.setRightComponent(healthManagerPanel);

                    }
                }
            }
        }
    }

    private Network findUserNetworkForHealthClub() {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<HealthClub> healthClubs = network.get(i).getEnterpriseDirectory().getListOfHealthClub();
            for (int j = 0; j < healthClubs.size(); j++) {
                List<Manager> manager = healthClubs.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }

    private Enterprise findUserHealthClub() {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<HealthClub> health = network.get(i).getEnterpriseDirectory().getListOfHealthClub();
            for (int j = 0; j < health.size(); j++) {
                List<Manager> manager = health.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return health.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void viewTaskPanel() {   //view task for health club
        String type = systemAdmin.findUserType(userName);
        HealthClub healthClub = (HealthClub) findUserHealthClub();
        viewTaskPanel viewTask = new viewTaskPanel(systemAdmin, this::healthClubManagerPanel, userName, type, healthClub
        );
        jSplitPane.setRightComponent(viewTask);
    }

    private void createOrganization() {
        Network network = findUserNetworkForHealthClub();
        manageOrganizationPanel org = new manageOrganizationPanel(systemAdmin, this::healthClubManagerPanel, userName, network);
        jSplitPane.setRightComponent(org);
    }

    private void organizationAdminPanel() {   //create org admin for health club
        String type = systemAdmin.findUserType(userName);
        Network network = findUserNetworkForHealthClub();
        organizationAdminPanel orgAdmin = new organizationAdminPanel(systemAdmin, this::healthClubManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void healthClubManagerPanel() {   //go back to healthclub
        jSplitPane.setRightComponent(new healthClubManagerPanel(systemAdmin, this::viewTaskPanel, this::createOrganization, this::organizationAdminPanel));
    }

    private void renderRestaurantManager(String username) {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Restaurant> restaurants = network.get(i).getEnterpriseDirectory().getListOfRestaurants();
            for (int j = 0; j < restaurants.size(); j++) {
                List<Manager> manager = restaurants.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(username)) {
                        restaurantManagerPanel restaurantAssign = new restaurantManagerPanel(systemAdmin, this::renderViewTask1, this::renderRestaurantOrg, this::renderRestaurantAdmin, this::addOrderPanel);
                        jSplitPane.setRightComponent(restaurantAssign);
                    }
                }
            }
        }
    }

    private Network findUserNetworkForRestaurant() {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Restaurant> restaurant = network.get(i).getEnterpriseDirectory().getListOfRestaurants();
            for (int j = 0; j < restaurant.size(); j++) {
                List<Manager> manager = restaurant.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }

    private Enterprise findUserRestaurant() {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Restaurant> restaurant = network.get(i).getEnterpriseDirectory().getListOfRestaurants();
            for (int j = 0; j < restaurant.size(); j++) {
                List<Manager> manager = restaurant.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return restaurant.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask1() {
        String type = systemAdmin.findUserType(userName);
        Restaurant restaurant = (Restaurant) findUserRestaurant();
        viewTaskPanelRestaurant resMan = new viewTaskPanelRestaurant(systemAdmin, this::restaurantManagerPanel, userName, type, restaurant);
        jSplitPane.setRightComponent(resMan);
    }

    private void renderRestaurantOrg() {
        String type = systemAdmin.findUserType(userName);
        Network network = findUserNetworkForRestaurant();
        manageRestaurantOrganisationPanel org = new manageRestaurantOrganisationPanel(systemAdmin, this::restaurantManagerPanel, userName, type, network
        );
        jSplitPane.setRightComponent(org);
    }

    private void renderRestaurantAdmin() { //create organisation admin under restauarant
        String type = systemAdmin.findUserType(userName);
        Network network = findUserNetworkForRestaurant();
        manageRestaurantOrgAdmin orgAdmin = new manageRestaurantOrgAdmin(systemAdmin, this::restaurantManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void addOrderPanel() {
        String type = systemAdmin.findUserType(userName);
        Network network = findUserNetworkForRestaurant();
        addOrderPanel order = new addOrderPanel(systemAdmin, this::restaurantManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(order);
    }

    private void restaurantManagerPanel() {
        jSplitPane.setRightComponent(new restaurantManagerPanel(systemAdmin, this::renderViewTask1, this::renderRestaurantOrg,
                this::renderRestaurantAdmin, this::addOrderPanel));
    }

    private void renderHotelManager(String username) {   //hotel panel
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Hotel> hotel = network.get(i).getEnterpriseDirectory().getListOfHotel();
            for (int j = 0; j < hotel.size(); j++) {
                List<Manager> manager = hotel.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(username)) {
                        hotelManagerPanel hotelPanel = new hotelManagerPanel(systemAdmin, this::renderViewTask2, this::renderHotelOrg,
                                this::renderHotelAdmin, this::renderRoomPanel);
                        jSplitPane.setRightComponent(hotelPanel);

                    }
                }
            }
        }
    }

    private Network findUserNetworkForHotel() {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Hotel> hotel = network.get(i).getEnterpriseDirectory().getListOfHotel();
            for (int j = 0; j < hotel.size(); j++) {
                List<Manager> manager = hotel.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        System.out.println("manager found is " + manager.get(k).getUsername() + " and city is " + network.get(i));
                        return network.get(i);
                    }
                }
            }
        }
        return null;
    }

    private Enterprise findManagerHotel() {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Hotel> hotel = network.get(i).getEnterpriseDirectory().getListOfHotel();
            for (int j = 0; j < hotel.size(); j++) {
                List<Manager> manager = hotel.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return hotel.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask2() {
        String type = systemAdmin.findUserType(userName);
        Hotel hotel = (Hotel) findManagerHotel();
        viewTaskForHotel hotelPanel = new viewTaskForHotel(systemAdmin, this::hotelManagerPanel, userName, type, hotel);
        jSplitPane.setRightComponent(hotelPanel);
    }

    private void renderHotelOrg() {
        String type = systemAdmin.findUserType(userName);
        Network network1 = findUserNetworkForHotel();
        manageHotelOrganisation org = new manageHotelOrganisation(systemAdmin, this::hotelManagerPanel, userName, type, network1);
        jSplitPane.setRightComponent(org);
    }

    private void renderHotelAdmin() {
        String type = systemAdmin.findUserType(userName);
        Network network1 = findUserNetworkForHotel();

        manageHotelOrganisationAdmin orgAdmin = new manageHotelOrganisationAdmin(systemAdmin, this::hotelManagerPanel, userName, type, network1);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void renderRoomPanel() {
        Network network = findUserNetworkForHotel();
        manageRoomPanel room = new manageRoomPanel(systemAdmin, this::hotelManagerPanel, network, userName);
        jSplitPane.setRightComponent(room);
    }

    private void hotelManagerPanel() {
        jSplitPane.setRightComponent(new hotelManagerPanel(systemAdmin, this::renderViewTask2, this::renderHotelOrg, this::renderHotelAdmin, this::renderRoomPanel));
    }

    private void renderEventManager(String username) {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getEnterpriseDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(username)) {
                        eventManagerPanel eventPanel = new eventManagerPanel(systemAdmin, this::renderViewTask3, this::renderEventOrg,
                                this::renderEventAdmin);
                        jSplitPane.setRightComponent(eventPanel);

                    }
                }
            }
        }
    }

    private Network findUserNetworkForEvents() {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getEnterpriseDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }

    private Enterprise findUserEnterprise() {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getEnterpriseDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return event.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void confirmWorkRequestForEvent() {
        List<Network> network = systemAdmin.getListOfNetwork();
        String type = systemAdmin.findUserType(userName);
        for (int i = 0; i < network.size(); i++) {
            confirmEventWorkRequests workRequest = new confirmEventWorkRequests(systemAdmin, userName, type);
            jSplitPane.setRightComponent(workRequest);
        }
    }

    private void renderViewTask3() {     // view Business Event manager panel
        String type = systemAdmin.findUserType(userName);
        BusinessEvent event = (BusinessEvent) findUserEnterprise();
        viewEventTaskPanel eventPanel = new viewEventTaskPanel(systemAdmin, this::eventManagerPanel, userName, type, event);
        jSplitPane.setRightComponent(eventPanel);
    }

    private void renderEventOrg() {     // add an organisation for event
        String type = systemAdmin.findUserType(userName);
        Network network = findUserNetworkForEvents();
        manageEventOrganisation org = new manageEventOrganisation(systemAdmin, this::eventManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(org);
    }

    private void renderEventAdmin() { //create organisation admin under event
        String type = systemAdmin.findUserType(userName);
        Network network = findUserNetworkForEvents();
        manageOrganisationEventAdmin orgAdmin = new manageOrganisationEventAdmin(systemAdmin, this::eventManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void eventManagerPanel() {    //go back to event manager panel
        jSplitPane.setRightComponent(new eventManagerPanel(systemAdmin, this::renderViewTask3, this::renderEventOrg, this::renderEventAdmin));
    }
}
