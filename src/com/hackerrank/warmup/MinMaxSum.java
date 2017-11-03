package com.hackerrank.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        getMinMaxSum(arr);
        
    }

	private static void getMinMaxSum(int[] array) {
		long min = getMinimum(array);
		long max = getMaximum(array);
		long sum = getSummation(array);
		
		long minSum = sum - max;
		long maxSum = sum - min;
		System.out.print(minSum +" " + maxSum);
	}

	private static long getSummation(int[] array) {
		long sum = 0;
		for(int i = 0 ; i < array.length ; i++) {
			sum += array[i];
		}
		return sum;
	}

	private static long getMaximum(int[] array) {
		long max = array[0];
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	private static long getMinimum(int[] array) {
		
		long min = array[0];
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}


