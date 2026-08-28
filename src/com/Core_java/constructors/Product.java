package com.Core_java.constructors;

public class Product {
	
	int oid;
	String oname;
	double price;
	
	public Product(int oid) {
		this.oid=oid;
		System.out.println("order is created \n oid : "+oid);
	}
	
	public Product(int oid,String oname) {
		this(oid);
		this.oname=oname;
		System.out.println("Order name : "+oname);
	}
	public Product(int oid,String oname,double price) {
		this(oid,oname);
		this.price=price;
		System.out.println("Order Price : "+price);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prd=new Product(101,"Laptop",30000.0);
	}

}
