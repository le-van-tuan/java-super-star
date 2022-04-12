package vn.sps.oops.trashtest;

import vn.sps.oops.shared.GenericJson;

public class Car extends GenericJson {

    public static String BRAND = "Tesla";

    private final int numberOfWheels;

    private String name;

    public Car() {
        numberOfWheels = 10;
    }

    public Car(String name) {
        this.numberOfWheels = 10;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
