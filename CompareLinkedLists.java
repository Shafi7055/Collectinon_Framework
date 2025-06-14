package src;

import java.util.*;

public class CompareLinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));

        // Check if both LinkedLists are equal
        boolean isEqual = list1.equals(list2);

        System.out.println("Are both LinkedLists equal? " + isEqual);
    }
}
