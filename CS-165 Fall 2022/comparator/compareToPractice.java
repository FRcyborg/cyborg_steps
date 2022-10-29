/*
        compareTo practice, trying to get a feel for how this method works

        #compareTo

        20221027  -  JLF
*/
public class compareToPractice {

    public static void makeLine() {
        System.out.print("\n-------------------------------------------------------------\n");
    } 


    public static void main(String[] args) {

        Integer[] arr1 = new Integer[10];
        makeLine();

        for ( int i=3; i<13; i++ ) {
            arr1[i-3] = i*i;
        }

       System.out.println("Hello World!");  

       System.out.print("arr1 => ");
        for ( int i=0; i<10; i++ ) {
            System.out.print("  " + arr1[i] + "[" + i + "]");  
        }

        System.out.println();

        System.out.println("if the first object is smaller => " + arr1[3].compareTo(arr1[5]));
        System.out.println("if the first object is bigger  => " + arr1[5].compareTo(arr1[3]));
        System.out.println("if the objects are the same    => " + arr1[5].compareTo(arr1[5]));

        makeLine();




    } // end of main()

}  // end of class
