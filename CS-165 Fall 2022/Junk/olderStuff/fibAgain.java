/*
   here is the basic fibonacci sequence for your edification:

   JLF  -  20220930
*/


public class fibAgain {

    public static int fibo(int n) {
        
        if (( n == 1 ) || ( n == 0 )) return 1;

        return fibo(n-1) + fibo(n-2);

    } // end of fibo

    public static void main(String[] args) {

        System.out.println("\n-----------------------------------------------------\n");

        for ( int i=0; i<10; i++ ) {
            System.out.println("fib thing => " + fibo(i));
        }

        System.out.println("\n-----------------------------------------------------\n");


    }


} // end of class
