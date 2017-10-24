package com.hackerrank.implementation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class EquilizeTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n ; i++) {
			array[i] = scan.nextInt();
		}
		
		LinkedList<Integer> distinctElement =  getDistinctList(array);
		int maxCount = 0;
		int[] count = new int[distinctElement.size()];
		
		Iterator<Integer> i = distinctElement.iterator();
		int k = 0;
		while(i.hasNext()) {
			count[k] = getCount((int)i.next() , array);
			k++;
		}
		
		maxCount = getMaxCount(count);
		System.out.println(n - maxCount);
		
		scan.close();
	}

	private static int getMaxCount(int[] count) {
		// TODO Auto-generated method stub
		int max = -100000000;
		for(int i = 0 ; i < count.length ;i++  ) {
			if(max < count[i]) {
				max = count[i];
			}
		}
		return max;
	}

	private static int getCount(int element, int[] array) {
		// TODO Auto-generated method stub
		int count = 0 ;
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] == element) {
				count++;
			}
		}
		return count;
	}

	private static LinkedList<Integer> getDistinctList(int[] array) {
		// TODO Auto-generated method stub
		LinkedList<Integer> distinctList = new LinkedList<Integer>();
		for(int i = 0 ; i < array.length ; i++) {
			if(isPresentInList(distinctList , array[i])) {
				continue;
			}
			distinctList.add(array[i]);
		}
		
		
		return distinctList;
	}

	private static boolean isPresentInList(LinkedList<Integer> distinctList, int element) {
		// TODO Auto-generated method stub

		Iterator<Integer> i = distinctList.iterator();
		while(i.hasNext()) {
			if(i.next() == element) {
				return true;
			}
		}
		return false;
	}

}
