import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class CalculatorServer{
    public CalculatorServer(){
        Calculator cal = null;
        try {
            cal = new CalculatorImpl();
            try {
                Naming.rebind("rmi://localhost:1099/CalculatorService",cal);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        new CalculatorServer();
    }
}