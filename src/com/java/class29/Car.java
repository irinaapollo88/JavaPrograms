package com.java.class29;
class Vehicle{
    int speed = 50;
    void drift(){
        System.out.println("Drifting Car");
    }
}
// this - it refers to current class object
class Car extends Vehicle {
    int speed = 100;

    void drift(){
        int speed = 200;
        System.out.println(speed);
        System.out.println(this.speed);
        System.out.println(super.speed);
        // drift(); // The process of calling the function itself called Recursion
        super.drift();
    }
}

