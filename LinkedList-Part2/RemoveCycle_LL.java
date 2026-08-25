public class RemoveCycle_LL {
   public class Node {
    int data;
    Node next;

    public Node (int data){
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

    public void removeCycle() {
    //detect cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow){
            cycle = true;
            break;
        }
    }

    if(cycle == false){
        return;
    }

    //find meeting point
    slow = head;
    Node prev = null;
    while(slow != fast){
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }

    //remove Cycle -> last.next = null
    if(prev == null){
        prev = fast;
        while(prev.next != fast){
            prev = prev.next;
        }
    }
    prev.next = null;
   }

   public static void main(String args [] ){
    RemoveCycle_LL list = new RemoveCycle_LL();
    list.head = list.new Node(1);
    Node temp = list.new Node(2);
    list.head.next = temp;
    list.head.next.next = list.new Node(3);
    list.head.next.next.next = temp;
    //1->2->3->2

    System.out.println(list.isCycle());
    list.removeCycle();
    System.out.println(list.isCycle());
   }
}
