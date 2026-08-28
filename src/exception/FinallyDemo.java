package exception;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("This is try method");
			int n=10;
			n=n/0;
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Thank you visit again");
		}
		
	}

}
