package com.Core_java.constructors;

import java.util.Scanner;

public class Roomtemp {
	private int temp;
	
	
	public  Roomtemp(int tp) {
		temp=tp;
	}
	
	void display() {
		System.out.println(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			Roomtemp rt=new Roomtemp(temp);
			rt.display();
		}
		sc.close();
	}

}
