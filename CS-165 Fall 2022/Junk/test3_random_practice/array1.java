import java.util.ArrayList;
import java.util.Iterator;

public class array1 {

    public static void main(String[] args) {
    
        ArrayList<String> list = new ArrayList<>();
        list.add("Andy");
        list.add("Bart");
        list.add("Carl");
        list.add("Doug");
        list.add("Elmo");

        System.out.println(list);

        list.set(list.indexOf("Carl"), "Zoltan");

        System.out.println(list);
        list.add(3, "Oscar");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);

        Iterator iter = list.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());

        while ( String name : list )
            System.out.println(name);



    } // end of main

} // end of class
