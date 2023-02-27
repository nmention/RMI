import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
  public static void main(String[] args) {

    String hostname = args[0];
    try {
      GameInterface gameInterface = (GameInterface) Naming.lookup("rmi://" + hostname + ":2001/MyGame");
      Vue vue = gameInterface.run();
      System.out.println(vue.grid);
    } catch (NotBoundException | MalformedURLException | RemoteException e) {
      throw new RuntimeException(e);
    }


  }
}
