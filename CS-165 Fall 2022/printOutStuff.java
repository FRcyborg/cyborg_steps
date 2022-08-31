public class printOutStuff {

    public static void main(String[] args) {

        int i = 0;

        makeLine();

        System.out.println("true || false && true => " + ( true || false && true ));

        makeLine();

        
        System.out.println("Now for Sizes of Things:");

        sizesOfThings();

        makeLine();

        TrueFalse();
        makeLine();

    }  // end of main


    private static void sizesOfThings() 
    {
        System.out.println("Size of Byte:       " + (Byte.SIZE/8) + " bytes.");
        System.out.println("Size of Short:      " + (Short.SIZE/8) + " bytes.");
        System.out.println("Size of Int:        " + (Integer.SIZE/8) + " bytes.");
        System.out.println("Size of long:       " + (Long.SIZE/8) + " bytes.");
        System.out.println("Size of Character:  " + (Character.SIZE/8) + " bytes.");
        System.out.println("Size of Float:      " + (Float.SIZE/8) + " bytes.");
        System.out.println("Size of Double:     " + (Double.SIZE/8) + " bytes.");

    }

   public static void TrueFalse( )
   {
      // create truth table for && (conditional AND) operator
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Conditional AND (&&)", "false && false", ( false && false ),
         "false && true", ( false && true ), 
         "true && false", ( true && false ),
         "true && true", ( true && true ) );

      // create truth table for || (conditional OR) operator
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Conditional OR (||)", "false || false", ( false || false ),
         "false || true", ( false || true ),
         "true || false", ( true || false ),
         "true || true", ( true || true ) );

      // create truth table for & (boolean logical AND) operator
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical AND (&)", "false & false", ( false & false ),
         "false & true", ( false & true ),
         "true & false", ( true & false ),
         "true & true", ( true & true ) );

      // create truth table for | (boolean logical inclusive OR) operator
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical inclusive OR (|)",
         "false | false", ( false | false ),
         "false | true", ( false | true ),
         "true | false", ( true | false ),
         "true | true", ( true | true ) );

      // create truth table for ^ (boolean logical exclusive OR) operator
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical exclusive OR (^)", 
         "false ^ false", ( false ^ false ),
         "false ^ true", ( false ^ true ),
         "true ^ false", ( true ^ false ),
         "true ^ true", ( true ^ true ) );

      // create truth table for ! (logical negation) operator
      System.out.printf( "%s\n%s: %b\n%s: %b\n", "Logical NOT (!)",
         "!false", ( !false ), "!true", ( !true ) );
   }




    private static void makeLine() { System.out.print("\n--------------------------------------------\n"); }


}  // end of class CS1review
