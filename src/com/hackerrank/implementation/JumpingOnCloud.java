package com.hackerrank.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnCloud {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int pos = 0;
        int jumps = 0;
        while(pos < n-1) {
        	if(pos + 2 < n && c[pos + 2] == 1) {
        		pos += 1;
        		jumps++;
        	}
        	else {
        		pos += 2;
        		jumps++;
        	}
        }
        System.out.println(jumps);
    }
}