package Problems;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(res.indexOf(ch)==-1) {
				res +=ch;
			}
		}
		System.out.println(res);
	}

}
