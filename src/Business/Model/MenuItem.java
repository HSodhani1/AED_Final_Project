package Business.Model;

/**
 *
 * @author Hardik
 */

public class MenuItem {

    private String details;
    private int price;

    public MenuItem(String item, int price) {
        this.details = item;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String toString() {
        return details + " ($" + price + ")";
    }
}
