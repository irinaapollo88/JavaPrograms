package com.java.class22;

// Arrays - container to hold more than one values of SIMILAR data types
public class ArraysExample {
    public static void main(String[] args) {
        int marksStudent1, marksStudent2, marksStudent3;
       // Declaration of array - Declaration will not initialize size in memory

        int data[];
        int a; // 4 bytes

        // Initialize the array
        // Important - In java when we want to initialize variable that can hold
        // collection of values we need to use NEW keyword
        data = new int[5];

        //  Declaration and Initialization in same line
        int salary[] = new int[100];

        // Declaration and assignment in the same line
        int nums[] = {10, 20, 30, 34, 45, 23, 45, 23, 12, 65, 23};

        // Length of the Array
        System.out.println(nums.length); // total elements 11

        // Print value at particular index
        System.out.println(nums[4]);


    }
}
