package com.java.class09;

import java.util.Scanner;

public class NestedIfExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = sc.nextInt();


        if(age < 18) {
            System.out.println("You are not eligible");
        }else{
            System.out.println("Please enter your salary");
            int salary = sc.nextInt();

            if (salary < 5000) {
                System.out.println("Work hard");
            } else if (salary >= 20000) {
                System.out.println("free card");
            }else{
                System.out.println("You are eligible");
            }
        }
    }
}


