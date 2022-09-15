/*
    this was a question on the quiz that had the wrong answer to pick
    from.  It asked for the output but gave 0, 1, 2, 3 as possible answers.
    Ran this just to make sure the answer is 5.

    20220914  -  JLF
*/

public class quizQ {

    public static long func2(int n) {
        if (n==1) return 1;
        if (n==0) return 0;
        return func2(n-1) + func2(n-2);
    } // end of func2

    
   public static void makeLine() { System.out.print("\n---------------------------\n"); }

   public static void main(String[] args) {

        makeLine();

        for ( int i=0; i<10; i++) {
            System.out.println("func2(" + i + ") =>  " + func2(i));
        }


        makeLine();

    } // end of main()    

} // end of class
