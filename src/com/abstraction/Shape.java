package com.abstraction;

abstract public class Shape {
	String color;
	
	Shape(String color){
		this.color=color;
	}
	
	abstract double area();
	
	void getColor() {
		System.out.println("Color : "+color);
	}
}
