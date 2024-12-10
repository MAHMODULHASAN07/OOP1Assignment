package Assignment;

import java.util.*;

class DeQueueExample {
    public void demonstrate() {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");
        deque.addLast("B");
        deque.addLast("C");
        System.out.println("Deque: " + deque);
    }
}