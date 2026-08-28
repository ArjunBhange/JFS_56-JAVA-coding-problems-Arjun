package linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<String> al=new ArrayList<>();
		al.add("Agent");
		al.add("Lenin");
		al.add("Thandel");
		al.add("Coolie");
		al.add("King 100");
		
		System.out.println(al);
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if(name.contains("A")){
				it.remove();
			}
		}
		System.out.println(al);
		
		/*
		 * for(int i=0;i<al.size();i++) { String s =al.get(i); if(s.length() == 5) {
		 * al.remove(al.get(i)); System.out.print(al); }
		 * 
		 * }
		 */
		
		
	}

}
