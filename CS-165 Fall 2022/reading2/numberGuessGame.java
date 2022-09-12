import java.util.Scanner;

public class numberGuessGame {

    public static void guessNumber(int lowVal, int highVal, Scanner scnr) {
        int midVal;
        char userAnswer;

        midVal = ( highVal + lowVal) / 2;

        System.out.print("is it " + midVal + "? (l/h/y): ");
        userAnswer = scnr.next().charAt(0);

        if ((userAnswer != 'l') && (userAnswer != 'h')) {
            System.out.println("Thank you!");
        } else {
            if (userAnswer =='l') {
                guessNumber(lowVal, midVal, scnr);
            } else {
                guessNumber(midVal + 1, highVal, scnr);
            }
        }
        return;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Choose a number from 0 to 100.");
        System.out.println("Answer with:");
        System.out.println("    l (your num is lower)");
        System.out.println("    h (your num is higher)");
        System.out.println("    any other key (guess is right).");

        guessNumber(0, 100, scnr);

        return;
        
    } // end of main

} // end of class
