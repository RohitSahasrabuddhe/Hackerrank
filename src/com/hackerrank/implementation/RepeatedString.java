package com.hackerrank.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) { Scanner in = new Scanner(System.in);
    String s = in.next();
    long n = in.nextLong();

    if (!s.contains("a")) {
        System.out.println(0);
        return;
    }

    long count = 0;
    long mod = s.length() > 0 ? n % s.length() : 0;
    long remainder = 0;
    boolean strLonger = false;
        
    for (int i = 0; i < s.length(); ++i) {
        if (i >= n) {
            strLonger = true;
            break;
        }
        if (s.charAt(i) == 'a') {
            if (mod > i) remainder++;
            count++;
        }
    }
            
    if (!strLonger) count = count * Math.max(n / s.length(), 1) + remainder;

    System.out.println(count);}
}