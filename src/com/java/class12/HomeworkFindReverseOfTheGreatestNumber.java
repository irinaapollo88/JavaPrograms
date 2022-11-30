package com.java.class12;

import java.util.Scanner;

public class HomeworkFindReverseOfTheGreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first three digit number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter second three digit number: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter second three digit number: ");
        int num3 = sc.nextInt();

        int maxNumber = findTheGreatestNumber(num1, num2, num3);
        System.out.println("The gteatest number is: " + maxNumber);
        System.out.println("The reversed number is: ");
        }
        static int findTheGreatestNumber(int a, int b, int c) {
            int theGreatestNumber = 0;
            if (a > b && a > c) {
            System.out.println(a + " is the greatest number");
        } else if (b > c) {
            System.out.println(b + " is the greatest number");
        } else if (c > a) {
            System.out.println(c + " is the greatest number");
        } else {
            System.out.println("Please enter 3 digit number. Thank you!");
        }
        int num = findTheGreatestNumber(a, b, c);

        int rev = getReverse(num);
        System.out.println(rev);
        return num;
    }
    static int getReverse(int num) {
        int rev = 0;

        int lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num / 10;

        lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num / 10;

        lastDigit =num % 10;
        rev = rev * 10 + lastDigit;
        num = num / 10;

        return rev;

    }
}


