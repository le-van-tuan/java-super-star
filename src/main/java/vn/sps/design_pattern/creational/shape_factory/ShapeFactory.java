package vn.sps.design_pattern.creational.shape_factory;

public class ShapeFactory {
    public static Shape getShape(String type) {
        Shape shape;
        switch (type) {
            case "Circle":
                shape = new Circle();
                break;
            case "Rectangle":
                shape = new Rectangle();
                break;
            default:
                throw new RuntimeException("Shape with type: " + type + " is not supported!");
        }
        return shape;
    }
}
