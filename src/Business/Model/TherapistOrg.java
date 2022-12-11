package Business.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hardik
 */

public class TherapistOrg extends Organization {

    private List<Therapist> listOfTherapist;

    public TherapistOrg(String name, String contact, String city) {
        super(name, contact, city);
        listOfTherapist = new ArrayList<>();
    }

    public List<Therapist> getListOfTherapist() {
        return listOfTherapist;
    }

    public void setListOfTherapist(List<Therapist> listOfTherapist) {
        this.listOfTherapist = listOfTherapist;
    }

    public void addTherapist(String name, String city, String user, String password1) {
        Therapist therapist = new Therapist(name, city, user, password1);
        listOfTherapist.add(therapist);
    }

    public void deleteManager(Manager man) {
        listOfManager.remove(man);
    }

}
