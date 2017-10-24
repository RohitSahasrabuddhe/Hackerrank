package com.hackerrank.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrisonersAndCandy {

    static int saveThePrisoner(int n, int m, int s){
        // Complete this function
    	int dyingPrisoner = 0;
    	int prisonerCount = s;
    	if(m > n) {
    		m = m % n;
    	}
    	while(m>=1) {
    		if(prisonerCount == n) {
    			prisonerCount = 1;
    		}
    		else {
    			prisonerCount++;
    		}
    		m--;
    	}
    	
    	
    	return --prisonerCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}