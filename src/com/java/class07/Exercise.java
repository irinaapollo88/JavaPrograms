package com.java.class07;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the percentage that you receive on your test: ");
        int percentage = sc.nextInt();

        if (percentage > 100) {
            System.out.println("Please enter a valid percentage from 40-100%:");
        } else if (percentage >= 90) {
            System.out.println("Your grade is A+");
        } else if (percentage >= 80) {
            System.out.println("Your grade is A");
        } else if (percentage >= 70) {
            System.out.println("Your grade is B+");
        } else if (percentage >= 60) {
            System.out.println("Your grade is B");
        } else if (percentage >= 50) {
            System.out.println("Your grade is C+");
        } else if (percentage >= 40) {
            System.out.println("Your grade is C ");
        } else{
            System.out.println("Please enter a valid percentage");

        }
    }
}
