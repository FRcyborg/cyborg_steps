public class primeNumber {

    // -----------------------------------------------------------------------


    public static void makeLine() { System.out.println("\n-------------------------------\n"); }

    // -----------------------------------------------------------------------

    public static boolean isPrime(int n) {
        int testMax = (int)(Math.sqrt(n)+1);

        if ( n % 2 == 0 ) return false;
        
        for ( int i=3; i<testMax; i+=2 ) {
            if ( n % i == 0 ) return false;
        }

        return true;
    }
    
    // -----------------------------------------------------------------------

    public static int isPrimeRec(int testVal, int divVal) {

        // return 1 is the statement of prime-ness
        if ( testVal == 1 || testVal == 2 || testVal == 3 ) return 1;
        if ( testVal % 2 == 0 ) return 0;
        int divider = testVal - ( divVal-2 );
        if ( testVal%divider == 0 ) return 0;
        else isPrimeRec(testVal, divVal-2);
        
        return 1;
        
       }

    // -----------------------------------------------------------------------

    public static void main(String[] args) {

        int testNum;

        makeLine(); 
        System.out.println("recusive prime thing");
        for ( testNum=1; testNum<=15; testNum++ ) {
            if ( isPrimeRec(testNum, testNum-1) == 1 ) {
            System.out.println("isPrimeRec(" + testNum + ") => is prime");
            }
        }

        /*
        makeLine(); 
        System.out.println("regular prime thing");
        for ( testNum=3; testNum<=15; testNum++ ) {
            System.out.println("isPrime(" + testNum + ") => " + isPrime(testNum));
        }
        */
        makeLine(); 
        System.out.println("9%1 => " + 9%1);
    }

} // end of class
