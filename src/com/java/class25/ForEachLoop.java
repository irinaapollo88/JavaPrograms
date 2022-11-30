package com.java.class25;

public class ForEachLoop {
    public static void main(String[] args) {
        int info [][] = {
                {23, 44, 21},
                {45, 42, 31},
                {73, 14, 0}
        };
        for(int[] rows: info){
            for (int data: rows){
                System.out.print(data + ", ");
            }
            System.out.println();
        }
    }
}
