package File.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {
    public static  void main (String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/home/rabina/Documents/Java.txt");

        int red = fileInputStream.read();// bcz the data return in binary format so byte stream

    while (red != -1){
        System.out.print((char)red);
          fileInputStream.close();

}
    }
}
