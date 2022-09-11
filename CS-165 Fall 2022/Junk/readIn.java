import java.util.Scanner;
import java.util.ArrayList;

public class readIn {

    public static void main(String[] args) {

       Scanner scnr = new Scanner(System.in);
       ArrayList<String> words = new ArrayList<String>();
       String tempWord;

       do {

           tempWord = scnr.next();
           if ( !tempWord.equals("-1")) words.add(tempWord);

       } while ( !tempWord.equals("-1"));

                
        System.out.println("words => " + words);

    } // end of main






}  // end of class
