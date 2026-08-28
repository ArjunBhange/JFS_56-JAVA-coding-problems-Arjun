package com.Core_java.Arrays;

import java.util.Scanner;

public class Firstandlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Fist Element: "+arr[0]);
		System.out.println("Last Element :"+arr[n-1]);
	}

}
