package Interface;

import java.util.Scanner;

public class DisplayResult implements  BankShow{


    @Override
    public void displayAccept() {
        System.out.println("---------------------------");
        System.out.println("Thank you for your Process. We will contact you Soon");
        System.out.println("---------------------------");


    }

    public void displayReject() {
        System.out.println("*******************************");
        System.out.println("please process with our main Branch");
        System.out.println("*******************************");


    }
}

