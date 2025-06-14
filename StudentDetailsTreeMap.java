package src;

import java.util.*;

class Student {
    String name;
    int age;
    String department;

    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String toString() {
        return name + " | Age: " + age + " | Dept: " + department;
    }
}

public class StudentDetailsTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Student> map = new TreeMap<>();

        map.put(101, new Student("Alice", 20, "CSE"));
        map.put(102, new Student("Bob", 21, "EEE"));
        map.put(103, new Student("Charlie", 22, "BBA"));

        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " => " + entry.getValue());
        }
    }
}
