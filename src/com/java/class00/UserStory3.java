package com.java.class00;
//UserStory3: Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
// The string length will be at least 2.

import java.util.Scanner;

public class UserStory3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

    }
    static String rotatedRight(String str){
        String strNew="";
        if (str.length()>=2) {
            strNew = strNew + str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
            return strNew;
        }
        return null;
    }
}
