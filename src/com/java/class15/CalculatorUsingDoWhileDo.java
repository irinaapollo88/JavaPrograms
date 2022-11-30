package com.java.class15;

import java.util.Scanner;

public class CalculatorUsingDoWhileDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number");
        int num2 = sc.nextInt();

        System.out.println("Please enter your operation - add, sub, mul, div");
        String operation = sc.next();

        switch (operation.toLowerCase()) {

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

            default:
                System.out.println("Please choose right operation");
        }
        System.out.println("Do you want to try one more time? YES/NO");
        System.out.println("press 1 for Yes");
        System.out.println("press 2 for No");
        choice = sc.nextInt();
    } while(choice == 1);
    }
}



