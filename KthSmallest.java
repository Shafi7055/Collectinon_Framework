package src;

import java.util.*;

public class KthSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 10, 4, 3, 20, 15));
        int k = 3;

        // Sort the ArrayList
        Collections.sort(list);

        // Print the kth smallest element
        System.out.println("Kth smallest element: " + list.get(k - 1));
    }
}
