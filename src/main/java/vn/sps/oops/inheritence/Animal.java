package vn.sps.oops.inheritence;

public abstract class Animal implements AnimalBehavior {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void bark() {
        System.out.println("Animal barking...");
    }
}
