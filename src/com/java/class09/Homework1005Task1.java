package com.java.class09;

import java.util.Scanner;

public class Homework1005Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, Please enter the year you was born");
        int year = sc.nextInt();

        if (year % 4== 0) {
        System.out.println("The year you born, was leap year =)");
        }else {
            System.out.println("The year you born, was not leap year =)");
        }

    }
}
