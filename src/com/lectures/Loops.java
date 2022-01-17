package com.lectures;

import java.util.Scanner;

public class Loops {

    public static void main (String [] args){

        //For loop:

        Scanner inputnum = new Scanner(System.in);

        int compare = inputnum.nextInt();

        for (int k = 0; k < compare; k++) {

            System.out.print(k + " ");

        }

        //----------------------------------------------

        //While loop:

        int count = 12;

        while (count >= 0){
            System.out.println(count);
            count --;
        }


        // do while loop

        int i = 0;

        do {
            System.out.println(i);
            i++;
        }while (i < 10);




    }



}
