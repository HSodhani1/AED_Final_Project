package Business.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hardik
 */

public class DeliveryMan extends Person {

    private String city;
    List<Order> list = new ArrayList<>();

    public DeliveryMan(String name, String city, String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Order> getList() {
        return list;
    }

    public void setList(List<Order> list) {
        this.list = list;
    }

    public void addOrder(Order order) {
        list.add(order);
    }

    public Order findOrder(String orderId) {
        for (int i = 0; i < list.size(); i++) {
            if (orderId.equals(list.get(i).getId())) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }

}
