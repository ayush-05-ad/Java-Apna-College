import java.util.LinkedList;

public class AddFirst_LL {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node head;
        Node tail;

        public void addFirst(int data) {

            // step 1 -> Create new Node
            Node newNode = new Node(data);

            // this step only for null case
            if (head == null) {
                head = tail = newNode;
                return;
            }

            // step2 -> newNode next = head
            newNode.next = head; // Link

            // step3 -> head = newNode
            head = newNode;

        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
    }
}