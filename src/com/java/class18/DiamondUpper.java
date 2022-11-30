package com.java.class18;

//    *
//   ***
//  *****
// *******
//*********
import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class DiamondUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for (int s= 1; s <=num - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
