public class findingPrefix {
    // here we also include freq variable (in Node class) to track frew of each
    // node. if freq = 1(char or node having 1 freq means that char didn't repeated)
    // after inserting all words in trie.rerurn char from root node till that
    // node.it acts as unique prefix for respective word.
    static class Node {
        Node[] children = new Node[26];
        boolean eoW = false;
        int freq;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    // this time we are tracking freq also if char comes which already exist freq
    // gets updated .
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eoW = true;
    }

    public static void uniquePrefix(String ans, Node root) {
        if (root == null)
            return;
        if (root.freq == 1) {
            System.out.print(ans+ " ");
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                uniquePrefix(ans + (char) (i + 'a'), root.children[i]);
            }
        }
    }

    public static void main(String args[]) {
        String words[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        root.freq = -1; //as root i empty node it only stores it's child node information 
        uniquePrefix("", root);
    }
}
