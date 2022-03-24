package com.junu.exceptionhandlingexamples;

public class Sample6 {
    public static void main(String[] args) {
        try{
        int a=10/0;
        System.out.println(a);
        }
        catch (NullPointerException e){
            System.out.println("catch block ");
        }
        finally {
            System.out.println("finally bloc is executed");
        }

    }
}
