package com.java.class18;
// Write a program to print all the prime numbers from 1 to 100

public class HW10272022Task1 {
    public static void main(String[] args) {

        System.out.print("These are prime numbers from 1 to 100: ");
        for (int i= 1; i <= 100; i++){
            if(isPrime(i)){ // isPalindrome(i) == true;
            System.out.println(i);
            }
        }
    }

    static boolean isPrime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
    static boolean isPalindrome(int num) {
        int originalNum = num;
        int rev = 0;

        while (num!=0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num/10;
        }

        if (originalNum == rev) {
            return true;
        } else {
            return false;
        }
    }
}



