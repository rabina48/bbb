package File;

import java.io.File;
import java.io.IOException;

public class FileInformation {
    public  static void main (String[] args){
        File obj = new File ("/home/rabina/Documents/Firstfile.txt");

        try {
            if(obj.exists()){
                System.out.println("File name is = "+obj.getName());
                System.out.println("File AbsolutePath is = "+obj.getAbsolutePath());
                System.out.println("File Canonical is = "+obj.getCanonicalPath());
                System.out.println("File Path is = "+obj.getPath());
                System.out.println("File FreeSpace is = "+obj.getFreeSpace());
                System.out.println("File Class is = "+obj.getClass());
                System.out.println("File FreeSpace is = "+obj.getFreeSpace());

            }
        }catch (IOException e){
            System.out.println("Not found");
        }
        finally {
            System.out.println("-----------------------------------------");
            System.out.println("Thanks For Reaching out!!");
        }

    }

}
