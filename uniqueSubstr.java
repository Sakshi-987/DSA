public class uniqueSubstr {
    // return the count of number of unique substring
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
        curr.eoW = true;
    }

    // finding unique substring count -> counting the number of nodes in a trie
    // count of unique substring = number of nodes in a trie including root(as it
    // acts as a null substring)
    public static int countNodes(Node root) {
        if (root == null)
            return 0;
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str = "ababa";
        // finding suffix using substring
        for (int i = 0; i <= str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        // count nodes once all suffix inserted in a trie ..so duplicate suffix and prefix already dissolved
        System.out.println(countNodes(root));
    }
}
