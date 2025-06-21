public class linkedList_2 {
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

    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        // size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode next = head;
        newNode.next = head; // link

        // step3 - head = newNode
        head = newNode;
    }

    public void deleteNthfromEnd(int n) {
        // calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // if we've to remove nth i.e 1st node(head) from LL.
        if (n == size) {
            head = head.next;
            return;
        }

        // size-n i.e prev Node
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

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
        linkedList_2 ll2 = new linkedList_2();

        // we dont add or remove elemnts here instead we create methods in linked list
        // class for each operations of linked-list.

        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        ll2.addFirst(5);// first node
        ll2.addFirst(4);// 2nd node
        ll2.addFirst(3);
        ll2.addFirst(2);
        ll2.addFirst(1);
        ll2.printList();

        ll2.deleteNthfromEnd(2);
        ll2.printList();
       


    }

}
