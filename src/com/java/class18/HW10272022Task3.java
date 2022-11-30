package com.java.class18;

import java.sql.SQLOutput;

public class HW10272022Task3 {
    public static void main(String[] args) {
        System.out.println("\t\t-------Task1-------");
        for (int i = 5; i >= 1; i--) {
            for (int digit = 5; digit >= 6 - i; digit--) {
                System.out.print(digit);
            }
            System.out.println();
        }
        System.out.println("\t\t-------Task2-------");
        for (int i = 1; i <= 5; i++) {
            for (int sp = 3; sp <= 1 + i; sp++) {
                System.out.print(" ");
            }
            for (int digit = 1; digit <= 11 - i * 2; digit++) {
                System.out.print(digit);
            }
            System.out.println();
        }
        System.out.println("\t\t-------Task3-------");
        for (int i = 1; i <= 5; i++) {
            for (int sp = 1; sp <= 5 - i; sp++) {
                System.out.print(" ");
            }
            for (int digit = 1; digit <= i * 2 - 1; digit++) {
                System.out.print(digit);
            }
            System.out.println();
        }

        System.out.println("\t\t-------Task4-------");
        for (int i = 1; i <= 3; i++) {
            for (int sp = 1; sp <= 3 - i; sp++) {
                System.out.print(" ");
            }
            for (int digit = 1; digit <= 3 + i * 2; digit++) {
                System.out.print(digit);
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int sp = 1; sp <= i; sp++) {
                System.out.print(" ");
            }
            for (int digit = 1; digit <= 9 - i * 2; digit++) {
                System.out.print(digit);
            }
            System.out.println();
        }
        System.out.println("\t\t-------Task5-------");
        // Upper Triangle
        for (int i = 1; i <= 5; i++) {
            for (int sp = 1; sp <= 5 - i; sp++) {
                System.out.print(" ");
            }
            for (int digit = 1; digit <= i * 2 - 1; digit++) {
                if (i % 2 == 0) {  // sout(i % 2)
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
        // Lower Triangle
        for (int i = 1; i <= 4; i++) {

            for (int sp = 1; sp <= i; sp++) {
                System.out.print(" ");
            }
            for (int digit = 1; digit <= 9 - 2 * i; digit++) {
                System.out.print((i+1)%2);
            }
            System.out.println();
        }
    }
}
