package com.java.class07;

import java.util.Scanner;

// Write a program to get two number from user and print maximum number
public class IfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print the number please: ");
        int a = sc.nextInt();

        System.out.println("Print the second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Maximum number is: " + a);
        } else {
            System.out.println("Maximum number is: " + b);

        }
    }
}

