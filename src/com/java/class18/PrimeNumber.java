package com.java.class18;
// Write a program to check given number is prime or not
// Input- 13
// Output - prime
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");

        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.println(i);
                count++;

            }
        }
        if (count ==2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}
