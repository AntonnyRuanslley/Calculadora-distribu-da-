
import java.rmi.*;

public interface RM1 extends Remote {
    float subtracao(float a, float b) throws RemoteException;
    float adicao(float a, float b) throws RemoteException;
    float divisao(float x, float y) throws RemoteException;
    float multiplicacao(float a, float b) throws RemoteException;
}
