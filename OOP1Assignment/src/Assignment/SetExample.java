package Assignment;
import java.util.*;

// Demonstrates Set and HashSet
class SetExample {
    public void demonstrate() {
        Set<String> set = new HashSet<>(Arrays.asList("Apple", "Banana", "Apple"));
        System.out.println("Set: " + set);
    }
}