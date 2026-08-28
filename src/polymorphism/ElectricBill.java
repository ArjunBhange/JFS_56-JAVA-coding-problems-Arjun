package polymorphism;

public class ElectricBill {
	
	public int calunit(int unit) {
		return 8*unit;
	}
	public double calunit(int unit,double servicechar) {
		return (8*unit)+(servicechar);
	}
	public double calunit(int unit,double servicechar,double tax) {
		double temp=( (8*unit) + servicechar) * (tax/100);
		return (8*unit) + servicechar - temp;
	}

}
