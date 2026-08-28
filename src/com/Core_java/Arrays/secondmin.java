package com.Core_java.Arrays;

import java.util.Scanner;

public class secondmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(min>arr[i])
				min=arr[i];
		}
		int sec_min=arr[0];
		for(int i:arr) {
			if(sec_min >i && i!=min) {
				sec_min=i;
			}
		}
		System.out.print(sec_min);
		
	}

}
