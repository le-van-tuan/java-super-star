package vn.sps.oops.inheritence;

import java.util.ArrayList;
import java.util.List;

public class AnimalFeederGeneric<T> {

    private final Class<T> type;

    public AnimalFeederGeneric(Class<T> type) {
        this.type = type;
    }

    public List<T> feeds(List<BaseAnimal> baseAnimals) {
        List<T> result = new ArrayList<>();
        for (BaseAnimal baseAnimal : baseAnimals) {
            if (type.isInstance(baseAnimal)) {
                T object = type.cast(baseAnimal);
                result.add(object);
            }
        }
        return result;
    }
}
