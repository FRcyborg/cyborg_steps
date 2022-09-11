import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

   // TODO: Write method to create and output all permutations of the list of names.
   public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
   
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name;
      
      // TODO: Read in a list of names; stop when -1 is read. Then call recursive method.
      do {
         name = scnr.next();
         if ( !name.equals("-1" )) nameList.add(name);
      } while ( !name.equals("-1"));
//      System.out.println(nameList);
   }
}

