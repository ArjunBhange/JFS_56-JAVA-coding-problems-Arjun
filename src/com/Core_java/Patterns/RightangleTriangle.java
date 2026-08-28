package com.Core_java.Patterns;

import java.util.Scanner;

public class RightangleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n-star;
		for(int i=1;i<=n;i++) { 
		
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			star++;
			space--;
			System.out.println();
			
		}
		
	}

}
