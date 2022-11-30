package com.java.class05;

import java.util.Scanner;

public class Homework0927_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first word: ");
        String str1 = sc.nextLine();
        System.out.println("Please enter the second word: ");
        String str2 = sc.nextLine();
        str1=str2;
        str2="Hello";

        System.out.println("Your sentence is: " + str1 + str2);
    }
}
