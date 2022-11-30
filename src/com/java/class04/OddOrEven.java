package com.java.class04;

import java.util.Scanner;

public class OddOrEven {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the number");
            int num = scan.nextInt();

            if(num%2==0){
                System.out.println( "Even");
            }else{
                System.out.println("Odd");
            }
        }
    }



