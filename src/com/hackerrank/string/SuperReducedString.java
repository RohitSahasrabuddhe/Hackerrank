package com.hackerrank.string;

import java.util.Scanner;

public class SuperReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		String result = getReducedString(input);
		//System.out.println(result);
		scan.close();
		
	}

	private static String getReducedString(String input) {
		char array[] = input.toCharArray();
		int length = array.length;
		char last = array[array.length-1];
		outerloop:
		while(!isReduced(array , length)) {
			for(int i = 0 ; i < array.length - 1 ; i++) {
				if(array[i] == array[i+1]) {
					
					for(int j = i; j < length - 2; j++) {
						array[j] = array[j+2];
					}
					length = length - 2;
					break;
				}
				
			}
		}
		if(length == 0) {
			System.out.println("Empty String");
		}
		else {
			for(int i = 0 ; i < length ; i++) {
				System.out.print(array[i]);
			}
		}
		return "abs";
	}

	private static boolean isReduced(char[] array , int length) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < length - 1 ; i++) {
			if(array[i] == array[i+1]) {
				return false;
			}
		}
		return true;
	}

}
