package com.Core_java.condtionalstatement;

import java.util.Scanner;

public class EmployeePerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int perf = sc.nextInt();
		if(perf<=100 && perf>89) {
			System.out.print("Outstanding");
		}else if(perf<=89 && perf>=80) {
			System.out.print("Excellent");
		}else if(perf<=79 && perf>=70) {
			System.out.print("Good");
		}else if(perf<=69 && perf>=60) {
			System.out.print("Average");
		}else {
			System.out.print("Needs Improvement");
		}
	}

}
