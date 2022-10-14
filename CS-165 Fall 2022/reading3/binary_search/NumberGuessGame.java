import java.util.Scanner;

public class NumberGuessGame {


    public static void guessNumber(int lowVal, int highVal, Scanner scnr) {
        int midVal;
        char userAnswer;

        midVal = (highVal + lowVal) / 2;

        System.out.print("Is it " + midVal + "? (l/h/y): ");
        userAnswer = scnr.next().charAt(0);

        if ((userAnswer != 'l') && (userAnswer != 'h')) {
            System.out.println("Thank you!");
        }
        else {
            if (userAnswer == 'l') {
                guessNumber(lowVal, midVal, scnr);
            }
            else { 
                guessNumber(midVal+1, highVal, scnr);
            }
        }
    } // end of guessNumber()

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Choose a number from 0 to 100.");
        System.out.println("Anser with:");
        System.out.println("    l (your num is lower)");
        System.out.println("    h (your num is higher)");
        System.out.println("    any other key (guess is right).");

        guessNumber(0, 100, scnr);
    } // end of main

} // end of class
