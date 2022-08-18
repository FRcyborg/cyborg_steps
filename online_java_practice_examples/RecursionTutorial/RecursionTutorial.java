/* 
      recursion tutorial from youTube:
      "Recursion in Java Full Tutorial - How to Create Recursive Met5hods" 
      Coding with John -  Nov 1 2021

      SEE NOTE "A" 

      20220817  -  JLF
*/

public class RecursionTutorial {
      public static void main(String[] args) {
            sayHi(3);
      }  // end of main()

      private static void sayHi(int count) {
            System.out.println("Hi!");

            if (count <=1) {
                  return;
            }
            // NOTE "A" !!! this next line actually seems
            // to decriment cout, which is a suprise to me.
            // maybe make it's own program and try this out
            // a few times
            sayHi(count - 1);
      }

}








