package maps;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap=new HashMap<>();
		hmap.put(101,"ramesh");
		hmap.put(104,"suresh");
		hmap.put(103,"kamesh");
		hmap.put(102,"somesh");
		hmap.put(null, null);
		/*System.out.println(hmap);
		for(Integer key : hmap.keySet()){
			System.out.println(key+" : "+hmap.get(key));
		}*/
		
		//System.out.println(hmap.size());
		//System.out.println(hmap.containsKey(104));
		//System.out.println(hmap.get(102));
		//System.out.println(hmap.containsValue("ganesh"));
		
		
	}

}
