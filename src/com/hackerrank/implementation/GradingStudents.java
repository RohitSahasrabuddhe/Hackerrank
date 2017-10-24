package com.hackerrank.implementation;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		int grades[] = new int[n];
		for(int i = 0 ; i < n ; i ++) {
			grades[i] = scan.nextInt();
		}
		int roundedGrade = 0;
		for(int i = 0 ; i < n ; i ++) {
			roundedGrade = getRoundedGrades(grades[i]);
			System.out.println(roundedGrade);
		}
		scan.close();
	}

	private static int getRoundedGrades(int grade) {
		int roundedGrade = 0;
		
		if(grade <= 37)
			roundedGrade = grade;
		else {
			if(checkIfRoundUpPossible(grade)) {
				roundedGrade = roundTheGrade(grade);
			}
			else {
				roundedGrade = grade;
			}
		}
		
		return roundedGrade;
	}

	private static int roundTheGrade(int grade) {
		// TODO Auto-generated method stub
		int division = grade/5;			
		return (division+1)*5;
	}

	private static boolean checkIfRoundUpPossible(int grade) {
		int division = grade/5;
		int dif = grade - division*5;
		if(dif >= 3)
			return true;
		return false;
	}

}
