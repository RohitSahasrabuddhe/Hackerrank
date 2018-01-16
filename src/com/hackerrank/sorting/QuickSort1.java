package com.hackerrank.sorting;

import java.util.LinkedList;
import java.util.Scanner;

public class QuickSort1 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
	}

	private static int[] quickSort(int[] array) {
		// TODO Auto-generated method stub
		
		int p = array[0];
		LinkedList<Integer> left = new LinkedList<Integer>();
		LinkedList<Integer> equal = new LinkedList<Integer>();
		LinkedList<Integer> right = new LinkedList<Integer>();
		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] < p) {
				left.add(array[i]);
			}
			else if(array[i] > p) {
				right.add(array[i]);
			}
			else {
				equal.add(array[i]);
			}
		}
		
		int[] output = new int[array.length];
		int index = 0;
		for(int i = 0 ; i < left.size() ; i++) {
			output[index++] = left.get(i);
		}
		for(int i = 0 ; i < equal.size() ; i++) {
			output[index++] = equal.get(i);
		}
		for(int i = 0 ; i < right.size() ; i++) {
			output[index++] = right.get(i);
		}
		
		return output;
	}
	
	
}
