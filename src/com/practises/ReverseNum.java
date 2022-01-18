package com.practises;

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to be reversed: ");
        int num = in.nextInt();

        int revNum = 0;

        while (num > 0){

            int lastDig = num % 10;
            num /= 10;
            // System.out.println(num);

            revNum = revNum * 10 + lastDig;

        }

        System.out.print("The reversed number is: ");
        System.out.println(revNum);

    }


}
