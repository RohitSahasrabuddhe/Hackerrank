package com.hackerrank.implementation;

import java.util.Scanner;

public class ViralAdvertisment {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 2;
		int floor = 2;
		for(int i = 1 ; i < n ; i++) {
			floor = floor*3/2;
			sum = sum + floor;
			//System.out.println("Sum : " + sum + " Floor value : " + floor);
		}
		System.out.println(sum);
	}
}
