package vn.sps.oops.inheritence;

public class BaseAnimal extends Animal {
    protected void eat() {
        System.out.println("animal eating...");
    }

    @Override
    public void bark() {
        System.out.println("BaseAnimal is barking...");
    }
}
