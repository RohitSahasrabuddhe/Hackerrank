package com.hackerrank.compititions;

import java.util.Scanner;

public class Eular201 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] s = new int[n];
		for(int i = 0 ; i < n ; i++) {
			s[i] = scan.nextInt();

		}
		
		findMSubsets(s,n,m);

	}

	private static void findMSubsets(int[] s, int n, int m) {
		
		
	}

}
