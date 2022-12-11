package Business.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hardik
 */

public class Restaurant extends Enterprise {

    private List<Manager> listOfManager;
    private List<Order> listOfOrder;
    private List<MenuItem> listOfItem;
    private List<DeliverymanOrg> listOfDeliveryManOrg;

    public Restaurant(String name, String contact) {
        super(name, contact);
        listOfManager = new ArrayList<>();
        listOfOrder = new ArrayList<>();
        listOfItem = new ArrayList<>();
        listOfDeliveryManOrg = new ArrayList<>();
    }

    public List<MenuItem> getListOfItem() {
        return listOfItem;
    }

    public void setListOfItem(List<MenuItem> ListOfItem) {
        this.listOfItem = ListOfItem;
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public List<Order> getListOfOrder() {
        return listOfOrder;
    }

    public void setListOfOrder(List<Order> listOfOrder) {
        this.listOfOrder = listOfOrder;
    }

    public List<DeliverymanOrg> getListOfDeliveryManOrg() {
        return listOfDeliveryManOrg;
    }

    public void setListOfDeliveryManOrg(List<DeliverymanOrg> listOfDeliveryManOrg) {
        this.listOfDeliveryManOrg = listOfDeliveryManOrg;
    }

    public Manager addManager(String name, String username, String password) {
        Manager manager = new Manager(name, username, password);
        listOfManager.add(manager);
        return manager;
    }

    public Manager findManager(String username) {
        for (Manager man : listOfManager) {
            if (man.getUsername().equals(username)) {
                return man;
            }
        }
        return null;
    }

    public void addDeliverymanOrg(String name, String contact, String networkName) {
        DeliverymanOrg del = new DeliverymanOrg(name, contact, networkName);
        listOfDeliveryManOrg.add(del);
    }

    public void addItem(String item, int price) {
        listOfItem.add(new MenuItem(item, price));
    }

    public void deleteManager(Manager man) {
        listOfManager.remove(man);
    }
}
