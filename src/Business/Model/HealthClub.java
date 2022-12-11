package Business.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hardik
 */

public class HealthClub extends Enterprise {

    private List<Manager> listOfManager;
    private List<PhysicianOrg> listOfPhysicianOrg;
    private List<TrainerOrg> listOfTrainerOrg;
    private List<TherapistOrg> listOfTherapistOrg;

    HealthClub(String name, String contact) {
        super(name, contact);
        listOfManager = new ArrayList<>();
        listOfPhysicianOrg = new ArrayList<>();
        listOfTrainerOrg = new ArrayList<>();
        listOfTherapistOrg = new ArrayList<>();
    }

    public List<TherapistOrg> getListOfTherapistOrg() {
        return listOfTherapistOrg;
    }

    public void setListOfTherapistOrg(List<TherapistOrg> listOfTherapistOrg) {
        this.listOfTherapistOrg = listOfTherapistOrg;
    }

    public List<PhysicianOrg> getListOfPhysicianOrg() {
        return listOfPhysicianOrg;
    }

    public void setListOfPhysicianOrg(List<PhysicianOrg> listOfPhysicianOrg) {
        this.listOfPhysicianOrg = listOfPhysicianOrg;
    }

    public List<TrainerOrg> getListOfTrainerOrg() {
        return listOfTrainerOrg;
    }

    public void setListOfTrainerOrg(List<TrainerOrg> listOfTrainerOrg) {
        this.listOfTrainerOrg = listOfTrainerOrg;
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public Manager addManager(String name, String username, String password) {
        Manager manager = new Manager(name, username, password);
        listOfManager.add(manager);
        System.out.println("size of manager in health club is " + listOfManager.size() + " name is " + manager.getUsername());
        return manager;
    }

    public Manager findManager(String username) {
        for (Manager man : listOfManager) {
            if (man.getUsername().equals(username)) {
                return man;
            }
        }
        return null;
    }

    public void addPhysicianOrg(String name, String contact, String city) {
        PhysicianOrg physicianOrg = new PhysicianOrg(name, contact, city);
        listOfPhysicianOrg.add(physicianOrg);
    }

    public void addTherapistOrg(String name, String contact, String city) {
        TherapistOrg therapistOrg = new TherapistOrg(name, contact, city);
        listOfTherapistOrg.add(therapistOrg);
    }

    public void addTraineOrg(String name, String contact, String networkName) {
        TrainerOrg trainerOrg = new TrainerOrg(name, contact, networkName);
        listOfTrainerOrg.add(trainerOrg);
    }
    
    public String toString() {
        return name;
    }

    public void deleteManager(Manager man) {
        listOfManager.remove(man);
    }

    public void deletePhysician(PhysicianOrg physician) {
      listOfPhysicianOrg.remove(physician);
    }

    public void deleteTrainer(TrainerOrg trainer) {
        listOfTrainerOrg.remove(trainer);
    }

    public void deleteTherapist(TherapistOrg therapist) {
           listOfTherapistOrg.remove(therapist);
    }
}
