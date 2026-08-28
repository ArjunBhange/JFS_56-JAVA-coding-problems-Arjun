package com.Core_java.Arrays;

import java.util.Scanner;

public class Friuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
		}
		
		
		for(String i:s) {
			System.out.print(i+" ");
		}
	}

}
