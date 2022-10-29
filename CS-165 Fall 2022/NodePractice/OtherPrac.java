/*
      DONT USE this one.  it didn't pass on the school computer
      because this is adding to the front and pulling off the back,
      and the computer judge did not like that.  see next other file for fix


   Lab 14 cs165 practice pages
   #Nodes #nodes #node #Node 
   Nodes Linked Lists Queues
   20221024  -  JLF
*/



public class OtherPrac {

    // linked list variables:
    private Node head;
    private Node tail;
    private final int maxCount;
    private int size;

    // Node class:
    public class Node {
    
        String name;
        Node next;
        public Node(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    } // end of node class


    // class Prac constructor:
    public Prac(int maxCount) {
        this.maxCount = maxCount;
        size = 0;
        Node head = null;
        Node tail = head;
    } // end of constructor


      public boolean offer(String name){
            Node newNode = new Node(name);
            if ( size == maxCount ) return false;
            if ( contains(name)) return false;
            if ( tail == null ) {
                  tail = newNode;
                  size+=1;
            } else {
                  tail.next = newNode;
                  
            

                  
            

      } // end of offer


// swap this around to add at the back
    public Node add(String name) {
        Node tempNode = new Node(name);

        if ( size == maxCount ) {
            throw new IllegalStateException();
        } else if ( this.head == null ) { 
            this.head = tempNode; 
            this.head.next = null;
            tail = tempNode;
            size+=1;
            //System.out.println("in this.head == null");
        } else {
            tempNode.next = this.head;
            this.head = tempNode;
            size = size + 1;
            //System.out.println("in => else");
        }

        return tempNode;
    }


    public int getSize(){ return size; }


    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }


    public boolean containsName(String name){
        
        Node tempNode = head;
        String tempString = null;
        for ( int i=0; i<size; i++ ) {
            //System.out.println("name => " + name + " tempNode => " + tempNode);
            tempString = tempNode.name;
            //System.out.println("name => " + name + " tempString => " + tempString);
            
            if ( name.equals(tempString) ) return true;
            tempNode = tempNode.next;
        }
        return false;

    } // end of containsName()


    public void showLinkedList(){
        Node tempNode = head;
        System.out.println();
        for ( int i=0; i<size; i++ ) {
            System.out.print("node[" + i + "] => " + tempNode);
            System.out.println("  next => " + tempNode.next);
            tempNode = tempNode.next;
        }

        System.out.println();
    } // end of getWholeThing()

    public String element() {
        if ( size > 0 ) return head.name;
        else System.out.println("in element");
        return "wht?";
        //else throw new NoSuchElementException();

    } // end of element()

/*
// might not need this, just stuck functionality into poll()
    public Node secondToLastNode() {
        Node tempNode1 = head;
        for ( int i=0; i<size; i++ ) {
            if ( tempNode1.next.next == null ) {
                tail = tempNode1;
                return tempNode1;
            }

            tempNode1 = tempNode1.next;
        }
        return null;
    } // end of secondToLastNode()
*/

    public Node poll() {

        Node tempNode1 = head;
        for ( int i=0; i<size; i++ ) {
            if ( tempNode1.next.next == null ) {
                tail = tempNode1;
                size-=1;
                return tempNode1;
            }

            tempNode1 = tempNode1.next;
        }
        return null;

    } // end of poll()


    // ----------------------------------------------------------------------------
    // ----------------------------------------------------------------------------
    // ----------------------------------------------------------------------------
    public static void main(String[] agrs) {

        System.out.print("\n----------------------------------------------------\n");

        Prac p1 = new Prac(16);  


        p1.showLinkedList();
        p1.add("bob");
        p1.add("steve");
        p1.add("alice");
        p1.add("cat");
        p1.add("dog");
        p1.add("rock");
        p1.add("small");
        p1.add("medium");
        p1.add("large");

        p1.showLinkedList();


        p1.poll();

        p1.showLinkedList();


        p1.poll();
        p1.poll();
        p1.poll();

        p1.showLinkedList();


        /*
        System.out.println("element returns => " + p1.element());

        System.out.printf("getTail => %s\n", p1.getTail());

        System.out.println("poll => " + p1.poll());

        System.out.printf("getTail => %s\n", p1.getTail());
        System.out.println("getHead => " + p1.getHead());
        System.out.println();

        p1.showLinkedList();


        System.out.println();
        System.out.println("p1.size => " + p1.size);

        System.out.println("contains 'cat'? => " + p1.containsName("cat"));
        System.out.println("contains 'alice'? => " + p1.containsName("alice"));
        System.out.println("contains 'emma'? => " + p1.containsName("emma"));
        
        String s1 = "george";
        Boolean b1 = p1.containsName(s1);
        System.out.printf("contains %s? => %b", s1, b1);
        */

        System.out.print("\n----------------------------------------------------\n");

    } // end of main


} // end of class
