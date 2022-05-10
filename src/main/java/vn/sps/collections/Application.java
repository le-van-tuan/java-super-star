package vn.sps.collections;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        String[] arrayStr = new String[2];
        String testStr[] = new String[2];

        int ints[] = new int[3];
        int[] testInts = new int[3];

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("c");
        stringList.add("b");
        stringList.add("a");
        System.out.println("ArrayList...");
        stringList.set(0, "Robin");
        stringList.forEach(System.out::println);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("b");
        stringSet.add("c");
        stringSet.add("a");
        stringSet.add("c");
        System.out.println("HashSet ....");
        stringSet.forEach(System.out::println);

        Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.add("1");
        stringQueue.add("2");
        stringQueue.add("3");
        System.out.println("PriorityQueue");
        stringQueue.forEach(System.out::println);
        stringQueue.remove();
        stringQueue.add("5");
        stringQueue.forEach(System.out::println);

        ArrayDeque<Integer> integerQueue = new ArrayDeque<>();
        integerQueue.add(1);
        integerQueue.add(2);
        System.out.println("ArrayDeque");
        integerQueue.forEach(System.out::println);
        integerQueue.addFirst(0);
        integerQueue.forEach(System.out::println);

        LinkedList<String> test = new LinkedList<>();
        test.add("1");
        test.add("2");
        System.out.println("LinkedList");
        test.remove(1);
        System.out.println(test.size());

        Car car = new Car("Vinfast");
        Car.F1(car);
        System.out.println(car.getBranchName());
        Car.F2(car.getBranchName());
        System.out.println(car.getBranchName());
        Car.F3(car);
        System.out.println(car.getBranchName());
    }
}
