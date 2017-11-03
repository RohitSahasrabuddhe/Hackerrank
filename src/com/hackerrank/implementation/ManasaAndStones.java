package com.hackerrank.implementation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;


public class ManasaAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt() ;
		for(int i = 0 ; i < n ; i++) {
			int size = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			TreeSet<Integer> treeSet = new TreeSet<Integer>();
			recursiveAdding(size-1 , 0 , a , b , treeSet);
			Iterator<Integer> itor = treeSet.iterator();
			while(itor.hasNext()) {
				System.out.print(itor.next()+" ");
			}
			System.out.print("\n");
		}
		scan.close();
	}

	private static void recursiveAdding(int n, int i, int a, int b , TreeSet<Integer> treeSet) {
		// TODO Auto-generated method stub
		if(n == 0) {
			treeSet.add(i);
			return;
		}
			
		n = n-1;
		
		recursiveAdding(n, i+a, a, b , treeSet);
		recursiveAdding(n, i+b, a, b , treeSet);
		
	}

}
