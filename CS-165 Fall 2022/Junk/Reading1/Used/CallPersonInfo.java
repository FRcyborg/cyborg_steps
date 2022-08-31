// ===== Code from file CallPersonInfo.java =====
import java.util.Scanner;

public class CallPersonInfo {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      PersonInfo person1 = new PersonInfo();
      int personsKid;

      personsKid = scnr.nextInt();

      person1.setNumKids(personsKid);

      /* Your solution goes here  */
      System.out.println("Kids: " + person1.getNumKids());
      person1.incNumKids();
      System.out.println("New baby, kids now: " + person1.getNumKids());
    



   }
}
// ===== end =====
