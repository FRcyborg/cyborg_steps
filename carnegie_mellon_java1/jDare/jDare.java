class jDare {


      public static void makeLine() 
      {
            System.out.println("\n--------------------------------------\n");
      }


      public static int someThing(int i) {
      
            for ( int x=0; x<10; x++) 
            {
                  System.out.println("x is now => " + x);
            }
            
            return i * i;
      }     

      // => String[] <= is an array of strings
      public static void main(String[] args) {

            for ( String s : args ) 
            {
                  System.out.println("string is => " + s);
            }     



      
            makeLine();
             
            System.out.println("did something happen?");

            makeLine();
             
}

}
