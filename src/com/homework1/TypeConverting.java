package com.homework1;

/**
 * Created by maxim on 28.06.2016.
 */
public class TypeConverting {
    public static void main(String[] args) {

        byte byteVar = 100;
        short shortVar;
        int intVar;
        long longVar;
        float floatVar;
        double doubleVar;
        char charVar = 'X';

        shortVar = byteVar;
        System.out.println("Byte: " + byteVar + " converting to short: " + shortVar);

        intVar = shortVar;
        System.out.println("Short: " + shortVar + " converting to int: " + intVar);

        longVar = intVar;
        System.out.println("Int: " + intVar + " converting to long: " + longVar);

        doubleVar = longVar;
        System.out.println("Long: " + longVar + " converting to double: " + doubleVar);

        floatVar = intVar;
        System.out.println("Int: " + intVar + " converting to float: " + floatVar);

        floatVar = longVar;
        System.out.println("Long: " + longVar + " converting to float: " + floatVar);

        doubleVar = intVar;
        System.out.println("Int: " + intVar + " converting to double: " + doubleVar);

        intVar = charVar;
        System.out.println("Char: " + charVar + " converting to int: " + intVar);


        longVar = 0xffffffffffffffffL;

        intVar = (int) longVar;
        System.out.println("Long: " + longVar + " converting to int: " + intVar);

        doubleVar = (double) longVar;
        System.out.println("Long: " + longVar + " converting to double: " + doubleVar);

        floatVar = (float) longVar;
        System.out.println("Long: " + longVar + " converting to float: " + floatVar);

        byteVar = (byte) longVar;
        System.out.println("Long: " + longVar + " converting to byte: " + byteVar);

        charVar = (char) longVar;
        System.out.println("Long: " + longVar + " converting to char: " + charVar);

    }
}
