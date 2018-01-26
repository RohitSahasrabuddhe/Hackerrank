package com.hackerrank.hiringcontest;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProgrammingCompitition {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        LinkedList<Programmer> list = new LinkedList<Programmer>();
	        for(int a0 = 0; a0 < n; a0++){
	            String name = in.next();
	            int d = in.nextInt();
	            int j = in.nextInt();
	            Programmer p = new Programmer(name,d,j);
	            list.add(p);
	        }
	        // Write Your Code Here
	        
	        Collections.sort(list , new Comparator<Programmer>() {

				@Override
				public int compare(Programmer o1, Programmer o2) {
					// TODO Auto-generated method stub
					return o2.s - o1.s;
				}
			});
	        Programmer p = list.get(0);
	        System.out.println(p.name + " " + p.s);
	        in.close();
	 }
}

class Programmer{
	String name;
	int d;
	int j;
	int s;
	
	Programmer(String name, int d , int j){
		this.name = name;
		this.d = d;
		this.j = j;
		this.s = j - d;
	}
}
