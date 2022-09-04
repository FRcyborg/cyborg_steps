/*
    Learing to handle files.  

    20220903  -  JLF

*/


import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadNums {
    public static void main ( String[] args ) throws IOException {

    makeLine();

    FileInputStream fbs = null;
    Scanner inFS = null;
    int fileNum1;
    int fileNum2;

    // try to open file
    System.out.println("Opening file numFile.txt.");
//    fileByteStream = new FileInputStream("numFile.txt");
    fbs = new FileInputStream("numFile.txt");
    inFS = new Scanner(fbs);

    System.out.println("Reading two integers.");
    fileNum1 = inFS.nextInt();
    fileNum2 = inFS.nextInt();

    System.out.println("num1: " + fileNum1);
    System.out.println("num2: " + fileNum2);
    System.out.println("num1+num2: " + ( fileNum1 + fileNum2 ));

    System.out.println("closing file numFile.txt.");

    fbs.close();

    makeLine();


    } // end of main

    public static void makeLine() {
        System.out.print("\n---------------------------------------------------------\n");
    }

} // end of class
