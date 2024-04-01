package HW_2_2;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);
        Car car1 = new Car("car1",4,1);
        Car car2 = new Car("car2",4,1);
        Truck truck1 = new Truck("track1",6,1,1);
        Truck truck2 = new Truck("track2",8,1,1);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.service(bicycle1.getModelName(), bicycle1.getWheelsCount());
        serviceStation.service(bicycle2.getModelName(), bicycle2.getWheelsCount());
        serviceStation.service(car1.getModelName(), car1.getWheelsCount(), car1.getEngine());
        serviceStation.service(car2.getModelName(), car2.getWheelsCount(), car2.getEngine());
        serviceStation.service(truck1.getModelName(), truck1.getWheelsCount(), truck1.getEngine(), truck1.getTrailer());
        serviceStation.service(truck2.getModelName(), truck2.getWheelsCount(), truck2.getEngine(), truck2.getTrailer());


    }
}