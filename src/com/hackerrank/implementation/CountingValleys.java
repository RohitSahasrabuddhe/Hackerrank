package com.hackerrank.implementation;

import java.util.Scanner;

public class CountingValleys {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String input = scan.next();
		
		int level = 0;
		int count = 0;
		for(int i = 0 ; i < n ; i++) {
			if(input.charAt(i) == 'U')
				level++;
			else {
				if(level == 0)
					count++;
				level--;
			}
		}
		
		
		System.out.print(count);
		
	}

}
