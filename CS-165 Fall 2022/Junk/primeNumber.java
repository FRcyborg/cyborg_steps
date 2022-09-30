public class primeNumber {

    public static void makeLine() { System.out.println("\n-------------------------------\n"); }

    public static boolean isPrime(int n) {
        int testMax = (int)(Math.sqrt(n)+1);

        if ( n % 2 == 0 ) return false;
        
        for ( int i=3; i<testMax; i+=2 ) {
            if ( n % i == 0 ) return false;
        }

        return true;
    }


    public static void main(String[] args) {

        int testNum;

        makeLine(); 
        for ( testNum=3; testNum<200; testNum++ ) {
            System.out.println("isPrime(" + testNum + ") => " + isPrime(testNum));
        }
        makeLine(); 
    }

} // end of class
