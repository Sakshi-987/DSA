import java.util.*;

public class duplicateParanthesis_stack {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    // remove opening
                    s.pop();
                }
            } else {
                // push elements
                s.push(ch);
            }
        }
        return false;

    }

    public static void main(String args[]) {
        // valid string
        String str = "((a+b))"; // true...duplicate
        String str2 = "(a-b+(c))"; // false ...not duplicate
        System.out.println(isDuplicate(str));
    }
}
