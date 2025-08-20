public class startsWithProblem {
    // if prefix asked exist in dictionary of words return true otherwise false;
    static class Node {
        Node[] children = new Node[26];
        boolean eoW = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eoW = true;
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null)
                return false;
            curr = curr.children[idx];
        }
        // we only have to see whether prefix exist or not.. it doesn't matter if it exist in dictionary of words or not.
        // if prefix ends all char found , atlast returns true doesn't need to check endofWord condition 
        return true;
    }

    public static void main(String args[]) {
        String[] words = { "apple", "app", "mango", "man", "woman" };
        String prefix1 = "app"; //case1 : prefix exist in dictionary also
        String prefix2 = "appl"; //case2 : prefix exist but not in dictionary
        String prefix3 = "xyz"; //case3 : prefix not even exist.
        
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(startsWith(prefix1)); //it return true
        System.out.println(startsWith(prefix2)); //it return true
        System.out.println(startsWith(prefix3)); //it return false
    }
}
