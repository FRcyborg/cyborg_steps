/* 
    Random number practice.

    !!! see todo list starting at line 29 below

    20220820  -  JLF

*/

import java.util.Random;

class zeroToNine {

    public static void main ( String[] args ) 
    {
        printNineRandomNumbers();
        arrayOfRandom();

    } // end of main


    // here's a little practice with arrays and random numbers:
    private static void arrayOfRandom()
    {
        int[] theNumbers;
        theNumbers = new int[10];
        int otherNumbers[];
        otherNumbers = new int[15];
        int[] thirdArray = new int[20];

// 1.  todo:  find out how to get array length, it's a property of the object
// 2.  put random numbers in all these arrays and then show them
// 3.  maybe run a statistic analysis to see if we are usably random
// 4.  see about pulling random off that website we have listed somewhere

        System.out.println("hello from arrayOfRandom!");

    } // end of arrayOfRandom()


    private static void printNineRandomNumbers()   // okay, actually prints 10
    {
        
        Random r1 = new Random();  // make an instance of the class
        int upperbound = 10;
        for ( int num1=0; num1<10; num1++ ) {
            System.out.println(r1.nextInt(upperbound));
        }

    } // end of printNineRandomNumbers()



} // end of class zeroToNine
