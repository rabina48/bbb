package Interface;

import calculatorr.using.function.Display;

import java.util.Scanner;

public class Department {
    String firstName;
    String lastName;
    String address;
    double number, checkNo;
    String loan;
//    private Display display;
//
//    public Department(DisplayResult message) {
//        this.display = (Display) message;
//
//    }




    public ProcessInformation getInput() {
        System.out.println("Please add your Information if you want to get loan:");
        Scanner information = new Scanner(System.in);

        System.out.println("Enter your first name:");
        firstName = information.nextLine();

        System.out.println("Enter your last name:");
        lastName = information.nextLine();

        System.out.println("Enter your current Address:");
        address = information.nextLine();

        System.out.println("Is your loan less than $100000? (Enter: 'yes' OR  'no')");
        loan = information.nextLine();

       // number = information.nextLong();
        ProcessInformation in = new ProcessInformation(loan);


        return in;
    }
    public void getLoan(){

        switch (loan){
            case "yes":
                System.out.println("you can take loan please provide your details  contact no:");
                addInfo();
                DisplayResult displayResult = new DisplayResult();
                displayResult.displayAccept();
                break;

            case "no":
                System.out.println("We can only provide loan less then $100000 at the moment!");
                break;
            default:
                System.out.println("Invalid! Please type Y= yes  & N = No");


        }
    }

//    double getLoan(String loan) {
//        if (loan.equals("yes")) {
//            System.out.println("you can take loan please provide your details  contact no:");
//            return addInfo();
//
//        } else if (loan.equals("no")) {
//            System.out.println("We can only provide loan less then $100000 at the moment!");
//
//        } else {
//            System.out.println("Invalid! Please type Y= yes  & N = No");
//        }
//        return 0;   //no data
//    }

    public void addInfo() {
        Scanner nextinfo = new Scanner(System.in);
        System.out.println("Please Enter your Number: ");
        number = nextinfo.nextLong();


        System.out.println("Please Enter your checkNO: ");
        checkNo = nextinfo.nextLong();

       // return addInfo();

    }





}