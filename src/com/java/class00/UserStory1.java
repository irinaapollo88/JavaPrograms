package com.java.class00;
import java.util.Scanner;

public class UserStory1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(printLine(str));
    }

    static String printLine(String str) {
        String s = "";
        if (str.length() == 0) {
            return str;
        } else if (str.length() < 2) {
            return str;
        } else {
            s = s + str.charAt(0) + str.charAt(1);
            return s;
        }
    }
}
