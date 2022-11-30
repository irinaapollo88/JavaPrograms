package com.java.class15;

public class HW1019Task2 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                result = i + result;
            }
        }
        System.out.println(result);
    }
}
