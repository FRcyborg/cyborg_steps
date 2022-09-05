public class test1 {

    public static int compute(int i, int j) {
        // base case
        if (i<j) return i;
        // recursion calla
        return compute(i - j, j);
    } 

    public static int minus(int i, int j) {
        while ( i > 5 ) {
            i = i - j;
        }

        System.out.println("i => " + i + "  j => " + j);

        return 0;
    }

    public static void main(String[] args) {
        int i = 1234;
        int j = 5;

        System.out.println(compute(i, j));

        minus(i, j);

    } // end of main

} // end of class
