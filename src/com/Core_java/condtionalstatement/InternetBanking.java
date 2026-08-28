package com.Core_java.condtionalstatement;

import java.util.Scanner;

public class InternetBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int bal=sc.nextInt();
		int amount=sc.nextInt();
		boolean active = sc.nextBoolean();
		
		if(active) {
			if(bal>=amount) {
				System.out.print("Sucessful Transaction");
			}else {
				System.out.print("Insufficient Balance");
			}
		}else {
			System.out.print("Account Blocked");
		}
		
	}

}
