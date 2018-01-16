package com.hackerrank.sorting;

import java.util.Scanner;

public class IntroTutorialChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = introTutorial(V, arr);
        System.out.println(result);
        in.close();

	}

	private static int introTutorial(int v, int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(v == arr[i]) {
				return i;
				
			}
		}
		return 0;
	}

}
