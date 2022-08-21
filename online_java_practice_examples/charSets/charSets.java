/*
      This program displays ASCII characters of various ranges.  We are trying to
      find those build-a-box characters that were all the rage before computer
      screens could do graphics.

      20220820  -  JLF
*/

class charSets {


    // ------------------------------------------------------------------------------

    public static void main( String[] args ) 
    {

        makeLine();

        showRegularASCII_chars();

        // this next one shows to much so leave it commented out
        // until you need all that
        // showOtherASCII_chars();

        showSomeASCII_chars();

        makeLine();


    } // end of main

    // ------------------------------------------------------------------------------

    private static void makeLine() 
    {
        System.out.println("\n******************************************\n");

    }


    // ------------------------------------------------------------------------------
    
    private static void showRegularASCII_chars() 
    {
        for ( int i=33; i<128; i++ )
        {
            System.out.println("char(" + i + ") => " + (char)i);
        }
    } 

    // ------------------------------------------------------------------------------
    
    private static void showSomeASCII_chars() 
    {
        for ( int i=5000; i<6000; i++ )
        {
            System.out.print(" " + (char)i);
        }
    } 



    // ------------------------------------------------------------------------------
    // This shows waaaay to many chars.  I suspect these are Apple specific.
      // I wonder how we find out...    
    private static void showOtherASCII_chars() 
    {
        for ( int i=129; i<20000; i++ )
        {
            System.out.print(" " + (char)i );
        }
    } 




    // ------------------------------------------------------------------------------
    // ------------------------------------------------------------------------------





}  // end of class
