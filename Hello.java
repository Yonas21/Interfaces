import java.rmi.Remote;

/**
 * Created by Yon MomBoy on 5/31/2018.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Hello extends Remote {
    void printMessage() throws RemoteException ;
}
