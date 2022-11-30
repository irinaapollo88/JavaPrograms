package com.java.class27;

class Bike{
    static int speed;

    static void method1(){
        System.out.println(speed);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Bike.speed = 10;
        Bike.method1();

    }
}
