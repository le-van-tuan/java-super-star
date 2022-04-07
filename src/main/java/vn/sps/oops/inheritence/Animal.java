package vn.sps.oops.inheritence;

public abstract class Animal implements AnimalBehavior {

    @Override
    public void bark() {
        System.out.println("Animal barking...");
    }
}
