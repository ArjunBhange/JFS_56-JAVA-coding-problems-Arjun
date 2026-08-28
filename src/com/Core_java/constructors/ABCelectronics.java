package com.Core_java.constructors;



public class ABCelectronics {
	
	int mobid,price;
	String brand,model;
	public ABCelectronics() {
		mobid=1001;
		brand="Samsung";
		model="S22 Ultra";
		price=40500;
	}
	
	public ABCelectronics(int id,String brd,String md,int pri) {
		mobid=id;
		brand=brd;
		model=md;
		price=pri;
	}
	
	public ABCelectronics(ABCelectronics cp) {
		mobid=cp.mobid;
		brand=cp.brand;
		model=cp.model;
		price=cp.price;
	}
	
	public void setprice(int pr) {
		price=pr;
	}
	
	void display() {
		System.out.println("Mobile Id :"+mobid);
		System.out.println("Brand     :"+brand);
		System.out.println("Model     :"+model);
		System.out.println("Price     :"+price);
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====================MOBILE DETAILS====================");
		
		ABCelectronics ab=new ABCelectronics();
		System.out.println("Mobile 1 (Default Constructor)");
		System.out.println("-------------------------------");
		ab.display();
		
		ABCelectronics ab1=new ABCelectronics(1002,"One plus","Nord CE 5",45000);
		System.out.println("Mobile 2 (Parameterized Constructor)");
		System.out.println("-------------------------------");
		ab1.display();
		
		
		ABCelectronics ab2=new ABCelectronics(ab1);
		System.out.println("Mobile 3 (Copy Constructor)");
		System.out.println("-------------------------------");
		ab2.display();
		
		ab2.setprice(23000);
		
		System.out.println("========================================");
		System.out.println("After Updating the Mobile 3");
		System.out.println("========================================");
		System.out.println("Mobile 2 details :");
		System.out.println("------------------");
		ab1.display();
	
		System.out.println("Mobile 3 details :");
		System.out.println("------------------");
		ab2.display();
		
		
	}

}
