package com.hackerrank.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrangeCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        BigInteger t = new BigInteger(str);
        
        
        
        BigInteger start = new BigInteger("3");
        
        BigInteger time = new BigInteger("1");
        outerloop:
        while(true) {
        	BigInteger i;
        	for(i = start ; i.compareTo(new BigInteger("0")) > 0 ; i = i.subtract(new BigInteger("1"))) {
        		//System.out.println(i.toString());
        		if(time.compareTo(t) == 0) {
        			System.out.println(i.toString());
        			break outerloop;
        		}
        		time = time.add(new BigInteger("1"));
        	}
        	start = start.multiply(new BigInteger("2"));
        }
    }
}