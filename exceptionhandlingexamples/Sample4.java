package com.junu.exceptionhandlingexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sample4 {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("a.txt");

        }
        catch (FileNotFoundException e){
            System.out.println(e);
            System.out.println("File not found!!");
        }
    }
}
