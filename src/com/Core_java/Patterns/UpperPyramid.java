package com.Core_java.Patterns;

import java.util.Scanner;

public class UpperPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int star=1;
		int space=n-star;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star+=2;
			space--;
			
			
		}
	}

}
