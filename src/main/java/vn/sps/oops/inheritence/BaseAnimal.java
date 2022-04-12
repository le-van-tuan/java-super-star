package vn.sps.oops.inheritence;

public class BaseAnimal extends Animal {

    protected BaseAnimal(String name) {
        super(name);
    }

    protected void eat() {
        System.out.println("animal eating...");
    }

    @Override
    public void bark() {
        System.out.println("BaseAnimal is barking...");
    }

    protected final void finalMethod() {
        System.out.println("final method");
    }
}
