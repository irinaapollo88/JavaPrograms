package com.java.class10;
// Wrote a program to get 3 digit number from the user (Valid Numbers - 100 to 999 only)
// and print  reverse of the given number the output
// example
// input - 325
// output -523

import java.util.Scanner;

public class Homework1011Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the 3 digit number from 100-999 only");
        int amount = sc.nextInt();

        int dig1, dig2, dig3;
        dig1 = amount % 10;
        dig2 = amount % 100/10;
        dig3 = amount /100;

        System.out.println("The reverse number of your amount is:" + dig1 + dig2 + dig3);
    }
}
