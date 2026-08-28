package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MarksList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		List<Student> eligible = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int marks = sc.nextInt();

			if(marks>=85) {
				eligible.add(new Student(id,name,marks));
			}
			
		}
		if(eligible.isEmpty()) {
			System.out.println("No Students are Eligible");
			return;
		}
		Collections.sort(eligible,(a,b) -> {
			if(a.marks != b.marks) {
				return b.marks - a.marks;
			}
			return a.name.compareTo(b.name);
		});
		
		System.out.println(eligible.size());
		
		for(Student s:eligible) {
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
	}

}
