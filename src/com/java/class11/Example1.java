package com.java.class11;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        System.out.println("Please enter the type of operation - add, sub, mul, div or mod");
        String operation = sc.next();


        switch (operation.toLowerCase()){
            case "add":
            case "+":
                System.out.println(num1 + num2);
                break;
            case "sub":
            case "-":
                System.out.println(num1 - num2);
                break;
            case "mul":
            case "*":
                System.out.println(num1 * num2);
                break;
            case "div":
            case "/":
                System.out.println(num1 / num2);
                break;
            case "mod":
            case "%":
                System.out.println(num1 % num2);
            default:
                System.out.println("Please enter valid operation");

        }
    }
}
