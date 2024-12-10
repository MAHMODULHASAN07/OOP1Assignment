package Assignment;

import java.util.*;

class SortedMapExample {
    public void demonstrate() {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("One", 1);
        sortedMap.put("Three", 3);
        sortedMap.put("Two", 2);
        System.out.println("SortedMap: " + sortedMap);
    }
}