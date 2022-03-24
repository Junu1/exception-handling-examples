package com.junu.exceptionhandlingexamples;
//multiple catch
public class Sample5 {
    public static void main(String[] args) {
        try{
            int[] a = new int[5];
            a[6]=10/0;

        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutofBound exception occurs");
        }
        System.out.println("Remaining code");

    }
}
