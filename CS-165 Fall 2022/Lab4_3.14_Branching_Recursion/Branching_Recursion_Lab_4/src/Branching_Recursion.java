public class Branching_Recursion {

    public static void makeLine() {
        System.out.println("\n-------------------------------------------------\n");
    }

    // 1. The Fibonacci Method
    public static int fibonacci(int n) {
        if ( n <= 1 ) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // 2. The Multiplication Method
    /*
    TO DO:
            1. Write a multiplication method recursively using repeated addition.
    Do not use the multiplication operator or a loop.
    */
    public static int mult(int j, int k){
        boolean isNeg = false;
        if ( k == 0 ) return 0;
        // find out what the final sign is going to be
        if (( k < 0 ) && ( j >= 0 )) isNeg = true;
        if (( j < 0 ) && ( k >= 0 )) isNeg = true;
        // make the numbers positive
        if ( k < 0 ) k = k * ( -1 );
        if ( j < 0 ) j = j * ( -1 );
        // make j the right sign
        if ( isNeg ) j = j * ( -1 );

        return j + mult(j, k-1);
    }
    /*
    3. The Exponent Method
    TO DO:
            1. Write a method that computes j^k.
    Do not use Math.pow() or a loop.
    */
    public static int expt(int j, int k){
        if ( k == 0 ) return 1;
        return j * expt(j, k-1);
    }

    /*
    4. The isPalindrome Method
    TO DO:
    1. Write a method that checks to see if a word is a palindrome. This should be case-independent.
     */
    public static boolean isPalindrome(String word) {

        word = word.toLowerCase();
        if ( word.length() <=1 ) return true;
        return ( word.charAt(0) == word.charAt(word.length()-1) );

    }

   /*
   5. The Longest Word Length Method
    TO DO:
    1. Write a method that returns length of the longest word in the given String using recursion (no loops).

    Hint: a Scanner may be helpful for finding word boundaries. After delimiting by space, use the following
    method on your String to remove punctuation .replaceAll("[^a-zA-Z]", "") If you use a Scanner, you will
    need a helper method to do the recursion on the Scanner object.
    */
   public static int longestWordLength(String words){
       return 0;
   }


    public static void main(String[] args) {

        makeLine();
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("Aibohphobia"));
        System.out.println(isPalindrome("noon"));
        System.out.println(isPalindrome("Recursion"));

//        System.out.println(fibonacci(8));
/*
        System.out.println(mult(8,2));
        System.out.println(mult(2,8));
        System.out.println(mult(-2,-8));
        System.out.println(mult(4,-3));
        System.out.println(mult(-3,4));
*/



        makeLine();
    }
}