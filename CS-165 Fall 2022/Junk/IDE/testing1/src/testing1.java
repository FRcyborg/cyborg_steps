import java.sql.SQLOutput;

public class testing1 {
    public static void convert(int number, int base) {
        int remainder = number % base;
        int quotient = number / base;
        System.out.println("remainder => " + remainder + "  quotient => " + quotient + "  base => " + base);
        if (quotient > 0) convert(quotient, base);
        System.out.print(remainder);
    }

    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 2;
        convert(num1, num2);

        // System.out.println("remainder => " + remainder + "  quotient => " + quotient);
    }  // end of main

} // end of class
