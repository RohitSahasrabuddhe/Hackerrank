package com.hackerrank.implementation;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		int[] width = new int[n];
		for(int i = 0 ; i < n ; i++) {
			width[i] = scan.nextInt();
		}
		for(int k = 0 ; k < t ; k++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			if(canPass(width , i , j , 3)) {
				System.out.print("3\n");
				continue;
			}
			if(canPass(width , i , j , 2)) {
				System.out.print("2\n");
				continue;
			}
			if(canPass(width , i , j , 1)) {
				System.out.print("1\n");
				continue;
			}
			System.out.print("0\n");
			
		}
		
		
		
		
		scan.close();

	}

	private static boolean canPass(int[] width, int i, int j, int k) {
		// TODO Auto-generated method stub
		for(int x = i ; x <= j ; x++) {
			if(width[x] < k)
				return false;
		}
		return true;
	}

}
