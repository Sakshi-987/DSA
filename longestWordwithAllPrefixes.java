import java.util.*;
public class longestWordwithAllPrefixes {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // insert func
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    // finding word which exist in dictionary with all its prefix
    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null)
            return;
        for (int i =0; i<26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        StringBuilder str = new StringBuilder("");
        longestWord(root,str);
        System.out.println(ans);
    // incase of multiple ans, it'll by default print lexicographicaaly small word
    // for lexicographical large words reverse the loop in longestWord
    // form (i=25 to i>=0)
    }
}
