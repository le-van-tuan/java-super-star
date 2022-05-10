package vn.sps.collections;

public class Car {
    private String branchName;

    public Car(String branchName) {
        this.branchName = branchName;
    }

    public static void F1(Car car) {
        car = new Car("Toyota");
    }

    public static void F2(String name) {
        name = "Ford";
    }

    public static void F3(Car car) {
        car.branchName = "Lexus";
    }

    public String getBranchName() {
        return branchName;
    }
}
