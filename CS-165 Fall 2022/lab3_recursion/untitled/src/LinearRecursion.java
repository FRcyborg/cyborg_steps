/*
   3.13 Lab 3 - Review Linear Recursion
        Module 2: Lab 3 - Review Linear Recursion

    see end of this program for the lab instructions

    20220905 -- JLF
 */

/**
 * Recitation created by Toby Patterson, 5/22/2020
 * For CS165 at CSU
 * With the help of https://www.cs.colostate.edu/~cs165/.Spring20/recitations/L6/doc/
 *
 * NOTE: All methods should be implemented recursively, no iteration allowed!
 */

public class LinearRecursion {

    /**
     * params: integer n
     * return: n! or n * (n - 1) * (n - 2) * ... * 1
     * TODO: implement this method
     */
    public static int factorial (int n) {
        int testNum = n;

        while (testNum>0) {
            
        }
        return 0;
    }

    /**
     * params: integer n
     * return: n + (n - 1) + (n - 2) + ... + 1
     * TODO: implement this method
     */
    public static int sum(int n) {
        return 0;
    }

    /**
     * Recursively return the sum of the harmonic series.
     * params: n a positive number.
     * return: the sum 1 + 1/2 + 1/3 + ... + 1/(n-1) + 1/n
     */
    public static double harmonicSum(int n) {
        return 0;
    }

    /**
     * Recursively return the sum of the geometric series.
     * params: n a non-negative number.
     * return: the sum 1 + 1/2 + 1/4 + 1/8 + ... + 1/Math.pow(2,n)
     */
    public static double geometricSum(int n){
        return 0;
    }

    public static void main(String args[]) {
        // Test code, uncomment each block as you write the functions
        /*
        System.out.println("Testing the factorial method");
        System.out.printf("factorial(4) should be 24 -> %d\n", factorial(4));
        System.out.printf("factorial(6) should be 720 -> %d\n", factorial(6));
        System.out.printf("factorial(0) should be 1 -> %d\n", factorial(0));
        System.out.println();

        System.out.println("Testing the summation method");
        System.out.printf("sum(4) should be 10 -> %d\n", sum(4));
        System.out.printf("sum(10) should be 55 -> %d\n", sum(10));
        System.out.printf("sum(0) should be 0 -> %d\n", sum(0));

        System.out.println("Testing out the harmonicSum method");
        System.out.printf("harmonicSum(0) should be 0.0000 -> %.4f\n", harmonicSum(0));
        System.out.printf("harmonicSum(7) should be 2.5929 -> %.4f\n", harmonicSum(7));
        System.out.printf("harmonicSum(8) should be 2.7179 -> %.4f\n", harmonicSum(8));
        System.out.printf("harmonicSum(13) should be 3.1801 -> %.4f\n", harmonicSum(13));
        System.out.printf("harmonicSum(24) should be 3.7760 -> %.4f\n", harmonicSum(24));
        System.out.println();

        System.out.println("Testing out the geometricSum method");
        System.out.printf("geometricSum(0) should be 1.0000 -> %.4f\n", geometricSum(0));
        System.out.printf("geometricSum(1) should be 1.5000 -> %.4f\n", geometricSum(1));
        System.out.printf("geometricSum(2) should be 1.7500 -> %.4f\n", geometricSum(2));
        System.out.printf("geometricSum(7) should be 1.9922 -> %.4f\n", geometricSum(7));
        System.out.printf("geometricSum(24) should be 2.0000 -> %.4f\n", geometricSum(24));
        System.out.println();

         */
    }
}






/*
3.13 Lab 3 - Review Linear Recursion
        Module 2: Lab 3 - Review Linear Recursion
        Linear Recursion

        This lab is made to help you review/learn basic recursion. The next lab will get
        a little trickier as you move from
        linear to branching recursion.
        What is recursion?

        Linear recursion is when a function calls itself without branching out into
        multiple function calls. A good example of this would be a factorial function, LaTeX
        : f\left(n\right)\:=\:n!

        Why is factorial linear in a recursive sense? Lets take f(5), for example. To compute
        this we need to do:  LaTeX: 1\cdot2\cdot3\cdot4\cdot5=120

        In other words we are doing LaTeX: f\left(4\right)\cdot5 or LaTeX: f\left(3\right
        )\cdot4\cdot5 and so on until we get to LaTeX: f\left(0\right), which is considered to be the base case.

        This function will only have one recursive call to itself, meaning if you draw out
        the stack trace each call will point to another in a linear fashion.

        This displays two important definitions: the recursive call and the base case.

        A recursive call is when a function in code calls itself, and the base case is a
        condition in which causes the function to eventually terminate. Without a base case
        , a recursive function will go indefinitely until you get what is called
        a stack overflow (too many recursive calls for the stack to handle). Java will throw
        a runtime error if you create a recursive function which overflows.
        Lab Assignment

        The best way to get an idea of how recursion works is to practice. In the code given
        to you, complete the unfinished methods and run them with the given test cases.

        The following .java files are included in this lab:
        L3
        ├── LinearRecursion.java

        Download starter jar L3.jar to work on the lab in another environment.
        The Factorial Method

        The first method we are going to modify is the Factorial Method.

        TO DO:
        1. Write this method so that it returns the factorial for any input integer n .
        n! is n * (n - 1) * (n - 2) * ... * 1.
        The Summation Method

        The next method we are going to modify is the Summation Method. This method is similar
        to factorial but instead of multiplying each element you will add them together.

        TO DO:
        1. Write this method so that when you input an integer n the method will return n + (n - 1) + (n - 2) + ... + 1.
        The Harmonic Summation Method

        The Harmonic Summation will return the sum of the harmonic series.

        TO DO:
        1. Set up this method so that when you input an integer n the method will return
        the sum of 1 + 1/2 + 1/3 + ... + 1/(n-1) + 1/n.
        The Geometric Summation Method

        The Geometric Summation will return the sum of the geometric series.

        TO DO:
        1. Set up this method so that when you input an integer n the method will return
        the sum of the sum 1 + 1/2 + 1/4 + 1/8 + ... + 1/Math.pow(2,n),

        To understand how these methods are exhibiting linear recursion, draw out the stack
        trace for a reasonable n value like 4. Here's an example of this for factorial for n = 5:

        factorial_stack_trace.png

        If you've implemented everything correctly your output should look like this:

        Testing the factorial method
        factorial(4) should be 24 -> 24
        factorial(6) should be 720 -> 720
        factorial(0) should be 1 -> 1

        Testing the summation method
        sum(4) should be 10 -> 10
        sum(10) should be 55 -> 55
        sum(0) should be 0 -> 0

        Testing out the harmonicSum method
        harmonicSum(0) should be 0.0000 -> 0.0000
        harmonicSum(7) should be 2.5929 -> 2.5929
        harmonicSum(8) should be 2.7179 -> 2.7179
        harmonicSum(13) should be 3.1801 -> 3.1801
        harmonicSum(24) should be 3.7760 -> 3.7760

        Testing out the geometricSum method
        geometricSum(0) should be 1.0000 -> 1.0000
        geometricSum(1) should be 1.5000 -> 1.5000
        geometricSum(2) should be 1.7500 -> 1.7500
        geometricSum(7) should be 1.9922 -> 1.9922
        geometricSum(24) should be 2.0000 -> 2.0000

*/