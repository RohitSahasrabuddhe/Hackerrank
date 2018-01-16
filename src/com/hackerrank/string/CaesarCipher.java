package com.hackerrank.string;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		String input = scan.next();
		int k = scan.nextInt();
		
		char[] output = new char[input.length()];
		
		for(int i = 0 ; i < input.length() ; i++) {
			if(input.charAt(i) >= 'a' &&  input.charAt(i) <= 'z') {
				//small
				int c = input.charAt(i);
				int o = 96+((c%96)+k)%26;
				output[i] = (char)o;
				
			}
			else if(input.charAt(i) >= 'A' &&  input.charAt(i) <= 'Z') {
				//capital
				int c = input.charAt(i);
				int o = 64+((c%64)+k)%26;
				output[i] = (char)o;
			}
			else {
				output[i] = input.charAt(i);
			}
		}
		for(int i = 0 ; i < input.length(); i++) {
			System.out.print(output[i]);
		}
		scan.close();
	}

}