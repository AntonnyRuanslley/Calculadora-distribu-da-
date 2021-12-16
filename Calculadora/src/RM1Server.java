
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RM1Server {
    public static void main (String args [ ]) {
        //Cria e instala o security manager
        //System.setSecurityManager(new RMISecurityManager() );
        try {
            Registry registry = LocateRegistry.createRegistry(160);

            RM1Impl obj = new RM1Impl();
            registry.rebind("RM1Server", obj);
            System.out.println("RM1Server pronto.");
        } catch(Exception e) {
            System.out.println("RM1Server erro"+ e.getMessage());
        }
    }
}
