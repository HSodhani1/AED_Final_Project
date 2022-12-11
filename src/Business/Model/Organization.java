package Business.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hardik
 */

public abstract class Organization {

    protected String name;
    protected String city;
    protected String contact;
    protected List<Manager> listOfManager;

    public Organization(String name, String contact, String city) {
        this.name = name;
        this.city = city;
        this.contact = contact;
        this.listOfManager = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }
    
    public Manager addManager(String name, String city, String user, String password) {
        Manager manager = new Manager(name, user, password);
        listOfManager.add(manager);
        return manager;
    }
    
    
    public String toString() {
        return name;
    }
}
