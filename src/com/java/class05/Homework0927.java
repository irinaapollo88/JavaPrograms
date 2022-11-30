package com.java.class05;

public class Homework0927 {
    public static void main(String[] args) {
        String str1 = "Hello", str2 = "Java";
        int i = 10, j = 20;

        System.out.println(i + j); // Statement 1 answer is 30
        System.out.println("i + j"); // Statement 2 answer is i + j
        System.out.println(str1 + i); // Statement 3 answer is Hello10
        System.out.println(str1 + i + j); // Statement 4 answer is Hello1020
        System.out.println(i + j + str1); // Statement 5 answer is 30Hello
        System.out.println(str1 + i * j); // Statement 6 answer is Hello200
        // System.out.println(str1 + i - j); // Statement 7 error: minus can not be used with String
        System.out.println(str1 + i + j + str2); // Statement 8 answer is Hello1020Java


    }
}
