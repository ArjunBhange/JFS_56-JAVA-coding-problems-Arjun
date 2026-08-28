package hashset;

import java.util.HashMap;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		map.put("Ram",123);
		map.put("Pothineni",345);
		map.put("kiriti",456);
		map.put("Shetty",678);
		
		map.put(123, "Ram");
		map.put(345, "Pothineni");
		map.put(456, "kiriti");
		map.put(678, "Shetty");
		
		System.out.println(map);
	}

}
