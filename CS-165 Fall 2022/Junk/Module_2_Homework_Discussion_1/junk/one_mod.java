public class one_mod {

    public static int compute(int i, int j) {
        // base case
        if (i<j) return i;
        // recursion calla
        System.out.println("i => " + i + "  j => " + j);
        return compute(i - j, j);
    } 

    public static void showNumbers(int i, int j) {
        System.out.println("i => " + i + "  j => " + j);
    }

    public static void main(String[] args) {
        makeLine(); 
        
        int num1 = 0;
        int num2 = 0;

        showNumbers(num1, num2);

        System.out.println(compute(num1, num2));

        showNumbers(num1, num2);



        makeLine(); 
    } // end of main

    public static void makeLine() { System.out.print("\n-----------------------------------\n"); }
} // end of class
