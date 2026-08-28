package com.Core_java.constructors;

public class Hospital {
	int id;
	String name,disease;
	double amount;

	public Hospital(int id) {
		this.id=id;
		System.out.println("Patient Details  \nPatient Id : "+id);
	}
	

	
	public Hospital(int id,String name) {
		this(id);
		this.name=name;
		System.out.println("Patient Name : "+name);
	}
	
	public Hospital(int id,String name,String disease) {
		this(id,name);
		this.disease=disease;
		System.out.println("Disease Name : "+disease);
	}
	
	public Hospital(int id,String name,String disease,double amount) {
		this(id,name,disease);
		this.amount=amount;
		System.out.println("Amount : "+amount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital h=new Hospital(1078,"Raj Kumar","Cold",4500.0);
		
		
	}

}
