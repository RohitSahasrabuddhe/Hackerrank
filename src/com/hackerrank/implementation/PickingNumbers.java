package com.hackerrank.implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        
        for(int i = 0 ; i < n ; i++) {
        	for(int j = 1 ; j < n-i ; j ++) {
        		if(a[j-1] > a[j]) {
        			int temp = a[j-1];
        			a[j-1] = a[j];
        			a[j] = temp;
        			
        		}
        	}
        }
        int maxCount = 0;
        
        for(int i = 0 ; i < n ; i++) {
        	int count = getCount(a,i);
        	System.out.print("Count is: " + count +"\n");
        	if(count > maxCount) {
        		maxCount = count;
        	}
        }
        System.out.println(maxCount);
    }

	private static int getCount(int[] a, int i) {
		// TODO Auto-generated method stub
		int count = 0 ;
		int t1 = i, t2 = i;
		while(t1 >= 0 && (a[t1] == a[i])) {
			count++;
			t1 -= 1;
		}
		while( t2 < a.length && (a[t2] == a[i] || Math.abs(a[t2] - a[i]) == 1) ) {
			count++;
			t2 += 1;
		}
		return count-1;
	}
}