package DSA;
import java.util.HashSet;
public class RepeatingCharacters {

	    public int lengthOfLongestSubstring(String s) {
	        HashSet<Character> set = new HashSet<>();

	        int left = 0;
	        int maxLength = 0;

	        for (int right = 0; right < s.length(); right++) {
	            char ch = s.charAt(right);

	            while (set.contains(ch)) {
	                set.remove(s.charAt(left));
	                left++;
	            }

	            set.add(ch);
	            maxLength = Math.max(maxLength, right - left + 1);
	        }

	        return maxLength;
	    }

	    public static void main(String[] args) {
	        RepeatingCharacters obj = new RepeatingCharacters();

	        String s = "abcabcbb";

	        System.out.println(obj.lengthOfLongestSubstring(s));
	    }


}
