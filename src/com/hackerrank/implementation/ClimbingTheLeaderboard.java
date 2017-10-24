package com.hackerrank.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClimbingTheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        // your code goes here
        
        for(int i = 0 ; i < m ; i++) {
        	int aliceScore = alice[i];
        	int alicerRank = 1;
        	for(int j = 0 ; j < n ; j++) {
        		if(aliceScore < scores[j]) {
        			if(j+1 < n && scores[j] == scores[j+1])
        				continue;
        			alicerRank++;
        		}
        		
        	}
        	System.out.println(alicerRank);
        }
    }
}