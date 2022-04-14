package vn.sps.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Person person = new Person();
        person.setName("Robin Lee");
        person.setAge(25);

        Class<?> clazz = Class.forName("vn.sps.reflection.Person");
        /**
         * Fields
         */
        for (Field declaredField : clazz.getDeclaredFields()) {
            System.out.println("Field: " + declaredField.getName() + " - type: " + declaredField.getType());
        }

        /**
         * Methods
         */
        for (Method method : clazz.getDeclaredMethods()) {
            if (!Objects.equals(method.getAnnotatedReturnType().getType().getTypeName(), "void")) {
                Object value = method.invoke(person);
                System.out.println("method: " + method.getName() + " - " + value);
            }
        }

        /**
         * Create new object
         */
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
        Object instance = constructor.newInstance("Cute Lee", 30);
        if (instance instanceof Person) {
            Person castedPerson = (Person) instance;
            castedPerson.toPrettyString();
        }
    }
}
