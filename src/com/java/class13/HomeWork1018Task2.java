package com.java.class13;

import java.util.Scanner;

public class HomeWork1018Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        System.out.println("Please enter third number");
        int num3 = sc.nextInt();
        System.out.println("Please enter fourth number");
        int num4 = sc.nextInt();

        int max1 = findMax(num1, num2);
        int max2 = findMax(num3, num4);


            System.out.println("greatest number " +findMax(max1, max2));
    }
    static int findMax(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }

    }
}

