package question1;

public abstract class Vehicle implements VehicleService {
    protected String brand;
    
    // 생성자를 통해  brand 초기화
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    // 하위 클래스에서 구현해야 하는 추상 메서드
    public abstract void move();

    public String getBrand() {
        return brand;
    }

}
