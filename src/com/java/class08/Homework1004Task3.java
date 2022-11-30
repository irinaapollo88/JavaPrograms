package com.java.class08;

import java.util.Scanner;

public class Homework1004Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your rating?");
        int rating = sc.nextInt();

        if (rating == 5) {
            System.out.println("Very Good");
        } else if (rating == 4) {
            System.out.println("Good");
        } else if (rating == 3) {
            System.out.println("Average");
        } else if (rating == 2) {
            System.out.println("Poor");
        } else if (rating == 4) {
            System.out.println("Very Poor");
        }
    }
}