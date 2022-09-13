public class callA {

    static public void makeLine() { System.out.print("\n-------------------------------------------\n"); }

    static public int A(int n) {

        if ( n == 0 ) return 1;

        System.out.println("A => " + n);

        return A(n-1);


    } // end of A()


    static public void main(String[] args) {


        makeLine();

        A(5);


        makeLine();

    }  // end of main()


    





} // end of class
