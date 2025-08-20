import java.util.*;

public class BST_to_BalancedBST {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inOrder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inOrder);
        inOrder.add(root.data);
        getInorder(root.right, inOrder);
    }

    public static Node createBST(ArrayList<Integer>inOrder, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inOrder.get(mid));
        root.left = createBST(inOrder, st, mid - 1);
        root.right = createBST(inOrder, mid + 1, end);
        return root;

    }

    public static Node balancedBST(Node root) {
        // inorder sequence
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInorder(root, inOrder);
        // sort the inorder sequence
        root = createBST(inOrder, 0, inOrder.size() - 1);
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = balancedBST(root);
        preOrder(root);
    }
}
