package vn.sps.oops.encapsulation;

import vn.sps.oops.shared.GenericJson;

public abstract class Vehicle extends GenericJson {

    protected void printVehicleName() {
        System.out.println("This is vehicle");
    }

    private double getVehiclePrice() {
        return 10;
    }

    void shortVehicleName() {
        System.out.println("Short name");
    }
}
