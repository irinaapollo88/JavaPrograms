package com.java.class12;

import java.util.Scanner;

public class HomeworkFindGreatestNumberUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Please enter the third number");
        int num3 = sc.nextInt();
        findGreatestNumber(num1, num2, num3);

    }

    static void findGreatestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is the greatest number");
        } else if (b > c) {
            System.out.println(b + " is the greatest number");
        } else if (c > a) {
            System.out.println(c + " is the greatest number");
        }
    }
}

