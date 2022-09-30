// import Math;


public class isPrime {
    // Returns 0 if value is not prime, 1 if value is prime
    public static int isPrime(int testVal, int divVal) {
        // Base case 1: 0 and 1 are not prime, testVal is not prime
        if ( testVal == 1 ) return 0;
        if ( testVal == 0 ) return 0;

        // Base case 2: testVal only divisible by 1, testVal is prime
        if ( testVal % divVal == 0 ) {
            return 0;
        } else {
            isPrime(testVal, divVal -1 );
        }

        // Recursive Case
        // Check if testVal can be evenly divided by divVal
        // Hint: use the % operator
        return isPrime(testVal, divVal-1);

        // If not, recursive call to isPrime with testVal and (divVal - 1)

    }
    public static Boolean isPrimeOld(int n) {
        int testMax = (int)(Math.sqrt(n)+1);
        if ( n==1 || n==2 ) return true;
        if ( n%2 == 0 ) return false;
        for ( int i=3; i<testMax; i+=2 ) if ( n%i == 0 ) return false;
        return true;
    }



    public static void main(String[] args) {
        int primeCheckVal;     // Value checked for prime

        // Check primes for values 1 to 10
        for (primeCheckVal = 1; primeCheckVal <= 10; ++primeCheckVal) {
            if (isPrime(primeCheckVal, (primeCheckVal - 1)) == 1) {
                System.out.println(primeCheckVal + " is prime.");
            }
            else {
                System.out.println(primeCheckVal + " is not prime.");
            }
        }
        for ( int i=0; i<=primeCheckVal; i++ ) {
            System.out.println("is " + i + " a prime number => " + isPrimeOld(i));
        }
    }
}
