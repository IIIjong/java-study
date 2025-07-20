package question1;

public class Main {
    public static void main(String[] args) {
        Vehicle [] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Ford", 4);
        vehicles[1] = new Car("Chevy", 4);

        for(Vehicle vehicle : vehicles){
            if(vehicle instanceof Car){
                vehicle = (Car) vehicle;
                System.out.println(vehicle.toString());
                vehicle.startEngine();
                vehicle.move();
                vehicle.stopEngine();
            }
            if(vehicle instanceof Bike){
                vehicle = (Bike) vehicle;
                System.out.println(vehicle.toString());
                vehicle.startEngine();
                vehicle.move();
                vehicle.stopEngine();
            }
            System.out.println();
        }

//        System.out.println(car.toString());
//        System.out.println(bike.toString());
//        car.startEngine();
//        bike.startEngine();
//        System.out.println(car.toString());
//        System.out.println(bike.toString());

        /*Vehicle [] vehicles = new Vehicle[2];
        vehicles[0] = car;
        vehicles[1] = bike;*/
//
//        for (Vehicle v : vehicles) {
//            System.out.println(v);
//        }

    }

}
