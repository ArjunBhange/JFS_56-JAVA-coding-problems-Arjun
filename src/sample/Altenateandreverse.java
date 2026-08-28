package sample;

import java.util.Scanner;

public class Altenateandreverse {
	
	public static String alternate(String s) {
		String s1="",s2="",str="",rev="";
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(i%2==0) {
				s1 +=Character.toUpperCase(ch);;
			}else {
				s2 +=ch;
			}
		}
		
		for(int i=s2.length()-1;i>=0;i--) {
			rev+=s2.charAt(i);
		}
		int e=0,o=0;
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				str += s1.charAt(e++);
			}
			else {
				str += rev.charAt(o++);
			}
			
		}
		
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(alternate(s));
	}

}
