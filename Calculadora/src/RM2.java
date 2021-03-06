import java.rmi.*;

public interface RM2 extends Remote {
    double raizQuadrada(double a, double b) throws RemoteException;
    double potenciacao(double a, double b) throws RemoteException;
    float porcentagem(float a, float b) throws RemoteException;
}
