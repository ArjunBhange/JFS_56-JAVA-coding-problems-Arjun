package Problems;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String s) {
		String rev="";
		String words[]=s.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			rev +=words[i]+" ";
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
