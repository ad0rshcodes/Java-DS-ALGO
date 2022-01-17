package com.lectures;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {


        System.out.println(75); //Standard format to output something, here the keyword "out " refers to console at the moment but out could be specified as a file and then the program will print the statement in that file.

        // "out" keyword is important if we need to print something either in console or in files. (out ="file path")


        Scanner sc = new Scanner(System.in); //way to take input
       //Here too, the "System.in" could be replaced with a file path and, therefore we can take inputs from a file too.

        String inputText =  sc.nextLine();

        System.out.println(inputText);




    }
}
