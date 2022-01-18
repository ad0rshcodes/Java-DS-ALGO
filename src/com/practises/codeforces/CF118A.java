package com.practises.codeforces;

//Question: https://codeforces.com/problemset/problem/118/A

import java.util.Locale;
import java.util.Scanner;

public class CF118A {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        String input = in.next();

        input = input.toLowerCase(Locale.ROOT);

        //System.out.println(input);

        String output = "";

        int length = input.length();

        for (int i = 0; i < length; i++) {

            char temp = input.charAt(i);

            if (temp != 'a' && temp != 'e' && temp != 'i' && temp != 'o' && temp != 'u'){

                output = output + "." + temp;

            }
        }

        System.out.println(output);


    }


}
