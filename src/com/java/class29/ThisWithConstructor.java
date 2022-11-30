package com.java.class29;

// You call a Consructor from another constructor only
// You can call a Constructor from another constructor but it has to be called in the first line only
class Bank{
    Bank(){
        System.out.println("FromBank");
    }
    Bank(int balance){
        this();
        System.out.println("From bank " + balance);
    }
}


public class ThisWithConstructor {
    public static void main(String[] args) {
        Bank b = new Bank(543);
    }
}
