package com.java.class13;

public class UserDefinedMethodUsed1 {
    public static void main(String[] args) {
        text("911", "How are you doing?");
    }

    static void getMultiplication(int a, int b){
        System.out.println(a*b);
    }

    static void call(String phoneNumber){
        System.out.println("Calling..." + phoneNumber);
    }

    static void text(String phoneNumber, String text) {
        System.out.println("Sending text: " + text + " to " + phoneNumber);

    }
}
