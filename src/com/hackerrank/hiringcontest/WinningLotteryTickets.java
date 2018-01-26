package com.hackerrank.hiringcontest;

import java.util.Scanner;

public class WinningLotteryTickets {

	static int winningLotteryTicket(String[] tickets) {
        // Complete this function
		int count = 0 ;
		for(int i = 0 ; i < tickets.length - 1 ; i++) {
			for(int j = i+1 ; j < tickets.length ; j++) {
				if(checkForWinning(tickets, i , j)) {
					count++;
					//System.out.println(tickets[i] + " " + tickets[j]);
				}
			}
		}
		return count;
    }

    private static boolean checkForWinning(String[] tickets, int first, int second) {
		int[] digits = {0,1,2,3,4,5,6,7,8,9};
		
		String total = tickets[first].concat(tickets[second]);
		
		for(int i = 0 ; i <digits.length ; i++) {
			if(checkDigitInString(digits[i] , total)) {
				continue;
			}
			return false;
		}
		return true;
	}

	private static boolean checkDigitInString(int digit, String ticket) {
		for(int i = 0 ; i < ticket.length() ; i++ ) {
			if(digit == (int)ticket.charAt(i)-48) {
				//System.out.println("Checking " + ticket + "for digit " + digit + "TRUE");
				return true;
			}
		}
		//System.out.println("Checking " + ticket + "for digit " + digit + "FALSE");
		return false;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] tickets = new String[n];
        for(int tickets_i = 0; tickets_i < n; tickets_i++){
            tickets[tickets_i] = in.next();
        }
        int result = winningLotteryTicket(tickets);
        System.out.println(result);
        in.close();
    }
}
