public class flipString {

    static public void makeLine() { System.out.print("\n-------------------------------------------\n"); }

    // just a little string practice
    static public String shortenString(String n) {
        if ( n.length() < 1 ) return "no";
        System.out.println("A => " + n);
        String n2 = n.substring(1, n.length());
        return shortenString(n2);
    } // end of shortenString()


    static public String flipString(String input) {

        if ( input.equals("")) return "";

        return flipString(input.substring(1)) + input.charAt(0);

    } // end of flipString


    static public void main(String[] args) {


        makeLine();


//        shortenString("abcdefghijklmnopqrstuvwxyz");

        System.out.println();
        System.out.println("abcdefghijklmnopqrstuvwxyz");
        System.out.println(flipString("abcdefghijklmnopqrstuvwxyz"));

        makeLine();

    }  // end of main()


    





} // end of class
