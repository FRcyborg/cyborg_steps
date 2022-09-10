/*
    This is recursion practice.  We are going to figure this out one way or the other.

    20220910  -  JLF
*/

class sumUp {

    public static void makeLine() { System.out.print("\n-----------------------------------------\n"); }

    public static int timesUp(int n) {
        
        if ( n <= 1 ) return 1;

        return n * timesUp(n-1);

    } // end of timesUp


    public static int addUp(int n) {
        
        if ( n <= 1 ) return 1;

        return n + addUp(n-1);

    } // end of addUp


    public static void main(String[] args) {

//        int workingNumber = 5;
        int workingNumber = 10;

        makeLine();

//        System.out.println("the thing => " + addUp(workingNumber));
        System.out.println("the thing => " + timesUp(workingNumber));


        makeLine();

    } // end of main

}  // end of class
