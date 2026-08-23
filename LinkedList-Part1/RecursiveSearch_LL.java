public class RecursiveSearch_LL {
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

    public static void main(String[] args) {
        RecursiveSearch_LL ll = new RecursiveSearch_LL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2, 3);
        ll.print();// 1 -> 2 -> 3 -> 4 -> 5 -> null

        System.out.println("Size of Linked List: " + size);

        System.out.println(ll.recSearch(4));// 3    
        System.out.println(ll.recSearch(10));// -1

    }

}
