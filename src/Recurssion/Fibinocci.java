package Recurssion;

import java.util.Scanner;

public class Fibinocci {
	
	static int fibi(int n) {
		if(n==1) {
			return 0;
		}else if(n==2) {
			return 1;
		}
		return fibi(n-1)+fibi(n-2);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibi(n));
	}

}
