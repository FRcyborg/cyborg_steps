import java.util.*;

public class part1 {




    public static long combRec(long n, long k) {

        if ( n==k || k==0 ){
            System.out.println("base case");
            if ( n==k ) System.out.println("n==k");
            if ( k==0 ) System.out.println("k==0");
            return 1;
        }
        else return combRec(n-1, k-1) + combRec(n-1, k);
    }






    public static void main(String[] args) {

        System.out.println(combRec(4,2));

    } // end of main()    

} // end of class   
