package strings;

import java.util.Scanner;

public class Reverse {

	public static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev +=ch;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(reverse(s));
	}

}
