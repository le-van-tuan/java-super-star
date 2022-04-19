package vn.sps.design_pattern.creational.shape_factory;

public class Demo {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("Circle");
        shape.draw();

        shape = ShapeFactory.getShape("Triangle");
        shape.draw();
    }
}
