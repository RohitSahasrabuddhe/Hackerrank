package com.hackerrank.implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CatsAndMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int[] x = new int[q];
        int[] y = new int[q];
        int[] z = new int[q];
        for(int a0 = 0; a0 < q; a0++){
            x[a0] = in.nextInt();
            y[a0] = in.nextInt();
            z[a0] = in.nextInt();
            
            
        }
        
        for(int i = 0 ; i < q ; i++) {
        	if(Math.abs(x[i] - z[i]) < Math.abs(y[i] - z[i]))
            	System.out.println("Cat A");
            
            else if(Math.abs(x[i] - z[i]) > Math.abs(y[i] - z[i]))
            	System.out.println("Cat B");
            else
            	System.out.println("Mouse C");
        }
    }
}