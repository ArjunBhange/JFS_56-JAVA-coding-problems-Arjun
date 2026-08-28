package sample;

public class Demo {
	
	static {
		System.out.println("This is static block");
	}
	
	public Demo() {
		System.out.println("This is constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main method");
		
		Demo d=new Demo();
	}

}
