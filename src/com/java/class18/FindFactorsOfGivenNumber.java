package com.java.class18;

import java.util.Scanner;

public class FindFactorsOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();

        for (int i= 1; i<=num; i++){
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}

