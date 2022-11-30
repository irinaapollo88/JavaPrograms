package com.java.class20;


// Write a program to take the full name from the user and print
// the first letter of the first name and last name
// Example
// Input - Thomas Joe
// Output  - T.J
// Another Example
// Input - Charlie Kyle
// Output - C.K
import java.util.Scanner;

public class HW11012022Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your full name?");
        String name = sc.nextLine();
        char firstInitial = name.charAt(0);
        int space = name.indexOf(" ");
        char secondInitial = name.charAt(space + 1);
                System.out.println(firstInitial + "." + secondInitial);

        }
}
