package com.hackerrank.onemonthchallenge;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int i1 = Integer.parseInt(scan.nextLine());
        double d1 = Double.parseDouble(scan.nextLine());
        String s1 = scan.nextLine();
        

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i1+i);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d1 + d);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
		
		System.out.println( s +""+ s1);
        
	}

}
