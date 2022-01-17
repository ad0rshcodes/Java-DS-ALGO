package com.practises;

import java.util.Scanner;

public class LargestNumber {

    public static void main (String[] args){

        // inputting how many numbers we have to compare
        Scanner input = new Scanner(System.in);
        int numCount = input.nextInt();

        // taking & storing the user's input
        int[] numRecord;
        numRecord = new int[numCount];

        for (int i = 0; i < numCount; i++) {
            numRecord[i] = input.nextInt();
        }

        //finding maximum in an array

        int largestNum = numRecord[0];

        for (int i = 1; i < numCount; i++){

            if (numRecord[i] > largestNum){
                largestNum = numRecord[i];
            }

        }


        System.out.println("The largest number is: " + largestNum);

    }
}
