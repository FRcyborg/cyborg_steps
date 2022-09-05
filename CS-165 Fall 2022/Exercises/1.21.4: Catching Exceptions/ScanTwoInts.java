import java.util.Scanner;
import java.util.InputMismatchException;

public class ScanTwoInts {

    public static void makeLine() { System.out.println("\n------------------------------\n"); }

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int resultVal = 0;
   
        makeLine();

        try {
            num1 = scnr.nextInt();
            num2 = scnr.nextInt();

            System.out.print("Good! ");
        }
        catch (InputMismatchException e) {
            System.out.print("Bad! ");
        }

        resultVal = num1 + num2;

        System.out.print(resultVal);


        makeLine();

    } // end of main


} // end of class
