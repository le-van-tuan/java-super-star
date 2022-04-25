package vn.sps.oops.encapsulation;

public class Car extends Vehicle {
    private int totalWheels;

    String colour;

    protected int totalSeats;

    public double price;

    protected Car(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    void defaultAccessModifier() {
        System.out.println("default");
    }

    protected void test() {
        defaultAccessModifier();
        super.shortVehicleName();
        super.printVehicleName();
    }

    protected void staticProtected() {
        System.out.println("Static protected...");
    }
}
