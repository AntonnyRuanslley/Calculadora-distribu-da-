
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RM2Server {
    public static void main (String args [ ]) {
        //Cria e instala o security manager
        //System.setSecurityManager(new RMISecurityManager() );
        try {
            Registry registry = LocateRegistry.createRegistry(150);

            RM2Impl obj = new RM2Impl();
            registry.rebind("RM2Server", obj);
            System.out.println("RM2Server pronto.");
        } catch(Exception e) {
            System.out.println("RM2Server erro"+ e.getMessage());
        }
    }
}
