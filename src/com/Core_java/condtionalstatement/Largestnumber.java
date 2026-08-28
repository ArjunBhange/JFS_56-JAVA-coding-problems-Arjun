package com.Core_java.condtionalstatement;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.print(a);
		}else if(b>a && b>c) {
			System.out.print(b);
		}else {
			System.out.print(c);
		}
		
		
	}

}
