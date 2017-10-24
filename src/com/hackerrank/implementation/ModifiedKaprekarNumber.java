package com.hackerrank.implementation;

import java.util.Scanner;

public class ModifiedKaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		long p = scan.nextLong();
		long q = scan.nextLong();
		
		for(long i = p ; i <= q ; i++) {
			//System.out.println(i);
			if(i == 1) {
				System.out.print(i+" ");
				continue;
			}
			if(isKaprekarNo(i)) {
				System.out.print(i+" ");
			}
		}
		
		scan.close();
	}

	private static boolean isKaprekarNo(long number) {
		// TODO Auto-generated method stub
		long square = number*number;
		long no = number;
		int digit = 0 ;
		
		while(no > 0) {
			no = no/10;
			digit++;			
		}
		String sqaureNo = Long.toString(square);
		Long number1 =(long) 0 , number2 =(long) 0;
		try {
		String no1 = sqaureNo.substring(0 , sqaureNo.length()-digit);
		String no2 = sqaureNo.substring(sqaureNo.length()-digit);
		
		number1 = Long.parseLong(no1);
		number2 = Long.parseLong(no2);
		}
		catch(Exception e) {}
		if(number1 + number2 == number) {
			return true;
		}
		return false;
	}

}
