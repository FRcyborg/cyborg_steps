import java.util.Scanner;
import java.util.ArrayList;

public class scanner_example {

    public static void makeLine() { System.out.println("\n------------------------------------------\n"); }

    public static void readInOneWord() {

        Scanner scnr = new Scanner(System.in);
        String wordThing;

        
        System.out.println("Give me a word: ");
        wordThing = scnr.next();
        System.out.println(wordThing);
    } // end of readInOneWord() 


    public static void readInManyWords() {

        Scanner scanTool = new Scanner(System.in);
        ArrayList<String> wordsArray = new ArrayList<String>();
        String tempWord;
        do {
            tempWord = scanTool.next();
            if ( !tempWord.equals("-1")) wordsArray.add(tempWord);
        }
        while ( !tempWord.equals("-1") );

        System.out.println(wordsArray);
    
    } // end of readInManyWords


    public static void main(String[] args) {
       
        makeLine();

//        readInOneWord();

        readInManyWords();        

        makeLine();

    } // end of main

} // end of class   
