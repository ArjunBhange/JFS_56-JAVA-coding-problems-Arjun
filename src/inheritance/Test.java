package inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.sunroof();
		
		System.out.println();
		
		ElectricCar e=new ElectricCar();
		e.battery();
		e.sunroof();
		
		System.out.println();
		
		Bike b=new Bike();
		b.start();
		b.stop();
		b.helmet();
	}

}
