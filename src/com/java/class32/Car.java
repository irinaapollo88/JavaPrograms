package com.java.class32;

 public class Car {
    private int speed;
    private String color;
    public int price;

    public Car(){
        System.out.println("From Car Constructor");
    }
    // Why we need getters and setters to control validation
    // Getters
    public int getSpeed(){
        return speed;
     }
     // Setters
     public void setSpeed(int speed){
        // here you can use all your logic to identify the transaction log
        this.speed = speed;
     }
     public void getPrice(int price){
        this.price = price;
     }
     public void setPrice(int price){

     }
}
