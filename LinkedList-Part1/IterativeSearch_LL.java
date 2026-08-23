public class IterativeSearch_LL {
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

    public void removeFirst() {
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        head = head.next;
        size--;
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

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){// Key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        // Key not found
        return -1;
    }

    

    public static void main(String[] args) {
        IterativeSearch_LL ll = new IterativeSearch_LL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2, 3);
        ll.print();// 1 -> 2 -> 3 -> 4 -> 5 -> null

        System.out.println(ll.itrSearch(4));// 3    
        System.out.println(ll.itrSearch(10));// -1

        ll.removeFirst();
        ll.print();

        System.out.println("Size of Linked List: " + size);
    }

}
