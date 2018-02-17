package com.hackerrank.onemonthchallenge;

import java.util.Scanner;

public class Day6 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for(int i = 0 ; i < n ; i++) {
			String str = scan.next();
			printEvenOddStrings(str);
		}
		
	}

	private static void printEvenOddStrings(String str) {
		String even ="";
		String odd = "";
		for(int i = 0 ; i < str.length() ; i++) {
			if(i%2 == 0) {
				//even
				even = even + str.charAt(i);
			}
			else {
				//odd
				odd = odd + str.charAt(i);
			}
		}
		
		System.out.println(even + " " + odd);
		
	}

}
