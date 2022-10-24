public class practice {

    public static Node head = null;
    public static Node tail = null;

    public class Node {
        String name;
        LinkedQueue.Node next;
        public Node(String name) {
            this.name = name;
        }
        @Override
        public String toString(){
            return name;
        }
    }

    public static void newNode(String name) {

    }
    public static boolean check() {
        return ( head == null );
        }
    }
    //----------------------------------------------------------------------
    public static void makeLine() {
        System.out.print("\n----------------------------------\n");
    }

    //----------------------------------------------------------------------

    public static void main(String[] args) {
        makeLine();
        System.out.println(check());



        makeLine();
    }
}
