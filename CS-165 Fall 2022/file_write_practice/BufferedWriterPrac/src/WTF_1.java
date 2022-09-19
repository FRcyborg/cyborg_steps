import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WTF_1 {

    public static void bufferedWriterExample() {

        try {
            BufferedWriter randomWord = new BufferedWriter(new FileWriter("output.txt"));

            System.out.println("we are in BufferedWriter()");
            randomWord.write("This file brought to you by bufferedWriterExample!");
            randomWord.close();
        }
        catch(Exception e) {
            System.out.println("did something happen?");
        }
    } // end of bufferedWriterExample


    public static void fileWriterExample() {

        try {
            FileWriter randomWord = new FileWriter("output2.txt");

            System.out.println("we are in FileWriterExample()");
            randomWord.write("this file brought to you by FileWriterExample!");
            randomWord.close();
        }
        catch(Exception e) {
            System.out.println("did something happen?");
        }
    } // end of FileWriterExample()


    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        bufferedWriterExample();
        fileWriterExample();

        System.out.println(("no, nothing happened"));
    }
}