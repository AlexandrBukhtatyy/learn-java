package com.company;

public class Main {

    public static void main(String[] args) {
        byte b = 0; // 1 байт byte(256) -128/+128
        short sh = 1234; // 2 байта(~65000) -32k/+32k
        int in = 23423424;  // 4 байта
        long ln = 234234; // 8 байт
        float flt = 12.324f; // 4 байта
        double dbl = 12.324; // 8 байт
        boolean bln = false; // 1 бит
        char chr;
        System.out.println("Hello World!");
    }
}