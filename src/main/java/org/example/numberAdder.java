/*
 *  UCF COP3330 Summer 2021 Assignment 27 Solution
 *  Copyright 2021 RAYME PERSAD
 */

/*
Write a program that prompts the user for five numbers and computes the total of the numbers.
 */


package org.example;

import java.util.Scanner;

public class numberAdder {
        public static void main(String[] args)
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.print("Input third number: ");
        int num3 = in.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = in.nextInt();

        System.out.print("Enter fifth number: ");
        int num5 = in.nextInt();


        System.out.println("The total is: " +
          (num1 + num2 + num3 + num4 + num5);
    }
}


