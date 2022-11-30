package com.java.class09;

import java.util.Scanner;

public class Homework1005Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount please");
        int amount = sc.nextInt();
        int notesOf500 = amount/500;
        int notesOf100 = (amount%500)/100;
        int notesOf20 = (amount%100)/20;
        int notesOf10 = (amount%20)/10;
        int notesOf5 = (amount%10)/5;
        int notesOf2 = (amount%5)/2;
        int notesOf1 = (amount%2)/1;

        System.out.println(notesOf500 + "notes of 500");
        System.out.println(notesOf100 + "notes of 100");
        System.out.println(notesOf20 + "notes of 20");
        System.out.println(notesOf10 + "notes of 10");
        System.out.println(notesOf5 + "notes of 5");
        System.out.println(notesOf2 + "notes of 2");
        System.out.println(notesOf1 + "notes of 1");


    }

}
