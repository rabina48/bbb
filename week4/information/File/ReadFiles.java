package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {
    public static void main (String[] args){

        try {
            FileInputStream obj = new FileInputStream("/home/rabina/Documents/Firstfile.txt");
            Scanner readfile = new Scanner(obj);
            while(readfile.hasNextLine()){
                String readData = readfile.nextLine();
                System.out.println("The available file are = "+readData);
            }

        }catch (FileNotFoundException e){
            System.out.println("We didnot Recognized the fileName");
            e.printStackTrace();


        }



    }


}
