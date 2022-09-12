public class convertCharToInt {

    public static void main(String[] args) {


        String s = "123";
        int asInt;


        System.out.println("String is   => " + s);
        System.out.println("First char  => " + s.charAt(0));
        asInt = ( (int)s.charAt(0) - 49);
        System.out.println("Int of that => " + asInt);

    } // end of main



}
