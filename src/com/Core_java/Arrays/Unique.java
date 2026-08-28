package com.Core_java.Arrays;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			boolean nrepeating=true;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j] && i!=j) {
					nrepeating = false;
					break;
				}
			}
			if(nrepeating) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
