package com.hackerrank.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoCharacters {

    public static void main(String[] args) {
    	int[] index = new int[26];
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        
        for(int i = 0 ; i < s.length() ; i++) {
        	index[s.charAt(i)-'a']++;
        }
        
        int max = 0;
        int temp = 0;
        for(int i = 0 ; i < 26 ; i++) {
        	System.out.print(index[i]);
        	if(max < index[i]) {
        		max = index[i];
        		temp = i;
        	}
        }
        index[temp] = 0;
        int secondMax = 0;
        for(int i = 0 ; i < 26 ; i++) {
        	if(index[i] < secondMax) {
        		secondMax = index[i];
        	}
        }
        
        System.out.println(max + secondMax);
    }
}