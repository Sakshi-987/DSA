import java.util.*;

public class fancyString {

    public static String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        char prev = s.charAt(0);
        ans.append(prev);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == prev)
                count++;
            else {
                prev = ch;
                count = 1;
            }
            if(count<3)ans.append(ch);
        }
        return ans.toString();
    }

    public static void main(String args[]) {
        // fancy string is a string where no three consecutives character r equal
        String s = "leeetcode";
        String s1 = "aaaabbbaabbbb";
        System.out.println(makeFancyString(s));
        System.out.println(makeFancyString(s1));
    }
}
