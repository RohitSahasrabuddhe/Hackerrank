package com.hackerrank.sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        
        for(int i = 0 ; i < n ; i++) {
        	for(int j = 0 ; j < n-i-1 ; j++) {
        		if(unsorted[j].length() > unsorted[j+1].length()||isIGreaterThanJ(unsorted , j , j+1)) {
        			String temp = unsorted[j];
        			unsorted[j] = unsorted[j+1];
        			unsorted[j+1] = temp;
        		}
        		else {
        			//System.out.println(unsorted[j] + "is less than " + unsorted[i]);
        		}
        	}
        }
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
        	System.out.println(unsorted[unsorted_i]);
        }
        	
        
        // your code goes here
    }

	private static boolean isIGreaterThanJ(String[] unsorted, int i, int j) {
		// TODO Auto-generated method stub
		BigInteger b1 = new BigInteger(unsorted[i]);
		BigInteger b2 = new BigInteger(unsorted[j]);
		if(b2.compareTo(b1) > 0) {
			//System.out.println(b2.toString() + " is Greater than " + b1.toString());
			return false;
		}
		else {
			//System.out.println(b2.toString() + " is less than " + b1.toString());
			
			return true;
		}
	}
}