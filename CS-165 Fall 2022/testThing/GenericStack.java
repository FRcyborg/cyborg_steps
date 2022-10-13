import java.util.*;

public class GenericStack<T> {

        //String[] nodeData;
        ArrayList<T> nodeData = new ArrayList<>();
        int size;


        public GenericStack(int capacity) {
            //nodeData = new String[capacity];
            nodeData = new ArrayList<>(capacity);
            size = 0;
        }

        /* If someone calls the constructor with no argument, they should get a
         * stack with a default capacity of 10.
         */
        public GenericStack() {
            // this next line per Jack Sovereign
            this(10);
            // size = 0; // do I need this?
        }

        /* Return true if the stack has no elements, and false otherwise.
         */
        public boolean empty() {
            return size == 0;
        }


        /* Return the object at the top of the stack, WITHOUT removing it.
         * If there are no elements to peek, throw a NoSuchElementException.
         */
        public T peek() {
            return nodeData.get(size-1);
            //return nodeData[size-1];
        }

        /* Return the object at the top of the stack, AND ALSO remove it.
         * If there are no elements to pop, throw a NoSuchElementException.
         */
        
        public T pop() {
            if (size == 0) {
                // this is going to be an issue with generics
                // look up what to do about this
                // return "NoSuchElementException";
                //return (T)"something";
                throw new NoSuchElementException();

            } else {
                T tempThing = null;
                if (size >= 0) {
                    tempThing = nodeData.get(size - 1);
                    nodeData.remove(size - 1);
                    size--;
                }
                return tempThing;
            }
        }

        /* Add a new object to the top of the stack.
         * If there is no room in the stack, throw a IllegalStateException.
         */
        public T push(T s) {
            nodeData.add(s);
            //size = nodeData.size();
            size++;
            //System.out.println("size from push => " + size);
            //System.out.println("nodeData.size() from push => " + nodeData.size());
            return s;
        }

        /* Return the position of an object on the stack.  The position of an object
         * is just its distance from the top of the stack. So, the topmost item is
         * distance 0, the one below the topmost item is at distance 1, etc.
         * If the item is not found, return -1.
         */
        public int search(T s) {
            //int distance = 0;
            if ( nodeData.contains(s)) {
                return ( nodeData.size() - nodeData.indexOf(s) - 1 );
            } else {
                return -1;
            }
        }

        public void showArray() {
            //for ( int i=0; i<size; i++ ) { System.out.println(nodeData.get(i) + " "); }
            //System.out.println("nodeData.size() => " + nodeData.size());
            //System.out.println("from showArray");
            System.out.println(nodeData);
            System.out.println("size => " + size);
        }


// ----------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------
// hide this main for final testing
    // this is a test main, remove this and reinstate other main
    // when you think the above code works.
    public static void main(String[] args) {

        GenericStack<String> ss = new GenericStack<>();
        GenericStack<Character> si = new GenericStack<>();

        ss.showArray();
//        System.out.println("is nodeData empty? => " + ss.empty());
        // add some stuff to string
        ss.push("string1");
        ss.push("other string");
        ss.push("somethingElse");
        ss.push("still more");

        si.push('A');
        si.push('b');
        si.push('L');
        si.push('i');



 //       System.out.println("is nodeData empty? => " + ss.empty());
        ss.showArray();
        System.out.println("contains 'string1' ? => " + ss.search("string1"));
        System.out.println("contains 'still more' ? => " + ss.search("still more"));
        System.out.println("contains 'wrong' ? => " + ss.search("wrong"));
        System.out.println("peek => " + ss.peek());
        System.out.println("pop  => " + ss.pop());
        System.out.println("pop  => " + ss.pop());
        System.out.println("push  => " + ss.push("roger"));
       ss.showArray();

       si.showArray();


    } // end of test main

} // temp end of program


