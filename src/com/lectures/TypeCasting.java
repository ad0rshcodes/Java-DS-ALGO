package com.lectures;

import java.util.Scanner;

public class TypeCasting {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        Float num1 = input.nextFloat();
        Float num2 = input.nextFloat();

        System.out.println(num1 + num2); //output: 103.0
        //We input integers but the result of num1 + num2 was a float... This happens when the destination type is greater than the source type. In our case: float > Integers

        //You can input int in float but can't do vise versa.
        //int num3 = input.nextFloat(); Gives an error

        //Integer to float conversion is done automatically but the vice versa is done through type casting.

        //Typecasting
        int num3 = (int) 34.547f; //Converting float to integer


        //automatic type promotion in expression

        //ExtraInfo: A byte is a datatype that can hold a value upto 256.

        int a = 257;
        byte b1 = (byte) a; //output: 1. Even after conversion of a from int to byte. A byte can maximum store a value of 256. Therefore, any value greater than that will be computed as {a%256}

        System.out.println(b1);


        byte c1 = 40;
        byte d1 = 50;
        byte e = 100;

        int f1 = c1*d1/e; //Output: 20. Here c*d should also give a byte but c*d = 2000 which exceeds the limits of a byte. Then how are things getting executed here?

        // Whenever any operations are performed on bytes. java automatically converts it into integers. In above example c*d is calculated keeping in mind that 'c' & 'd' are integers.
        // Things are getting self promoted ;)

        System.out.println(f1);



        int character = 'A';
        System.out.println(character); //Output: 65. The char 'A' is automatically promoted to int and is assigned its ascii code value.




        //Example of automatic promotion in an expression

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d= 0.1234;
        double result = (f * b) + (i * c) - (d * s);
        // {f*b} is promoted as float where b is promoted to float.
        // {i*c} is promoted as int where char is promoted to integer.
        // {d*s} is promoted as double where short is promoted to double.

        System.out.println((f * b) + " " + (i * c) + " " + (d * s));
        System.out.println(result);

    }
}


//Great Article for revision: https://www.geeksforgeeks.org/type-conversion-java-examples/