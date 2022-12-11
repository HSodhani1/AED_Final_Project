package Business.Model;

import java.util.List;

/**
 *
 * @author Hardik
 */

public class CateringService extends Organization {

    public CateringService(String name, String contact, String city) {
        super(name, contact, city);
    }

    public enum CateringType {
        STANDARD(50, "Standard", "Includes 1 starter and 1 entreee"),
        GOLD(100, "Gold", "Includes 1 starter and 2 entrée"),
        PLATINUM(200, "Platinum", "Includes 2 starter, 2 entree and 1 dessert");

        private final int rate;
        private final String name;
        private final String description;

        private CateringType(int rate, String name, String description) {
            this.rate = rate;
            this.name = name;
            this.description = description;
        }

        public int getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return getName() + " (" + rate + "$ per night)";
        }
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

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public Manager addManager(String name, String city, String user, String password1) {
        Manager manager = new Manager(name, user, password1);
        listOfManager.add(manager);
        return manager;
    }

    public void deleteManager(Manager man) {
        listOfManager.remove(man);
    }

}
