package com.java.class16;

import java.util.Scanner;

public class FindLengthOfNumber {
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;

        while (num > 0) {
            num = num / 10;
            result++;
        }
        System.out.println(result);
    }
}
