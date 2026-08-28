package com.Core_java.loops;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum= sum+rem;
			n/=10;
		}
		System.out.print(sum);
	}

}
