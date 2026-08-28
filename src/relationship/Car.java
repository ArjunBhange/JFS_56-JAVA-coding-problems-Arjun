package relationship;

public class Car {
	Engine e=new Engine();
	void drive() {
		e.start();
		System.out.println("Car is started");
	}
	
	public static void main(String args[]) {
		Car car=new Car();
		car.drive();
	}
}
