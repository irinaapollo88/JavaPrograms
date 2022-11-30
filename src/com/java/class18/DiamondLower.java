package com.java.class18;
//*********
// *******
//  *****
//   ***
//    *
import java.sql.SQLOutput;
import java.util.Scanner;

public class DiamondLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();

        for (int i=num; i>=1; i--) {

            for (int s = 1; s<=num -i; s++) {
                System.out.print(" ");
            }
                for (int j=1; j<=i*2-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

