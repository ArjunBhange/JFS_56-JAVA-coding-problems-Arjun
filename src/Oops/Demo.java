package Oops;

import java.util.Random;

public class Demo {
	
	public int generateNumber() {
		Random rn=new Random();
		int n=rn.nextInt();
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo dm=new Demo();
		System.out.println(dm.generateNumber());
		
	}

}
