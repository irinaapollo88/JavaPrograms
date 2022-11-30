package com.java.class28;

public class Cake {

    public void dough(double flour, int eggs, double sugar) {
        System.out.println("Mix: " + flour + " gram of flour " + eggs + " eggs " + sugar + " gram of sugar");
    }
}
    class Cream extends Cake {
        public void creamPreparation(int eggs, double sugar, double creamCheese) {
            System.out.println("Mix: " + eggs + " eggs " + sugar + " gram of sugar " + creamCheese + " gram of cream cheese");

        }
    }

