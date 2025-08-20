import java.util.*;

public class longestSubstring {
    public static int longestSubstr(String s) {
        HashSet<Character> ans = new HashSet<>();
        int left = 0;//starting  the window
        int maxLength=0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (ans.contains(ch)) {
                ans.remove(s.charAt(left));
                left++;
            }
            ans.add(ch);
            maxLength = Math.max(maxLength, right-left+1); //window size = right-left+1 
        }
        return maxLength;
    }

    public static void main(String args[]) {
        // print longest substring length without repeating characters
        String s = "abcdefghi";
        System.out.println(longestSubstr(s));
    }
}