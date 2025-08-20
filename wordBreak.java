public class wordBreak {
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

    // time complexity-> O(L) length represent the length of longest word in array of dictionary
    public static void createTrie(String word) {
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

    // search in trie -> T.C = O(L) .. length of key.
    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null)
                return false;
            curr = curr.children[idx];
        }
        return curr.eoW == true;
    }

    // word-break i.e all parts of word exist in dictionary or not 
    // time complexity -> O(L) length of key T.C directly proportional to key length
    public static boolean wordBreak(String key) {
        if (key.length() == 0)
            return true;
        for (int i = 1; i <= key.length(); i++) {
            if(search(key.substring(0,i)) && wordBreak(key.substring(i)))return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = { "i", "like", "sam", "samsung", "mobile", "ice" };
        String key = "ilikesamsung";
        for (int i = 0; i < words.length; i++) {
            createTrie(words[i]);
        }
        System.out.println(wordBreak(key));
    }
}
