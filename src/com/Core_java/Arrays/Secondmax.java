package com.Core_java.Arrays;

import java.util.Scanner;

public class Secondmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}int max=arr[0];
		for(int i:arr) {
			if(max<i) {
				max=i;
			}
		}
		int second_max=arr[1];
		for(int i:arr) {
			if(second_max<i && i!=max) {
				second_max=i;
			}
		}
		System.out.print(second_max);
	}

}
