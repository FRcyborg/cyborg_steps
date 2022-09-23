public class junk3 {

      private int someInt;

      public void setInt(int n) {
            //this.someInt = n;
            someInt = n;
      }

      public int getInt() {
            return someInt;
      }


      public static void main(String[] args) {
            
//            junk3 j = new junk3();

            System.out.print("\n--------------------------------\n");

            setInt(5);
//            j.setInt(5);

            System.out.println("getInt() => " + getInt());
//            System.out.println("getInt() => " + j.getInt());

            System.out.print("\n--------------------------------\n");

      } // end of main()

} // end of class
