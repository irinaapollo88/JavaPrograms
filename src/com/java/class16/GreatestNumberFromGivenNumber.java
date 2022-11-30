package com.java.class16;

import java.util.Scanner;

public class GreatestNumberFromGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        int max = num % 10;

        while (num != 0) {
            int lastDigit = num % 10;

            if (lastDigit > max) {
                max = lastDigit;
            }
            num = num / 10;
        }

        System.out.println(max);
    }
}

