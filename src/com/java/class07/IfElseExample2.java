package com.java.class07;

import java.util.Scanner;

public class IfElseExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you? ");
        int a = sc.nextInt();

        if (a>=16) {
            System.out.println("You are eligible for driver license");
        }else {
            System.out.println("You are not eligible to drive, Sorry");
        }
    }
}
