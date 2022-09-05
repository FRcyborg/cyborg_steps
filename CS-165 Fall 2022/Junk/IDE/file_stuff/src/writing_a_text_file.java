import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class writing_a_text_file {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileStream = null;
        PrintWriter outFS = null;

        // Try to open file
        fileStream = new FileOutputStream("myoutfile.txt");
        outFS = new PrintWriter(fileStream);

        // Arriving here implies that the file can now be written
        // to, otherwise an exception would have been thrown.
        outFS.println("Hello");
        outFS.println("1 2 3");

        // Done with file, so try to close
        // Note that close() may throw and IOException on failure
        outFS.close();
    }


}
