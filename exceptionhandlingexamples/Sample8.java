package com.junu.exceptionhandlingexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Sample8 {
    public void readFile() throws FileNotFoundException {
        FileInputStream fs = new FileInputStream("a.txt");
        System.out.println("Read file");
    }

    public void saveFile() throws FileNotFoundException {
        FileOutputStream fs1 = new FileOutputStream("a.txt");
        System.out.println("Save file");
    }
}
