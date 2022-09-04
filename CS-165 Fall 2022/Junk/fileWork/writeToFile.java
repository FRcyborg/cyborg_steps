/*
   https://www.w3schools.com/java/java_files_create.asp

   This made the file and that is all.
*/



import java.io.File;  // import the file class
import java.io.IOException;  // import the IOException class to handle errors

public class writeToFile {

    public static void main(String[] args) {

        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    } // end of main

} // end of class










