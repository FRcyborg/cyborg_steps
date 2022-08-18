class argsPractice {

      public static void some1() {
      
            // print out ten numbers
            for (int x=0; x<10; x++) {
                  System.out.println("x => " + x);
            }

      }

      public static void makeLine()
      {
            System.out.println("\n********************************************\n");
      }



      
      public static void main(String[] args) {

            for ( String s : args ) {
                  System.out.println(s);
            }
      
      makeLine();

      some1();

      makeLine();

      } // end of main



}
