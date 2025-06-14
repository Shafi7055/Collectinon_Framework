package src;

import java.util.*;

public class EmployeeDepartmentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> empMap = new HashMap<>();

        empMap.put(1001, "HR");
        empMap.put(1002, "IT");
        empMap.put(1003, "Finance");

        for (Map.Entry<Integer, String> entry : empMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + " => Department: " + entry.getValue());
        }
    }
}
