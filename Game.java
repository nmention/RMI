import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Game extends UnicastRemoteObject implements GameInterface {
  Vue vue;

  public Game(Vue vue) throws RemoteException {
    super();
    this.vue = vue;
  }


  @Override
  public Vue run() {
      return vue;
  }
}
