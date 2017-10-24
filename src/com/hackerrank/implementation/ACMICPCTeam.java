package com.hackerrank.implementation;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ACMICPCTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		String[] binaryString = new String[n];
		for(int i = 0 ; i < n ; i++) {
			binaryString[i] = scan.next();
		}
		LinkedList<Position> list = new LinkedList<Position>();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = i+1 ; j <= n ; j++ ) {
				Position pos = new Position(i,j);
				list.add(pos);
			}
		}
		
		Iterator<Position> i = list.iterator();
		
		while(i.hasNext()) {
			Position pos = i.next();
			int groupCount = pos.getGroupCount(binaryString);
			pos.setTeamCount(groupCount);
		}
		
		
		//Sort the List with using the size of list
		Collections.sort(list, new Comparator<Position>(){
			@Override
			public int compare(Position o1, Position o2) {
				// TODO Auto-generated method stub
				return o2.teamCount - o1.teamCount;
			}
		});
	
		LinkedList<Position> output = new LinkedList<Position>();
		Iterator<Position> i1 = list.iterator();
		int maxTeamCount = 0;
		boolean b = true;
		while(i1.hasNext()) {
			Position pos = i1.next();
			if(b) {
				maxTeamCount = pos.teamCount;
				b = false;
			}
			if(pos.teamCount == maxTeamCount) {
				output.add(pos);
			}
		}
		
		Iterator<Position> i3 = output.iterator();
		
		while(i3.hasNext()) {
			Position pos = i3.next();
			//System.out.println(pos + "\n");
		}

		System.out.print(maxTeamCount + "\n" + output.size());
		
		
	
		
		
		scan.close();
	}

}

class Position{
	int x,y;
	int teamCount = 0;
	Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.x + " , " + this.y + " : " + this.teamCount;		
	}	
	
	public int getGroupCount(String[] binaryString) {
		// TODO Auto-generated method stub
		
		int count = 0;
		String str1 = binaryString[x-1];
		String str2 = binaryString[y-1];
		
		for(int i = 0 ; i < str1.length() ; i++) {
			if(str1.charAt(i) == '1' || str2.charAt(i) == '1' ) {
				//System.out.print("Increasing count\n");
				count++;
			}
		}
		return count;
	}

	public void setTeamCount(int n) {
		this.teamCount = n;
	}
}
