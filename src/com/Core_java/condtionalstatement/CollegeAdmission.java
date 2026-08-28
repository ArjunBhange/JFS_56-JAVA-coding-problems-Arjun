package com.Core_java.condtionalstatement;

import java.util.Scanner;

public class CollegeAdmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rank = sc.nextInt();
		int percentage = sc.nextInt();
		int age = sc.nextInt();
		
		if(rank<1000 && percentage>=75 && age>=17) {
			System.out.print("Admission Confirmed");
		}else {
			System.out.print("Not Eligible");
		}
	}

}
