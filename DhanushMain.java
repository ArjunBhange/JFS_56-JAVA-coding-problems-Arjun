package DSA;

import java.util.ArrayList;
import java.util.List;

public class DhanushMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<DhanushM> us=new ArrayList<>();
		DhanushM u=new DhanushM(101,"Rajesh");
		us.add(new DhanushM(2015,"Raghuvaran"));
		us.add(u);
		us.add(new DhanushM(2014,"marri"));
		us.add(new DhanushM(2018,"thiru"));
		us.add(new DhanushM(2016,"marri 2"));
		
		us.add(new DhanushM(2017,"vip-2"));
		
		
		for(DhanushM m : us) {
			System.out.println(m);
			
			
			//System.out.println(m.getid()+" "+)
			
		}
		
	}

}
