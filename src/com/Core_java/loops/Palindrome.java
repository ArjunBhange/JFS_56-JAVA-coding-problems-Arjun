package com.Core_java.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int org=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev =rev*10+rem;
			n /=10;
		}
		if(rev==org) {
			System.out.print("Palindrome");
		}else {
			System.out.print("Not Palindrome");
		}
	}

}
