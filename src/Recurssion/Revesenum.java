package Recurssion;

import java.util.Scanner;

public class Revesenum {

	static int reverse(int n,int rev) {
	
		if(n==0) {
			return 0;
		}
		return reverse(n/10,rev*10+(n % 10));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(reverse(n,0));
	}

}
