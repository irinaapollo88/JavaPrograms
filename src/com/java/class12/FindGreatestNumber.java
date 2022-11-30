package com.java.class12;
import java.util.Scanner;

public class FindGreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();

        findGreatestNumber(num1, num2, num3);
    }

    static void findGreatestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("The greatest number is " + a);
        } else if (b > c) {
            System.out.println("The greatest number is " + b);
        } else if (c > a) {
            System.out.println("The greatest number is " + c);

        }
    }
    }

