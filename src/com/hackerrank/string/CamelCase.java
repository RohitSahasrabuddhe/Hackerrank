package com.hackerrank.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        for(int i = 0 ; i < s.length(); i++) {
        	if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
        		count++;
        }
        
        System.out.println(count);
    }
}