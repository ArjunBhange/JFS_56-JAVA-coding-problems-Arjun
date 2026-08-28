package com.Core_java.constructors;

public class Laptopinventry {
	int price;
	String brand,model;
	
	public Laptopinventry(int pr,String brd,String mod){
		price=pr;
		brand=brd;
		model=mod;
		
	}
	
	Laptopinventry(Laptopinventry s){
		price = s.price;
		brand = s.brand;
		model = s.model;
		
	}
	
	void display() {
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Model : "+model);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptopinventry lp=new Laptopinventry(65000,"Dell","Inspiron");
		System.out.println("Laptop 1 ");
		lp.display();
		Laptopinventry lp1=new Laptopinventry(lp);
		System.out.println("Laptop 2 : Copy constructor ");
		lp1.display();
		
	}

}
