package File.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args){
        try{
            FileOutputStream outputStream = new FileOutputStream("/home/rabina/Documents/Firstfile.txt");
            String s="Welcome to java";
            byte b[] = s.getBytes();
            outputStream.write(b);
            outputStream.close();
            System.out.println("SUCCESS...");

        }catch (FileNotFoundException e){
            System.out.println("File not Found!");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
