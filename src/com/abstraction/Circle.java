package com.abstraction;

public class Circle extends Shape{
	int radius;

	Circle(String color, int radius) {
		super(color);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

	
	
}
