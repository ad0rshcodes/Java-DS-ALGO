package com.adarsh;

public class Main { //The className has to be capitalised and similar to that of the file name.

    public static void main(String[] args) { //It's a compulsion to have a main function in the java program as it's the starting point of the program.

        //-> Public keyword give access of the function to all other functions outside of it.As "main" is a crucial function it makes sense to make it public for other functions to access it.

        //-> Static keyword means that this function will be accessible without creating an object of it. In Java, we have to create an object of functions & classes to access them.

        System.out.println("hello world");

        int a = 100;

        int b = a;

        a = 80;

        System.out.println(b);
        System.out.println(a);
    }
}
