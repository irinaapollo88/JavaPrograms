package com.java.class11;

import java.util.Scanner;

public class FindNumberOfDysInMonth {
    public static void main(String[] args) {
        System.out.println("Please enter month number (1-12):");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 2) {
            System.out.println("28/29 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else {
            System.out.println("Please enter the number from 1-12");
        }
    }
}
