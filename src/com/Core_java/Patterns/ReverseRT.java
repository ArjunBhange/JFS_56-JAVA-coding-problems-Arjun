package com.Core_java.Patterns;

import java.util.Scanner;

public class ReverseRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int star=1;
		int space=n;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			star++;
			space--;
			System.out.println();
		}
	}

}
