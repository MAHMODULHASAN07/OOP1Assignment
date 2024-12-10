package Assignment;
import java.util.*;

class SortedListExample {
    public void demonstrate() {
        List<String> sortedList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry"));
        Collections.sort(sortedList);
        System.out.println("Sorted List: " + sortedList);
    }
}