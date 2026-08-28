package strings;

import java.util.Scanner;

public class CountofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=sc.next().charAt(0);
		int n=s.length();
		int count=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println(count);
	}

}
