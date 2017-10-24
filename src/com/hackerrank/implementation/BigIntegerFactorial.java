package com.hackerrank.implementation;

import java.math.BigInteger;
import java.util.Scanner;
public class BigIntegerFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(factorial(n));
		scan.close();
	}

	private static BigInteger factorial(int n) {
		// TODO Auto-generated method stub
		BigInteger factorial = new BigInteger("1");
		for(int i = 1; i <= n ; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}
}


