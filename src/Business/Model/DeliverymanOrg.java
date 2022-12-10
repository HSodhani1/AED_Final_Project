package Business.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hardik
 */

public class DeliverymanOrg extends Organization{

    private List<DeliveryMan> listOfDeliveryMan;

  public DeliverymanOrg(String name, String contact, String city) {
        super(name, contact, city);
        this .listOfDeliveryMan = new ArrayList<>();
    }
  
    public List<DeliveryMan> getListOfDeliveryMan() {
        return listOfDeliveryMan;
    }

    public void setListOfDeliveryMan(List<DeliveryMan> listOfDeliveryMan) {
        this.listOfDeliveryMan = listOfDeliveryMan;
    }

    public void addDeliveryman(String name, String city, String user, String password1) {
        DeliveryMan del = new DeliveryMan(name, city, user, password1);
        listOfDeliveryMan.add(del);
        System.out.println("Deliveryman manager added is " + listOfDeliveryMan.size());
    }

    public void deleteDeliveryman(DeliverymanOrg del) {
     listOfDeliveryMan.remove(del);
    }

    public void deleteManager(Manager man) {
      listOfManager.remove(man);
    }

}
