package encapsulation;

public class Recharge {
	private double amount;
	private String mobilenum,operator;
	
	public void setmobilenum(String mobilenum) {
		this.mobilenum=mobilenum;
	}
	public void setoperator(String operator) {
		this.operator=operator;
	}
	public void setamount(double amount) {
		this.amount=amount;
	}
	public String getmobilenum() {
		return mobilenum;
	}public String getoperator() {
		return operator;
	}public double getamount() {
		return amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recharge rc=new Recharge();
		rc.setmobilenum("9014380212");
		rc.setoperator("Xiaomi");
		rc.setamount(25000);
		System.out.println("Mobile number : "+rc.getmobilenum());
		System.out.println("Operator : "+rc.getoperator());
		System.out.println("Amount : "+rc.getamount());
		
		
	}

}
