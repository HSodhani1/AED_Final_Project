package Business.Model;

/**
 *
 * @author Hardik
 */

public class Manager extends Person {

    private String contact;

    public Manager(String name,String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}
