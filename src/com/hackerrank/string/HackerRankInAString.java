package com.hackerrank.string;

import java.util.Scanner;

public class HackerRankInAString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for(int a0 = 0; a0 < q; a0++){
			String s = in.next();
			String result = hackerrankInString(s);
			System.out.println(result);
		}
		in.close();
	}

	private static String hackerrankInString(String s) {
		// TODO Auto-generated method stub
		int index = 0;
		String hack = "hackerrank";
		for(int i = 0 ; i < s.length() ; i++) {
			if(hack.charAt(index) == s.charAt(i)) {
				index++;
			}
			if(index == hack.length()-1) {
				return "YES";
			}
		}
		if(index == hack.length()-1) {
			return "YES";
		}
		else {
			return "NO";
		}
	}
}
