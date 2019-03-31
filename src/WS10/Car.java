package WS10;
import java.io.Serializable;

public class Car implements Serializable {

   private String model;
   private String color;
   private double mileage;
   private int plate;

    Car()
    {
        model = null;
        color = null;
        mileage = 0;
        plate = 0;
    }

    public Car(String model, String color, double mileage) {
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        plate = 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", plate=" + plate +
                '}';
    }

    public int getPlate() {
        return plate;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

}
