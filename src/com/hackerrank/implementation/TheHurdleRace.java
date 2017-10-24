package com.hackerrank.implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxheight = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        // your code goes here
        
        int drinks = 0;
        for(int i = 0 ; i < n ; i++) {
        	if(maxheight >= height[i])
        		continue;
        	else {
        		while(maxheight < height[i] ) {
        			maxheight++;
        			drinks++;
        		}
        	}
        }
        System.out.println(drinks);
    }
}