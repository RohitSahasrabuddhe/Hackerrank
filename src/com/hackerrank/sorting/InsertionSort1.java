package com.hackerrank.sorting;

import java.util.Scanner;

public class InsertionSort1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int arr_i = 0; arr_i < n; arr_i++){
			arr[arr_i] = in.nextInt();
		}
		insertionSort1(n, arr);
		in.close();

	}

	private static void insertionSort1(int n, int[] array) {
		
		int temp = array[n-1];
		int index = n-1;
		while(temp < array[index-1]) {
			array[index] = array[index-1];
			index--;
			printArray(array);
			if(index == 0){
				break;
			}
			
		}
		array[index] = temp;
		printArray(array);
		
	}

	private static void printArray(int[] array) {
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}

}
