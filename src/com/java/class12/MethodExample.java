package com.java.class12;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        // Name of The Method - printLineWithHyphen
        // Return Type - void
        // Parameter - ()   <-- No parameter
        // Method Body - System.out.println("-------------------");

        Scanner sc = new Scanner(System.in);
        printLineWithEqual(); // Method call
        System.out.println("Welcome to the calculator");
        printLineWithEqual();

        printLineWithHyphen();
        System.out.println("Please enter first number");
        printLineWithHyphen();
        int num1 = sc.nextInt();

        printLineWithHyphen();
        System.out.println("Please enter second number");
        printLineWithHyphen();
        int num2 = sc.nextInt();

        printLineWithEqual();
        System.out.println("Here is your addition:" + (num1 + num2));
        printLineWithEqual();

    }

    static void printLineWithEqual() {
        System.out.println("=============================");
    }

    static void printLineWithHyphen() {
        System.out.println("------------------------------");
    }
}