package encapsulation;

public class Employee {

	private int empid;
	private String empname;
	
	public int getRmpId() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpId(int empid) {
		if(empid>0) {
			this.empid=empid;
		}else {
			System.out.println("Invalid user id");
		}
	}
	public void setEmpName(String empname) {
		this.empname=empname;
	}
}
