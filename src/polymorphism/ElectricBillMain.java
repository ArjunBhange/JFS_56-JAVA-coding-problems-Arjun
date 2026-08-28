package polymorphism;

public class ElectricBillMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricBill eb=new ElectricBill();
		System.out.println(eb.calunit(23));
		System.out.println(eb.calunit(31, 200.0));
		System.out.println(eb.calunit(99, 167.0, 25.0));
	}

}
