public class small {

    Node head = null;
    Node tail = null;

    // -------------------------------------------------------------------------------------
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
    // -------------------------------------------------------------------------------------

    public boolean add(int item) {
      System.out.println("weeze in add(1)");
       Node newNode = new Node(item);
       if ( head == null ) {
           head = newNode;
           tail = newNode;
       } else {
           tail.next = newNode;
           tail = newNode;
       } // end of if / else
        
       return false;

    } // end of add

    // -------------------------------------------------------------------------------------

    public void add(int index, Integer element) {

      System.out.println("weeze in add(1,2)");

       Node newNode = new Node(element);
       Node previousNode = head;
       int whereToPutIt = index;

       if ( size() <= whereToPutIt ) {
          add(element);
      }
       else {
           for ( int i=0; i<index-1; i++ ) {
              previousNode = previousNode.next;
           }
           newNode.next = previousNode.next;
           previousNode.next = newNode;
       } // end of else


    } // end of add(1,2)

    // -------------------------------------------------------------------------------------

    public void showList() { 
        Node current = head;
        if ( head==null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    } // end of showList()
    // -------------------------------------------------------------------------------------
    public int size() {
        int sizeOfThing=0;
        Node tempNode = head;
        
        while ( tempNode != null ) {
            sizeOfThing++;
            tempNode = tempNode.next;
        }

        return sizeOfThing;
    } // end of size()

    // -------------------------------------------------------------------------------------
    public int indexOf(Integer item) {
        int sizeOfThing=0;
        Node tempNode = head;
        int indexOfHolder = 0;
        
        while ( tempNode != null ) {
            if ( tempNode.data == item ) indexOfHolder = sizeOfThing;

            sizeOfThing++;

            tempNode = tempNode.next;
        }


        return indexOfHolder;
        
        
    } // end of indexOf()
    
    // -------------------------------------------------------------------------------------

    public Integer get(int index) {
       int indexTracker = 0;
       Node tempNode = head;
       int dataHolder = 0;
       
       if ( head == null ) return null;
       if ( size()-1 < index ) return null;
       for ( int i=0; i<=index; i++ ) {
           System.out.println("tempNode.data => " + tempNode.data);
           dataHolder = tempNode.data;
          tempNode = tempNode.next;
       }
       return dataHolder;
         
    }

    // -------------------------------------------------------------------------------------

        public boolean contains(Integer item) {
            Node tempNode = head;
            while ( tempNode != null ) {
                if ( tempNode.data == item ) return true;
                tempNode = tempNode.next;
            }

            return false;
        }

    // -------------------------------------------------------------------------------------

        public void clear() {

            head = null;
            tail = null;


        }  // end of clear()

    // -------------------------------------------------------------------------------------

    public static void makeLine() { System.out.print("\n-----------------------------------------\n"); }


    // -------------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------------

    public static void main(String[] args) {
        linkListPractice l = new linkListPractice();
        makeLine();
      System.out.println("well, did anything print?\n");

        l.showList();
        l.add(4);
        l.add(9);
        l.add(5);
        l.add(2);
        l.showList();

        System.out.println("checking add(2,7) => ");
        l.add(2,7);
        l.showList();

        System.out.println("checking add(0,7) => ");
        l.add(0,7);
        l.showList();



//        System.out.println("size of linkedList => " + l.size());
//        System.out.println("indexOfHolder => " + l.indexOf(9));
//        System.out.println("get function 2 returns => " + l.get(2));
//        System.out.println("get function 1 returns => " + l.get(1));
//        System.out.println("does it contain 5 => " + l.contains(5));
//        System.out.println("does it contain 6 => " + l.contains(6));
//        l.clear();
//        l.showList();

        makeLine();

    } // end of main
}
