public class junk {

      private int someInt;

      public void setInt(int n) {
            someInt = n;
      } 

      public int getInt() {
            return this.someInt;
      }

      public static void makeLine() { 
            System.out.println("\n-------------------------------------\n");
      }

      public static void main( String[] args) {
      
            makeLine();
            
            setInt(4);            
            System.out.println("getInt => " + getInt());

            makeLine();

      } // end of main
} // end of class
