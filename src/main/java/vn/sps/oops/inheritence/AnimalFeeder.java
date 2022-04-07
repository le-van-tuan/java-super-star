package vn.sps.oops.inheritence;

import java.util.List;

public class AnimalFeeder {

    public static void feeds(List<BaseAnimal> animals) {
        animals.forEach(baseAnimal -> {
            baseAnimal.eat();
            if (baseAnimal instanceof Dog) {
                ((Dog) baseAnimal).bark();
            }
        });
    }
}
