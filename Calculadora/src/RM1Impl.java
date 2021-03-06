
import java.rmi.*;
import java.rmi.server.*;

public class RM1Impl extends UnicastRemoteObject implements RM1{
    public RM1Impl() throws RemoteException {
        super();
    }
    public float subtracao(float a, float b) throws RemoteException {
        return a - b;
    }
    public float adicao(float a, float b) throws RemoteException {
        return a + b;
    }
    public float divisao(float x, float y) throws RemoteException {
        return (x / y);
    }
    public float multiplicacao(float a, float b) throws RemoteException {
        return a * b;
    }
}
