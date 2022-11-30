package com.java.class26;

class Phone {
    // Variable of Class
    String color;
    int sizeOfRam;
    int cameraMegaPixel;
    String model;

    // Methods of Class
    void call(String number) {
        System.out.println("calling from " + model + " to the number " + number);
    }
    void text(String number, String text){
        System.out.println("sending message " + text + "from " + model + " to the number " + number);
    }
}

public class PhoneTestingClass {
    public static void main(String[] args) {
        // Create an object of class
        Phone iPhone8 = new Phone();
        // Set values of an instance variable
        iPhone8.color = "White";
        iPhone8.sizeOfRam = 4;
        iPhone8.cameraMegaPixel=5;
        iPhone8.model = "Apple iPhone8 64GB";

        // Call instance method of a class using an object
        iPhone8.call("9789633242");

        // Create another object of class
        Phone iPhone10 = new Phone();
        // Set values of an instance variable
        iPhone10.color = "Black";
        iPhone10.sizeOfRam = 8;
        iPhone10.cameraMegaPixel=12;
        iPhone10.model = "Apple iPhone10 32GB";

        // Call instance method of a class using an object
        iPhone10.call("3477793751");
    }
}
