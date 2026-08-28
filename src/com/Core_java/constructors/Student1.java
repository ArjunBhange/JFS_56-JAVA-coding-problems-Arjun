package com.Core_java.constructors;

public class Student1 {
	
	int age,id;
	String name;
	
	public Student1(int id,int age,String name) {
		this.id=id;
		this.age=age;
		this.name=name;
		
	}
	
	void show() {
		System.out.println("Id : "+id+"  Name : "+name+"  Age : "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 std=new Student1(001,25,"Ram");
		std.show();
		
		System.out.println();
		
		Student1 std1=new Student1(002,23,"Lakshman");
		std1.show();
	}

}
