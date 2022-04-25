package vn.sps.oops.encapsulation;

public class ApplicationTesting {

    public static void main(String[] args) {
        Car car = new Car(2);

        car.toPrettyString();
        car.defaultAccessModifier();
        car.test();
        car.staticProtected();

        Vehicle vehicle = new Car(2);
        vehicle.printVehicleName();
    }
}
