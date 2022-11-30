package com.java.class13;

public class UserDefinedMethodUsed {
    public static void main(String[] args) {
        getMultiplication(10,20);
    }

    static void getMultiplication(int a, int b){
        System.out.println(a*b);
    }

    static void call(String phoneNumber){
        System.out.println("Calling..." + phoneNumber);
    }

    static void text(String phoneNumber, String text) {
        System.out.println("Sending text to " + phoneNumber);

    }
}
