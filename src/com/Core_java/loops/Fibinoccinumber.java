package com.Core_java.loops;

import java.util.Scanner;

public class Fibinoccinumber {
	
	public static int fibinocci(int n) {
		if(n==1) return 0;
		else if(n==2) return 1;
		return fibinocci(n-1)+fibinocci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result = fibinocci(n);
		System.out.print(result);
		
		/*
		int first=0;
		int second=1;
		if(n==1) 
			System.out.print(0);
		else if(n==2)
			System.out.print(1);
		else {
			for(int i=3;i<=n;i++) {
				int temp=first+second;
				first=second;
				second=temp;
			}
			
			System.out.print(second);
		}
		*/
		
	}

}
