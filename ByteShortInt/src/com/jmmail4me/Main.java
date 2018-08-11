package com.jmmail4me;

public class Main {

    public static void main(String[] args) {

        //has a width of 32
        int myMinValue=-2_147_483_648;
        int myMaxValue=2_147_483_647;
        int myTotal=myMinValue/2;
        System.out.println("myTotal = " +myTotal);

        //has a width of 8
        byte myMinByte = -128;
        byte myMaxByte = 127;
        byte myNewByteValue= (byte)(myMinByte/2);
        System.out.println("myNewByteValue = " +myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;

        //log has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        byte myByte = 50;
        short myShort = 3000;
        int myInt = 1000000000;
        long myLong = 50000L +  10L * (myByte + myShort + myInt);
        short shortTotal = (short)(1000 + 10 *(myByte + myShort ));
        System.out.println("longTotal = " + myLong);
        System.out.println("shortTotal = " + shortTotal);

    }
}
