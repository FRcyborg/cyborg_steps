public class fibdebug {

    public static int fib(int n, String indentAmount ) {

//        System.out.print(indentAmount);
        System.out.print(" ");
        if ( n<=1 ) return n;
        return fib(n-1, indentAmount + "   ") + fib(n-2, indentAmount + "   ");


    } // end of fib()


    public static void main(String[] args) {

        String indentAmount = "   ";

        for ( int i=0; i<10; i++ ) {
            System.out.println(indentAmount + "the " + i + " fib# => " + fib(i, indentAmount));
        }


    } // end of main
}

