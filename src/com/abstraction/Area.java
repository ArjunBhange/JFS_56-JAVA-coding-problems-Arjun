package com.abstraction;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle("Red",5);
		s.getColor();
		System.out.println("Area : "+s.area());
	}

}
