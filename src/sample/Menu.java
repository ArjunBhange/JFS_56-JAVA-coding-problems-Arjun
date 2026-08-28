package sample;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Veg Biryani\n2.Pizza\n3.Chicken Dum Biryani\n4.Burger\n5.Exit");
		System.out.println("Enter the Option :");
		int n=sc.nextInt();
		switch(n) {
		case 1 -> System.out.println("Veg Briyani is 170");
		case 2 -> System.out.println("Pizza is 250");
		case 3 -> System.out.println("Chicken Dum Biryani is 300");
		case 4 -> System.out.println("Burger is 350");
		case 5 -> System.out.println("Exit");
		default ->System.out.println("Enter the valid Option");
		}
		
	}

}
