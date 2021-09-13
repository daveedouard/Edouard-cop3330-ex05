/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex05;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int first = input.nextInt();

        System.out.print("What is the second number? ");
        int second = input.nextInt();

        int sum = first+second;
        int difference = first-second;
        int product = first*second;
        int quotient = first/second;

        System.out.print(first+" + "+second+" = "+sum+"\n"+first+" - "+second+" = "+difference+"\n"+first+" * "+second+" = "+product+"\n"+first+" / "+second+" = "+quotient);
    }
}
