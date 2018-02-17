package com.hackerrank.onemonthchallenge;

import java.util.HashMap;
import java.util.Scanner;

public class Day8 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		HashMap<String,String> hm = new HashMap<String,String>(); 
		for(int i = 0 ; i < n ; i++) {
			String key = scan.next();
			String value = scan.next();
			hm.put(key, value);
		}
		
		while(true) {
			String key = scan.next();
			
			String result = getValue(hm,key);
			
			System.out.println(result);
		}

	}

	private static String getValue(HashMap<String, String> hm, String key) {
	
		if(hm.containsKey(key)) {
			return key + "=" + hm.get(key);
		}
		return "Not found";
	}


}


