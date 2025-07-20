package question1;

public class Car extends Vehicle {
    int numberOfDoor;

    public Car(String brand, int numberOfDoor) {
        super(brand);
        this.numberOfDoor = numberOfDoor;
    }

    @Override
    public void move() {
        System.out.println("Car move");
    }

    @Override
    public String toString() {
        return "자동차입니다." +
                "문의 갯수는 " + numberOfDoor +
                " 브랜드는 " + brand + "입니다";
    }

    @Override
    public void startEngine() {
        System.out.println("Car startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car stopEngine");
    }
}

