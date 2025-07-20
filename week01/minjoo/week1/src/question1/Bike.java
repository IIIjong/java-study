package question1;

public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, boolean hasCarrier) {
        super(brand);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void move() {
        System.out.println(brand + " bike is moving");
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " bike is starting engine on the road");
    }
    @Override
    public void stopEngine() {
        System.out.println(brand + " bike is stopping engine on the road");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "hasCarrier=" + hasCarrier +
                ", brand='" + brand + '\'' +
                '}';
    }
}
