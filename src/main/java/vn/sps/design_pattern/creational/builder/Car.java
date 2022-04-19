package vn.sps.design_pattern.creational.builder;

import vn.sps.shared.GenericJson;

public class Car extends GenericJson {

    private final String name;

    private final String make;

    private final String model;

    private final double price;

    private final String color;

    private Car(CarBuilder carBuilder) {
        this.name = carBuilder.name;
        this.make = carBuilder.make;
        this.model = carBuilder.model;
        this.price = carBuilder.price;
        this.color = carBuilder.color;
    }

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public static class CarBuilder {

        private String name;

        private String make;

        private String model;

        private double price;

        private String color;

        public CarBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder withMake(String make) {
            this.make = make;
            return this;
        }

        public CarBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public CarBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            this.validateCarData();
            return new Car(this);
        }

        private void validateCarData() {
        }
    }
}
