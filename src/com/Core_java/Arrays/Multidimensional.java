package com.Core_java.Arrays;

import java.util.Scanner;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Length of the array in rows:"+arr.length);
		System.out.print("Length of the array in coloumns:"+arr[0].length);
	}

}
