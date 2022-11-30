package com.java.class06;

import java.util.Scanner;

public class ConvertAgeFromYearsToMonthsToDaysToMinutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = sc.nextInt();
        int b = age * 12;
        System.out.println("You have  " + b + " months on earth");
        int c= age * 365;
        System.out.println("You have spent " + c + " days on earth");
        int d = age * 60 * 24 * 365;
        System.out.println("You have spent " + d + " minutes on earth");


    }
}
