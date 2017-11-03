package com.hackerrank.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HappyLadyBugs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
        	boolean flag = false;
            int n = in.nextInt();
            String b = in.next();
            LinkedList<Character> set = new LinkedList<Character>();
            for(int i = 0 ; i < b.length() ; i++) {
            	set.add(b.charAt(i));
            }
           
            if(isUnderScorePresent(set)) {
            	if(checkAllMoreThanOneOccurances(set)) {
            		System.out.println("YES");
            		flag = true;
            	}
            }
            else {
            	if(checkAllMoreThanOneOccurances(set)) {
            		System.out.println("YES");
            		flag = true;
            	}
            }
            if(onlyOneCharacter(set)) {
            	System.out.println("NO");
            	flag = true;
            }
            if(!flag) {
            	System.out.println("NO");
            }
        }
    }

	private static boolean onlyOneCharacter(LinkedList<Character> set) {
		// TODO Auto-generated method stub
		Iterator<Character> i = set.iterator();
		while(i.hasNext()) {
			if(i.next() != '_')
				return false;
			
		}
		return true;
	}


	private static boolean checkAllMoreThanOneOccurances(LinkedList<Character> set) {
		// TODO Auto-generated method stub
		Iterator<Character> i = set.iterator();
		while(i.hasNext()) {
			char temp = i.next();
			Iterator<Character> j = set.iterator();
			int count = 0;
			while(j.hasNext()) {
				if(j.next() == temp ) {
					count++;
				}
			}
			if(count < 2 && temp != '_') {
				return false;
			}
		}
		return true;
	}

	private static boolean isUnderScorePresent(LinkedList<Character> set) {
		// TODO Auto-generated method stub
		Iterator<Character> i = set.iterator();
		while(i.hasNext()) {
			if(i.next() == '_') {
				return true;
			}
		}
		return false;
	}
}