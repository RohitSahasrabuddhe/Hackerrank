package com.hackerrank.implementation;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int matrix[][] = new int[n][n]; 
		int outputMatrix[][] = new int[n][n];
		String[] str = new String[n];
		for(int i = 0 ; i < n ; i++) {
			str[i] = scan.next();
		}
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				matrix[i][j] = (int)(str[i].charAt(j) -'0');
				outputMatrix[i][j] = matrix[i][j];
			}
			
		}
		for(int i = 1 ; i < n-1 ; i++ ) {
			for(int j = 1 ; j < n-1 ; j++) {
				if(isCavity(matrix , i , j))
					outputMatrix[i][j] = 10;
			}
		}
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(outputMatrix[i][j] == 10) {
					System.out.print("X");
				}
				else {
					System.out.print(outputMatrix[i][j]);
				}
			}
			System.out.print("\n");
		}
		scan.close();
	}

	private static boolean isCavity(int[][] matrix, int i, int j) {
		// TODO Auto-generated method stub
		if(matrix[i][j] > matrix[i-1][j] && matrix[i][j] > matrix[i][j-1] && matrix[i][j] > matrix[i+1][j] && matrix[i][j] > matrix[i][j+1])
			return true;
		return false;
	}

}
