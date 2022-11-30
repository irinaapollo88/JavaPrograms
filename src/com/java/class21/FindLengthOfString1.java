package com.java.class21;

import java.util.Scanner;

public class FindLengthOfString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name = sc.nextLine();


        int count = 0;
        while (!name.isEmpty()) {
            count++;
            name = name.substring(1);

        }

        System.out.println(count);
    }
}
