package Oops;

import java.util.Scanner;

public class Student {
	double age,std,id;
	static String institute="Codegnan";
	
	static {
		System.out.println("This method will print before the main method because it is a staic method");
	}
	
	{
		System.out.println("Student details:");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student();
		Scanner sc=new Scanner(System.in);
		st1.age=sc.nextDouble();
		st1.std=sc.nextDouble();
		System.out.println("age : "+st1.age+" standard : "+st1.std+"   "+institute);
		Student st2=new Student();
		st2.age=15;
		st2.std=9;
		
		
		System.out.println("age : "+st2.age+" standard : "+st2.std+" "+institute);
				
	}

}
