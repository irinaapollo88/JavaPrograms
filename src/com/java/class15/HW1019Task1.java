package com.java.class15;

public class HW1019Task1 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 2; i <= 10; i++) {
            if (i % 2 == 0) {
                result = i + result;
            }
        }
        System.out.println(result);
    }
}


