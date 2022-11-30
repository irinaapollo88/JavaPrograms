package com.java.class30;

import java.util.Scanner;

class Browser{
    void openIncognitoWindow(){
        System.out.println("Cntr + T");
    }
}
class Chrome extends Browser {
    void openIncognitoWindow(){
        System.out.println("Cntr + Shift + N");
    }
}
class FireFox extends Browser {
    void openIncognitoWindow(){
        System.out.println("Cntr + Shift + P");
    }
}

public class BrowserMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name");
        String browser = sc.next();

        Browser b; // Reference variable

        if (browser.equalsIgnoreCase("chrome")){
            b = new Chrome();

        } else {
           b = new FireFox();
        }
        b.openIncognitoWindow();
    }
}
