package com.hackerrank.implementation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class QueensAttack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int x = scan.nextInt()-1;
		int y = scan.nextInt()-1;
		BoardPosition queenPos = new BoardPosition(x,y);
		
		LinkedList<BoardPosition> list = new LinkedList<BoardPosition>();
		for(int i = 0 ; i < k ; i++) {
			int xPos = scan.nextInt() - 1;
			int yPos = scan.nextInt() - 1;
			BoardPosition position = new BoardPosition(xPos, yPos);
			
			list.add(position);
		}
		
		int count = getAttackPositionCount(queenPos , list , n) ;
		
		System.out.println(count);
		
		
		
		
		
		
		scan.close();
	}

	private static int getAttackPositionCount(BoardPosition queenPos, LinkedList<BoardPosition> list , int n) {
		// TODO Auto-generated method stub
		
		int count = 0 ;
		for(int i = queenPos.x + 1 ; i < n ; i++) {
			if(isInList(list,i,queenPos.y)) {
				break;
			}
			count++;
		}
		for(int i = queenPos.x - 1 ; i >= 0 ; i--) {
			if(isInList(list,i,queenPos.y)) {
				break;
			}
			count++;
		}
		
		for(int i = queenPos.y + 1 ; i < n ; i++) {
			if(isInList(list,queenPos.x , i)) {
				break;
			}
			count++;
		}
		for(int i = queenPos.y - 1 ; i >= 0 ; i--) {
			if(isInList(list,queenPos.x , i)) {
				break;
			}
			count++;
		}
		
		for(int i = queenPos.x + 1 , j = queenPos.y + 1 ; i < n && j < n ; i++ , j++) {
			if(isInList(list,i , j)) {
				break;
			}
			count++;
		}
		for(int i = queenPos.x + 1 , j = queenPos.y - 1 ; i < n && j >= 0 ; i++ , j--) {
			if(isInList(list,i , j)) {
				break;
			}
			count++;
		}
		
		for(int i = queenPos.x - 1 , j = queenPos.y + 1 ; i >= 0 && j < n ; i-- , j++) {
			if(isInList(list,i , j)) {
				break;
			}
			count++;
		}
		for(int i = queenPos.x - 1 , j = queenPos.y - 1 ; i >= 0 && j >= 0 ; i-- , j--) {
			if(isInList(list,i , j)) {
				break;
			}
			count++;
		}
		
		
		
		return count;
	}

	private static boolean isInList(LinkedList<BoardPosition> list, int x, int y) {
		// TODO Auto-generated method stub
		Iterator<BoardPosition> i = list.iterator();
		
		while(i.hasNext()) {
			BoardPosition pos = i.next();
			if(pos.x == x && pos.y == y)
				return true;
		}
		
		return false;
	}

}

class BoardPosition{
	int x,y;
	
	BoardPosition(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.x + " , " + this.y ;		
	}	
	
}

