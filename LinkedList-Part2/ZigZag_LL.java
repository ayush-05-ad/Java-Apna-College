public class ZigZag_LL {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

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

    public void zigZag() {
        if (head == null || head.next == null) {
            return;
        }

        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merg - Zig-Zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }


    }

    public static void main(String args[]){
        ZigZag_LL ll = new ZigZag_LL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5->4->3->2->1

        ll.print();
        ll.zigZag();
        ll.print();
    }
    
}
