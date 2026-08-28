package Core.java.Methods;

import java.util.Scanner;

public class Fruit {

	String name;
	double price;
	String color;
	
	static Fruit[] fru=new Fruit[10];
	static int index=0;
	public Fruit(String name, double price,String color) {
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	static void addFruit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Fruit Name : ");
		String name=sc.next();
		sc.nextLine();
		System.out.println("Enter the Price : ");
		double price=sc.nextDouble();
		System.out.println("Enter the Color of the Fruit : ");
		String color=sc.next();
		Fruit f=new Fruit(name,price,color);
		fru[index++]=f;
		System.out.println("Added Sucessfully");
	}
	
	static void displayFruits() {
		for(int i=0;i<index;i++) {
			System.out.println("Fruit : "+fru[i].name);
			System.out.println("Price : "+fru[i].price);
			System.out.println("Color : "+fru[i].color);
			System.out.println();
		}
	}
	
	static void checkFruit() {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean start=true;;
		do {
			System.out.println("1.Add fruit Details \n2.Display\n3.Check Fruit\n4.Exit");
			int choice=sc.nextInt();
			
			switch(choice){
				case 1:addFruit();
					break;
				case 2:displayFruits();
					break;
				case 3:checkFruit();
					break;
				case 4:System.out.println("Exit Sucessfully");
				start=false;
					break;
				default:System.out.println("Invalid choice try again");
			}
		}while(start);
		


	}

}
