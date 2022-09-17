/*
3.12 LAB: Number pattern

Write a recursive method called printNumPattern() to output the following number pattern.

Given a positive integer as input (Ex: 12), subtract another positive integer (Ex: 3) continually until
a negative value is reached, and then continually add the second integer until the first integer is
again reached. For this lab, do not end output with a newline.

20220916  -  JLF
 */


public class NumberPattern {

    public static void printNumPattern(int n1, int n2) {
         if ( n1 < 0 ) {
             System.out.print(n1 + " ");
             return;
         }
        System.out.print(n1 + " ");
        printNumPattern(n1-n2, n2);
        System.out.print(n1 + " ");

    }


    public static void main(String[] args) {

        printNumPattern(12,3);

    }
}
/*
THIS IS THE ACTUAL ASSIGNMENT FROM THE SCHOOL WEBSITE:

import java.util.Scanner;

public class NumberPattern {
   // TODO: Write recursive printNumPattern() method

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;

      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      printNumPattern(num1, num2);
   }
}
 */