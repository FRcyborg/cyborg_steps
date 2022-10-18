import java.util.*;

/*
Assume that an ArrayList of String objects named arr has been 
declared, initialized and is filled with strings. arr.add(1,"ABC"); 
would add "ABC" at the first index (counting from zero) of arr.
  True
  False


TODO: ?how did that <= happen?  anyway, check the question vs mark-wrong-answer on this quiz

then put a populated array in and try it again.

*/

public class Question4 {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        System.out.println("=> " + arr + " <=");

        arr.add(1,"ABC");

        System.out.println("=> " + arr + " <=");

    } // end of main
} // end of class 

