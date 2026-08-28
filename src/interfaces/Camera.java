package interfaces;

public interface Camera {
	
	
	
	void click();
		
	static void m1() {
		System.out.println("It static method in camera interface");
	}
	default void m2() {
		System.out.println("It is default method in camera interface");
	}
	
	
	
	
	
}
