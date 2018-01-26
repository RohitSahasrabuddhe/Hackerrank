package com.hackerrank.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ClosestNumbers {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int difference = getMinimumDifference(arr);
        int[] result = closestNumbers(arr , difference);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

	private static int getMinimumDifference(int[] array) {
		int diff = Math.abs(array[1] - array[0]);
		for(int i = 0 ;i < array.length-1 ; i++) {
			for( int j = i+1 ; j < array.length ; j++) {
				int currentDiff = Math.abs(array[i] - array[j]);
				if(currentDiff < diff) {
					diff = currentDiff;
				}
			}
		}
		return diff;
	}

	private static int[] closestNumbers(int[] array , int diff) {
		
		LinkedList<Pair> list = new LinkedList<Pair>();
		for(int i = 0 ;i < array.length-1 ; i++) {
			for( int j = i+1 ; j < array.length ; j++) {
				int currentDiff = Math.abs(array[i] - array[j]);
				if(currentDiff == diff) {
					Pair p = new Pair(array[i],array[j]);
					list.add(p);
				}
			}
			
		}
		
		Collections.sort(list, new Comparator<Pair>() {

			@Override
			public int compare(Pair p1, Pair p2) {
				// TODO Auto-generated method stub
				return(p1.least - p2.least);
			}
			
		});
		
		int[] result = new int[list.size()*2]; 
		int index = 0;
		for(int i = 0 ; i < list.size() ; i++) {
			result[index++] = list.get(i).first;
			result[index++] = list.get(i).second;
		}
		return result;
	}
}

class Pair{
	public Pair(int i, int j) {
		
		if(i<j) {
			this.least = i;
			this.first = i;
			this.second = j;
		}
		else {
			this.least = j;
			this.first = j;
			this.second = i;
		}
	}

	int first,second;
	
	int least;
	
}
