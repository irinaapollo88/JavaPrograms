package com.java.class00;

import java.util.Scanner;

//UserStory2:Given a string of even length,
// return a string made of the middle two chars,
// so the string "string" yields "ri". The string length will be at least 2.
public class UserStory2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(middleTwo(str));
    }
    static String middleTwo(String str){
        if(str.length()>=2){
            return str.substring(str.length()/2-1, str.length()/2+1);
        }
        return null;
    }
}
