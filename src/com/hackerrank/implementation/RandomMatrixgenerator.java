package com.hackerrank.implementation;

public class RandomMatrixgenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 3;
		int n = 6;
		System.out.print(m + " " + n + " 1\n");
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.print((i+j)%10+" ");
			}
			System.out.print("\n");
		}
	}

}
