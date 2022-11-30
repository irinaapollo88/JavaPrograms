package com.java.class21;
//Java Program to remove all the white spaces from a string
//Example
//Input - Today is Saturday
//Output - TodayisSaturday

import java.util.Scanner;

public class HW11022022Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = sc.nextLine().toLowerCase();

        System.out.println(str.replace(" ", ""));

    }
}
