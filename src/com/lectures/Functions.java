package com.lectures;

import java.util.Scanner;

public class Functions {

    public static void main (String[] args){

        greetings("hii");

        int addition = sum();

        System.out.println(addition);

    }


    //Non-returning methods
    static void greetings(String message){
        System.out.println(message);
    }


    //returning integer
    static int sum(){

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        return num1 + num2;
    }



}
