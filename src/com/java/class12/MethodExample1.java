package com.java.class12;

import java.util.Scanner;

public class MethodExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the calculator");
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        System.out.println("Please enter the type of operation - add, sub, mul, div or mod");
        String operation = sc.next();

        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                add(num1, num2);
                break;

            case "sub":
            case "-":
                sub(num1, num2);
                break;

            case "mul":
            case "*":
                mul(num1, num2);
                break;

            case "div":
            case "/":
                div(num1, num2);
                break;

            default:
                System.out.println("Please enter valid operation");
        }
    }

    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void sub(int num1, int num2) {
        System.out.println(num1 + num2);
    }
        static void mul(int num1, int num2) {
            System.out.println(num1 + num2);
        }
    static void div(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}