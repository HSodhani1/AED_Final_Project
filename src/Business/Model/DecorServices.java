package Business.Model;

/**
 *
 * @author Hardik
 */

public class DecorServices extends Organization {

    public DecorServices(String name, String contact, String city) {
        super(name, contact, city);
    }

    public enum DecorType {
        STANDARD(50, "Standard", "Includes ballon decoration"),
        GOLD(100, "Gold", "Includes flower decoration and fire-works"),
        PLATINUM(200, "Platinum", "Includes flower decoration,fire-works and customised cake");

        private final int rate;
        private final String name;
        private final String description;

        private DecorType(int rate, String name, String description) {
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

        public String getDescription() {
            return description;
        }

        public String toString() {
            return name + "(" + description + ")";
        }
    }

    public void deleteManager(Manager man) {
        listOfManager.remove(man);
    }

}
