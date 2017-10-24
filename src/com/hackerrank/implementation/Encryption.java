package com.hackerrank.implementation;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		int length = str.length();
		int row , column;
		double sqrt = Math.sqrt(length);
		
		if(sqrt == Math.floor(sqrt)) {
			row = (int)sqrt;
			column = (int)sqrt;
			}
		else {
			row = (int)sqrt;
			column = row + 1;
			
			if(row*column < length) {
				row += 1;
			}
		}
		char[][] array = new char[row][column];
		
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < column ; j++) {
				if(i*column + j >= length) {
					array[i][j] = '0';
				}
				else {
					array[i][j] = str.charAt(i*column+j);
				}
			}
		}
		for(int j = 0 ; j < column ; j++) {
			for(int i = 0 ; i < row ; i++) {
				if(array[i][j] == '0')
					continue;
				System.out.print(array[i][j]);
			}
			System.out.print(" ");
		}
		scan.close();
	}

}
