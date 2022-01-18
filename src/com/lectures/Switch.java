package com.lectures;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        //old method of writing switch:
        switch (fruit){

            case "Mango":
                System.out.println("king");
                break;

            case "Apple":
                System.out.println("red");
                break;

            case "Papaya":
                System.out.println("Yellow");
                break;

            default:
                System.out.println("invalid fruit");
        }

        // New method of writing switch
        switch (fruit) {
            case "Mango" -> System.out.println("king");
            case "Apple" -> System.out.println("red");
            case "Papaya" -> System.out.println("Yellow");
            default -> System.out.println("invalid fruit");
        }


        int day = in.nextInt();


        //Old method

        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:

            case 6:

            case 7:
                System.out.println("Holidays");
                break;

            default:
                System.out.print("out of range");
        }


        //New method with same code for some multiple cases.

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5, 6, 7 -> System.out.println("Holidays"); //Multiple cases
            default -> System.out.print("out of range");
        }

    }


}
