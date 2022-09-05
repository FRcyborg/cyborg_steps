/*
    https://colostate.instructure.com/courses/151661/discussion_topics/1447744

    Module 2: Homework Discussion 1
    Recursion Homework Worksheet #1
    No unread replies.No replies.

    Answer the following questions in the discussion forum.  Once you have done so, 
    respond to at least two people, one of who is the person who posted immediately 
    before you.   If necessary, modify your answers to the agreed upon solution.  
    Your initial answer is worth 50 points, with each response to another student 
    worth 25 points.

    20220904  -  JLF

*/

public class module_2_homework_discussion_1_code {

    // code block 1
    public static int compute1(int i, int j) {
        // base case
        if (i<j) return i;
        // recursion calla
//        System.out.println("i => " + i + "  j => " + j);
        return compute1(i - j, j);
    } 

    // code block 2
    public static int compute2(int value) {
        // base case
        if (value == 0) return 0;
        // compute term
        int term = value;
        // recusive case
        return term + compute2(value - 2);
    }

    // code block 3 
    public static int compute3(int value) {
        // base case
        if (value == 0) return 0;
        // compute term
        int term = value ;
        // recursive case
        return term + compute3(value - 2);
    }

    // code block 4 
    public static double compute4(double d, int n) {
        // base case
        if (n == 0) return 0.0;
        // compute term
        double term = d;
        // recursion call
        return term + compute4(d / 10.0, n - 1);
    }

    // code block 5
    public static String munge(String s) {
        if (s == null || s.length() <= 1)  // base case
            return s;
        else if (s.charAt(0) == s.charAt(1))
            return munge(s.substring(1, s.length()));
        else
            return s.charAt(0) + munge(s.substring(1, s.length()));
    }

    // code block 6
    public static void convert6(int number, int base) {
        int remainder = number % base;
        int quotient = number / base;
        if (quotient > 0) convert6(quotient, base);
        System.out.print(remainder);
    }


    // ***************************************************
    // start of main
    // ***************************************************
    public static void main(String[] args) {
        makeLine();
        int num1; 
        int num2; 
        int num3; 
        double num4;
        String s = "aabbccddeeff";
        
        // block one of code
        num1 = 1234;
        num2 = 5;
        System.out.println("Answer to block 1 => " + compute1(num1, num2));

        // block two of code
        num3 = 10;
        System.out.println("Answer to block 2 => " + compute2(num3));

        // block three of code
        num3 = 9;
//        System.out.println("Answer to block 3 => " + compute2(num3));
        System.out.println("Answer to block 3 => STACK OVERFLOW ERROR");

        // block four of code
        num4 = 100.0;
        num3 = 6;
        System.out.println("Answer to block 4 => " + compute4(num4, num3));

        // block five code
        System.out.println("Answer to block 5 => " + munge(s.substring(1, s.length())));

        // block six code
        num1 = 13;
        num2 = 2;
        System.out.print("Answer to block 6 => ");
        convert6(num1, num2);
        System.out.println();

        makeLine();
    } // end of main


    public static void makeLine() { 
        System.out.print("\n---------------------------------------------\n");
    }


} // end of class

