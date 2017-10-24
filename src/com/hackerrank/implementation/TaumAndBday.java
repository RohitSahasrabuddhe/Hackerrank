package com.hackerrank.implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TaumAndBday {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
        	long cost = 0;
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            
            if(Math.abs(x - y) > z ) {
            	System.out.println("In IF");
            	if(x > y) {
            		cost = b * (y + z) + w * y;            		
            	}
            	else {
            		cost = b * x + w * (x + z);
            	}
            }
            else {
            	System.out.println("In Else");
            	cost = b * x + w * y;
            }
            System.out.println(cost);
        }
    }
}