package WS10;

import java.rmi.RemoteException;

public interface PlateInterface extends java.rmi.Remote {
   Car generatePlate(Car c) throws RemoteException;
}