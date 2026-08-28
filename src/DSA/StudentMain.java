package DSA;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setMarks(160);
		s.setName("Bahubali");
		
		System.out.println(s.getMarks());
		System.out.println(s.getName());
		
		s.setMarks(140);
		s.setName("Ballala");
		
		System.out.println(s.getMarks());
		System.out.println(s.getName());
		
	}

}
