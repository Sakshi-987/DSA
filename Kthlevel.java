import java.util.*;

public class Kthlevel {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static void kLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kLevel(root.left, level + 1, k);
        kLevel(root.right, level + 1, k);
    }

    // get path from root to given node method
    public static boolean getPath(Node root, int n, ArrayList<Node> path) { // takes O(n)
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size() - 1); // removing the last node
        return false;
    }

    // lowest common ancestor => approach1
    public static Node lca(Node root, int n1, int n2) { // O(n)
        ArrayList<Node> path1 = new ArrayList<>(); // takes O(n) to find path for n1
        ArrayList<Node> path2 = new ArrayList<>(); // takes O(n) to find path for n2

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // last common ancestor
        int i = 0;
        // this loop takes n time to traverse and find lca
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        return path1.get(i - 1);

        // 3O(n) => O(n)
    }

    // lca => approach2
    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        // leftLCA = val rightLCA = null
        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }

        return root;
    }

    // minimum distance between 2 nodes

    // calc distance between 2 nodes by their lowest ancestor path
    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    // min distance between 2 nodes
    public static int minDistance(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        // int dist1 = lcaDist(root, n1);
        // int dist2 = lcaDist(root, n2);
        // return dist1+dist2;
        return lcaDist(root, n1) + lcaDist(root, n2);

    }

    // to find kth ancestor of a given node
    public static int KthAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = KthAncestor(root.left, n, k);
        int rightDist = KthAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max+1;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // print the nodes at kth level
        // int k = 3;
        // kLevel(root, 1, k);

        // using approach1
        int n1 = 4;
        int n2 = 6;
        System.out.println(lca(root, n1, n2).data);
        System.out.println("*************");

        // by using approch 2
        System.out.println(lca2(root, n1, n2).data);
         System.out.println("*************");

        // minimum distance between 2 nodes
        System.out.println(minDistance(root, n1, n2));
         System.out.println("*************");

        // to find kth ancestor from a given node
        int n=5,k=2;
        KthAncestor(root,n,k);
         System.out.println("*************");
    }
}
