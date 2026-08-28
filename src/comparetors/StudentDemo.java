package comparetors;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> slist=new ArrayList<>();
		
		Student s1=new Student(101,"karthik",22);
        slist.add(s1);
        slist.add(new Student(107,"Kushal",24));
        slist.add(new Student(110,"raju",26));
        slist.add(new Student(108,"saravan",23));
		
		System.out.println(slist);
        
	}

}
