public class createNsearchInTrie {
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
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eoW = true;
    }

    // searching key, if exist in dictionary of words return true otherwise false;
    public static boolean searchKey(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null)
                return false;
            curr = curr.children[idx];
        }
        return curr.eoW == true;
    }

    public static void main(String[] args) {
        String[] words = { "the", "a", "there", "their", "any", "thee" };
        String key = "there";
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(searchKey(key));
    }
}
