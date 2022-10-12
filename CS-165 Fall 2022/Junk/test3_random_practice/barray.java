import java.util.ArrayList;
import java.util.Iterator;

public class barray {

    public static void main(String[] args) {
    
        ArrayList<String> list = new ArrayList<>();

        list.add("Andy");
        list.add("Bart");
        list.add("Carl");
        list.add("Doug");
        list.add("Elmo");

        System.out.println(list);

//        while ( String name : list ) {
//            System.out.println(name);
//        }

        for ( String name : list ) 
            System.out.println(name);



    } // end of main

} // end of class
