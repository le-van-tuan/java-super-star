package vn.sps.oops.inheritence;

public class Dog extends BaseAnimal {

    private int legs;

    public Dog(int legs) {
        this.legs = legs;
    }

    @Override
    protected void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void bark() {
        System.out.println("Dog is barking...");
    }
}
