package Recurssion;

import java.util.Scanner;

public class Factorial {

	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));
	}

}
