package com.practises;

import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.print("Enter the number: ");
        int givenNum = in.nextInt();

        System.out.print("Enter digit you need to find: ");
        int desiredDigit = in.nextInt(); //desired digit to find.

        int count = 0;

        while (givenNum != 0){
            int temp = givenNum % 10; //going through the one's place by finding remainder.

            if (temp == desiredDigit){
                count++;
            }

            givenNum = (givenNum - temp)/10; //removing the last digit from the number itself.

        }

        System.out.println(count);


    }

}
