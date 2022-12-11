package Model.services;


import java.util.Date;
import Business.Model.Restaurant;

/**
 *
 * @author Aparna
 */

public class RestaurantService extends Service {

    private String menuItem;

    public RestaurantService(Restaurant res, Date eventDate, String menuItem, int cost) {
        super(res, Service.ServiceType.RESTURANT, eventDate);
        this.menuItem = menuItem;
        super.totalCost = cost;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nRestaurant order details:");
        sb.append("\n").append(TAB).append("Restaurant name: ").append(enterprise);
        sb.append("\n").append(TAB).append("Order item: ").append(menuItem);
        sb.append("\n").append(TAB).append("Total cost for restaurant: $").append(totalCost);
        sb.append("\n").append(TAB).append("Date of order: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());
        return sb.toString();
    }
}
