package com.hackerrank.implementation;

import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sticks[] = new int[n];
		
		for(int i = 0 ; i < n ; i ++) {
			sticks[i] = scan.nextInt();
		}
		
		while(getSticksCount(sticks) > 0) {
			System.out.println(getSticksCount(sticks));
			int min  = getMinimum(sticks);
			
			for(int i = 0 ; i < n ; i++) {
				sticks[i] -= min;
			}
			
			
			
			
		}
		
		scan.close();
	}

	private static int getMinimum(int[] sticks) {
		// TODO Auto-generated method stub
		int min = 10000000;
		
		for(int i = 0 ; i < sticks.length ; i++) {
			if(min > sticks[i] && sticks[i] > 0)
				min = sticks[i];
		}
		
		return min;
	}

	private static int getSticksCount(int[] sticks) {
		// TODO Auto-generated method stub
		int count = 0 ;
		
		for(int i = 0 ; i < sticks.length ; i++) {
			if(sticks[i] > 0)
				count++;
		}
		
		return count;
	}

}
