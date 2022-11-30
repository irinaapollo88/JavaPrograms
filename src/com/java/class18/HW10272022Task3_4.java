package com.java.class18;

import com.sun.security.jgss.GSSUtil;

public class HW10272022Task3_4 {
    private static String[] args;

    public static void main(String[] args) {
        HW10272022Task3_4.args = args;
        for (int i = 1; i <= 3; i++) {
            for (int sp = 1; sp <= 3 - i; sp++) {
                System.out.print(" ");
            }
            for (int digit = 1; digit <= 3 + i * 2; digit++) {
                System.out.print(digit);
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int sp=1; sp<=i; sp++) {
                System.out.print(" ");
            }
            for (int digit=1; digit<=9-i*2; digit++){
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}