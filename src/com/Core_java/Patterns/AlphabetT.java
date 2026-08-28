package com.Core_java.Patterns;

import java.util.Scanner;

public class AlphabetT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		
		for(int i=0;i<n;i++) {

			for(int j=0;j<=i;j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}

}
