package DSA;

import java.util.*;

public class EmplyoeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDemo e1=new EmployeeDemo(1,"keerthi");
		EmployeeDemo e2=new EmployeeDemo(2,"suresh");
		EmployeeDemo e3=new EmployeeDemo(3,"saleem");
		EmployeeDemo e4=new EmployeeDemo(4,"ramesh");
		EmployeeDemo e5=new EmployeeDemo(5,"koti");
		
		EmployeeDemo[] e= {e1,e2,e3,e4,e5};
		
		for(EmployeeDemo i:e) {
			System.out.println(i.empid);
			System.out.println(i.empname);
		}
		List<Integer> ls=Arrays.asList(2,5,7,4);
		System.out.println(ls);
		
		int[] arr= {4,3,5,2,6};
		Arrays.sort(arr);
		System.out.println("Index : "+Arrays.binarySearch(arr, 4));
		
		System.out.println(Arrays.toString(arr));
		
		int c[]=Arrays.copyOf(arr,arr.length-1 );
		System.out.println(Arrays.toString(c));

		
	}

}
