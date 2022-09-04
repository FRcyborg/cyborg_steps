/*
    This program shows the difference between i++ and ++i.  There doesn't seem to be any
    difference in for loops.  It mattered in print out, though.

    20220903  -  JLF
*/
public class prePostIncrement {
    public static void main(String[] args) {

    System.out.print("\n---------------------------------------------------------------\n");

    for ( int i=0; i<10; ++i ) {
        System.out.print("  i => " + i);
    }

    System.out.print("\n---------------------------------------------------------------\n");

    for ( int i=0; i<10; i++ ) {
        System.out.print("  i => " + i);
    }

    System.out.print("\n---------------------------------------------------------------\n");

    int x = 5;
    System.out.println("print out x++ => " + x++);
    x = 5;
    System.out.println("print out ++x => " + ++x);


    System.out.print("\n---------------------------------------------------------------\n");

    } // end of main
} // end of class
