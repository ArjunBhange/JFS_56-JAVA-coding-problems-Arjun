package inheritance;

public class Dog extends Animal {

	public  Dog() {
		super.a=18;
		System.out.println("It is a Dog class Constructor"+a);
	}
	
	void display(int a) {
		System.out.println("bow....bow....."+a);
		super.display();
		
		System.out.println(a*10);
	}
	
}
