package vn.sps.oops.inheritence;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTesting {
    public static void main(String[] args) {
        Dog dog = new Dog(2, "Bruw");
        dog.bark();
        List<BaseAnimal> animalList = new ArrayList<>();
        animalList.add(new Dog(2, "Bruw"));
        animalList.add(new Cat("Meow"));
        AnimalFeeder.feeds(animalList);

        AnimalBehavior animalBehavior = new Dog(1, "Bruw"); // upcasting
        Dog downCastingDog = (Dog) animalBehavior; // down-casting
        downCastingDog.bark();

        if (Dog.class.isInstance(animalBehavior)) {
            Dog castedDog = Dog.class.cast(animalBehavior);
            castedDog.eat();
        }

        AnimalFeederGeneric<Dog> dogAnimalFeederGeneric = new AnimalFeederGeneric<>(Dog.class);
        System.out.println(dogAnimalFeederGeneric.feeds(animalList).size());
    }
}
