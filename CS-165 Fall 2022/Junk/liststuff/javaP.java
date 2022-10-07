import java.util.ArrayList;

public class javaP {

      public static void main(String[] args) {

            System.out.println("hello world!");
            ArrayList<String> l1 = new ArrayList<>();


            l1.add("some");
            l1.add("other");
            l1.add("either");
            l1.add("or");
            l1.add("not");

            System.out.println(l1.toString());
            System.out.println(l1);
            System.out.println("contains => " + l1.contains("some"));

            l1.remove("or");
            System.out.println(l1);
            l1.add(0,"not");
            System.out.println(l1);
            System.out.println("last => " + l1.lastIndexOf("not"));


      } // end of main


}// end of class
