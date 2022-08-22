class takeOverScreen {

      public static void main( String[] args) 
      {
            makeLine();
            
            clearTheScreen();

            System.out.println("so far so good");

            makeLine();

      } // end of main


      private static void makeLine()
      {
            System.out.println("\n*********************************************\n");
      }

      private static void clearTheScreen()
      {
            for ( int i=0; i<20; i++ ) 
            {
                  System.out.println();
            }

      }

} 
