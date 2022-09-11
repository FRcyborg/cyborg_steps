import java.util.*;

public class photoLineups {

    public static void makeLine(){ System.out.print("\n-----------------------------------\n"); }

    public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {

        if ( permList.size() == 0 ) {
            System.out.println(nameList);
            return;
        }

        for (int i=0; i<permList.size(); i++) {
            String tempString = permList(i);

            String temp2 = permList(i) + permList(i+1);
        }



    } // end of printAllPermutations()


    public static void main(String[] args) {

        makeLine();

        printAllPermutations(

        makeLine();

    } // end of main()

} // end of class

/*
// Java program to print all the permutations
// of the given string
public class GFG {

    // Function to print all the permutations of str
    static void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                         str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "abb";
        printPermutn(s, "");
    }
}
*/
