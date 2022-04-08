package vn.sps.oops.encapsulation;

public class ApplicationTesting {

    public static void main(String[] args) {
        Car car = new Car();
        car.totalSeats = 10;
        car.toPrettyString();
        car.defaultAccessModifier();
        car.test();

        Vehicle vehicle = new Car();
        vehicle.printVehicleName();
    }
}
