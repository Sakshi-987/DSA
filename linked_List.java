public class linked_List {
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
    public static int size;

    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode next = head;
        newNode.next = head; // link

        // step3 - head = newNode
        head = newNode;
    }

    // add last
    public void addLast(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode next = head;
        tail.next = newNode; // link

        // step3 - head = newNode
        tail = newNode;
    }

    public void addInMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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

    // to removeFirst (i.e head node)
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        size--;
        return val;
    }

    // searching key (by iteration)
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {// key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; // key not found

    }

    // searching key (by recursion)
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // reverse the LL
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args[]) {
        // to create linked list in main class
        // same lnked_list ki class ki ek object bnayi h ll naam s & uss objects k andr
        // saare objects ko create krege
        linked_List ll = new linked_List();

        // we dont add or remove elemnts here instead we create methods in linked list
        // class for each operations of linked-list.

        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        ll.addFirst(2);// first node
        ll.addFirst(1);// 2nd node
        ll.addLast(4);
        ll.addLast(5);
        ll.printList();

        ll.addInMiddle(2, 3);
        ll.printList();
        System.out.println(ll.size);

        // remove first (head) node
        // ll.removeFirst();
        // ll.printList();
        // System.out.println(ll.size);

        // // removing from las i.e tail
        // ll.removeLast();
        // ll.printList();
        // System.out.println(size);

        // searching key by iteration method
        System.out.println(ll.itrSearch(4));
        System.out.println(ll.itrSearch(14));

        // searching key by recursion method
        System.out.println(ll.recSearch(4));
        System.out.println(ll.recSearch(14));

        // reverse the list
       ll.printList();
       ll.reverse();
       ll.printList();

    }
}