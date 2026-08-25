public class DetectingCycle_LL {
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

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast) {
                return true; //cycle exists
            }
        }
        return false; //cycle doesn't exist
    }

    public static void main (String args []){
        DetectingCycle_LL list = new DetectingCycle_LL();
        
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.head;
        //1->2->3->1
        System.out.println(list.isCycle());
    }
}
