package com.Core_java.condtionalstatement;

import java.util.Scanner;

public class Atm {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		int correctpin=sc.nextInt();
		int bal=sc.nextInt();
		int amount=sc.nextInt();
		
		if(pin==correctpin) {
			if(bal>=amount) {
				System.out.print("Collect your cash");
			}else {
				System.out.print("Insufficient bank balance");
			}
		}else {
			System.out.print("Incorrect pin");
		}
		
	}
}
