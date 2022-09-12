import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.IOException;


public class makeJava {

    public static void makeLine() { System.out.println("\n--------------------------------------------------\n"); }

    public static void writeToFile (ArrayList<String> theList) throws IOException { 
        
       

        String fileName = "fileName";
        PrintWriter outPut = new PrintWriter(fileName + ".java");


        outPut.println("//import java.io.PrintWriter;");
        outPut.println("//import java.util.ArrayList;");
        outPut.println("//import java.io.IOException;");

        
        outPut.println();
        outPut.println("public class " + fileName + ".java {");
        outPut.println();
        outPut.println("    public static void main(String[] args) {");
        outPut.println();
        outPut.println();
        outPut.println();
        outPut.println();
        outPut.println();
        outPut.println("    } // end of main");
        outPut.println("} // end of class");



        outPut.close();

        }


    public static void main(String[] args) throws IOException {

        makeLine();

        ArrayList<String> toBeWriten = new ArrayList<String>();

        for ( String s : args ) {
            System.out.println("String s => " + s);
        }

        writeToFile(toBeWriten);

        makeLine();


    } // end of main

} // end of class
