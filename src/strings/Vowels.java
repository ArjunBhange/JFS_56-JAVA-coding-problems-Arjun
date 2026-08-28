package strings;

import java.util.Scanner;

public class Vowels {
	
	public static  int countvowel(String s) {
		char c[]=s.toCharArray();
		int count =0;
		for(char ch:c) {
			if("aAeEiIoOuU".indexOf(ch)!=-1) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		//System.out.println(countvowel(s));
		
	}

}
