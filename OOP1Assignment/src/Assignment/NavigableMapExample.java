package Assignment;

import java.util.*;

class NavigableMapExample {
    public void demonstrate() {
        NavigableMap<String, Integer> navigableMap = new TreeMap<>();
        navigableMap.put("A", 1);
        navigableMap.put("C", 3);
        navigableMap.put("B", 2);
        System.out.println("NavigableMap: " + navigableMap.descendingMap());
    }
}