package sample;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		byte exp=0;
		short depid=0;
		int empid=0;
		long mobnum=0;
		float height=0;
		double salary=0;
		boolean filePresent=false;
		BigInteger aadar=BigInteger.ZERO;
		BigDecimal bonus=BigDecimal.ZERO;
		
		String empsurname="";
		String empFullname="";
		char matrialstatus=' ';
		
		System.out.println("Enter Employee ID :");
		if(sc.hasNextInt()) {
			empid=sc.nextInt();
		}else {
			System.out.println("Employee ID is Invalid");
		}
		
		System.out.println("Experience :");
		if(sc.hasNextByte()) {
			exp=sc.nextByte();
		}else {
			System.out.println("Invalid Experience");
		}
		
		System.out.println("Department ID :");
		if(sc.hasNextShort()) {
			depid=sc.nextShort();
		}else {
			System.out.println("Invalid Department ID");
		}
		
		System.out.println("Mobile Number :");
		if(sc.hasNextLong()) {
			mobnum=sc.nextLong();
		}else {
			System.out.println("Invalid Mobile Number");
		}
		
		System.out.println("Height :");
		if(sc.hasNextFloat()) {
			height=sc.nextFloat();
		}else {
			System.out.println("Invalid Height");
		}
		
		System.out.println("Salary :");
		if(sc.hasNextDouble()) {
			salary=sc.nextDouble();
		}else {
			System.out.println("Invalid Salary");
		}
		
		System.out.println("File Present :");
		if(sc.hasNextBoolean()) {
			filePresent=sc.nextBoolean();
		}else {
			System.out.println("Invalid input for File Present");
		}
		
		System.out.println("Aadhar Number :");
		if(sc.hasNextBigInteger()) {
			aadar=sc.nextBigInteger();
		}else {
			System.out.println("Invalid Aadhar Number");
		}
		
		System.out.println("Bonus :");
		if(sc.hasNextBigInteger()) {
			bonus=sc.nextBigDecimal();
		}else {
			System.out.println("Invalid Bonus");
		}
		
		System.out.println("Employee Surname :");
		if(sc.hasNext()) {
			empsurname=sc.next();
		}else {
			System.out.println("Invalid Surname");
		}
		
		System.out.println("Employee Fullname :");
		if(sc.hasNext()) {
			empFullname=sc.next();
		}else {
			System.out.println("Invalid Fullname");
		}
		
		System.out.println("Employee Matrial Status :");
		if(sc.hasNext()) {
			matrialstatus=sc.next().charAt(0);
		}else {
			System.out.println("Invalid Matrial Status");
		}
		
	}

}
