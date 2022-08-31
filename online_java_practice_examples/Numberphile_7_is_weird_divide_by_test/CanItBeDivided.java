/*
    Can a number be divided evenly by the numbers 1 through 12?

    Got this from this Numberphile youTube video.  The video shows how to tell 
    if a number is divisible by the numbers 1 through 12.  Let's make a program
    that runs all the checks on any given number(s).

    https://www.youtube.com/watch?v=UDQjn_-pDSs
    Why 7 is Weird - Numberphile
    Aug 22, 2022

    20220828  -  JLF

*/

public class CanItBeDivided {

    private int numToCheck = 123;

    public CanItBeDivided(int numToCheck) {
        this.numToCheck = numToCheck;
        System.out.println("numToCheck => " + numToCheck);
    }

    public static void one_divide_by(int numToCheck) {

        System.out.println("Can numToCheck " + numToCheck + " be divided by one? => ");

        System.out.println("Duh, everything can be divided by one.");

    }  // end of one_divide_by()


    public static void makeLine() {
        System.out.print("\n-----------------------------------------------------------\n");
    } // end of makeLine()



    public static void main(String[] args) {

        makeLine();

        one_divide_by(123);

        makeLine();

    } // end of main


    public String toString() {

        return "This is the toString method!";

    } // end of toString

} // end of class
















