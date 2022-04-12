package vn.sps.oops.trashtest;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Application {
    public static void main(String[] args) throws JsonProcessingException {
        Car car = new Car("Tesla");
        car.setName("G63");

        Car mer = car.deepCopy(Car.class);
        mer.setName("Mercedes");

        car.toPrettyString();
        mer.toPrettyString();

        /**
         * '==' compare Reference address
         * '.equals' method compare object content
         */
        String s1 = new String("Tuan");
        String s2 = new String("Tuan");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(Integer.toHexString(s1.hashCode()));
        System.out.println(Integer.toHexString(s2.hashCode()));

        String name = "baeldung";
        String newName = name.replace("dung", "----");
        System.out.println("name: " + name);
        System.out.println("newName: " + newName);

        StringBuffer stringBuffer = new StringBuffer("TuanCute");
        stringBuffer.replace(0, 2, "Cuteo");
        System.out.println(stringBuffer);
    }
}
