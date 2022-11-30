package com.java.class30;

class Demo{
    void sum(int a, int b){
    }
    void sum(int a, int b, int c){
    }
    void sum(double c, int d){
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.sum(10, 20,30);
        d.sum(10, 20);
    }
}
