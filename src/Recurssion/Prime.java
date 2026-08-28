package Recurssion;

import java.util.Scanner;

public class Prime {
	
	static boolean prime(int n, int div) {
		if(n==div) {
			return true;
		}
		if(n%div==0) {
			return false;
		}
		
		return prime(n,div+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=prime(n,2);
		if(res) {
			System.out.println("Prime");
		}else {
			System.out.println("Non-Prime");
		}
		
	}

}
