package Business.Model;

/**
 *
 * @author Hardik
 */

public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public Network(String name) {
        this.name = name;
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
   

    public String toString()

    {
        return name;
    }
}
