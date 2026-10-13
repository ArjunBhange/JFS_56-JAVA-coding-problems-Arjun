package DSA;

public class Word_Occurances {

	  public static void main(String[] args) {
	        String str = "java is easy and java is powerful";
	        String word = "java";

	        String[] words = str.split("\\s+");
	        int count = 0;

	        for (String w : words) {
	            if (w.equals(word)) {
	                count++;
	            }
	        }

	        System.out.println("Occurrences: " + count);
	    }
	
}
