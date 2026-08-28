package Problems;

import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r= n+2;
		String s="";
		while(n!=0) {
			int rem=n%2;
			s=rem+s;
			n/=2;
		}
		String str=Integer.toBinaryString(r);
		System.out.println("n+2:"+str);
		System.out.println(s);
	}

}
