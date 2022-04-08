package vn.sps.oops.encapsulation;

public class Car extends Vehicle {
    private int totalWheels;

    String colour;

    protected int totalSeats;

    public double price;

    void defaultAccessModifier() {
        System.out.println("default");
    }

    protected void test() {
        super.shortVehicleName();
        super.printVehicleName();
    }
}
