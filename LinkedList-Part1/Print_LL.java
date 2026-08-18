
public class Print_LL {

    // Node class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail
    Node head;
    Node tail;

    // Add First
    public void addFirst(int data) {

        Node newNode = new Node(data);

        // Linked List empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // New node points to current head
        newNode.next = head;

        // New node becomes head
        head = newNode;
    }

    // Add Last
    public void addLast(int data) {

        Node newNode = new Node(data);

        // Linked List empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Current tail points to new node
        tail.next = newNode;

        // New node becomes tail
        tail = newNode;
    }

    // Print Linked List
    public void print() {

        Node temp = head;

        // Linked List empty
        if (head == null) {
            System.out.println("LL is empty.");
            return;
        }

        // Traverse Linked List
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create our Linked List
        Print_LL ll = new Print_LL();

        ll.print();

        ll.addFirst(2);
        ll.print();

        ll.addFirst(1);
        ll.print();

        ll.addLast(3);
        ll.print();

        ll.addLast(4);
        ll.print();
    }
}