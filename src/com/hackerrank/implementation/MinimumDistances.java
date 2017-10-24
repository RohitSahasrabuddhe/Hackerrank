package com.hackerrank.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumDistances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        LinkedList<Integer> set = new LinkedList<Integer>();
        for(int i = 0 ; i < n ; i++){
        	for(int j = 0 ; j < n ; j++) {
        		if(i == j) {
        			continue;
        		}
        		
        		if(A[i] == A[j]) {
        			set.add(Math.abs(i-j));
        		}
        	}
        }
        
        Iterator<Integer> i = set.iterator();
        int min = 100000;
        while(i.hasNext()) {
        	int temp = i.next();
        	if(min > temp) {
        		min = temp;
        	}
        }
        System.out.println(min);
    }
}
