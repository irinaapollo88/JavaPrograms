package com.java.class30;
import com.java.class32.Car;

public class AccessModifierCarExampleFromClass32 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(500);
        System.out.println(c.getSpeed());

    }
}
