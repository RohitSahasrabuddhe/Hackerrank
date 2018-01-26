package com.hackerrank.searching;

import java.util.LinkedList;
import java.util.Scanner;

public class ConnectedCellsInGrid {
	static LinkedList<LinkedList<Point>> listOfList = new LinkedList<LinkedList<Point>>();

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        for(int matrix_i = 0; matrix_i < n; matrix_i++){
            for(int matrix_j = 0; matrix_j < m; matrix_j++){
                matrix[matrix_i][matrix_j] = in.nextInt();
            }
        }
        int result = connectedCell(matrix);
        System.out.println(result);
        in.close();

	}

	static int connectedCell(int[][] matrix) {

		int r = matrix.length;
		int c = matrix[0].length;
		
		
		
		
		for(int i = 0 ; i < r ; i++ ) {
			for(int j = 0 ; i < c ; j++) {
				if(matrix[i][j] == 1) {
					if(!isInList(listOfList , i , j)) {
						//Point is not in any list till now so create new list
						LinkedList<Point> adjacentList = new LinkedList<Point>();
						recursivelyAddPositionsToList(adjacentList,i,j,matrix);
						listOfList.add(adjacentList);
					}
				}
			}
		}

		
		for(int i = 0 ; i < listOfList.size() ; i++) {
			LinkedList<Point> currentAdjacencyList = new LinkedList<Point>();
			for(int j = 0 ; j < currentAdjacencyList.size() ; j++) {
				
				System.out.println(currentAdjacencyList.get(j));
			}
			System.out.println("\n\n");
		}
		
		return 0;
    }

	private static void recursivelyAddPositionsToList(LinkedList<Point> adjacentList, int i, int j , int[][] matrix) {
		int r = matrix.length;
		int c = matrix[0].length;
		if(matrix[i][j] == 1) {
			Point p = new Point(i, j);
			System.out.println(p);
			adjacentList.add(p);
			if(i-1 >= 0 && j-1 >= 0 && !isInList(listOfList, i-1, j-1))
				recursivelyAddPositionsToList(adjacentList, i-1, j-1, matrix);
			if(j-1 >= 0 && !isInList(listOfList, i, j-1))
				recursivelyAddPositionsToList(adjacentList, i, j-1, matrix);
			if(i+1 < r && j-1 >= 0 && !isInList(listOfList, i+1, j-1))
				recursivelyAddPositionsToList(adjacentList, i+1, j-1, matrix);
			if(i-1 >= 0 && !isInList(listOfList, i-1, j))
				recursivelyAddPositionsToList(adjacentList, i-1, j, matrix);
			if(j+1 < c && !isInList(listOfList, i, j+1))
				recursivelyAddPositionsToList(adjacentList, i, j+1, matrix);
			if(i-1 >= 0 && j+1 < c && !isInList(listOfList, i-1, j+1))
				recursivelyAddPositionsToList(adjacentList, i-1, j+1, matrix);
			if(i+1 < r && !isInList(listOfList, i+1, j))
				recursivelyAddPositionsToList(adjacentList, i+1, j, matrix);
			if(i+1 < r && j+1 < c && !isInList(listOfList, i+1, j+1))
				recursivelyAddPositionsToList(adjacentList, i+1, j+1, matrix);
		}
		
		return;
		
	}

	private static boolean isInList(LinkedList<LinkedList<Point>> listOfList, int x, int y) {
		for(int i = 0 ; i < listOfList.size() ; i++) {
			LinkedList<Point> currentAdjacencyList = new LinkedList<Point>();
			for(int j = 0 ; j < currentAdjacencyList.size() ; j++) {
				if(comparePosition(currentAdjacencyList.get(j), x , y)) {
					System.out.println("Comparing " + currentAdjacencyList.get(j) + "with " + x + " , " + y);
					return true;
				}
			}
		}
		return false;
	}

	private static boolean comparePosition(Point point, int x, int y) {
		if(point.x == x && point.y == y) {
			return true;
		}
		return false;
	}
}

class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.x + "," + this.y +")";
	}
}