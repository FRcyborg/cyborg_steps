import java.util.ArrayList;

public class indexOf {

    public static void main(String[] args) {
    
        ArrayList<Integer> theList = new ArrayList<>(20);

        System.out.println("\n-----------------------------------------------\n");
        for ( int i=0; i<10; i++ ) theList.add(i);
        System.out.println("theList.size() => " + theList.size());

        System.out.print(theList);
        System.out.println();

        System.out.println("indexOf 5 => " + theList.indexOf(5));
        System.out.println("remove some stuff");
        theList.remove(5);
        theList.remove(5);
        System.out.print(theList);
        System.out.println();

        System.out.println("contains 5  => " + theList.contains(5));
        System.out.println("contains 7  => " + theList.contains(7));
        System.out.println("indexOf 5   => " + theList.indexOf(5));

        System.out.print(theList);
        System.out.println();
        System.out.println("theList.size() => " + theList.size());

        System.out.println("\n-----------------------------------------------\n");
    } // end of main






} // end of class   
