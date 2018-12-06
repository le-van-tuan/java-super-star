package vn.sps.design_pattern.creational.factory_pattern.product;

public class HtmlButton implements Button {

    public void render() {
        System.out.println("HTML button is rendering...");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
