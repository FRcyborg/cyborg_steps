public class nodeTest {



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
    } // end of Node subclass

    private Node head;
    private Node tail;
    private final int maxCount;
    private int size;

    public nodeTest(int maxCount) {
        this.maxCount = maxCount;
        size = 0;
    }

//    @Override  // this created an error, so we hid it
    public boolean add(String name) {
        boolean ret = offer(name);
        if (!ret) {
//            throw new IllegalStateExeption();  // this caused error in Intellij, so hiding it
            return false;
        }
        return true;
    }

    public boolean offer(String name) {
        System.out.println("Hello World!");
        return true;
    }


    // --------------------------------------------------------------------------------------
    // --------------------------------------------------------------------------------------
    // --------------------------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.print("\n-----------------------------------------------------------------------\n");
        offer("sam");



        System.out.print("\n-----------------------------------------------------------------------\n");
    }


} // end of nodeTest class



