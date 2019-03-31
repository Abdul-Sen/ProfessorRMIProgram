package WS10;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CarClient {
    public static void main(String [] args)
    {

        try {
            Car car = new Car("Toyota","Red",1996);
            System.out.println(car);
            PlateInterface c = (PlateInterface) Naming.lookup("rmi://localhost/CalculatePlate");
           car = c.generatePlate(car);
            System.out.println(car);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
