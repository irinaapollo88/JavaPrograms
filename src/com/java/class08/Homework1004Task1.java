package com.java.class08;

import java.util.Scanner;

public class Homework1004Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number");
        int number = sc.nextInt();

        if (number / 5 == 0) {
            System.out.println("The number is divisible by 5");
        } else if (number/5 != 0) {
            System.out.println("The number is not divisible by 5");
        }

    }
}
