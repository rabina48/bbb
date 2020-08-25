package Interface;

import java.util.Scanner;

public class Result implements  BankShow{


    @Override
    public void displayAccept() {
        System.out.println("---------------------------");
        System.out.println("Thank you for your Process");
        System.out.println("---------------------------");


    }

    public void displayReject() {
        System.out.println("*******************************");
        System.out.println("please process with our main Branch");
        System.out.println("*******************************");


    }
}

