package db;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import Business.Model.SystemAdmin;


/**
 *
 * @author Shreya
 */

public class DbUtils {

    private static DbUtils dbUtils;

    private DbUtils() {

    }

    public static DbUtils getInstance() {
        if (dbUtils == null) {
            dbUtils = new DbUtils();
        }
        return dbUtils;
    }

    private ObjectContainer createConnection() {
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().activationDepth(Integer.MAX_VALUE);
        config.common().objectClass(SystemAdmin.class).updateDepth(Integer.MAX_VALUE);
        config.common().objectClass(SystemAdmin.class).cascadeOnUpdate(true);

        ObjectContainer db = Db4oEmbedded.openFile(config, "database/FeelHome.db4o");
        return db;
    }

    public synchronized void storeSystem(SystemAdmin system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public SystemAdmin retrieveSystem() {
        try {
            ObjectContainer conn = createConnection();
            ObjectSet<SystemAdmin> systems = conn.query(SystemAdmin.class); // Change to the object you want to save
            SystemAdmin system;
            if (systems.isEmpty()) {
                system = SystemAdmin.createSystemAdmin();
            } else {
                system = systems.get(systems.size() - 1);
            }
            conn.close();
            return system;
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return null;
    }

}
