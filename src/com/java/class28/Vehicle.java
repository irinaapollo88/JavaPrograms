package com.java.class28;

public class Vehicle {
    Vehicle(){
        System.out.println("From Vehicle");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("From Car");
    }
}
class SportsCar extends Car{
    SportsCar(){
        System.out.println("From Sports Car");
    }
}