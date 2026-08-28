package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Set<Integer> set=new HashSet<>();
			set.add(10);
			set.add(24);
			set.add(11);
			set.add(30);
			set.add(20);
			set.add(null);
			//List<Integer> list=new ArrayList<>(set);
			
			//System.out.println(set);
			
			Set<Integer> set1=new HashSet<>();
			set1.add(10);
			set1.add(24);
			set1.add(11);
			set1.add(30);
			set1.add(20);
			
			set1.removeAll(set1);
			System.out.println(set1);
			
	}

}
