public class decrementInCall {

    public static int test1(int callVar) {
        return callVar;
    }




    public static void main(String[] args) {

        int a = 10;

        System.out.println("a => " + a);
        System.out.println(test1(a-2));
        System.out.println("a => " + a);







    } // end of main
} // end of class
