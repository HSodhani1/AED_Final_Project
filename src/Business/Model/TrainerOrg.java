package Business.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hardik
 */

public class TrainerOrg extends Organization {

    private List<Trainer> listOfTrainer;

    public TrainerOrg(String name, String contact, String city) {
        super(name, contact, city);
        listOfTrainer = new ArrayList<>();
    }
    
    public void addTrainer(String name, String city, String user, String password1) {
        Trainer trainer = new Trainer(name, city, user, password1);
        listOfTrainer.add(trainer);
    }
      public void deleteManager(Manager man) {
     listOfManager.remove(man);
    }
  
}
