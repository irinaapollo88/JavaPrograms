package com.java.class21;
// Create Java Program to count the total number of vowels and consonants in a string
// Example: Input - Today is Saturday; Output - Total Vowels - 6, Total Consonants - 9.
import java.util.Scanner;

public class HW11022022Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write any sentence ");
        String str = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i <= str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if ((ch >= 'a') && (ch <= 'z')) {
                consonants++;
            }
        }
        System.out.println("Total Vowels -" + vowels);
        System.out.println("Total Consonants -" + consonants);
    }
}

