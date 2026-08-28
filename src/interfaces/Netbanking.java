package interfaces;

public class Netbanking implements Payment{
	int amount;
	public Netbanking(int amount){
		this.amount=amount;
	}
	public void balance(int amount) {
		System.out.println("Balance is: "+amount);
	}public int deposit(int i) {
		return amount+i;
	}public int withdraw(int i) {
		return amount-i;
	}
}
