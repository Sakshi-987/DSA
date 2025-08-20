import java.util.*;

public class merge2BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node mergeBSTs(Node root1, Node root2) {
        // step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        // step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // merge
        int i = 0, j = 0;
        ArrayList<Integer> finalBST = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalBST.add(arr1.get(i));
                i++;
            } else {
                finalBST.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            finalBST.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            finalBST.add(arr2.get(j));
            j++;
        }
        // step 3
        return createBST(finalBST, 0, finalBST.size() - 1);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]) {
        // BST 1
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // BST 2
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preOrder(root);
    }
}
