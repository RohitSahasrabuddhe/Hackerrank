package com.hackerrank.sorting;
import java.util.Scanner;

public class CountingSort2 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int arr_i = 0; arr_i < n; arr_i++){
			arr[arr_i] = in.nextInt();
		}
		int[] result = countingSort(arr);
		int[] output = sortIt(result, arr);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
		System.out.println("");


		in.close();
	}

	private static int[] sortIt(int[] count, int[] array) {
		int[] output = new int[array.length];
		int index = 0;
		for(int i = 0 ; i < 100 ; i++) {
			if(count[i] > 0) {
				for(int j = 0 ; j < count[i] ; j++) {
					output[index++] = i;
				}
			}
		}
		return output;
	}

	private static int[] countingSort(int[] array) {
		int[] count = new int[100];

		for(int i = 0 ; i < array.length ; i++) {
			count[array[i]]++;
		}
		return count;
	}
}