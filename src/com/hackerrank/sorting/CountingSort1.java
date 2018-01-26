package com.hackerrank.sorting;

import java.util.Scanner;

public class CountingSort1 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = countingSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("");


        in.close();
	}

	private static int[] countingSort(int[] array) {
		int[] count = new int[100];
		
		for(int i = 0 ; i < array.length ; i++) {
			count[array[i]]++;
		}
		return count;
	}
}
