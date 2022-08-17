/*
    This program shows how to deal with the args in "main(String[] args)"

    To use this you need to include command line arguments at run time:

    $ java commandLineArgumentsExample string1 string2 <enter>

    jlf  -  20220816
*/



class commandLineArgumentsExample {

      public static void makeLine() 
      {
            System.out.println("\n--------------------------------------\n");
      }


      // => String[] <= is an array of strings
      public static void main(String[] args) {

            makeLine();

            for ( String s : args ) 
            {
                  System.out.println("string is => " + s);
            }     

            makeLine();
             
        }

}
