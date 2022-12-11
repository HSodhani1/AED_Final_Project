package Business.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hardik
 */

public class TransportationOrg extends Organization {

    private List<Transportation> listOfTransportation;

    public TransportationOrg(String name, String contact, String city) {
        super(name, contact, city);
        listOfTransportation = new ArrayList<>();
    }

    public List<Transportation> getListOfTransportation() {
        return listOfTransportation;
    }

    public void setListOfTransportation(List<Transportation> listOfTransportation) {
        this.listOfTransportation = listOfTransportation;
    }

    public void addTransportationman(String name, String city, String user, String password1) {
        Transportation transportation = new Transportation(name, city, user, password1);
        listOfTransportation.add(transportation);
        System.out.println("Deliveryman manager added is " + listOfTransportation.size());
    }

    public void deleteManager(Manager man) {
       listOfManager.remove(man);
    }
}
