package vn.sps.oops.polymorphism;

public class Application {

    /**
     * @param args
     * As you see, we just declared an shape object, but it has difference display value for every time we call display?
     * Why, Because Display method in Circle and Rectangle has override from Shape Class(SuperClass)
     * So, we call it in OOP [Polymorphism]
     *
     * It is also upcasting in Java, see full example at vn.sps.oops.inheritance
     */
    public static void main(String[] args) {
        /* GO OUT */
        Shape shape = new Shape();
        shape.display();

        /* GO HOME */
        shape = new Circle();
        shape.display();

        /* GO TO SCHOOL */
        shape = new Rectangle();
        shape.display();
    }
}
