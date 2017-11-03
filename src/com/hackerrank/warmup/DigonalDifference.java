package com.hackerrank.warmup;

import java.util.Scanner;

public class DigonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		
		int matrix[][] = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		
		int firstDigonal = sumOfFirstDigonal(matrix);
		int secondDigonal = sumOfSecondDigonal(matrix);
		
		int difference = Math.abs(firstDigonal - secondDigonal);
		System.out.print(difference);
	}

	private static int sumOfSecondDigonal(int[][] matrix) {
		int sum = 0;
		
		for(int i = 0 , j = matrix.length - 1 ; i < matrix.length && j >= 0 ; i++ , j--) {
			sum += matrix[i][j];
		}
		
		return sum;
	}

	private static int sumOfFirstDigonal(int[][] matrix) {
		int sum = 0;
		
		for(int i = 0, j = 0; i < matrix.length && j < matrix.length ; i++ , j++) {
			sum += matrix[i][j];
		}
		return sum;
	}

}
