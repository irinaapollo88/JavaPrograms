package com.java.class21;

import java.util.Scanner;
// Write a program to print length of the String
// without using length function
public class FindLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name = sc.nextLine();

        int count = 0;

        for (int i = 1; i<=name.length(); i++){
            count++;
        }
        System.out.println(name.lastIndexOf(""));

        System.out.println(count);
    }

}
