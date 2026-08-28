package com.Core_java.loops;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=2;i<=n;i++) {
			int count = 0;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(i+" ");
			}
		}
	}

}
