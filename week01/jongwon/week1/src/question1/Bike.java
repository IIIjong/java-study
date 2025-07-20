package question1;

public class Bike extends Vehicle {
    boolean hasCarrier;


    public Bike(String brand, boolean hasCarrier) {
        super(brand);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public String toString() {
        return "자전거 입니다 " +
                "수납공간은 " + hasCarrier +
                " 브랜드는 " + brand + "입니다";
    }

    @Override
    public void move() {
        System.out.println("Bike move");
    }

    @Override
    public void startEngine() {
        System.out.println("Bike startEngine");
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike stopEngine");
    }
}
