package com.hackerrank.string;

import java.util.Scanner;

public class Pangrams {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
			String s = scan.nextLine();
			
			String result = isPangram(s);
			
			System.out.println(result);
		
	}

	private static String isPangram(String s) {
		
		int[] array = new int[26];
		for(int i = 0 ; i < s.length() ; i++) {
			if(96 < s.charAt(i) && s.charAt(i) < 123) {
				array[s.charAt(i)-97] = 1;
			}
			else if(64 < s.charAt(i) && s.charAt(i) < 91){
				array[s.charAt(i)-65] = 1;
			}
		}
		for(int i = 97 ; i < 123 ; i++) {
			char c = (char)i;
			System.out.print(c+ " ");
		}
		System.out.println();
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] == 0) {
				return "not pangram";
			}
		}
		
		return "pangram";
	}
}
