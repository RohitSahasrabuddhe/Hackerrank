package com.hackerrank.implementation;

import java.util.LinkedList;
import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int M = scan.nextInt();
		int N = scan.nextInt();
		int R = scan.nextInt();
		
		int[][] matrix = new int[M][N];
		int[][] outputMatrix = new int[M][N];
		
		for(int i = 0 ; i < M ; i++) {
			for(int j = 0 ; j < N ; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		int m = M-1, n = N-1;
		LinkedList<Layer> layers = new LinkedList<Layer>();
		for(int i = 0 , j = 0 ; (i < m && j < n) || (i <= m && j == n) || (i == m && j <= n) ; i++ , j++) {
			//System.out.println("I : " + i + " J : " + j +" M : " + m +" N : " + n);
			Layer l = new Layer(i , j , m , n);
			int[] result = getElementsOfLayer(l, matrix);
			int[] resultArray = applyRotation(result,R);
			storeOutputMatrix(outputMatrix,l,result);
			/*for(int k = 0 ; k < result.length ; k++) {
				System.out.print(result[k]+" ");
			}*/
			//System.out.print("\n");
			layers.add(l);
			m--;
			n--;
		}
		//System.out.print("\nOutput Matrix is: +\n");
		for(int i = 0 ; i < M ; i++) {
			for(int j = 0 ; j < N ; j++) {
				System.out.print(outputMatrix[i][j]+" ");
			}
			System.out.print("\n");
		}
			
		
		
		
		scan.close();
	}

	private static int[] applyRotation(int[] result, int r) {
		// TODO Auto-generated method stub
		r = r%(result.length);
		for(int i = 0 ; i < r ; i++) {
			//System.out.println(i + " ---loop");
			rotateArray(result);
		}
		return result;
	}

	private static void rotateArray(int[] array) {
		// TODO Auto-generated method stub
		int n = array.length;
		int temp = array[0];
		for(int i = 0 ; i < n-1 ; i++) {
			array[i] = array[i+1];
		}
		array[n-1] = temp;
	}

	private static void storeOutputMatrix(int[][] outputMatrix, Layer l, int[] array) {
		// TODO Auto-generated method stub
		int x = l.x;
		int y = l.y;
		int m = l.m;
		int n = l.n;
		
		
		int count = 0;
		if(x == m) {
			while(y<n) {
				outputMatrix[x][y] = array[count++];
				y++;
			}
		}
		else if(y == n) {
			while(x<m) {
				outputMatrix[x][n] = array[count++];
				x++;
			}
		}
		else {
			x = l.x ; y = l.y ; m = l.m ; n = l.n;
			while(y<n) {
				outputMatrix[x][y] = array[count++];
				y++;
			}
			x = l.x ; y = l.y ; m = l.m ; n = l.n;
			while(x<m) {
				outputMatrix[x][n] = array[count++];
				x++;
			}
			x = l.x ; y = l.y ; m = l.m ; n = l.n;
			while(n > y) {
				outputMatrix[m][n] = array[count++];
				n--;
			}
			x = l.x ; y = l.y ; m = l.m ; n = l.n;
			while(m > x) {
				outputMatrix[m][y] = array[count++];
				m--;
			}
		}
	}

	private static int[] getElementsOfLayer(Layer l , int[][] matrix) {
		// TODO Auto-generated method stub
		int x = l.x;
		int y = l.y;
		int m = l.m;
		int n = l.n;
		
		
		int count = 0;
		if(x == m) {
			int size = n-y;
			int[] array = new int[size];
			while(y<n) {
				array[count++] = matrix[x][y];
				y++;
			}
			return array;
		}
		else if(y == n) {
			int size = m -x;
			int[] array = new int[size];
			while(x<m) {
				array[count++] = matrix[x][n];
				x++;
			}
			return array;
		}
		else {
			x = l.x ; y = l.y ; m = l.m ; n = l.n;
			int size = 2*(m+n-x-y);
			count = 0;
			int[] array = new int[size];
			while(y<n) {
				array[count++] = matrix[x][y];
				//System.out.print("X : " + x + " Y : " +y + " Value : " + matrix[x][y] + "Array value : "+ array[count] +"\n");
				y++;
			}
			x = l.x ; y = l.y ; m = l.m ; n = l.n;
			while(x<m) {
				array[count++] = matrix[x][n];
				x++;
			}
			x = l.x ; y = l.y ; m = l.m ; n = l.n;
			while(n > y) {
				array[count++] = matrix[m][n];
				n--;
			}
			x = l.x ; y = l.y ; m = l.m ; n = l.n;
			while(m > x) {
				array[count++] = matrix[m][y];
				m--;
			}
			return array;
		}
	}

}
class Layer{
	int x , y , m , n;
	
	Layer(int x , int y , int m , int n){
		this.x = x;
		this.y = y;
		this.m = m;
		this.n = n;
	}
}
