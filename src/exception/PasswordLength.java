package exception;

public class PasswordLength {

	public static void passwordLength(String a) throws PasswordLengthException{ 
			
			if(a.length()<8) {
				throw new PasswordLengthException("password must be above characters");
			}
			
	}
	
	public static void main(String[] args) throws  PasswordLengthException{
		// TODO Auto-generated method stub
		
		passwordLength("arjuns");
		
	}

}
