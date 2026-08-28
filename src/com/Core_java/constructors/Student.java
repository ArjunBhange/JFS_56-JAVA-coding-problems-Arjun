package com.Core_java.constructors;

public class Student {
	int age;
	String name;
	
	public Student(int sage,String sname) {
		
		age=sage;
		name=sname;
		
	}
	
	public Student(Student s1) {
		age=s1.age;
		name=s1.name;
	}
	
	public void display() {
		System.out.println("age : "+age);
		System.out.println("name : "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(26,"Raj Kumar");
		Student s2=new Student(s1);
		
		System.out.println("s1 object details");
		s1.display();
		System.out.println();
		
		System.out.println("s2 object details");
		s2.display();
	}

}
