package com.hackerrank.implementation;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int output[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			int N = scan.nextInt();
			int K = scan.nextInt();
			int timings[] = new int[N];
			for(int j = 0 ; j < N ; j++) {
				timings[j] = scan.nextInt();
			}
			int count = 0 ;
			for(int j = 0 ; j < N ; j++) {
				if(timings[j] <= 0){
					count++;
				}
			}
			//System.out.println(count + ":" + K);
			if(count < K) {
				output[i] = 1;
			}
			else {
				output[i] = 0;
			}			
		}
		
		for(int i = 0 ; i < n ; i++) {
			if(output[i] == 1)
				System.out.println("YES");
			if(output[i] == 0)
				System.out.println("NO");
		}
	}

}
