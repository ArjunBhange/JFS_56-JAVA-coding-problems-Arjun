package Core.java.Methods;

public class Atm {
	static int bal=1000;
	
	public void bal() {
		System.out.println("Intial balance : "+bal);
	}
	public void withdraw(int amt) {
		bal=bal-amt;
		System.out.println("Remaining Balance : "+bal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm a=new Atm();
		a.bal();
		a.withdraw(700);
		
		Atm a1=new Atm();
		a1.bal();
		a1.withdraw(800);
	}

}
