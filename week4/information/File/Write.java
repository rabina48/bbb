package File;

import java.io.FileWriter;
import java.io.IOException;


public class Write {
    public static void main(String[] args)  {

        try {
            FileWriter fileWriter = new FileWriter("/home/rabina/Documents/Firstfile.txt");
            fileWriter.write("Java is one of the most popular programming, and fun too.. Keep clam and Learn java");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");

        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

    }
}
