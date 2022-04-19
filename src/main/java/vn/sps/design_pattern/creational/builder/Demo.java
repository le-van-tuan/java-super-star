package vn.sps.design_pattern.creational.builder;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .withColor("Red")
                .withName("Mercedes")
                .withPrice(3501)
                .build();
        car.toPrettyString();
    }
}
