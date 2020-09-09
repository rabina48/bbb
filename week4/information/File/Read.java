package File;

import java.io.File;
import java.io.IOException;

public class Read {
    public static void main (String[] args){
        File file = new File("/home/rabina/Documents/Firstfile.txt");

        try {
            if (file.createNewFile()){
                System.out.println("File created: " + file.getName());
            }else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println(" Error occurred.");
            e.printStackTrace();
        }



    }
}
