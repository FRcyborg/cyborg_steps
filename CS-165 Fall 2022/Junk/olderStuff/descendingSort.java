public class descendingSort {



    public static void main(String[] args) {

        int[] workingArray = new int[10];

        int numberOfElements = 4;
        int largestNumIndex = 0;

        // example numbers
        workingArray[0] = 20;
        workingArray[1] = 10;
        workingArray[2] = 30;
        workingArray[3] = 40;



        makeLine();

        int tempNumber;
        int x = 0; 

        for ( x=0; x<numberOfElements-1; x++ ) {

            largestNumIndex = x;


            for ( int i=x; i<numberOfElements; i++ ) {
                if ( workingArray[i] > workingArray[largestNumIndex] ) 
                {
                    largestNumIndex = i;
                }
            }
        if ( largestNumIndex != x ) 
        {
            tempNumber = workingArray[x];
            workingArray[x] = workingArray[largestNumIndex];
            workingArray[largestNumIndex] = tempNumber;
        }


        // display workingArray
        for ( int j=0; j<numberOfElements; j++ ) {
            System.out.print(workingArray[j] + " ");
        } 
        System.out.println();

        } // end of x=0...

        makeLine();


    } // end of main


        public static void makeLine() { 
            System.out.print("\n------------------------------------------\n"); 
        }
} // end of class
