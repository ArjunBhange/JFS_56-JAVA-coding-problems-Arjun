package interfaces;

public class Cow implements Animal,Sound{

	@Override
	public void makSound() {
		// TODO Auto-generated method stub
		System.out.println("ambaaa..mooooww");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("It eats grass");
	}

}
