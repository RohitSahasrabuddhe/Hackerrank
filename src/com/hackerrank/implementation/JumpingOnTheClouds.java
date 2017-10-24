package com.hackerrank.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int position = 0;
        int energy = 100;
        while(position < n) {
        	if(c[position] == 1)
        		energy -= 2;
        	energy -=1;
        	position += k;
        }
        System.out.println(energy);
    }
}