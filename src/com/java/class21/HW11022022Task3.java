package com.java.class21;
//3. Java Program to determine whether a given string is palindrome or not by ignoring the case of characters and white spaces
//Example
//Input - Was it a car or a cat I saw
//Output - Palindrome (edited)
import java.util.Scanner;

public class HW11022022Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string");
        String str = sc.nextLine();
        String backup = str;
        String reverse = "";
        for (int i = 0; i <= str.length(); i++) {
            reverse =  str.charAt(i) +reverse ;
        }

        if (backup.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
