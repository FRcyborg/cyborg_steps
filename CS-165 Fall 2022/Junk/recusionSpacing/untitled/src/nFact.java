public class nFact {
    public static int factorial(int N) {
        if ( N <= 1 ) {
            return 1;
        } else {
            return N * factorial(N-1);
        }
    }

    // this didn't work, no time now to look at it
    public static void normal(int N) {
        for (int i=0; i<N; i++) {
            System.out.println("other factorial of " + i + " => " + N*i);
        }

    }


    public static void main(String[] args) {
        for ( int N=0; N<10; N++){
            System.out.println("factorial of " + N + " is => " + factorial(N));
        }
        int N = 10;
        normal(N);
    }
}
