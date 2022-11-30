package com.java.class26;

public class MainClass {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();
        c1.speed = 200;
        c1.color = "White";
        c1.drive();
        c2.drive();

        // First approach 
        c1.increaseSpeed(c1.speed);

        System.out.println(c1.speed);

    }

}
