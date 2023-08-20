package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Task 4 (will result in error)
        // obj.name = "John"; // Error: The field name is not visible

        // Task 6
        obj.setName("John");
        System.out.println("Name from getter: " + obj.getName());
    }
}
