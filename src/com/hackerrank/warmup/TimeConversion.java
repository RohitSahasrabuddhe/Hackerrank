
package com.hackerrank.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String input) {
        // Complete this function
    	String result = "";
    	
    	//07:05:45PM
    	if(input == "12:00:00AM") {
    		return "00:00:00"; 
    	}
    	if(input == "12:00:00PM") {
    		return "12:00:00";
    	}
    	
    	int hour = Integer.parseInt(input.substring(0 , 2));
    	
    	String minute = input.substring(3 , 5);
    	String seconds = input.substring(6 , 8);
    	
    	String ampm = input.substring(8 , 10);
    	
    	
    	String hourString = "";
    	if(ampm.equals("AM")) {
    		if(hour < 10) {
    			hourString = "0" + hour;
    		}
    		else if(hour == 12) {
    			hourString = "00";
    		}
    		else {
    			hourString = String.valueOf(hour);
    		}
    	}
    	else {
    		hour = hour + 12;
    		if(hour >= 24) {
    			hourString = "12";
    		}
    		else {
    			hourString = String.valueOf(hour);
    		}
    		
    	}
    	//System.out.println(hourString + ":" + minute + ":" + seconds);
    	result = hourString + ":" + minute + ":" + seconds;
    	return result;
    	
    }

    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        //String s = in.next();
        String result = timeConversion("12:45:54PM");
        System.out.println(result);
    }
}