package com.java.class12;

import java.util.Scanner;

public class just {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first three digit number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter second three digit number: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter second three digit number: ");
        int num3 = sc.nextInt();

        findTheGreatestNumber(num1, num2, num3);
    }

    static void findTheGreatestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is the greatest number");
        } else if (b > c) {
            System.out.println(b + " is the greatest number");
        } else if (c > a) {
            System.out.println(c + " is the greatest number");
        }


        boolean res = true;
        if (res == a > b && a > c) {
            System.out.println(a);
        } else if (res == b > c) {
            System.out.println(b);
        } else if (res == c > a) {
            System.out.println(c);
        }
    }
}




