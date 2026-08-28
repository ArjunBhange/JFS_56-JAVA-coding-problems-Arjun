package com.Core_java.constructors;

public class Employee_payroll {
	int emp_id,salary;
	String emp_name,department;
	
	public Employee_payroll(int id,int sal,String name,String dep) {
		emp_id=id;
		emp_name=name;
		department=dep;
		salary=sal;
		
	}
	void display() {
		System.out.println("Id 	  : "+emp_id);
		System.out.println("Name	  : "+emp_name);
		System.out.println("Department: "+department);
		System.out.println("Salary	  : "+salary);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_payroll emp1=new Employee_payroll(1,20000,"raju","CSE");
		Employee_payroll emp2=new Employee_payroll(2,30000,"Karthik","DA");
		Employee_payroll emp3=new Employee_payroll(3,20000,"Saravan","CSE");
		emp1.display();
		emp2.display();
		emp3.display();
	}

}
