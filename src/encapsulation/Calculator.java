package encapsulation;

public class Calculator {
	
	public  int add(int a,int b) {
		System.out.println("It is  2 paarameters method");
		return a+b;
	}
	
	public int add(int a,int b, int c) {
		System.out.println("it is 3 parameters method");
		return a+b+c;
	}

}