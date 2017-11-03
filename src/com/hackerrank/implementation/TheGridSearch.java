package com.hackerrank.implementation;

import java.util.Scanner;

public class TheGridSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int k = 0 ; k < t ; k++) {
			boolean flag = false;
			int R = scan.nextInt();
			int C = scan.nextInt();
			int[][] M = new int[R][C];
			String[] str1 = new String[R];
			for(int i = 0 ; i < R ; i++) {
				str1[i] = scan.next();
			}
			for(int i = 0 ; i < R ; i++ ) {
				for(int j = 0 ; j < C ; j++) {
					M[i][j] = (int)(str1[i].charAt(j) -'0');
				}
			}
			int r = scan.nextInt();
			int c = scan.nextInt();
			String[] str2 = new String[R];
			for(int i = 0 ; i < r ; i++) {
				str2[i] = scan.next();
			}
			int[][] P = new int[r][c];
			for(int i = 0 ; i < r ; i++) {
				for(int j = 0 ; j < c ; j++) {
					P[i][j] = (int)(str2[i].charAt(j) -'0');
				}
			}
			
			for(int i = 0 ; i < R ; i++) {
				for(int j = 0 ; j < C ; j++) {
					if(isPresent(M , P , i , j , r , c , R , C)) {
						if(!flag)
							System.out.println("YES");
						flag = true;
					}
				}
			}
			if(!flag)
				System.out.println("NO");
			
			
		}
		
		
		
		scan.close();
				

	}

	private static boolean isPresent(int[][] m, int[][] p, int x, int y , int r , int c , int R , int C) {
		// TODO Auto-generated method stub
		if(x+r > R  || y+c > C) {
			return false;
		}
		for(int i = 0 ; i < r ; i++) {
			for(int j = 0 ; j < c ; j++) {
				//System.out.print("X : " +x + " Y : " + y + " I : " + i + " J : " + j +"\n");
				if(m[i+x][j+y] != p[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
