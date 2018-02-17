package com.hackerrank.onemonthchallenge;

import java.util.Scanner;

public class Day11 {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int maxSum = -100000 ;
        
        for(int i = 0 ; i < 4 ; i++) {
        	for(int j = 0 ; j < 4 ; j++) {
        		
        		int sum = getSum(arr, i , j);
        		if(sum > maxSum) {
        			maxSum = sum;
        		}
        	}
        }
        System.out.println(maxSum);
    }

	private static int getSum(int[][] arr, int i, int j) {
		int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
		return sum;
	}

}
