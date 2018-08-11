package com.udemy;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D'; //width of 16 or 2 bytes
        char myUnicode = '\u00A9'; //width of 16 or 2 bytes

        System.out.println("Unicode output was: " + myUnicode);

        boolean myBoolean = false;
        boolean  isMale = true;


        char registeredSymbol = '\u00AE';
        System.out.println("Unicode output was: " + registeredSymbol);

    }
}
