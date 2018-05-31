import java.rmi.RemoteException;

/**
 * Created by Yon MomBoy on 5/31/2018.
 */
public class Greet implements Hello {
    @Override
    public void printMessage()  {
        System.out.println("welcome to java");
    }
}
