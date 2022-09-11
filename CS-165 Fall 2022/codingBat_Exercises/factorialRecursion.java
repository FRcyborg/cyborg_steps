/*
   CodingBat.com exercises: Recursion-1 > factorial

   20220910  -  JLF

*/

class factorialRecursion {

    public static void makeLine() { System.out.print("\n------------------------\n"); }


    // --------------------------------------------------------------
    // this is the part that matters for this exercise:
    public static int factorial(int n) {

        // this handles the base case:  
        if ( n==1 ) return n;

        // this does the recusion part:
        return n*factorial(n-1);

    } // end of factorial
    // --------------------------------------------------------------


    public static void main(String[] args) {

        int aNumber = 5;

        makeLine();

        System.out.println(factorial(aNumber));

        makeLine();

    } // end of main
} // end of class
