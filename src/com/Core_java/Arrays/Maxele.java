package com.Core_java.Arrays;

import java.util.Scanner;

public class Maxele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.print("Largest element in array is "+max);
	}

}
