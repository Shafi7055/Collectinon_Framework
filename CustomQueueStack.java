package src;

import java.util.*;

public class CustomQueueStack {
    public static void main(String[] args) {
        // PriorityQueue as Stack (LIFO using reverse order)
        PriorityQueue<Integer> stack = new PriorityQueue<>(Collections.reverseOrder());
        stack.add(10);
        stack.add(20);
        stack.add(30);
        System.out.println("Stack-like output:");
        while (!stack.isEmpty()) {
            System.out.println(stack.poll());
        }

        // PriorityQueue as Queue (FIFO)
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.naturalOrder());
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue-like output:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
