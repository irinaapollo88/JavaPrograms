package com.java.class09;

import java.util.Scanner;

public class LadderIfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int weight = sc.nextInt();

        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You are eligible");
            } else {
                if (weight >= 50) {
                    System.out.println("You are too young to donate blood");
                } else {
                    System.out.println("you are not eligible");
                }
            }
        }
    }
}



