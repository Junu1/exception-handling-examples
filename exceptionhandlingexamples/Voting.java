package com.junu.exceptionhandlingexamples;

public class Voting {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new CustomException();
            }
            else{
                System.out.println("You can vote");
            }
        }
        catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
