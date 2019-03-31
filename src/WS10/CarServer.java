package WS10;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class CarServer {
    public static void main(String[] args)
    {
       new CarServer(); //Running on that url
    }

    public CarServer() {
        try {
           ServerCar sc = new ServerCar();
            Naming.rebind("rmi://localhost:1099/CalculatePlate", sc);
            System.out.println("RMI object bound to 'Car' and ready to use");
            System.out.println(sc + "\nThis is from server ");

        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
