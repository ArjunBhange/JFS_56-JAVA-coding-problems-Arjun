package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramWord {
															
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		          
		Scanner sc=new Scanner(System.in);
		 int n = sc.nextInt();
	     String str[] = new String[n];

	     for (int i = 0; i < n; i++) {
	          str[i] = sc.next();
	     }  
	     							
	     Map<String, Integer> hmap = new HashMap<>();

	        for (int i = 0; i < n; i++) {

	            char ch[] = str[i].toCharArray();
	            Arrays.sort(ch);

	            String key = new String(ch);
	            hmap.put(key, hmap.getOrDefault(key, 0) + 1);
	        }																					

	        System.out.println(hmap);
		
	}
																															
}
