package Interface;
            //looks like a class but it is not a class
//  can have methods and variables just like the class
//  but the methods declared in interface are by default abstract
// Use for full abstraction
//an interface can not implement another interface. It has to extend the other interface.
//class needs to implement them before they access it.


import java.util.Scanner;

interface Bank {

     abstract Input getLoan();

}
    class Department implements Bank {
        String firstName;
        String lastName;
        String address;
        double loan, number;
        char amount;


        public Input getLoan() {
            System.out.println("Please add your Information if you want to get loan:");
            Scanner information = new Scanner(System.in);

            System.out.println("Enter your first name:");
            firstName = information.nextLine();

            System.out.println("Enter your last name:");
            lastName = information.nextLine();

            System.out.println("Enter your current Address:");
            address = information.nextLine();

            System.out.println("Is your loan less than $100000?");
            loan = information.nextDouble();

            char amount = information.next().charAt(0);
            Input input = new Input(amount);
            return  input;



        }

        public double addInfo() {
            System.out.println("you can take loan please provide your details  contact no:");
            Scanner phone = new Scanner(System.in);
            number = phone.nextLong();

            return number;
        }

        char getLoanAmount(char input1) {

            switch (amount) {
                case 'Y':
                    System.out.println("you can take loan please provide your details  contact no:");

                case 'N':
                    System.out.println("We can only provide loan less then $100000 at the moment!");
                    // return ;
                default:
                    System.out.println("Invalid! Please type Y= yes  & N = No");

             return amount;
            }


//            class Department1 implements Bank {
//
//                public void getLoan() {
//                    System.out.println("We are providing 10% interest for Loan above 1Lakh");
//
//                }


        }}