package vn.sps.collections;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("b");
        stringSet.add("c");
        stringSet.add("a");
        System.out.println("TreeSet....");
        stringSet.forEach(System.out::println);

        System.out.println("LinkedList...");
        List<String> stringList = new LinkedList<>();
        stringList.add("c");
        stringList.add("b");
        stringList.add("a");
        stringList.sort(Comparator.naturalOrder());
        stringList.forEach(System.out::println);

        Map<String, Integer> map = new TreeMap<>();
        map.put("b", 5);
        map.put("c", 8);
        ((TreeMap<String, Integer>) map).descendingMap();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("key : " + entry.getKey());
        }
    }
}
