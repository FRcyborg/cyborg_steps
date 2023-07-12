import java.io.FileWriter;
import java.io.IOException;

public class showArgs {






    public static void main(String[] args) {

        String fileName = "defaultName";

        try { 
            FileWriter writer = new FileWriter(fileName);
            writer.write("something for a file");
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    } // end of main()




} // end of class
