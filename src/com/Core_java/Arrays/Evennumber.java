package com.Core_java.Arrays;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//System.out.println(arr);
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
