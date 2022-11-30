package com.java.class10;

public class NestedIf {
    public static void main(String[] args) {
        int i = 1, j = 5;

        if (i > j) {
            if (i <= j) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
        System.out.println("3");
    }
}
