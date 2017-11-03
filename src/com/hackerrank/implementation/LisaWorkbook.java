package com.hackerrank.implementation;

import java.util.Scanner;

public class LisaWorkbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int t[] = new int[n];
		int count = 0;
		int pageNo = 0;
		for(int i = 0 ; i < n ; i++) {
			t[i] = scan.nextInt();
			int problems = t[i];
			int firstProblem = 0 , lastProblem = 0;
			while(problems > 0) {
				lastProblem = firstProblem + k-1;
				if(firstProblem <= pageNo && pageNo <= lastProblem ) {
					count++;
				}
				
				//System.out.println("First Problem : " + firstProblem + " Last Problem : "+ lastProblem + "Page No : " + pageNo + " Count : " + count);
				firstProblem = lastProblem+1;
				pageNo++;
				problems = problems/k;
			}
			for(int j = firstProblem ; j < t[i] ; j++ ) {
				if(pageNo == j) {
					count++;
				}
			}
		
			
			
			
			
		}
		System.out.println(count-1);
		
		scan.close();

	}

}
