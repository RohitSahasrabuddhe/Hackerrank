package com.hackerrank.sorting;

import java.util.LinkedList;
import java.util.Scanner;

public class QuickSort2 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int arr_i = 0; arr_i < n; arr_i++){
			arr[arr_i] = in.nextInt();
		}
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0 ; i < n ; i++) {
			list.add(arr[i]);
		}
		LinkedList<Integer> result = quickSort(list);

		in.close();
	}

	private static void printList(LinkedList<Integer> result) {
		for(int i = 0 ; i < result.size() ; i++) {
			System.out.print(result.get(i) + " ");
		}
		System.out.println("");
	}

	private static LinkedList<Integer> quickSort(LinkedList<Integer> list) {
		// TODO Auto-generated method stub

		int p = list.get(0);
		LinkedList<Integer> left = new LinkedList<Integer>();
		LinkedList<Integer> equal = new LinkedList<Integer>();
		LinkedList<Integer> right = new LinkedList<Integer>();

		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i) < p) {
				left.add(list.get(i));
			}
			else if(list.get(i) > p) {
				right.add(list.get(i));
			}
			else {
				equal.add(list.get(i));
			}
		}

		if(left.size() > 1) {
			left = quickSort(left);
		}
		if(right.size() > 1) {
			right = quickSort(right);
		}

		LinkedList<Integer> output = new LinkedList<Integer>();
		for(int i = 0 ; i < left.size() ; i++) {
			output.add(left.get(i));
		}

		for(int i = 0 ; i < equal.size() ; i++) {
			output.add(equal.get(i));
		}

		for(int i = 0 ; i < right.size() ; i++) {
			output.add(right.get(i));
		}

		printList(output);
		return output;
	}


}
