package com.hackerrank.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++) {
        	if(s.charAt(i) == 'S' && s.charAt(i+1) == 'O' && s.charAt(i+2) == 'S') {
        		count++;
        		i += 2;
        	}
        }
        System.out.println(s.length()/3 - count);
    }
}