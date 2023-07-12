/*
    CS165 Node BSTInsert #binary #search #tree 
    #20221201
    CSU 
    program

*/

class BSTInsert {

    public class Node {
        public String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.node = null;
        }

        public void setNextNode(Node node) {
            this.next = node;
        }

        public Node getNextNode() {
            return this.next;
        }

    } // end of class Node

    // next method copied from zyBooks
    BSTInsert(tree, node) {
       if (tree⇢root is null) {
          tree⇢root = node
       }
       else {
          currentNode = tree⇢root
          while (currentNode is not null) {
             if (node⇢key < currentNode⇢key) {
                if (currentNode⇢left is null) {
                   currentNode⇢left = node
                   currentNode = null
                }
                else {
                   currentNode = currentNode⇢left
                }
             }
             else {
                if (currentNode⇢right is null) {
                   currentNode⇢right = node
                   currentNode = null
                }
                else {
                   currentNode = currentNode⇢right
                }
             }
          }
       }
    }
    // *********** end of BSTInsert()


    public static void main(String[] args) {

        System.out.println("hello world");

    } // end of main() 
        
} // end of class


