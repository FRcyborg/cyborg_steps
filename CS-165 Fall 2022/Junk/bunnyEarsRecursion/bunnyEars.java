public class bunnyEars {
    
    public static int bunnyEars(int bunnies) {

        if ( bunnies == 0 ) return 0;
        return 2 + bunnyEars(bunnies-1);

    } // end of bunnyEars


    public static void main(String[] args) {

        System.out.print("\n-----------------------------------\n");
        for ( int i=0; i<11; i++ ) {
            System.out.println("bunnyEars(" + i + ") => " + bunnyEars(i));
        }
        System.out.print("\n-----------------------------------\n");

    } // end of main

} // end of class
