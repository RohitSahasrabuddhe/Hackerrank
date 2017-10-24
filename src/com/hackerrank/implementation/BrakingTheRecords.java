package com.hackerrank.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BrakingTheRecords {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        int maxCount = 0, minCount = 0;
        for(int i=0; i < n; i++){
            s[i] = in.nextInt();
            if(i == 0) {
            	continue;
            }
            else {
            	int max = s[0];
            	int min = s[0];
            	
            	for(int j = 0 ; j < i ; j++) {
            		if(s[j] > max)
            			max = s[j];
            		if(s[j] < min)
            			min = s[j];
            	}
            	
            	if(s[i] < min)
            		minCount++;
            	if(s[i] > max)
            		maxCount++;
            }
            
        }
        
        System.out.print(maxCount + " " + minCount);
        
        
        
       
    }
}
