package WS10;

import java.rmi.RemoteException;

public class ServerCar extends java.rmi.server.UnicastRemoteObject implements PlateInterface {

    ServerCar() throws java.rmi.RemoteException{
        super();
    }

    @Override
    public Car generatePlate(Car c) throws RemoteException {
        System.out.println("Inside server Object's generatePlate");
        c.setPlate(c.hashCode());
        System.out.println("New plate number is: " + c.hashCode());
        return c;
    }
}