package com.java.class20;
// Write a program to find frequency of given character in the String
// String - Hello, How are you?
// Character - e
// Output - 2
public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {
        String str = "How is everything Eva?";
        char target = 'e';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        System.out.println(count);

    }
}
