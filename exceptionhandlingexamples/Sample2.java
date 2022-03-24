package com.junu.exceptionhandlingexamples;

public class Sample2 {
    public static void main(String[] args) {
        try{
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("You are not allowed to overflow the array index num");
        }
    }
}
