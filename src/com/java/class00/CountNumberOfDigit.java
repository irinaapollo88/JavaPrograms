package com.java.class00;

// Write a program to count number of digit of in a given number
// Example
// Input1 - 123, Output1 - 3
// input 2 - 12345, Output1 - 5

public class CountNumberOfDigit {
    public static void main(UserStory1[] args) {
        int num  = 12345;
        int count = 0;
        while (num>0) {
            num=num/10;
            count++;
        }
            System.out.println(count);

    }
}
