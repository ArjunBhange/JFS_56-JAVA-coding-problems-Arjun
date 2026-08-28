package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		
		
		String arr[]=s.split(" ");
		
		Map<String, Integer> hmap=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			String word = arr[i];
			if(hmap.containsKey(word)) {
				hmap.put(word, hmap.get(word)+1);
			}else {
				hmap.put(word, 1);
			}
		}
		System.out.println(hmap);
		
	}

}
