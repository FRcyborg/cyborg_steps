import java.util.NoSuchElementException;
/*
   CS165
   #Lab12 #Lab 12  #Queue
   20221026  -  JLF

 */
public class workAreaPart2 {


    public class Node {
        String name;
        Node next;
        public Node(String name) {
            this.name = name;
        }
        @Override
        public String toString(){
            return name;
        }
    }
    private Node head;
    private Node tail;
    private final int maxCount;
    private int size;


    public workAreaPart2(int maxCount){
        this.maxCount = maxCount;
        size = 0;
        tail = null;
        head = tail;
    }


    // @param name - person to add
    // @return - true if item can be added
    // @throw IllegalStateException if the Queue is full
    // element can not be added if it is a duplicate


    public boolean offer(String name){
        Node newNode = new Node(name);
        if ( size == maxCount ) {
            return false;
        }
        else {
            if ( !contains(name) ) {
                if ( size == 0 ) {
                    head = newNode;
                } else {
                    // add newNode to end of LinkedList:
                    tail.next = newNode;
                }
                tail = newNode;
                size+=1;
                return true;
            }
        }
        return false;
    }  // end of offer()

    public boolean add(String name){
        Node newNode = new Node(name);
        if ( size == maxCount ) {
            throw new IllegalStateException();
        }
        else {
            if ( !contains(name) ) {
               if ( size == 0 ) {
                   head = newNode;
               } else {
                   // add newNode to end of LinkedList:
                   tail.next = newNode;
               }
                tail = newNode;
                size+=1;
                return true;
            }
        }
        return false;
    } // end of add()

    // todo:
    private boolean contains(String name){
        // does it contain that thing?
        Node tempNode = head;
        String tempString = null;
        for ( int i=0; i<size; i++ ) {
            tempString = tempNode.name;
            if (name.equals(tempString)) return true;
            tempNode = tempNode.next;
        }
        return false;
    } // end of contains()


    public String remove(){
        if ( size == 0 ) throw new NoSuchElementException();
        else {
            String tempString = head.name;
            head = head.next;
            size -= 1;
            return tempString;
        }
    } // end of remove()

    public String poll(){
        if ( size == 0 ) return null;
        else {
            String tempString = head.name;
            head = head.next;
            size -= 1;
            return tempString;
        }
    } // end of poll()


    // ----------------------------------------------------------------------------------i
    public void showLinkedList(){
        Node tempNode = head;
        System.out.println();
        System.out.println("head => " + head);
        System.out.println("tail => " + tail);
        System.out.println();
        for ( int i=0; i<size; i++ ) {
            System.out.print("node[" + i + "] => " + tempNode);
            System.out.println("     .next => " + tempNode.next);
            tempNode = tempNode.next;
            //if ( tempNode != null ) tempNode = tempNode.next;
        }
        System.out.println();
    }
    public static void makeLine(){
        System.out.println("\n-------------------------------------------------------------\n");
    }
    // ----------------------------------------------------------------------------------
    // ----------------------------------------------------------------------------------
    // ----------------------------------------------------------------------------------
    public static void main(String[] args) {
        workAreaPart2 w1 = new workAreaPart2(8);
        makeLine();
        System.out.println("Hello World!");

        w1.add("bob");
        w1.add("steve");
        w1.add("sue");
        w1.add("pete");
        w1.add("otis");
        w1.showLinkedList();
        System.out.println("size => " + w1.size);
        System.out.println("poll => " + w1.poll());
        System.out.println("poll => " + w1.poll());
        System.out.println("poll => " + w1.poll());

        System.out.println("size => " + w1.size);
/*
        w1.showLinkedList();
        w1.add("bob");
        w1.add("sue");
        w1.add("steve");

        w1.showLinkedList();

        System.out.println("remove => " + w1.remove());
        System.out.println("remove => " + w1.remove());
        System.out.println("remove => " + w1.remove());

        w1.showLinkedList();

        System.out.println("contains 'bob'? => " + w1.contains("bob"));
        System.out.println("contains 'pete'? => " + w1.contains("pete"));
        System.out.println("contains 'otis'? => " + w1.contains("otis"));
        System.out.println("contains 'nada'? => " + w1.contains("nada"));

 */
        makeLine();
    }

}
