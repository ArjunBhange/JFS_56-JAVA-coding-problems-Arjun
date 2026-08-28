package com.Core_java.Arrays;

import java.util.Scanner;

public class Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.print("minimun ele : "+min+"   maximum ele : "+max);
		
	}

}
