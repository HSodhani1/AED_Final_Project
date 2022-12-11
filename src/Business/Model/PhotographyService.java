package Business.Model;

/**
 *
 * @author Hardik
 */

public class PhotographyService extends Organization {

   
    public static enum PhotographyType {
        STANDARD(50, "Standard", "Includes 1 candid photograher"),
        GOLD(100, "Gold", "Includes 1 candid photograher and 1 videographer"),
        PLATINUM(200, "Platinum", "Includes 2 candid photograhers and 2 videographers");

        private final int rate;
        private final String name;
        private final String description;

        private PhotographyType(int rate, String name, String description) {
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
            return getName() + " (" + description + ")";
        }
    }

    public PhotographyService(String name, String contact, String city) {
        super(name, contact, city);
    }

    public Manager addManager(String name, String city, String user, String password1) {
        Manager manager = new Manager(name, user, password1);
        listOfManager.add(manager);
        System.out.println("size of manager in health club is " + listOfManager.size() + " name is " + manager.getUsername());
        return manager;
    }
     public void deleteManager(Manager man) {
        listOfManager.remove(man);
    }

}
