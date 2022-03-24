package com.junu.exceptionhandlingexamples;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Sample7 s = new Sample7();
        try {
            s.divide();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Run successfully");

        Sample8 s1 = new Sample8();
        try {
            s1.readFile();
        } catch (FileNotFoundException e) {

        }
        try {
            s1.saveFile();
        } catch (FileNotFoundException e) {

        }
    }


}
