package com.hackerrank;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] array = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            array[ar_i] = in.nextInt();
	        }
	        plusMinusFractioCalculator(array);
	}

	private static void plusMinusFractioCalculator(int[] array) {
		int plus = 0 ; 
		int minus = 0 ;
		int zero = 0 ;
		
		for(int i = 0 ; i <  array.length ; i++) {
			if(array[i] > 0)
				plus++;
			else if(array[i] < 0)
				minus++;
			else
				zero++;
			}
		double sum = plus + minus + zero;
		double plusFraction, minusFraction, zeroFraction;
		
		plusFraction = plus/sum;
		minusFraction = minus/sum;
		zeroFraction = zero/sum;
		
		System.out.print(plusFraction + "\n" + minusFraction + "\n" + zeroFraction);
		
	}

}
