package com.java.class13;

import java.util.Scanner;

public class HomeWork1018Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Temperature in celsius");
        int celsius = sc.nextInt();

        int fhr = getTempInFahrenheit(celsius);

        System.out.println("The temperature in Fahrenheit is " + fhr);

    }

    static int getTempInFahrenheit(int celsius) {
        int fhr = celsius * 9 / 5 + 32;
        return fhr;
    }
}