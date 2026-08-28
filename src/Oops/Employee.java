package Oops;

import java.util.Scanner;

public class Employee {

	
	double id;
	String name;
	static String company = "Codegnan";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		
		
		Scanner sc=new Scanner(System.in);
		
		
		
		emp1.id=sc.nextInt();
		emp1.name="Raju";
		
		Employee emp2 =new Employee();
		emp2.id=002;
		emp2.name="Saravan";
		
		System.out.println("id: "+emp1.id+" name: "+emp1.name+"  "+company);
		System.out.println("id: "+emp2.id+" name: "+emp2.name+"  "+company);
		
	}

}
