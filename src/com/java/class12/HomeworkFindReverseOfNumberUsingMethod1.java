package com.java.class12;

import java.util.Scanner;

public class HomeworkFindReverseOfNumberUsingMethod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the 3 digit number from 100 to 999: ");
        int num = sc.nextInt();

        int rev = getReverse(num);

        System.out.println(rev);
    }


    static int getReverse(int num) {
        int rev = 0;

        int lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num/10;

        lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num/10;

        lastDigit = num;
        rev = rev * 10 + lastDigit;
        num = num/10;

        return rev;

    }
}


