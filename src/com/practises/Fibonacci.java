package com.practises;

import java.util.Scanner;

public class Fibonacci {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        int seriesInd = in.nextInt(); //Fibonacci number we have to find.

        int[] fibonacci;

        fibonacci = new int[seriesInd];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < seriesInd; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]; //Building a fibonacci series upto the desired index
        }

        System.out.println(fibonacci[seriesInd-1]);

    }

}
