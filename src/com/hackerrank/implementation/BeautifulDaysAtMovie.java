package com.hackerrank.implementation;

import java.util.Scanner;

public class BeautifulDaysAtMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		int count = 0;
		for(int n = i ; n <= j ; n++) {
			int reverse = getReverse(n);
			//System.out.println("N is: " + n + "  Reverse is : " + reverse);
			if((n-reverse)%k == 0)
				count++;
		}
		System.out.print(count);
	}

	private static int getReverse(int n) {
		// TODO Auto-generated method stub
		int reverse = 0;
		while(n != 0) {
			int digit = n%10;
			n = n/10;
			reverse = reverse * 10 + digit;
		}
		return reverse;
	}

}
