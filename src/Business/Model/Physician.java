package Business.Model;

/**
 *
 * @author Hardik
 */

public class Physician extends Person {

    private String city;

    public Physician(String name, String city, String username, String password) {
        this.name = name;
        this.city = city;
        this.username = username;
        this.password = password;
    }

    public String getCity() {
        return city;
    }
}
