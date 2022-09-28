/** Linked List Lab
 * Made by Toby Patterson 5/29/2020
 * For CS165 at CSU
 */

public class MyLinkedList implements MiniList<Integer>{
    /* Private member variables that you need to declare:
     ** The head pointer
     ** The tail pointer
     */
    Node head;
    Node tail;

    public class Node {
        // declare member variables (data and next)
        int data;
        Node next = null;

        // finish these constructors
        public Node(int data, Node next) {

        }
        public Node(int data) {} // HINT: use this() with next = null
    }

    // Initialize the linked list (set head and tail pointers)
    public MyLinkedList() {}

    @Override
    public boolean add(Integer item) {

        return false;
    }

    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove() {
        return null;
    }

    @Override
    public Integer remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Integer item) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Integer item) {
        return false;
    }

    @Override
    public Integer get(int index) {
        return null;
    }

    @Override
    public int indexOf(Integer item) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    // Uncomment when ready to test
//    @Override
//    public String toString() {
//        String ret = "";
//        Node curr = head;
//        while (curr != null) {
//            ret += curr.data + " ";
//            curr = curr.next;
//        }
//        return ret;
//    }

}