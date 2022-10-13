import java.util.ArrayList;

public class aPrac {

    public static void main(String[] args) {

        ArrayList<String> theList = new ArrayList<>();

        theList.add("bob");
        theList.add("alice");
        theList.add("stan");

        System.out.println("theList => " + theList);
        
        
        System.out.println("add emma");
        theList.add("emma");
        System.out.println("theList => " + theList);

        
        System.out.println("theList[0] => " + theList.get(0));
        System.out.println("theList.size() => " + theList.size());

        System.out.println("theList[theList.size()] => " + theList.get(theList.size()-1));
        System.out.println();

    } // end of main


}
