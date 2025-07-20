package question1;

public abstract class Vehicle implements VehicleService {
    String brand;


    public Vehicle(String brand) {
        this.brand = brand;
    }



    public abstract void move();
}
