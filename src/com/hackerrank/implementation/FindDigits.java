package com.hackerrank.implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int testCases = scan.nextInt();
		
		for(int i = 0 ; i < testCases ; i++) {
			int N = scan.nextInt();
			int count = 0;
			int n = N ;
			while(n>0) {
				int digit = n%10;
				if(digit != 0 && N%digit == 0)
					count++;
				n = n/10;
			}
			System.out.println(count);
		}
		
	}

}
