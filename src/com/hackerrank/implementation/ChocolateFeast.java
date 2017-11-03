package com.hackerrank.implementation;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			int dollars = scan.nextInt();
			int price = scan.nextInt();
			int wrappersPerChocolate = scan.nextInt();
			
			int count = getTotalChocolates(dollars, price, wrappersPerChocolate);
			
			System.out.print(count+"\n");
			
		}
		
		scan.close();
	}

	private static int getTotalChocolates(int dollars, int price, int wrappersPerChocolate) {
		// TODO Auto-generated method stub
		int chocolates = dollars/price;
		int count = chocolates;
		int wrappers = chocolates;
		while(wrappers >= wrappersPerChocolate) {
			int temp = wrappers%wrappersPerChocolate;
			chocolates = wrappers/wrappersPerChocolate;
			
			wrappers = chocolates + temp;
			count += chocolates;
			
			//System.out.print("Count : "+count+" Wrappers : "+wrappers + " Chocolates : " + chocolates + "\n");
		}
		return count;
	}

}
