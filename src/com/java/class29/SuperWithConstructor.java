package com.java.class29;

// You call a Consructor from another constructor only
// You can call a Constructor from another constructor but it has to be called in the first line only
class Bank1{
 //   Bank1(){
 //       this(10);
  //      System.out.println("FromBank");
  //  }
    Bank1(int balance){
        System.out.println("From bank " + balance);
    }
}
class CitiBank extends Bank1{
    CitiBank(int a, double b){
        super(a);
        System.out.println("I still have double values "+ b);
    }

}


public class SuperWithConstructor {
    public static void main(String[] args) {

        CitiBank b = new CitiBank(40, 60);
    }
}