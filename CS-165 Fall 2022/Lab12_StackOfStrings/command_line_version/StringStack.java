import java.util.*;
/* 
    7.3 Lab 13 - Stack of Strings CS165
    submitted and passed 20221012  -  JLF
*/

/* YOUR CODE HERE
 * This entire class is just a skeleton for your code, plus a main method
 * for testing.
 */
public class StringStack {

    String[] nodeData;
    int size;

    /* You will need some data fields here - at the very least, some kind of
     * String array. You may also want to keep track of the size of the stack, i.e. the number of elements in the stack.
     *REMEMBER: Capacity is how much the stack can hold, and size is the number of elements it contains.
     */

    /* Puts the stack into a valid state, ready for us to call methods on.
     * This constructor will create a stack with a different capacity than the default.
     */
    public StringStack(int capacity) {
        nodeData = new String[capacity];
        size = 0;
    }

    /* If someone calls the constructor with no argument, they should get a
     * stack with a default capacity of 10.
     */
    public StringStack() {
        // this next line per Jack Sovereign 
        this(10);
        // size = 0; // do I need this?
    }

    /* Return true if the stack has no elements, and false otherwise.
     */
    public boolean empty() {
        if ( size == 0 ) return true;
        return false;
    }

    /* Return the object at the top of the stack, WITHOUT removing it. 
     * If there are no elements to peek, throw a NoSuchElementException.
     */
    public String peek() {
        return nodeData[size-1];
    }

    /* Return the object at the top of the stack, AND ALSO remove it.
     * If there are no elements to pop, throw a NoSuchElementException.
     */
    public String pop() {
        if ( size < 1 ) { 
            System.out.println("NoSuchElementException"); 
        }
        else {
            size--;
            return nodeData[size];
        } // end of else
        return "NoSuchElementException";
    }

    /* Add a new object to the top of the stack. 
     * If there is no room in the stack, throw a IllegalStateException.
     */
    public String push(String s) {
        nodeData[size] = s;
        size++;
        return s;
    }

    /* Return the position of an object on the stack.  The position of an object
     * is just its distance from the top of the stack. So, the topmost item is
     * distance 0, the one below the topmost item is at distance 1, etc.
     * If the item is not found, return -1.
     */
    public int search(String s) {
//        System.out.println("------------------------------------------\n"); 
        int distance = 0;

//        System.out.println("size-1 => " + (size-1)); 
        for ( int i=(size-1); i>=0; i-- ) { 
//            System.out.println("nodeData["+i+"] => " + nodeData[i]);
            if ( s.equals(nodeData[i]) ) return distance;
            distance++;
        }

//        System.out.println("------------------------------------------\n"); 
        return -1;
    }

    public void showArray() {
        for ( int i=0; i<size; i++ ) { System.out.println(nodeData[i] + " "); }
        System.out.println("size => " + size);
    }
/* // hide this main for final testing
    // this is a test main, remove this and reinstate other main 
    // when you think the above code works.
    public static void main(String[] args) {

        StringStack ss = new StringStack(20);

        ss.showArray();
//        System.out.println("is nodeData empty? => " + ss.empty());
        // add some stuff to string
        ss.push("string1");
        ss.push("other string");
        ss.push("somethingElse");
        ss.push("still more");

 //       System.out.println("is nodeData empty? => " + ss.empty());
        ss.showArray();
        System.out.println("contains 'somethingElse' ? => " + ss.search("somethingElse"));
//        System.out.println("peek => " + ss.peek());
//        System.out.println("pop  => " + ss.pop());
//        System.out.println("pop  => " + ss.pop());

    } // end of test main

} // temp end of program
*/


    public static void main(String[] args) {
        StringStack stack_ten = new StringStack();
        StringStack stack_three = new StringStack(3);


        assertEquals(stack_ten.empty(), true,
            "Your stack returned false for empty(), even though it was just "
            + "created and should be empty.");

        stack_ten.push("Alef");
        stack_ten.push("Bet");
        stack_ten.push("Gimel");

        assertEquals(stack_ten.empty(), false,
            "Your stack returned true for empty(), even though elements were "
            + "pushed into it.");

        String top = stack_ten.pop();
        assertEquals(top, "Gimel",
            "Didn't get the correct element from a pop()! Should have been \" "
            + "Gimel\", but was \"" + top + "\".");

        top = stack_ten.peek();
        assertEquals(top, "Bet",
            "Didn't get the correct element from a peek()! Should have been "
            + "\"Bet\", but was \"" + top + "\".");
    
        // Making sure a peek doesn't change anything!
        top = stack_ten.peek();
        assertEquals(top, "Bet",
            "Didn't get the correct element from a peek()! Should have been "
            + "\"Bet\", but was \"" + top + "\".");

        stack_ten.pop();
        stack_ten.pop();

        assertEquals(stack_ten.empty(), true,
            "Your stack returned false for empty, even though all of its "
            + "elements were popped off.");

        boolean caught = false;
        try {
            stack_ten.pop();
        } catch (NoSuchElementException e) {
            caught = true;
        }
        if (!caught) {
            throw new AssertionError(
                "Popping an empty stack should have caused a "
                + "NoSuchElementException, but it did not!");
        }
        caught = false;
        try {
            stack_ten.peek();
        } catch (NoSuchElementException e) {
            caught = true;
        }
        if (!caught) {
            throw new AssertionError(
                "Peeking an empty stack should have caused a "
                + "NoSuchElementException, but it did not!");
        }
        caught = false;

        String[] moreLetters = new String[] {
            "Dalet", "He", "Vav", "Zayin", "Het", "Tet", "Yod", "Kaf", "Lamed"
        };
        for (String l : moreLetters) {
            stack_ten.push(l);
        }
        
        int searched = stack_ten.search("Het");
        assertEquals(searched, 4,
            "Incorrect result from .search(): got " + searched
            + ", but should have found 4");

        searched = stack_ten.search("Lamed");
        assertEquals(searched, 0,
            "Incorrect result from .search(): got " + searched
            + ", but should have found 0");

        searched = stack_ten.search("Not in the stack!");
        assertEquals(searched, -1,
            "Incorrect result from .search(): got " + searched
            + ", but should have found -1");


        stack_three.push("A");
        stack_three.push("B");
        stack_three.push("G");
        try {
            stack_three.push("D");
        } catch (IllegalStateException e) {
            caught = true;
        }
        if (!caught) {
            throw new AssertionError(
                "Trying to push onto a full stack should have caused an "
                + "IllegalStateException, but it did not.");
        }

        System.out.println("All tests passed! Now go play some Jenga, because "
            + "you're the stacking master.");
    }

    private static <T1, T2> void assertEquals(T1 e1, T2 e2, String msg) {
        if (!e1.equals(e2)) {
            throw new AssertionError(msg);
        }
    }
}
