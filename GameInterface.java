import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GameInterface extends Remote {
  public Vue run() throws RemoteException;
}
