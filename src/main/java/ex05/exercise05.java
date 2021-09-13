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
        String firststr = input.nextLine();
        int first = Integer.parseInt(firststr);

        System.out.print("What is the second number? ");
        String secondstr = input.nextLine();
        int second = Integer.parseInt(secondstr);

        int sum = first+second;
        int difference = first-second;
        int product = first*second;
        int quotient = first/second;

        System.out.print(first+" + "+second+" = "+sum+"\n"+first+" - "+second+" = "+difference+"\n"+first+" * "+second+" = "+product+"\n"+first+" / "+second+" = "+quotient);
    }
}
