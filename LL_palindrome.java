public class LL_palindrome {

    public static class Node {
        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head & tail properties
    public static Node head;
    public static Node tail;
    // public static int size;


    // add last
    public void addLast(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        // size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode next = head;
        tail.next = newNode; // link

        // step3 - head = newNode
        tail = newNode;
    }

    // for finding midnode ...helper func
    private Node findmidNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // palindorme function
    public boolean checkPalindrome() {
        if (head == null || head.next== null) {
            return true;
        }
        // find mid node - step 1st
        Node midNode = findmidNode(head);
        // reverse 2nd half - 2nd step
        Node prev = null;
         Node curr = midNode;
         Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // prev is right's head here
        Node left = head;
        // checking - 3rd step
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }

    // to print linked list
    public void printList() {
        if (head == null) {
            System.out.println("linked list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        // to create linked list in main class
        // same lnked_list ki class ki ek object bnayi h ll naam s & uss objects k andr
        // saare objects ko create krege
        // linked_List ll = new linked_List();
        LL_palindrome llNew = new LL_palindrome();

        // we dont add or remove elemnts here instead we create methods in linked list
        // class for each operations of linked-list.

        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        llNew.addLast(1);// first node
        llNew.addLast(2);// 2nd node
        llNew.addLast(2);
        llNew.addLast(2);
        llNew.addLast(1);
        llNew.printList();
        

        System.out.println(llNew.checkPalindrome());

       

    }

}
