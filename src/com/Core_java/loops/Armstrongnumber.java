package com.Core_java.loops;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int org=n,len=n;
		String s=Integer.toString(len);
		int length= s.length();
		double sum=0;
		while(n>0) {
			int digit=n%10;
			sum=sum+Math.pow(digit, length);
			n/=10;
		}
		if(sum==org) {
			System.out.print("Armstrong Number");
		}else {
			System.out.print("Not a Armstrong Number");
		}
	}

}
