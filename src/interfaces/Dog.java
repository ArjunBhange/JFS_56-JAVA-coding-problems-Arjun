package interfaces;

public class Dog implements Animal,Sound {

	@Override
	public void makSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog Barks bow bow....");	
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("It eats foods");
	}

}
