package question1;

public class Main {
    public static void main(String[] args) {

        //Car car = new Car("기아",4);
        Bike bike = new Bike("종원",false);
        bike.setHasCarrier(true);
        bike.hasCarrier=true;
        //System.out.println(car.toString());

        Vehicle [] vehicles = new Vehicle[2];
        vehicles[0] = new Car("기아",4);
        vehicles[1] = new Bike("종원",false);

        /*for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
            System.out.println(vehicles[i].toString());
        }*/
        //여기서 궁금증 car랑 bike 객체마다 고유로 재정의한 메서드는 어덯게 호출할까?

        for (Vehicle vehicle : vehicles) {

            if (vehicle instanceof Car) {
                vehicle = (Car) vehicle;
                System.out.println(vehicle.toString());
                vehicle.startEngine();
                vehicle.move();
                vehicle.stopEngine();
            }
            if (vehicle instanceof Bike) {
                vehicle = (Bike) vehicle;
                System.out.println(vehicle.toString());
                vehicle.startEngine();
                vehicle.move();
                vehicle.stopEngine();
            }
            System.out.println();
        }
    }
}
