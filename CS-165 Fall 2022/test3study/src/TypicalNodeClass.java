public class TypicalNodeClass {
    private int item;
    private TypicalNodeClass next;

    // one variable constructor
    public TypicalNodeClass(int item) {
        this.item = item;
        this.next = null;
    }

    // two variable constructor
    public TypicalNodeClass(int item, TypicalNodeClass next) {
        this.item = item;
        this.next = next;
    }

    public TypicalNodeClass getNext() {
        return next;
    }

    public void setNext(TypicalNodeClass next) {
        this.next = next;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

} // end of class
