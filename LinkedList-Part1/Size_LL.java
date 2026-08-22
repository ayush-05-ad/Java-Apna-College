public class Size_LL {
    class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    public static int size;

    public void addFirst (int data) {
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        size++;

        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        size++;
        tail = newNode;
    }

    public void addMiddle(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx - 1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
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
        Size_LL ll = new Size_LL();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2, 3);

        ll.print(); //1->2->3->4->5
        System.out.println(Size_LL.size);
    }
}