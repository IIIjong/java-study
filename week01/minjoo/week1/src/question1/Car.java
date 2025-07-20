package question1;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void move() {
        System.out.println(brand + " car is moving on the road");
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " car is starting engine on the road");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " car is stopping engine on the road");
    }


    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", brand='" + brand + '\'' +
                '}';
    }
}
