package interfaces;

public class Credit implements Payment{
	int amount;
	public Credit(int amount){
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
