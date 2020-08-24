package Interface;

import java.util.Scanner;

public class Department {
        String firstName;
        String lastName;
        String address;
        double  number, checkNo;
        String loan;



    public String getInput() {
            System.out.println("Please add your Information if you want to get loan:");
            Scanner information = new Scanner(System.in);

            System.out.println("Enter your first name:");
            firstName = information.nextLine();

            System.out.println("Enter your last name:");
            lastName = information.nextLine();

            System.out.println("Enter your current Address:");
            address = information.nextLine();

            System.out.println("Is your loan less than $100000?");
            loan = information.nextLine();

            number = information.nextLong();

            return  loan;
        }

        String getLoan(){
            if (loan.equals( "yes" )){
                System.out.println("you can take loan please provide your details  contact no:");
            } else if(loan.equals("no")){
                System.out.println("We can only provide loan less then $100000 at the moment!");

            }else{
                System.out.println("Invalid! Please type Y= yes  & N = No");
            }
            return  loan;
        }


        public NextInfomation addInfo() {
            Scanner nextinfo = new Scanner(System.in);
            number = nextinfo.nextLong();
            checkNo = nextinfo.nextLong();
           NextInfomation in = new NextInfomation(number, checkNo);
            return in;
        }



//            class Department1 implements Bank {
//
//                public void getLoan() {
//                    System.out.println("We are providing 10% interest for Loan above 1Lakh");
//
//                }
}
