package com.Core_java.Arrays;

import java.util.Scanner;

public class JaggedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the jagged array size:");
		int n=sc.nextInt();
		
		int arr[][]=new int[n][];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the no of columns of row number: "+i+" ");
			int col=sc.nextInt();
			arr[i]=new int[col];
			
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
