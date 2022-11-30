package com.java.class26;

import java.sql.SQLOutput;
import java.util.Scanner;

class UseCarHM{
    int mileage;
    int milesDriven;
    int mpg = 25;
    int milesTillOilChange=5000;
    int oil = 5000;
    int gasTankHolds = 16;
    double gallonsGas = 16.0;

    int topSpeed;
    int numDoors;
    String color;

    UseCarHM(){
        System.out.println("Constructor with no parameters.");
    }
    UseCarHM(int topSpeedFromUser, int numDoorsFromUser, String colorFromUser){
        topSpeed = topSpeedFromUser;
        numDoors = numDoorsFromUser;
        color = colorFromUser;
    }
}


public class MainUseCarHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UseCarHM car = new UseCarHM();
        int choice = 0;
        int again = 0;

        UseCarHM Fusion = new UseCarHM(150, 2,"Gray");
        UseCarHM Jetta = new UseCarHM(180, 4, "Black");
        UseCarHM Altima = new UseCarHM(1650, 4, "Red");

        UseCarHM CRX = new UseCarHM();

        System.out.println(Fusion.color);
        System.out.println(Jetta.topSpeed);
        System.out.println(Altima.numDoors);


    }
}
