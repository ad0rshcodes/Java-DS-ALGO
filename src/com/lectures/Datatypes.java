package com.lectures;

public class Datatypes {

    public static void main(String[] args) {

        //various datatype are present in java. Ex: int, bool, float etc. All of them belong to primitive date type except String.

        char firstChar = 'a'; //size: 2 byte
        float num1 = 98.67f; //size: 4 bytes
        double largeDecimalNumbers = 4567654.4567; //size: 8 bytes
        long largeIntegers = 545444545454545454L; //size: 8 bytes
        boolean check = true; //size: 1 bits
        // 1 byte = 8 bits

        String name = "adarsh";

        //Primitive datatype: a datatype that can't broken further int, char, etc. can be broken while String can be broken down into further characters.

        int age = 16; //creating a int variable
        int marks = 50; // size: 4 bytes.
        // Integer marks = new Integer(56); method to create an Int object. This allow us to perform a lot of functions on the integer
        System.out.println(marks);
        //Various Functions on integers can be accessed by writing "marks."

    }
}
