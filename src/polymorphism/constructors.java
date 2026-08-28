package polymorphism;

public class constructors {
	int money;
	public  constructors(int money,int age) {
		this(money);
		this.money=money;
		System.out.println("Money:"+money);
		System.out.println("Age:"+age);
	}
	public  constructors(int money) {
		this.money=money;
		System.out.println("Money:"+money);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructors c=new constructors(200,22);
		
		
	}

}
