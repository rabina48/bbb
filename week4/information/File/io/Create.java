package File.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Create {
    public static  void main (String[] args) throws IOException {
        File file = new  File("/home/rabina/Documents/Java.txt");
        try {
            if(file.createNewFile()){
                System.out.println(" file Created = "+file.getName());
            }
        }catch (IOException e){
            System.out.println("Already Exist");
            e.printStackTrace();
        }

        FileOutputStream create = new FileOutputStream(file,true);

        String addingInput = "hello Java , You are one of the Popular Programming language";
        byte b[] = addingInput.getBytes();
        create.write(b);
        create.close();
        System.out.println("And Success update!");
        
    }
}
