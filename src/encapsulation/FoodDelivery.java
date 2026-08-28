package encapsulation;

public class FoodDelivery {
	private int orderid;
	private String name;
	private double	amount;
	private String status;
	
	public void setorderid(int orderid) {
		this.orderid=orderid;
	}public void setname(String name) {
		this.name=name;
	}public void setamount(double amount) {
		this.amount=amount;
	}public void setstatus(String status) {
		this.status=status;
	}
	
	public int getorderid() {
		return orderid;
	}public String getname() {
		return name;
	}public double getamount() {
		return amount;
	}public String getstatus() {
		return status;
	}
	
	
}
