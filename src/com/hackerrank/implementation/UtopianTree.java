package com.hackerrank.implementation;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		for(int i = 0 ; i < n ; i ++) {
			array[i] = scan.nextInt();
		}
		
		for(int i = 0 ; i < n ; i++) {
			int growth = getGrowth(array[i]);
			System.out.println(growth);
		}
	}

	private static int getGrowth(int cycles) {
		int size = 1;
		if(cycles == 0)
			return size;
		boolean isSpring = true;
		for(int i = 0 ; i < cycles; i++) {
			if(isSpring) {
				size *= 2;
				isSpring = false;
			}
			else {
				size += 1;
				isSpring = true;
			}
		}
		return size;
	}
}
