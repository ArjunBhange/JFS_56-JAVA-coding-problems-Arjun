package exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int div=0,res=0;
		try {
			res=n/div;
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
