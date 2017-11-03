package com.hackerrank.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] array) {
        // Complete this function
    	int max = 0 ;
    	for(int i = 0 ; i < array.length ; i++) {
    		if(array[i] > max) {
    			max = array[i];
    		}
    	}
    	int count = 0 ;
    	for(int i = 0 ; i < array.length ; i++) {
    		if(array[i] == max) {
    			count++;
    		}
    	}
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            array[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, array);
        System.out.println(result);
    }
}