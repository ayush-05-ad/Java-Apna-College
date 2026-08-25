public class RemoveNth_LL {
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
        System.out.println("'null");
    }

    public void deleteNthfromend (int n){
        //calculate size
        int sz = 0;
        Node temp = head;
            while(temp != null){
                temp = temp.next;
                sz++;
            }
            if(n == sz){
                head = head.next;//removedFirst
                return;
            }

            //sz-1
            int i=1;
            int iToFind = sz-n;
            Node prev = head;
            while(i< iToFind){
                prev = prev.next;
                i++;
            }

            prev.next = prev.next.next;
            return;
        }
    

    public static void main(String[] args) {
        RemoveNth_LL ll = new RemoveNth_LL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        ll.deleteNthfromend(3);
        ll.print();
    }

}



