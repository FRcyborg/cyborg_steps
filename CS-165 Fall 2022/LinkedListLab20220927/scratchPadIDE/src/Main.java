/*
1. Node head/tail = null;  line 8, is that right?
2. why is it giving me a warning for a reassigned variable?  what's the problem with reassigning?
3. java said there wouldn't be pointers.  Java lied.
4. go over the current = head... what does that do exactly and why doesn't it mess with data when doing this?
        i.e. => is current = head the same as current = head.next?  and why are "=" okay for this?  shouldn't
        there be a method?
5. so... everything is an object, except linked list?  the linked list itself is not an object but each thing
        in it is an object, right?  not really an object, just the data is an object.  the node is sort of
        not a thing.  So the list can't have a name or anything.  Is that why it has to self
        reference as class node?  Is this some kind of lamda b.s.?
6. how come this program doesn't work?
7. could you put a linked list in an object form?
8.
 */


public class Main {

    Node head = null;
    Node tail = null;
    public class Node {
       int data;
       Node next = null;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
       public Node(int data) {
           this.data = data;
           this.next = null;
       }
    } // end of class Node

   public Node getPreviousNode(int index) {
        Node tempNode = head;
        int i = 0;
        for ( i=0; i<index; i++ ) {
            tempNode = tempNode.next;
        }
        return tempNode;
   }

   public void add(int element) {
        Node newNode = new Node(element);
        Node current = head;
       if ( head == null ) {
           head = newNode;
           tail = newNode;
       } else {
           head = newNode;
           head.next = current;
       }
       System.out.println("newNode => " + newNode.data + " " + newNode.next);
   }
   public void add(int index, Integer element) {

   } // end of add(1,2)

    public void showLinkedList() {
        Node current = head;
        if ( head == null ) {
            System.out.println("List is empty");
        } else
        while ( current != null ) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Main l = new Main();
        System.out.println("Hello world!");
        System.out.print("\n-------------------------------------------------\n");
        l.showLinkedList();
        l.add(5);
        l.add(6);
        l.add(9);
        l.showLinkedList();

        System.out.print("\n-------------------------------------------------\n");
    }
}