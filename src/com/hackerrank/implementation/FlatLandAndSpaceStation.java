package com.hackerrank.implementation;

import java.util.Scanner;

public class FlatLandAndSpaceStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int spaceStation[]  = new int[m];
		for(int i = 0 ; i < m ; i ++)
		{
			spaceStation[i] = scan.nextInt();
		}
		int maxDistance = -100000;
		for(int i = 0 ; i < n ; i++) {
			
			int distance = getDistance(i , spaceStation);
			//System.out.println(distance);
			if(distance > maxDistance) {
				maxDistance = distance;
			}
		}
		System.out.println(maxDistance);
		scan.close();
	}

	private static int getDistance(int city, int[] spaceStation) {
		// TODO Auto-generated method stub
		int m = spaceStation.length;
		int minDistance = 1000000;
		for(int i = 0 ; i < m ; i++) {
			//System.out.println("City : " + city + "  Space Station: " + spaceStation[i]);
			int distance = Math.abs(city - spaceStation[i]);
			if(distance < minDistance) {
				minDistance = distance;
			}
		}
		return minDistance;
	}

}
