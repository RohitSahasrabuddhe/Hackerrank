package com.hackerrank.onemonthchallenge;

import java.util.Scanner;

public class Day10 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String binary = generateBinary(n);
		
		int max = getMaxCount(binary);
		
		System.out.println(max);
	}

	private static int getMaxCount(String binary) {
		int maxCount = 0;
		int currentCount;
		for(int i = 0 ; i < binary.length() ; i++) {
			if(binary.charAt(i) == '1') {
				currentCount = 1;
				i++;
				while(i < binary.length() && binary.charAt(i) == '1') {
					currentCount++;
					i++;
				}
				if(maxCount < currentCount)
					maxCount = currentCount;
			}
		}
		return maxCount;
	}

	private static String generateBinary(int n) {
		String binaryReverse = "";
		while(n > 0) {
			if(n%2 == 1)
				binaryReverse = binaryReverse + "1";
			else
				binaryReverse = binaryReverse +"0";
			
			n = n/2;
		}
		
		String binary = "";
		for(int i = binaryReverse.length() - 1 ; i >= 0  ; i--) {
			binary = binary + binaryReverse.charAt(i);
		}
		return binary;
	}

}
