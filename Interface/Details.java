package Interface;

import java.util.Scanner;

public class Details  implements  BankShow{


    @Override
    public void displayAccept() {
        System.out.println("Thank you for your Process");


    }

    public void displayReject() {
        System.out.println("please process with our main Branch");


    }
}

