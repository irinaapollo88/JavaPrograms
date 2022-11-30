package com.java.class31;

public class PayPal {

    public void checkBalance(Bank cb) {
        cb.checkBalance();
    }
    void withdraw(Bank b, int amount){
        b.withdraw(amount);
    }
}