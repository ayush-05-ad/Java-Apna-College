public class RemoveFirst_LL {
    public class Node {
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
        Node temp = head;
        int i = 0;

        while(i < idx - 1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int removeFirst() {
        if(head == null){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public void print() {

        Node temp = head;

        // Linked List empty
        if (head == null) {
            System.out.println("LL is empty.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveFirst_LL ll = new RemoveFirst_LL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2, 3);
        ll.print();
        System.out.println("Removed element: " + ll.removeFirst());
        ll.print();

        System.out.println("Size of Linked List: " + size);
    }

}
