package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Charcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Map<Character,Integer> hmap=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch) +1);
			}else {
				hmap.put(ch, 1);
			}
		}
		Map<Character,Integer> hdup=new HashMap<>();
		
		for(Map.Entry<Character,Integer> entry: hmap.entrySet() ) {
			if(entry.getValue() > 1) {
				hdup.put(entry.getKey(),entry.getValue());
			}
		}
		
		Map<Character,Integer> hunique=new HashMap<>();
		for(Map.Entry<Character,Integer> unique: hmap.entrySet()) {
			if(unique.getValue()==1) {
				hunique.put(unique.getKey(), unique.getValue());
			}
		}
		
		System.out.println(hmap);
		System.out.println(hdup);
		System.out.println(hunique);
		
	}

}
