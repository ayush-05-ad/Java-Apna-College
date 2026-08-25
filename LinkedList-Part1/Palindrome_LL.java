public class Palindrome_LL {
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

    public void addLast (int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return ; 
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty.");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;//slow is my middle
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null){
            return true;
        }

        //step 1 -> Find Mid
        Node midNode = findMid(head);

        //step 2 -> Reverse 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head; 

        //step-3 -> check left Half & right Half
        boolean isPalindrome = true;
        while(right != null) {
            if(left.data != right.data){
                isPalindrome = false;
                break;
            }
            left = left.next;
            right = right.next;
        }

        // Restore the list after checking it.
        curr = prev;
        prev = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return isPalindrome;
    }
    

    public static void main(String[] args) {
        Palindrome_LL ll = new Palindrome_LL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();
        System.out.println(ll.checkPalindrome());
        
    }
}
