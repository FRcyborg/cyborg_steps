public class functionEqual {

    public static int g(int x) {
        
        int answer = ((int)Math.pow(x+1, 2) - 2*x);
        return answer;

    } // end of g()

    public static int f(int x) {
        
        int answer = (int)Math.pow(x, 2) + 1;
        return answer;

    } // end of f()

    


    public static void main(String[] args) {

        System.out.println("\n\nfunctions are fun!\n\n");

        for ( int i = -5; i<6; i++ ) {        
            System.out.println("function f(x) => " + f(i));
            System.out.println("function g(x) => " + g(i));
            System.out.println();
        }





    } // end of main

} // end of class

