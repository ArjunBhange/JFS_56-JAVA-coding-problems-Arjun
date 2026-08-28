package encapsulation;

import java.util.Scanner;

public class Enerylevel {
	
	public static int adjustfactor(int l,int f){
		int adjustfact=Math.abs(l);
		if(l%2==0) {
			f +=sum(adjustfact);
		}else {
			f +=count(adjustfact);
		}
		return l*f;
	}
	
	public static int sum(int n) {
		int s=0;
		while(n>0) {
			s +=n%10;
			n /=10;
		}
		return s;
	}
	public static int count(int n) {
		int c=0;
		while(n>0) {
			c++;
			n /=10;
		}
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int level=sc.nextInt();
		int factor=sc.nextInt();
		System.out.println(adjustfactor(level,factor));
		sc.close();
	}

}
