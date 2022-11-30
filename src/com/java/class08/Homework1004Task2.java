package com.java.class08;

import java.util.Scanner;

public class Homework1004Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your bill please");
        int bill = sc.nextInt();

        if (bill >= 10000) {
            System.out.println("Your discount is 20% and your price is: " + ((double) +bill - (bill * 0.2)));
        } else if (bill >=5000) {
            System.out.println("Your discount is 15% and your price is: " + ((double) +bill - (bill * 0.15)));
        }else if (bill >=2000) {
            System.out.println("Your discount is 10% and your price is: " + ((double) +bill - (bill * 0.1)));
        } else if (bill >= 1000) {
            System.out.println("Your discount is 5% and your price is: " + ((double) +bill - (bill * 0.05)));
        } else {
            System.out.println("Sorry, you don't have discount: " + bill);
        }
        }
    }

